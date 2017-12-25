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

import jcrapi.model.Alliance;
import jcrapi.model.Arena;
import jcrapi.model.Badges;
import jcrapi.model.ChestCycleList;
import jcrapi.model.Clan;
import jcrapi.model.ConstantCard;
import jcrapi.model.Constants;
import jcrapi.model.CountryCode;
import jcrapi.model.Profile;
import jcrapi.model.Rarity;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * @author Michael Lieshoff
 */
public class IntegrationTest {

    public static final String AUTH = "secret";
    public static final String VERSION = "4.0.3";

    private static JettyServer jettyServer;

    private static final String CONTEXT = "test";
    private static final String APP = "jcrapi";
    private static final String URL = String.format("http://localhost:50000/%s/%s/", CONTEXT, APP);

    @BeforeClass
    public static void beforeClass() throws Exception {
        jettyServer = new JettyServer(50000, "/" + CONTEXT);
        jettyServer.addServlet("/" + APP + "/version", new TestVersionServlet());
        jettyServer.addServlet("/" + APP + "/player/*", new TestProfileServlet());
        jettyServer.addServlet("/" + APP + "/top/clans/*", new TestTopClansServlet());
        jettyServer.addServlet("/" + APP + "/top/players/*", new TestTopPlayersServlet());
        jettyServer.addServlet("/" + APP + "/clan/*", new TestClanServlet());
        jettyServer.addServlet("/" + APP + "/constants", new TestConstantsServlet());
        jettyServer.addServlet("/" + APP + "/constants/alliance/", new TestAllianceConstantsServlet());
        jettyServer.addServlet("/" + APP + "/constants/arenas/", new TestArenasConstantsServlet());
        jettyServer.addServlet("/" + APP + "/constants/badges/", new TestBadgesConstantsServlet());
        jettyServer.addServlet("/" + APP + "/constants/chestCycle/", new TestChestCycleConstantsServlet());
        jettyServer.addServlet("/" + APP + "/constants/countryCodes/", new TestCountryCodesConstantsServlet());
        jettyServer.addServlet("/" + APP + "/constants/rarities/", new TestRaritiesConstantsServlet());
        jettyServer.addServlet("/" + APP + "/constants/cards/", new TestCardsConstantsServlet());
        jettyServer.start();
    }

    @AfterClass
    public static void afterClass() throws Exception {
        jettyServer.stop();
    }

    @Test
    public void shouldGetVersionWithAuth() throws IOException {
        doGetVersion(URL, AUTH, VERSION);
    }

    private void doGetVersion(String url, String auth, String expected) {
        String version = new Api(url, auth).getVersion();
        assertEquals(expected, version);
    }

    @Test(expected = ApiException.class)
    public void failGetVersionBecauseWrongAuth() throws IOException {
        doGetVersion(URL, "abc", VERSION);
    }

    @Test
    public void shouldGetProfileWithAuth() throws IOException {
        doGetProfile(URL, AUTH, "8L9L9GL");
    }

    private void doGetProfile(String url, String auth, String tag) {
        assertEquals(tag, new Api(url, auth).getProfile(tag).getTag());
    }

    @Test(expected = ApiException.class)
    public void failGetProfileBecauseWrongAuth() throws IOException {
        doGetProfile(URL, "abc", "8L9L9GL");
    }

    private void doGetProfiles(String url, String auth, List<String> tags) {
        List<Profile> profiles = new Api(url, auth).getProfiles(tags);
        assertEquals(tags.size(), profiles.size());
        for (int i = 0, n = tags.size(); i < n; i ++) {
            Profile profile = profiles.get(i);
            String tag = tags.get(i);
            assertEquals(tag, profile.getTag());
        }
    }

    private List<String> createProfileTags() {
        List<String> tags = new ArrayList<>();
        tags.add("L88P2282");
        tags.add("9CQ2U8QJ");
        tags.add("8L9L9GL");
        return tags;
    }

    @Test
    public void shouldGetProfilesWithAuth() throws IOException {
        doGetProfiles(URL, AUTH, createProfileTags());
    }

    @Test(expected = ApiException.class)
    public void failGetProfilesBecauseWrongAuth() throws IOException {
        doGetProfiles(URL, "abc", createProfileTags());
    }

    @Test
    public void shouldGetTopClansWithAuth() throws IOException {
        doGetTopClans(URL, AUTH);
    }

    private void doGetTopClans(String url, String auth) {
        assertTrue(new Api(url, auth).getTopClans().size() > 0);
    }

    @Test(expected = ApiException.class)
    public void failGetTopClansBecauseWrongAuth() throws IOException {
        doGetTopClans(URL, "abc");
    }

    @Test
    public void shouldGetClanWithAuth() throws IOException {
        doGetClan(URL, AUTH, "2CCCP");
    }

    private void doGetClan(String url, String auth, String tag) {
        assertEquals(tag, new Api(url, auth).getClan(tag).getTag());
    }

    @Test(expected = ApiException.class)
    public void failGetClanBecauseWrongAuth() throws IOException {
        doGetClan(URL, "abc", "2CCCP");
    }

