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
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

/**
 * @author Michael Lieshoff
 */
class Crawler {

    private final HttpClientFactory httpClientFactory;

    Crawler(HttpClientFactory httpClientFactory) {
        this.httpClientFactory = httpClientFactory;
    }

    String get(String url, Map<String, String> headers) throws IOException {
        Preconditions.checkNotNull(url);
        Preconditions.checkArgument(url.length() > 0);
        Preconditions.checkNotNull(headers);
        Preconditions.checkArgument(headers.size() > 0);
        HttpClient client = httpClientFactory.create();
        HttpGet request = createRequest(url, headers);
        HttpResponse response = client.execute(request);
        StatusLine statusLine = response.getStatusLine();
        if (statusLine.getStatusCode() != 200) {
            throw new IOException("crapi: " + statusLine.getStatusCode());
        }
        BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
        StringBuilder s = new StringBuilder();
        String line;
        while ((line = rd.readLine()) != null) {
            s.append(line);
        }
        return s.toString();
    }

    private HttpGet createRequest(String url, Map<String, String> headers) {
        System.out.println("> " + url);
        HttpGet httpGet = new HttpGet(url);
        addHeaders(httpGet, headers);
        return httpGet;
    }

    private void addHeaders(HttpGet httpGet, Map<String, String> headers) {
        for (Map.Entry<String, String> entry : headers.entrySet()) {
            httpGet.addHeader(entry.getKey(), entry.getValue());
            System.out.println("> " + entry.getKey() + " = " + entry.getValue());
        }
    }

}
