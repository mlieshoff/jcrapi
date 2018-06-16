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
import jcrapi.model.AuthStats;
import jcrapi.model.Battle;
import jcrapi.model.ChestCycle;
import jcrapi.model.Clan;
import jcrapi.model.ClanHistory;
import jcrapi.model.ClanSearch;
import jcrapi.model.ClanTracking;
import jcrapi.model.ClanWar;
import jcrapi.model.ClanWarLog;
import jcrapi.model.ClanWeeklyHistory;
import jcrapi.model.Endpoints;
import jcrapi.model.KnownTournament;
import jcrapi.model.OpenTournament;
import jcrapi.model.PopularClan;
import jcrapi.model.PopularDeck;
import jcrapi.model.PopularPlayer;
import jcrapi.model.PopularTournament;
import jcrapi.model.Profile;
import jcrapi.model.SearchedTournament;
import jcrapi.model.TopClan;
import jcrapi.model.TopPlayer;
import jcrapi.model.Tournament;
import jcrapi.request.AuthStatsRequest;
import jcrapi.request.ClanBattlesRequest;
import jcrapi.request.ClanHistoryRequest;
import jcrapi.request.ClanRequest;
import jcrapi.request.ClanSearchRequest;
import jcrapi.request.ClanTrackingRequest;
import jcrapi.request.ClanWarLogRequest;
import jcrapi.request.ClanWarRequest;
import jcrapi.request.ClanWeeklyHistoryRequest;
import jcrapi.request.KnownTournamentsRequest;
import jcrapi.request.OpenTournamentsRequest;
import jcrapi.request.PlayerBattlesRequest;
import jcrapi.request.PlayerChestsRequest;
import jcrapi.request.PopularClansRequest;
import jcrapi.request.PopularDecksRequest;
import jcrapi.request.PopularPlayersRequest;
import jcrapi.request.PopularTournamentsRequest;
import jcrapi.request.ProfileRequest;
import jcrapi.request.ProfilesRequest;
import jcrapi.request.TopClansRequest;
import jcrapi.request.TopPlayersRequest;
import jcrapi.request.TournamentSearchRequest;
import jcrapi.request.TournamentsRequest;
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
    private AuthMode authMode;

    public Api(String url, String developerKey) {
        this(url, developerKey, new ClientFactory(), AuthMode.NORMAL);
    }

    public Api(String url, String developerKey, AuthMode authMode) {
        this(url, developerKey, new ClientFactory(), authMode);
    }

    Api(String url, String developerKey, ClientFactory clientFactory, AuthMode authMode) {
        checkString(url, "url");
        checkString(developerKey, "developerKey");
        this.url = url;
        this.developerKey = developerKey;
        this.clientFactory = clientFactory;
        this.authMode = authMode;
    }

    private void checkString(String s, String key) {
        Preconditions.checkNotNull(s, key);
        Preconditions.checkArgument(s.length() > 0, key);
    }

    public String getVersion() {
        try {
            return createClient().getVersion();
        } catch (IOException e) {
            throw new ApiException(e);
        }
    }

    private Client createClient() {
        return clientFactory.createClient(url, developerKey, authMode);
    }

    @Deprecated
    public Profile getProfile(String tag) {
        return getProfile(ProfileRequest.builder(tag).build());
    }

    public Profile getProfile(ProfileRequest profileRequest) {
        Preconditions.checkNotNull(profileRequest, "profileRequest");
        try {
            return createClient().getProfile(profileRequest);
        } catch (IOException e) {
            throw new ApiException(e);
        }
    }

    @Deprecated
    public List<Profile> getProfiles(List<String> tags) {
        return getProfiles(ProfilesRequest.builder(tags).build());
    }

    public List<Profile> getProfiles(ProfilesRequest profilesRequest) {
        Preconditions.checkNotNull(profilesRequest, "profilesRequest");
        try {
            return createClient().getProfiles(profilesRequest);
        } catch (IOException e) {
            throw new ApiException(e);
        }
    }

    public List<TopClan> getTopClans() {
        return getTopClans(TopClansRequest.builder().build());
    }

    @Deprecated
    public List<TopClan> getTopClans(String locationKey) {
        try {
            return createClient().getTopClans(TopClansRequest.builder().locationKey(locationKey).build()
            );
        } catch (IOException e) {
            throw new ApiException(e);
        }
    }

    public List<TopClan> getTopClans(TopClansRequest topClansRequest) {
        try {
            return createClient().getTopClans(topClansRequest);
        } catch (IOException e) {
            throw new ApiException(e);
        }
    }

    @Deprecated
    public Clan getClan(String tag) {
        return getClan(ClanRequest.builder(tag).build());
    }

    public Clan getClan(ClanRequest clanRequest) {
        Preconditions.checkNotNull(clanRequest);
        try {
            return createClient().getClan(clanRequest);
        } catch (IOException e) {
            throw new ApiException(e);
        }
    }

    public List<Clan> getClans(List<String> tags) {
        Preconditions.checkArgument(CollectionUtils.isNotEmpty(tags));
        try {
            return createClient().getClans(tags);
        } catch (IOException e) {
            throw new ApiException(e);
        }
    }

    @Deprecated
    public List<Clan> getClanSearch(ClanSearch clanSearch) {
        try {
            return createClient().getClanSearch(clanSearch);
        } catch (IOException e) {
            throw new ApiException(e);
        }
    }

    public List<Clan> getClanSearch(ClanSearchRequest clanSearchRequest) {
        try {
            return createClient().getClanSearch(clanSearchRequest);
        } catch (IOException e) {
            throw new ApiException(e);
        }
    }

    public List<TopPlayer> getTopPlayers() {
        return getTopPlayers(TopPlayersRequest.builder().build());
    }

    @Deprecated
    public List<TopPlayer> getTopPlayers(String locationKey) {
        try {
            return createClient().getTopPlayers(TopPlayersRequest.builder().locationKey(locationKey).build());
        } catch (IOException e) {
            throw new ApiException(e);
        }
    }

    public List<TopPlayer> getTopPlayers(TopPlayersRequest topPlayersRequest) {
        try {
            return createClient().getTopPlayers(topPlayersRequest);
        } catch (IOException e) {
            throw new ApiException(e);
        }
    }

    @Deprecated
    public Tournament getTournaments(String tag) {
        return getTournaments(TournamentsRequest.builder(tag).build());
    }

    public Tournament getTournaments(TournamentsRequest tournamentsRequest) {
        Preconditions.checkNotNull(tournamentsRequest);
        try {
            return createClient().getTournaments(tournamentsRequest);
        } catch (IOException e) {
            throw new ApiException(e);
        }
    }

    public Endpoints getEndpoints() {
        try {
            return createClient().getEndpoints();
        } catch (IOException e) {
            throw new ApiException(e);
        }
    }

    @Deprecated
    public List<PopularClan> getPopularClans() {
        return getPopularClans(PopularClansRequest.builder().build());
    }

    public List<PopularClan> getPopularClans(PopularClansRequest popularClansRequest) {
        try {
            return createClient().getPopularClans(popularClansRequest);
        } catch (IOException e) {
            throw new ApiException(e);
        }
    }

    @Deprecated
    public List<PopularPlayer> getPopularPlayers() {
        return getPopularPlayers(PopularPlayersRequest.builder().build());
    }

    public List<PopularPlayer> getPopularPlayers(PopularPlayersRequest popularPlayersRequest) {
        try {
            return createClient().getPopularPlayers(popularPlayersRequest);
        } catch (IOException e) {
            throw new ApiException(e);
        }
    }

    @Deprecated
    public List<PopularTournament> getPopularTournaments() {
        return getPopularTournaments(PopularTournamentsRequest.builder().build());
    }

    public List<PopularTournament> getPopularTournaments(PopularTournamentsRequest popularTournamentsRequest) {
        try {
            return createClient().getPopularTournaments(popularTournamentsRequest);
        } catch (IOException e) {
            throw new ApiException(e);
        }
    }

    @Deprecated
    public List<Battle> getClanBattles(String tag) {
        return getClanBattles(ClanBattlesRequest.builder(tag).build());
    }

    public List<Battle> getClanBattles(ClanBattlesRequest clanBattlesRequest) {
        try {
            return createClient().getClanBattles(clanBattlesRequest);
        } catch (IOException e) {
            throw new ApiException(e);
        }
    }

    @Deprecated
    public ClanHistory getClanHistory(String tag) {
        return getClanHistory(ClanHistoryRequest.builder(tag).build());
    }

    public ClanHistory getClanHistory(ClanHistoryRequest clanHistoryRequest) {
        try {
            return createClient().getClanHistory(clanHistoryRequest);
        } catch (IOException e) {
            throw new ApiException(e);
        }
    }

    public ClanWeeklyHistory getClanWeeklyHistory(ClanWeeklyHistoryRequest clanWeeklyHistoryRequest) {
        try {
            return createClient().getClanWeeklyHistory(clanWeeklyHistoryRequest);
        } catch (IOException e) {
            throw new ApiException(e);
        }
    }

    public List<OpenTournament> getOpenTournaments(OpenTournamentsRequest openTournamentsRequest) {
        try {
            return createClient().getOpenTournaments(openTournamentsRequest);
        } catch (IOException e) {
            throw new ApiException(e);
        }
    }

    public List<KnownTournament> getKnownTournaments(KnownTournamentsRequest knownTournamentsRequest) {
        try {
            return createClient().getKnownTournaments(knownTournamentsRequest);
        } catch (IOException e) {
            throw new ApiException(e);
        }
    }

    public List<SearchedTournament> getTournamentSearch(TournamentSearchRequest tournamentSearchRequest) {
        try {
            return createClient().getTournamentSearch(tournamentSearchRequest);
        } catch (IOException e) {
            throw new ApiException(e);
        }
    }

    public List<List<Battle>> getPlayerBattles(PlayerBattlesRequest playerBattlesRequest) {
        try {
            return createClient().getPlayerBattles(playerBattlesRequest);
        } catch (IOException e) {
            throw new ApiException(e);
        }
    }

    public List<ChestCycle> getPlayerChests(PlayerChestsRequest playerChestsRequest) {
        try {
            return createClient().getPlayerChests(playerChestsRequest);
        } catch (IOException e) {
            throw new ApiException(e);
        }
    }

    public List<PopularDeck> getPopularDecks(PopularDecksRequest popularDecksRequest) {
        try {
            return createClient().getPopularDecks(popularDecksRequest);
        } catch (IOException e) {
            throw new ApiException(e);
        }
    }

    public ClanTracking getClanTracking(ClanTrackingRequest clanTrackingRequest) {
        try {
            return createClient().getClanTracking(clanTrackingRequest);
        } catch (IOException e) {
            throw new ApiException(e);
        }
    }

    public List<ClanWarLog> getClanWarLog(ClanWarLogRequest clanWarLogRequest) {
        try {
            return createClient().getClanWarLog(clanWarLogRequest);
        } catch (IOException e) {
            throw new ApiException(e);
        }
    }

    public ClanWar getClanWar(ClanWarRequest clanWarRequest) {
        try {
            return createClient().getClanWar(clanWarRequest);
        } catch (IOException e) {
            throw new ApiException(e);
        }
    }

    public AuthStats getAuthStats(AuthStatsRequest authStatsRequest) {
        try {
            return createClient().getAuthStats(authStatsRequest);
        } catch (IOException e) {
            throw new ApiException(e);
        }
    }

    public Response getLastResponse() {
        return createClient().getLastResponse();
    }

}