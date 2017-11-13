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
import jcrapi.model.Constants;
import jcrapi.model.DetailedClan;
import jcrapi.model.Profile;
import jcrapi.model.TopClans;
import org.apache.commons.collections.CollectionUtils;

import java.io.IOException;
import java.util.List;

/**
 * @author Michael Lieshoff
 */
public class Api {

    private final ClientFactory clientFactory;

    private final String url;

    public Api(String url) {
        this(url, new ClientFactory());
    }

    Api(String url, ClientFactory clientFactory) {
        checkString(url);
        this.url = url;
        this.clientFactory = clientFactory;
    }

    private void checkString(String url) {
        Preconditions.checkNotNull(url);
        Preconditions.checkArgument(url.length() > 0, url);
    }

    public String getVersion() {
        try {
            return clientFactory.createClient(url).getVersion();
        } catch (IOException e) {
            throw new ApiException(e);
        }
    }

    public Profile getProfile(String tag) {
        checkString(tag);
        try {
            return clientFactory.createClient(url).getProfile(tag);
        } catch (IOException e) {
            throw new ApiException(e);
        }
    }

    public List<Profile> getProfiles(List<String> tags) {
        Preconditions.checkArgument(CollectionUtils.isNotEmpty(tags));
        try {
            return clientFactory.createClient(url).getProfiles(tags);
        } catch (IOException e) {
            throw new ApiException(e);
        }
    }

    public TopClans getTopClans() {
        try {
            return clientFactory.createClient(url).getTopClans();
        } catch (IOException e) {
            throw new ApiException(e);
        }
    }

    public DetailedClan getClan(String tag) {
        checkString(tag);
        try {
            return clientFactory.createClient(url).getClan(tag);
        } catch (IOException e) {
            throw new ApiException(e);
        }
    }

    public List<DetailedClan> getClans(List<String> tags) {
        Preconditions.checkArgument(CollectionUtils.isNotEmpty(tags));
        try {
            return clientFactory.createClient(url).getClans(tags);
        } catch (IOException e) {
            throw new ApiException(e);
        }
    }

    public Constants getConstants() {
        try {
            return clientFactory.createClient(url).getConstants();
        } catch (IOException e) {
            throw new ApiException(e);
        }
    }

}
