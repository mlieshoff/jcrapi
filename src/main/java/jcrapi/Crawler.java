/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jcrapi;

import com.google.common.base.Preconditions;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;

/**
 * @author Michael Lieshoff
 */
class Crawler {

    private static final ThreadLocal<Response> RESPONSE = new ThreadLocal<Response>(){
        @Override
        protected Response initialValue() {
            return new Response();
        }
    };

    private final HttpClientFactory httpClientFactory;

    Crawler(HttpClientFactory httpClientFactory) {
        this.httpClientFactory = httpClientFactory;
    }

    String get(String url, Map<String, String> headers) throws CrawlerException, IOException {
        return get(url, headers, null);
    }

    String get(String url, Map<String, String> headers, Map<String, String> parameters) throws IOException {
        Response apiResponse = RESPONSE.get();
        Preconditions.checkNotNull(url);
        Preconditions.checkArgument(url.length() > 0);
        Preconditions.checkNotNull(headers);
        Preconditions.checkArgument(headers.size() > 0);
        url = appendToUrl(url, parameters);
        HttpClient client = httpClientFactory.create();
        HttpGet request = createRequest(url, headers);
        HttpResponse response = client.execute(request);
        StatusLine statusLine = response.getStatusLine();
        if (statusLine.getStatusCode() != 200) {
            setLastResponse(apiResponse, "ERROR", response);
            throw new CrawlerException(statusLine);
        }
        BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
        StringBuilder s = new StringBuilder();
        String line;
        while ((line = rd.readLine()) != null) {
            s.append(line);
        }
        String result = s.toString();
        setLastResponse(apiResponse, result, response);
        return result;
    }

    private void setLastResponse(Response apiResponse, String result, HttpResponse response) {
        apiResponse.setRaw(result);
        if (ArrayUtils.isNotEmpty(response.getAllHeaders())) {
            apiResponse.getResponseHeaders().clear();
            for (Header header : response.getAllHeaders()) {
                apiResponse.getResponseHeaders().put(header.getName().toLowerCase(), header.getValue());
            }
        }
    }

    public Response getLastResponse() {
        return RESPONSE.get();
    }

    private String appendToUrl(String url, Map<String, String> parameters) throws UnsupportedEncodingException {
        if (MapUtils.isNotEmpty(parameters)) {
            StringBuilder s = new StringBuilder();
            s.append("?");
            for (Iterator<Map.Entry<String, String>> iterator = parameters.entrySet().iterator(); iterator.hasNext(); ) {
                Map.Entry<String, String> entry = iterator.next();
                String name = entry.getKey();
                String value = entry.getKey();
                s.append(name);
                s.append("=");
                if (StringUtils.isNotBlank(value)) {
                    s.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
                }
                if (iterator.hasNext()) {
                    s.append("&");
                }
            }
            url = url + s;
        }
        return url;
    }

    private HttpGet createRequest(String url, Map<String, String> headers) {
        HttpGet httpGet = new HttpGet(url);
        addHeaders(httpGet, headers);
        return httpGet;
    }

    private void addHeaders(HttpGet httpGet, Map<String, String> headers) {
        for (Map.Entry<String, String> entry : headers.entrySet()) {
            httpGet.addHeader(entry.getKey(), entry.getValue());
        }
    }

}
