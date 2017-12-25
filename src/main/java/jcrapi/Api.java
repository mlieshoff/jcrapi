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

import java.io.IOException;
import java.util.List;

/**
 * @author Michael Lieshoff
 */
public class Api {

    private final ClientFactory clientFactory;

    private final String url;
    private final String developerKey;

    public Api(String url, String developerKey) {
        this(url, developerKey, new ClientFactory());
    }

    Api(String url, String developerKey, ClientFactory clientFactory) {
        checkString(url, "url");
        checkString(developerKey, "developerKey");
        this.url = url;
        this.developerKey = developerKey;
        this.clientFactory = clientFactory;
    }

    private void checkString(String s, String key) {
        Preconditions.checkNotNull(s, key);
        Preconditions.checkArgument(s.length() > 0, key);
    }

    public String getVersion() {
        try {
            return clientFactory.createClient(url, developerKey).getVersion();
        } catch (IOException e) {
            throw new ApiException(e);
        }
    }

    public Profile getProfile(String tag) {
        checkString(tag, "tag");
        try {
            return clientFactory.createClient(url, developerKey).getProfile(tag);
        } catch (IOException e) {
            throw new ApiException(e);
        }
    }

    public List<Profile> getProfiles(List<String> tags) {
        Preconditions.checkArgument(CollectionUtils.isNotEmpty(tags));
        try {
            return clientFactory.createClient(url, developerKey).getProfiles(tags);
        } catch (IOException e) {
            throw new ApiException(e);
        }
    }

    public List<TopClan> getTopClans() {
        try {
            return clientFactory.createClient(url, developerKey).getTopClans();
        } catch (IOException e) {
            throw new ApiException(e);
        }
    }

    public Clan getClan(String tag) {
        checkString(tag, "tag");
        try {
            return clientFactory.createClient(url, developerKey).getClan(tag);
        } catch (IOException e) {
            throw new ApiException(e);
        }
    }

    public List<Clan> getClans(List<String> tags) {
        Preconditions.checkArgument(CollectionUtils.isNotEmpty(tags));
        try {
            return clientFactory.createClient(url, developerKey).getClans(tags);
        } catch (IOException e) {
            throw new ApiException(e);
        }
    }

    public Constants getConstants() {
        try {
            return clientFactory.createClient(url, developerKey).getConstants();
        } catch (IOException e) {
            throw new ApiException(e);
        }
    }

    public Alliance getAllianceConstants() {
        try {
            return clientFactory.createClient(url, developerKey).getAllianceConstants();
        } catch (IOException e) {
            throw new ApiException(e);
        }
    }

    public List<Arena> getArenasConstants() {
        try {
            return clientFactory.createClient(url, developerKey).getArenasConstants();
        } catch (IOException e) {
            throw new ApiException(e);
        }
    }

    public Badges getBadgesConstants() {
        try {
            return clientFactory.createClient(url, developerKey).getBadgesConstants();
        } catch (IOException e) {
            throw new ApiException(e);
        }
    }

    public ChestCycleList getChestCycleConstants() {
        try {
            return clientFactory.createClient(url, developerKey).getChestCycleConstants();
        } catch (IOException e) {
            throw new ApiException(e);
        }
    }

    public List<CountryCode> getCountryCodesConstants() {
        try {
            return clientFactory.createClient(url, developerKey).getCountryCodesConstants();
        } catch (IOException e) {
            throw new ApiException(e);
        }
    }

    public List<Rarity> getRaritiesConstants() {
        try {
            return clientFactory.createClient(url, developerKey).getRaritiesConstants();
        } catch (IOException e) {
            throw new ApiException(e);
        }
    }

    public List<ConstantCard> getCardsConstants() {
        try {
            return clientFactory.createClient(url, developerKey).getCardsConstants();
        } catch (IOException e) {
            throw new ApiException(e);
        }
    }

}



