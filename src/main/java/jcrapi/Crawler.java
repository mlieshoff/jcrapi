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

/**
 * @author Michael Lieshoff
 */
class Crawler {

    private final HttpClientFactory httpClientFactory;

    Crawler(HttpClientFactory httpClientFactory) {
        this.httpClientFactory = httpClientFactory;
    }

    String get(String url) throws IOException {
        Preconditions.checkNotNull(url);
        Preconditions.checkArgument(url.length() > 0);
        System.out.println("get> " + url);
        HttpClient client = httpClientFactory.create();
        HttpGet request = new HttpGet(url);
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
        System.out.println("< " + s);
        return s.toString();
    }

}
