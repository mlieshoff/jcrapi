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

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Michael Lieshoff
 */
public class ResponseTest {

    private Response response = null;

    @Before
    public void setUp() {
        response = new Response();
    }

    @Test
    public void shouldHaveJson() {
        response.setRaw("json");
        assertEquals("json", response.getRaw());
    }

    @Test
    public void shouldHaveHeaders() {
        assertNotNull(response.getResponseHeaders());
    }

    @Test
    public void shouldCheckHashCode() {
        Response response1 = createResponse();
        Response response2 = createResponse();
        assertEquals(response1.hashCode(), response2.hashCode());
    }

    private Response createResponse() {
        Response response = new Response();
        response.getResponseHeaders().put("hello", "world");
        response.setRaw("json");
        return response;
    }

    @Test
    public void shouldEquals() {
        Response response1 = createResponse();
        Response response2 = createResponse();
        assertEquals(response1, response2);
    }

    @Test
    public void shouldNotEqualsBecauseJson() {
        Response response1 = createResponse();
        response1.setRaw("other");
        Response response2 = createResponse();
        assertNotEquals(response1, response2);
    }

    @Test
    public void shouldNotEqualsBecauseHeaders() {
        Response response1 = createResponse();
        response1.getResponseHeaders().put("other", "other");
        Response response2 = createResponse();
        assertNotEquals(response1, response2);
    }

    @Test
    public void shouldGetRateRemaining() {
        Response response = createResponse();
        response.getResponseHeaders().put(Response.X_RATELIMIT_REMAINING, "255");
        assertEquals(255, response.getRateRemaining().get().intValue());
    }

    @Test
    public void shouldGetRateLimit() {
        Response response = createResponse();
        response.getResponseHeaders().put(Response.X_RATELIMIT_LIMIT, "260");
        assertEquals(260, response.getRateLimit().get().intValue());
    }

    @Test
    public void shouldGetNoRateLimit() {
        Response response = createResponse();
        assertFalse(response.getRateLimit().isPresent());
    }

}