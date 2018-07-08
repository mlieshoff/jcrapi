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

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * @author Michael Lieshoff
 */
public class ApiExceptionTest {

    private CrawlerException crawlerException;

    @Before
    public void setUp() {
        crawlerException = mock(CrawlerException.class);
    }

    @Test
    public void shouldGetNoneCode() {
        assertEquals(0, new ApiException(new IllegalStateException("lala")).getCode());
    }

    @Test
    public void shouldGetNoneCodeForNonKnownException() {
        assertEquals(0, new ApiException(new IllegalStateException("crapi: 402")).getCode());
    }

    @Test
    public void shouldGetCodeForCrawlerException() {
        when(crawlerException.getStatusCode()).thenReturn(402);
        assertEquals(402, new ApiException(crawlerException).getCode());
    }

    @Test
    public void shouldGetMessageForCrawlerException() {
        when(crawlerException.getMessage()).thenReturn("xyz");
        assertEquals("xyz", new ApiException(crawlerException).getMessage());
    }

}