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

import org.apache.http.StatusLine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * @author Michael Lieshoff
 */
public class CrawlerExceptionTest {

    private CrawlerException crawlerException;

    private StatusLine statusLine;

    @Before
    public void setUp() {
        statusLine = mock(StatusLine.class);
    }

    @Test(expected = NullPointerException.class)
    public void failWithNullStatsLine() {
        new CrawlerException(null);
    }

    @Test
    public void shouldSetStatusCode() {
        when(statusLine.getStatusCode()).thenReturn(400);
        crawlerException = new CrawlerException(statusLine);
        assertEquals(400, crawlerException.getStatusCode());
    }

    @Test
    public void shouldSetReason() {
        when(statusLine.getReasonPhrase()).thenReturn("that is what she said!");
        crawlerException = new CrawlerException(statusLine);
        assertEquals("that is what she said!", crawlerException.getReason());
    }

    @Test
    public void shouldGetMessageWithoutReason() {
        when(statusLine.getStatusCode()).thenReturn(400);
        crawlerException = new CrawlerException(statusLine);
        assertEquals("crapi: 400", crawlerException.getMessage());
    }

    @Test
    public void shouldGetMessageWithStatusCodeAndReason() {
        when(statusLine.getReasonPhrase()).thenReturn("that is what she said!");
        when(statusLine.getStatusCode()).thenReturn(400);
        crawlerException = new CrawlerException(statusLine);
        assertEquals("crapi: 400: that is what she said!", crawlerException.getMessage());
    }

}