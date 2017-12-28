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
import org.apache.commons.lang.StringUtils;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

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
        when(crawler.get("lala/version", createHeaders())).thenReturn("1.0");
        assertEquals("1.0", createClient().getVersion());
    }

    private Map<String,String> createHeaders() {
        return ImmutableMap.<String, String>builder().put("auth", "abc").build();
    }

    private Client createClient() {
        return new Client("lala/", "abc", crawlerFactory);
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
        when(crawler.get("lala/player/xyz", createHeaders())).thenReturn("{}");
        assertNotNull(createClient().getProfile("xyz"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void failGetProfilesBecauseNullTag() throws IOException {
        createClient().getProfiles(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void failGetProfilesBecauseEmptyTag() throws IOException {
        createClient().getProfiles(Collections.<String>emptyList());
    }

    @Test
    public void shouldGetProfiles() throws IOException {
        List<String> tags = createTags();
        when(crawler.get("lala/player/" + StringUtils.join(tags, ','), createHeaders())).thenReturn("[{}]");
        assertNotNull(createClient().getProfiles(tags));
    }

    private List<String> createTags() {
        List<String> tags = new ArrayList<>();
        tags.add("xyz");
        tags.add("def");
        return tags;
    }

    @Test
    public void shouldGetTopClans() throws IOException {
        when(crawler.get("lala/top/clans", createHeaders())).thenReturn("[{}]");
        assertNotNull(createClient().getTopClans(null));
    }

    @Test
    public void shouldGetTopClansWithLocation() throws IOException {
        when(crawler.get("lala/top/clans/EU", createHeaders())).thenReturn("[{}]");
        assertNotNull(createClient().getTopClans("EU"));
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
        when(crawler.get("lala/clan/xyz", createHeaders())).thenReturn("{}");
        assertNotNull(createClient().getClan("xyz"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void failGetClansBecauseNullTag() throws IOException {
        createClient().getClans(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void failGetClansBecauseEmptyTag() throws IOException {
        createClient().getClans(Collections.<String>emptyList());
    }

    @Test
    public void shouldGetClans() throws IOException {
        List<String> tags = createTags();
        when(crawler.get("lala/clan/" + StringUtils.join(tags, ','), createHeaders())).thenReturn("[{}]");
        assertNotNull(createClient().getClans(tags));
    }

    @Test
    public void shouldGetTopPlayers() throws IOException {
        when(crawler.get("lala/top/players", createHeaders())).thenReturn("[{}]");
        assertNotNull(createClient().getTopPlayers(null));
    }

    @Test
    public void shouldGetTopPlayersWithLocation() throws IOException {
        when(crawler.get("lala/top/players/EU", createHeaders())).thenReturn("[{}]");
        assertNotNull(createClient().getTopPlayers("EU"));
    }

    @Test
    public void shouldGetConstants() throws IOException {
        when(crawler.get("lala/constants", createHeaders())).thenReturn("{}");
        assertNotNull(createClient().getConstants());
    }

    @Test
    public void shouldGetAllianceConstants() throws IOException {
        when(crawler.get("lala/constants/alliance/", createHeaders())).thenReturn("{}");
        assertNotNull(createClient().getAllianceConstants());
    }

    @Test
    public void shouldGetArenasConstants() throws IOException {
        when(crawler.get("lala/constants/arenas/", createHeaders())).thenReturn("[{}]");
        assertNotNull(createClient().getArenasConstants());
    }

    @Test
    public void shouldGetBadgesConstants() throws IOException {
        when(crawler.get("lala/constants/badges/", createHeaders())).thenReturn("{}");
        assertNotNull(createClient().getBadgesConstants());
    }

    @Test
    public void shouldGetChestCycleConstants() throws IOException {
        when(crawler.get("lala/constants/chestCycle/", createHeaders())).thenReturn("{}");
        assertNotNull(createClient().getChestCycleConstants());
    }

    @Test
    public void shouldGetCountryCodesConstants() throws IOException {
        when(crawler.get("lala/constants/countryCodes/", createHeaders())).thenReturn("[{}]");
        assertNotNull(createClient().getCountryCodesConstants());
    }

    @Test
    public void shouldGetRaritiesConstants() throws IOException {
        when(crawler.get("lala/constants/rarities/", createHeaders())).thenReturn("[{}]");
        assertNotNull(createClient().getRaritiesConstants());
    }

    @Test
    public void shouldGetCardConstants() throws IOException {
        when(crawler.get("lala/constants/cards/", createHeaders())).thenReturn("[{}]");
        assertNotNull(createClient().getCardsConstants());
    }

    @Test
    public void shouldGetEndpoint() throws IOException {
        when(crawler.get("lala/endpoints", createHeaders())).thenReturn("[]");
        assertNotNull(createClient().getEndpoints());
    }

}