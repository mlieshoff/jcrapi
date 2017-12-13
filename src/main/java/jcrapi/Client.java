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

import com.google.common.base.Preconditions;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import jcrapi.model.Constants;
import jcrapi.model.DetailedClan;
import jcrapi.model.Profile;
import jcrapi.model.TopClans;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Michael Lieshoff
 */
class Client {

    private final String url;
    private final String developerKey;

    private final CrawlerFactory crawlerFactory;

    Client(String url, String developerKey, CrawlerFactory crawlerFactory) {
        checkString(url);
        Preconditions.checkNotNull(crawlerFactory);
        this.url = url;
        this.developerKey = developerKey;
        this.crawlerFactory = crawlerFactory;
    }

    private void checkString(String url) {
        Preconditions.checkNotNull(url);
        Preconditions.checkArgument(url.length() > 0, url);
    }

    String getVersion() throws IOException {
        return createCrawler().get(createUrl("version"));
    }

    private Crawler createCrawler() {
        return crawlerFactory.createCrawler();
    }

    private String createUrl(String part) {
        StringBuilder s = new StringBuilder();
        s.append(url);
        s.append(part);
        if (developerKey != null) {
            s.append("?auth=");
            s.append(developerKey);
        }
        return s.toString();
    }

    Profile getProfile(String tag) throws IOException {
        checkString(tag);
        String json = createCrawler().get(createUrl("profile/" + tag));
        return new Gson().fromJson(json, Profile.class);
    }

    List<Profile> getProfiles(List<String> tags) throws IOException {
        Preconditions.checkArgument(CollectionUtils.isNotEmpty(tags));
        String json = createCrawler().get(createUrl("profile/" + StringUtils.join(tags, ",")));
        Type listType = new TypeToken<ArrayList<Profile>>(){}.getType();
        return new Gson().fromJson(json, listType);
    }

    TopClans getTopClans() throws IOException {
        String json = createCrawler().get(createUrl("top/clans"));
        return new Gson().fromJson(json, TopClans.class);
    }

    DetailedClan getClan(String tag) throws IOException {
        checkString(tag);
        String json = createCrawler().get(createUrl("clan/" + tag));
        return new Gson().fromJson(json, DetailedClan.class);
    }

    List<DetailedClan> getClans(List<String> tags) throws IOException {
        Preconditions.checkArgument(CollectionUtils.isNotEmpty(tags));
        String json = createCrawler().get(createUrl("clan/" + StringUtils.join(tags, ",")));
        Type listType = new TypeToken<ArrayList<DetailedClan>>(){}.getType();
        return new Gson().fromJson(json, listType);
    }

    Constants getConstants() throws IOException {
        String json = createCrawler().get(createUrl("constants"));
        return new Gson().fromJson(json, Constants.class);
    }

}
