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
import com.google.common.collect.ImmutableMap;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
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
import jcrapi.model.TopClan;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
        return createCrawler().get(createUrl("version"), createAuthHeader(developerKey));
    }

    private Map<String, String> createAuthHeader(String developerKey) {
        return ImmutableMap.<String, String>builder().put("auth", developerKey).build();
    }

    private Crawler createCrawler() {
        return crawlerFactory.createCrawler();
    }

    private String createUrl(String part) {
        StringBuilder s = new StringBuilder();
        s.append(url);
        s.append(part);
        return s.toString();
    }

    Profile getProfile(String tag) throws IOException {
        checkString(tag);
        String json = createCrawler().get(createUrl("player/" + tag), createAuthHeader(developerKey));
        return new Gson().fromJson(json, Profile.class);
    }

    List<Profile> getProfiles(List<String> tags) throws IOException {
        Preconditions.checkArgument(CollectionUtils.isNotEmpty(tags));
        String json = createCrawler().get(createUrl("player/" + StringUtils.join(tags, ",")), createAuthHeader(developerKey));
        Type listType = new TypeToken<ArrayList<Profile>>(){}.getType();
        return new Gson().fromJson(json, listType);
    }

    List<TopClan> getTopClans() throws IOException {
        String json = createCrawler().get(createUrl("top/clans"), createAuthHeader(developerKey));
        Type listType = new TypeToken<ArrayList<TopClan>>(){}.getType();
        return new Gson().fromJson(json, listType);
    }

    Clan getClan(String tag) throws IOException {
        checkString(tag);
        String json = createCrawler().get(createUrl("clan/" + tag), createAuthHeader(developerKey));
        return new Gson().fromJson(json, Clan.class);
    }

    List<Clan> getClans(List<String> tags) throws IOException {
        Preconditions.checkArgument(CollectionUtils.isNotEmpty(tags));
        String json = createCrawler().get(createUrl("clan/" + StringUtils.join(tags, ",")), createAuthHeader(developerKey));
        Type listType = new TypeToken<ArrayList<Clan>>(){}.getType();
        return new Gson().fromJson(json, listType);
    }

    Constants getConstants() throws IOException {
        String json = createCrawler().get(createUrl("constants"), createAuthHeader(developerKey));
        return new Gson().fromJson(json, Constants.class);
    }

    Alliance getAllianceConstants() throws IOException {
        String json = createCrawler().get(createUrl("constants/alliance/"), createAuthHeader(developerKey));
        return new Gson().fromJson(json, Alliance.class);
    }

    List<Arena> getArenasConstants() throws IOException {
        String json = createCrawler().get(createUrl("constants/arenas/"), createAuthHeader(developerKey));
        Type listType = new TypeToken<ArrayList<Arena>>(){}.getType();
        return new Gson().fromJson(json, listType);
    }

    Badges getBadgesConstants() throws IOException {
        String json = createCrawler().get(createUrl("constants/badges/"), createAuthHeader(developerKey));
        return new Gson().fromJson(json, Badges.class);
    }

    ChestCycleList getChestCycleConstants() throws IOException {
        String json = createCrawler().get(createUrl("constants/chestCycle/"), createAuthHeader(developerKey));
        return new Gson().fromJson(json, ChestCycleList.class);
    }

    List<CountryCode> getCountryCodesConstants() throws IOException {
        String json = createCrawler().get(createUrl("constants/countryCodes/"), createAuthHeader(developerKey));
        Type listType = new TypeToken<ArrayList<CountryCode>>(){}.getType();
        return new Gson().fromJson(json, listType);
    }

    List<Rarity> getRaritiesConstants() throws IOException {
        String json = createCrawler().get(createUrl("constants/rarities/"), createAuthHeader(developerKey));
        Type listType = new TypeToken<ArrayList<Rarity>>(){}.getType();
        return new Gson().fromJson(json, listType);
    }

    List<ConstantCard> getCardsConstants() throws IOException {
        String json = createCrawler().get(createUrl("constants/cards/"), createAuthHeader(developerKey));
        Type listType = new TypeToken<ArrayList<ConstantCard>>(){}.getType();
        return new Gson().fromJson(json, listType);
    }

}
