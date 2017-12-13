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

import org.apache.commons.lang.StringUtils;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
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
        new Client(null, "abc", crawlerFactory);
    }

    @Test(expected = IllegalArgumentException.class)
    public void failCreateBecauseEmptyUrl() {
        new Client("", "abc", crawlerFactory);
    }

    @Test(expected = NullPointerException.class)
    public void failCreateBecauseNullCrawlerFactory() {
        new Client("abc", "abc", null);
    }

    @Test
    public void shouldGetVersion() throws IOException {
        when(crawler.get("lala/version")).thenReturn("1.0");
        assertEquals("1.0", createClient().getVersion());
    }

    private Client createClient() {
        return new Client("lala/", null, crawlerFactory);
    }

    @Test
    public void shouldGetVersionWithAuth() throws IOException {
        when(crawler.get("lala/version?auth=abc")).thenReturn("1.0");
        assertEquals("1.0", createClientWithAuth().getVersion());
    }

    private Client createClientWithAuth() {
        return new Client("lala/", "abc", crawlerFactory);
    }

    @Test(expected = NullPointerException.class)
    public void failGetProfileBecauseNullTag() throws IOException {
        createClientWithAuth().getProfile(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void failGetProfileBecauseEmptyTag() throws IOException {
        createClientWithAuth().getProfile("");
    }

    @Test
    public void shouldGetProfile() throws IOException {
        when(crawler.get("lala/profile/xyz")).thenReturn("{}");
        assertNotNull(createClient().getProfile("xyz"));
    }

    @Test
    public void shouldGetProfileWithAuth() throws IOException {
        when(crawler.get("lala/profile/xyz?auth=abc")).thenReturn("{}");
        assertNotNull(createClientWithAuth().getProfile("xyz"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void failGetProfilesBecauseNullTag() throws IOException {
        createClientWithAuth().getProfiles(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void failGetProfilesBecauseEmptyTag() throws IOException {
        createClientWithAuth().getProfiles(Collections.<String>emptyList());
    }

    @Test
    public void shouldGetProfiles() throws IOException {
        List<String> tags = createTags();
        when(crawler.get("lala/profile/" + StringUtils.join(tags, ','))).thenReturn("[{}]");
        assertNotNull(createClient().getProfiles(tags));
    }

    private List<String> createTags() {
        List<String> tags = new ArrayList<>();
        tags.add("xyz");
        tags.add("def");
        return tags;
    }

    @Test
    public void shouldGetProfilesWithAuth() throws IOException {
        List<String> tags = createTags();
        when(crawler.get("lala/profile/" + StringUtils.join(tags, ',') + "?auth=abc")).thenReturn("[{}]");
        assertNotNull(createClientWithAuth().getProfiles(tags));
    }

    @Test
    public void shouldGetTopClans() throws IOException {
        when(crawler.get("lala/top/clans")).thenReturn("{}");
        assertNotNull(createClient().getTopClans());
    }

    @Test
    public void shouldGetTopClansWithAuth() throws IOException {
        when(crawler.get("lala/top/clans?auth=abc")).thenReturn("{}");
        assertNotNull(createClientWithAuth().getTopClans());
    }

    @Test(expected = NullPointerException.class)
    public void failGetClanBecauseNullTag() throws IOException {
        createClientWithAuth().getClan(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void failGetClanBecauseEmptyTag() throws IOException {
        createClientWithAuth().getClan("");
    }

    @Test
    public void shouldGetClan() throws IOException {
        when(crawler.get("lala/clan/xyz")).thenReturn("{}");
        assertNotNull(createClient().getClan("xyz"));
    }

    @Test
    public void shouldGetClanWithAuth() throws IOException {
        when(crawler.get("lala/clan/xyz?auth=abc")).thenReturn("{}");
        assertNotNull(createClientWithAuth().getClan("xyz"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void failGetClansBecauseNullTag() throws IOException {
        createClientWithAuth().getClans(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void failGetClansBecauseEmptyTag() throws IOException {
        createClientWithAuth().getClans(Collections.<String>emptyList());
    }

    @Test
    public void shouldGetClans() throws IOException {
        List<String> tags = createTags();
        when(crawler.get("lala/clan/" + StringUtils.join(tags, ','))).thenReturn("[{}]");
        assertNotNull(createClient().getClans(tags));
    }

    @Test
    public void shouldGetClansWithAuth() throws IOException {
        List<String> tags = createTags();
        when(crawler.get("lala/clan/" + StringUtils.join(tags, ',') + "?auth=abc")).thenReturn("[{}]");
        assertNotNull(createClientWithAuth().getClans(tags));
    }

    @Test
    public void shouldGetConstants() throws IOException {
        when(crawler.get("lala/constants")).thenReturn("{}");
        assertNotNull(createClient().getConstants());
    }

    @Test
    public void shouldGetConstantsWithAuth() throws IOException {
        when(crawler.get("lala/constants?auth=abc")).thenReturn("{}");
        assertNotNull(createClientWithAuth().getConstants());
    }

}