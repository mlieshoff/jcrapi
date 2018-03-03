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
package jcrapi.model;

import javax.annotation.Generated;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

@Generated("org.mili.generator")
public class AuthStatsTest {

    private AuthStats unitUnderTest;

    @Before
    public void setUp() {
        unitUnderTest = new AuthStats();
    }

    @Test
    public void shouldGetSetId() {
        long expected = 4711L;
        unitUnderTest.setId(expected);
        assertEquals(expected, unitUnderTest.getId());
    }

    @Test
    public void shouldGetSetLastRequest() {
        long expected = 4711L;
        unitUnderTest.setLastRequest(expected);
        assertEquals(expected, unitUnderTest.getLastRequest());
    }

    @Test
    public void shouldGetSetRequestCount() {
        long expected = 4711L;
        unitUnderTest.setRequestCount(expected);
        assertEquals(expected, unitUnderTest.getRequestCount());
    }

    @Test
    public void shouldToString() {
        unitUnderTest.setId(4711L);
        unitUnderTest.setLastRequest(4711L);
        unitUnderTest.setRequestCount(4711L);
        String expected = "AuthStats{id=4711, lastRequest=4711, requestCount=4711}";
        String actual = unitUnderTest.toString();
        assertEquals(expected, actual);
    }

}