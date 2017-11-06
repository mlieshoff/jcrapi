package jcrapi;
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

import com.google.gson.Gson;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * @author Michael Lieshoff
 */
public class LiveTest {

    private static final String URL = "http://api.cr-api.com/";

    private Api api;

    private Crawler crawler;

    @Before
    public void setUp() {
        api = new Api(URL);
        crawler = new CrawlerFactory().createCrawler();
    }

    @Test
    public void version() throws Exception {
        assertEquals(crawler.get(URL + "version"), api.getVersion());
    }

    @Ignore
    public void profile() throws Exception {
        assertEquals(crawler.get(URL + "profile/Y99YRPYG"), new Gson().toJson(api.getProfile("Y99YRPYG")));
    }

    @Ignore
    public void multiClans() throws Exception {
        assertEquals(crawler.get(URL + "clan/2CCCP,2U2GGQJ"), new Gson().toJson(api.getClans(Arrays.asList("2CCCP,2U2GGQJ".split(",")))));
    }

    @Ignore
    public void clan() throws Exception {
        assertEquals(crawler.get(URL + "clan/2CCCP"), new Gson().toJson(api.getClan("2CCCP")));
    }

    @Ignore
    public void topClans() throws Exception {
        assertEquals(crawler.get(URL + "top/clans"), new Gson().toJson(api.getTopClans()));
    }

    @Ignore
    public void constants() throws Exception {
        assertEquals(crawler.get(URL + "constants"), new Gson().toJson(api.getConstants()));
    }

}
