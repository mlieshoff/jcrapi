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
import jcrapi.model.TopClans;
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
    public void shouldGetVersion() throws IOException {
        String version = new Api(URL).getVersion();
        Integer.valueOf(version.replace(".", ""));
    }

    @Test
    public void shouldGetProfile() throws IOException {
        Profile profile = new Api(URL).getProfile("Y99YRPYG");
        assertEquals("Y99YRPYG", profile.getTag());
    }

    @Test
    public void shouldGetTopClans() throws IOException {
        TopClans topClans = new Api(URL).getTopClans();
        assertTrue(topClans.getLastUpdated() > 0);
    }

    @Test
    public void shouldGetClan() throws IOException {
        DetailedClan detailedClan = new Api(URL).getClan("2CCCP");
        assertEquals("2CCCP", detailedClan.getTag());
    }

    @Test
    public void shouldGetClans() throws IOException {
        List<String> tags = new ArrayList<String>();
        tags.add("2CCCP");
        tags.add("2U2GGQJ");
        List<DetailedClan> detailedClans = new Api(URL).getClans(tags);
        assertEquals("2CCCP", detailedClans.get(0).getTag());
        assertEquals("2U2GGQJ", detailedClans.get(1).getTag());
    }

    @Test
    public void shouldGetConstants() throws IOException {
        Constants constants = new Api(URL).getConstants();
        assertTrue(constants.getAlliance().getRoles().size() > 0);
    }

}
