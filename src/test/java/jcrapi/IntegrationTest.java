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

import jcrapi.model.Constants;
import jcrapi.model.DetailedClan;
import jcrapi.model.Profile;
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
        jettyServer.addServlet("/" + APP + "/profile/*", new TestProfileServlet());
        jettyServer.addServlet("/" + APP + "/top/clans/*", new TestTopClansServlet());
        jettyServer.addServlet("/" + APP + "/clan/*", new TestClanServlet());
        jettyServer.addServlet("/" + APP + "/constants", new TestConstantsServlet());
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
        doGetProfile(URL, AUTH, "Y99YRPYG");
    }

    private void doGetProfile(String url, String auth, String tag) {
        assertEquals(tag, new Api(url, auth).getProfile(tag).getTag());
    }

    @Test(expected = ApiException.class)
    public void failGetProfileBecauseWrongAuth() throws IOException {
        doGetProfile(URL, "abc", "Y99YRPYG");
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
        assertTrue(new Api(url, auth).getTopClans().getLastUpdated() > 0);
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
        List<DetailedClan> detailedClans = new Api(url, auth).getClans(tags);
        assertEquals(tags.size(), detailedClans.size());
        for (int i = 0, n = tags.size(); i < n; i ++) {
            DetailedClan detailedClan = detailedClans.get(i);
            String tag = tags.get(i);
            assertEquals(tag, detailedClan.getTag());
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

}