    @Test
    public void shouldGetClansWithAuth() throws IOException {
        doGetClans(URL, AUTH, createClanTags());
    }

    private void doGetClans(String url, String auth, List<String> tags) {
        List<Clan> clans = new Api(url, auth).getClans(tags);
        assertEquals(tags.size(), clans.size());
        for (int i = 0, n = tags.size(); i < n; i ++) {
            Clan clan = clans.get(i);
            String tag = tags.get(i);
            assertEquals(tag, clan.getTag());
        }
    }

    private List<String> createClanTags() {
        List<String> tags = new ArrayList<>();
        tags.add("2CCCP");
        tags.add("2U2GGQJ");
        return tags;
    }

    @Test(expected = ApiException.class)
    public void failGetClansBecauseWrongAuth() throws IOException {
        doGetClans(URL, "abc", createClanTags());
    }

    @Test
    public void shouldGetConstantsWithAuth() throws IOException {
        doGetConstants(URL, AUTH);
    }

    private void doGetConstants(String url, String auth) {
        Constants constants = new Api(url, auth).getConstants();
        assertTrue(constants.getAlliance().getRoles().size() > 0);
    }

    @Test(expected = ApiException.class)
    public void failGetConstantsBecauseWrongAuth() throws IOException {
        doGetConstants(URL, "abc");
    }

    @Test
    public void shouldGetAllianceConstantsWithAuth() throws IOException {
        doGetAllianceConstants(URL, AUTH);
    }

    private void doGetAllianceConstants(String url, String auth) {
        Alliance alliance = new Api(url, auth).getAllianceConstants();
        assertTrue(alliance.getRoles().size() > 0);
    }

    @Test(expected = ApiException.class)
    public void failGetAllianceConstantsBecauseWrongAuth() throws IOException {
        doGetAllianceConstants(URL, "abc");
    }

    @Test
    public void shouldGetArenasConstantsWithAuth() throws IOException {
        doGetArenasConstants(URL, AUTH);
    }

    private void doGetArenasConstants(String url, String auth) {
        List<Arena> arenas = new Api(url, auth).getArenasConstants();
        assertTrue(arenas.size() > 0);
    }

    @Test(expected = ApiException.class)
    public void failGetArenasConstantsBecauseWrongAuth() throws IOException {
        doGetArenasConstants(URL, "abc");
    }

    @Test
    public void shouldGetBadgesConstantsWithAuth() throws IOException {
        doGetBadgesConstants(URL, AUTH);
    }

    private void doGetBadgesConstants(String url, String auth) {
        Badges badges = new Api(url, auth).getBadgesConstants();
        assertTrue(badges.size() > 0);
    }

    @Test(expected = ApiException.class)
    public void failGetBadgesConstantsBecauseWrongAuth() throws IOException {
        doGetBadgesConstants(URL, "abc");
    }

    @Test
    public void shouldGetChestCycleConstantsWithAuth() throws IOException {
        doGetChestCycleConstants(URL, AUTH);
    }

    private void doGetChestCycleConstants(String url, String auth) {
        ChestCycleList chestCycleList = new Api(url, auth).getChestCycleConstants();
        assertTrue(chestCycleList.getOrder().size() > 0);
    }

    @Test(expected = ApiException.class)
    public void failGetChestCycleConstantsBecauseWrongAuth() throws IOException {
        doGetChestCycleConstants(URL, "abc");
    }

    @Test
    public void shouldGetCountryCodesConstantsWithAuth() throws IOException {
        doGetCountryCodesConstants(URL, AUTH);
    }

    private void doGetCountryCodesConstants(String url, String auth) {
        List<CountryCode> countryCodes = new Api(url, auth).getCountryCodesConstants();
        assertTrue(countryCodes.size() > 0);
    }

    @Test(expected = ApiException.class)
    public void failGetCountryCodesConstantsBecauseWrongAuth() throws IOException {
        doGetCountryCodesConstants(URL, "abc");
    }

    @Test
    public void shouldGetRaritiesConstantsWithAuth() throws IOException {
        doGetRaritiesConstants(URL, AUTH);
    }

    private void doGetRaritiesConstants(String url, String auth) {
        List<Rarity> rarities = new Api(url, auth).getRaritiesConstants();
        assertTrue(rarities.size() > 0);
    }

    @Test(expected = ApiException.class)
    public void failGetRaritiesConstantsBecauseWrongAuth() throws IOException {
        doGetRaritiesConstants(URL, "abc");
    }

    @Test
    public void shouldGetCardsConstantsWithAuth() throws IOException {
        doGetCardsConstants(URL, AUTH);
    }

    private void doGetCardsConstants(String url, String auth) {
        List<ConstantCard> constantCards = new Api(url, auth).getCardsConstants();
        assertTrue(constantCards.size() > 0);
    }

    @Test(expected = ApiException.class)
    public void failGetCardsConstantsBecauseWrongAuth() throws IOException {
        doGetCardsConstants(URL, "abc");
    }

}
