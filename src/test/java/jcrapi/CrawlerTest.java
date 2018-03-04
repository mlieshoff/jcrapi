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

import com.google.common.collect.ImmutableMap;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.StringEntity;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.ArgumentMatcher;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyObject;
import static org.mockito.Matchers.argThat;
import static org.mockito.Mockito.when;

/**
 * @author Michael Lieshoff
 */
public class CrawlerTest {

    private HttpClientFactory httpClientFactory;

    private HttpClient httpClient;

    @Before
    public void setUp() {
        httpClientFactory = Mockito.mock(HttpClientFactory.class);
        httpClient = Mockito.mock(HttpClient.class);
        when(httpClientFactory.create()).thenReturn(httpClient);
    }

    @Test(expected = NullPointerException.class)
    public void failGetBecauseNullUrl() throws IOException {
        new Crawler(httpClientFactory).get(null, createHeaders(), null);
    }

    private Map<String,String> createHeaders() {
        return ImmutableMap.<String, String>builder().put("name", "value").build();
    }

    @Test(expected = IllegalArgumentException.class)
    public void failGetBecauseEmptyUrl() throws IOException {
        new Crawler(httpClientFactory).get("", createHeaders(), null);
    }

    @Test(expected = NullPointerException.class)
    public void failGetBecauseNullHeaders() throws IOException {
        new Crawler(httpClientFactory).get("abc", null, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void failGetBecauseEmptyHeaders() throws IOException {
        new Crawler(httpClientFactory).get("abc", new HashMap<String, String>(), null);
    }

    @Test
    public void shouldGetAbc() throws IOException {
        String expectedResult = "break-out-prison";
        when(httpClientFactory.create()).thenReturn(httpClient);
        HttpResponse httpResponse = new BasicHttpResponse(new BasicStatusLine(new ProtocolVersion("http", 100, 1), 200, ""));
        httpResponse.setEntity(new StringEntity(expectedResult));
        when(httpClient.execute((HttpUriRequest) anyObject())).thenReturn(httpResponse);
        assertEquals(expectedResult, new Crawler(httpClientFactory).get("the-url", createHeaders()));
    }

    @Test
    public void shouldGetErrorStatus() throws IOException {
        String expectedResult = "break-out-prison";
        when(httpClientFactory.create()).thenReturn(httpClient);
        HttpResponse httpResponse = new BasicHttpResponse(new BasicStatusLine(new ProtocolVersion("http", 100, 1), 200, ""));
        httpResponse.setEntity(new StringEntity(expectedResult));
        httpResponse.setStatusCode(400);
        when(httpClient.execute((HttpUriRequest) anyObject())).thenReturn(httpResponse);
        try {
            new Crawler(httpClientFactory).get("the-url", createHeaders(), null);
        } catch (IOException e) {
            assertEquals("crapi: 400", e.getMessage());
        }
    }

    @Test
    public void shouldEncodeParameters() throws IOException {
        String expectedResult = "break-out-prison";
        when(httpClientFactory.create()).thenReturn(httpClient);
        HttpResponse httpResponse = new BasicHttpResponse(new BasicStatusLine(new ProtocolVersion("http", 100, 1), 200, ""));
        httpResponse.setEntity(new StringEntity(expectedResult));
        when(httpClient.execute(argThat(getMatcher()))).thenReturn(httpResponse);
        assertEquals(expectedResult, new Crawler(httpClientFactory).get("the-url", createHeaders(),
                ImmutableMap.<String, String>builder().put("param", "a+b").put("key", "abc").build()));
    }

    private ArgumentMatcher<HttpUriRequest> getMatcher() {
        return new ArgumentMatcher<HttpUriRequest>() {
            @Override
            public boolean matches(Object o) {
                if (o instanceof HttpUriRequest) {
                    HttpUriRequest httpUriRequest = (HttpUriRequest) o;
                    return httpUriRequest.getURI().getRawQuery().equals("param=a%2Bb&key=abc");
                }
                return false;
            }
        };
    }

    @Ignore
    public void shouldGetLastResponse() throws IOException {
        String expectedResult = "break-out-prison";
        when(httpClientFactory.create()).thenReturn(httpClient);
        HttpResponse httpResponse = new BasicHttpResponse(new BasicStatusLine(new ProtocolVersion("http", 100, 1), 200, ""));
        httpResponse.setEntity(new StringEntity(expectedResult));
        httpResponse.addHeader("hello", "world");
        when(httpClient.execute(argThat(getMatcher()))).thenReturn(httpResponse);
        Response response = new Response();
        response.setRaw(expectedResult);
        response.getResponseHeaders().put("hello", "world");
        assertEquals(expectedResult, new Crawler(httpClientFactory).get("the-url", createHeaders(),
                ImmutableMap.<String, String>builder().put("param", "a+b").put("key", "abc").build()));
        assertEquals(response, new Crawler(httpClientFactory).getLastResponse());
    }

}