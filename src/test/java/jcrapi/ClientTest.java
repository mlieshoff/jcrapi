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
import org.mockito.Mockito;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

/**
 * @author Michael Lieshoff
 */
public class ClientTest {

    private CrawlerFactory crawlerFactory;

    private Crawler crawler;

    @Before
    public void setUp() {
        crawlerFactory = Mockito.mock(CrawlerFactory.class);
        crawler = Mockito.mock(Crawler.class);
        when(crawlerFactory.createCrawler()).thenReturn(crawler);
    }

    @Test(expected = NullPointerException.class)
    public void failCreateBecauseNullUrl() {
        new Client(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void failCreateBecauseEmptyUrl() {
        new Client("");
    }

    @Test(expected = NullPointerException.class)
    public void failCreateBecauseNullCrawlerFactory() {
        new Client("abc", null);
    }

    @Test
    public void shouldGetVersion() throws IOException {
        when(crawler.get(anyString())).thenReturn("1.0");
        assertEquals("1.0", createClient().getVersion());
    }

    private Client createClient() {
        return new Client("lala", crawlerFactory);
    }

    @Test(expected = NullPointerException.class)
    public void failGetProfileBecauseNullTag() throws IOException {
        createClient().getProfile(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void failGetProfileBecauseEmptyTag() throws IOException {
        createClient().getProfile("");
    }

    @Test
    public void shouldGetProfile() throws IOException {
        when(crawler.get(anyString())).thenReturn("{}");
        assertNotNull(createClient().getProfile("abc"));
    }

    @Test
    public void shouldGetTopClans() throws IOException {
        when(crawler.get(anyString())).thenReturn("{}");
        assertNotNull(createClient().getTopClans());
    }

    @Test(expected = NullPointerException.class)
    public void failGetClanBecauseNullTag() throws IOException {
        createClient().getClan(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void failGetClanBecauseEmptyTag() throws IOException {
        createClient().getClan("");
    }

    @Test
    public void shouldGetClan() throws IOException {
        when(crawler.get(anyString())).thenReturn("{}");
        assertNotNull(createClient().getClan("abc"));
    }

    @Test(expected = NullPointerException.class)
    public void failGetClansBecauseNullTag() throws IOException {
        createClient().getClan(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void failGetClansBecauseEmptyTag() throws IOException {
        createClient().getClans(Collections.<String>emptyList());
    }

    @Test
    public void shouldGetClans() throws IOException {
        List<String> tags = new ArrayList<String>();
        tags.add("abc");
        tags.add("def");
        when(crawler.get(anyString())).thenReturn("[{}]");
        assertNotNull(createClient().getClans(tags));
    }

    @Test
    public void shouldGetConstants() throws IOException {
        when(crawler.get(anyString())).thenReturn("{}");
        assertNotNull(createClient().getConstants());
    }

}