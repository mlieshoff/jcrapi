# Java CR-API Connector

## Actual version: v12.0.104-RC1

## Simplest Usage ##

```java
// connect to api
Api api = new Api("http://api.royaleapi.com/", "my-developer-key"); // standard auth mode
Api api = new Api("http://api.royaleapi.com/", "my-developer-key", AuthMode.BEARER);
```

```java
// get version
String version = api.getVersion();
```

```java
// get profile
Profile profile = api.getProfile(ProfileRequest.builder("2PGGCJJL")
    .keys(Arrays.asList("name", "clan", "tag"))
    .excludes(Arrays.asList("battles"))
    .build()
);
```

```java
// get profiles
List<Profile> profiles = api.getProfiles(ProfilesRequest.builder(Arrays.asList("L88P2282", "9CQ2U8QJ", "8L9L9GL"))
    .keys(Arrays.asList("name", "clan", "tag"))
    .excludes(Arrays.asList("battles"))
    .limit(10)
    .max(5)
    .page(2)
    .build()
);
```

```java
// get clan
Clan clan = api.getClan(ClanRequestBuilder.builder("RP88QQG")
    .keys(Arrays.asList("name", "clan", "tag"))
    .excludes(Arrays.asList("battles"))
    .build());
```

```java
// get list of clans
List<Clan> clans = api.getClans(ClanRequestBuilder.builder(Arrays.asList("RP88QQG", "2CCCP"))
    .keys(Arrays.asList("name", "clan", "tag"))
    .excludes(Arrays.asList("battles"))
    .limit(10)
    .max(5)
    .page(2)
    .build());
```

```java
// clan search
List<Clan> clans = api.getClanSearch(ClanSearchRequest.builder()
    .setName("abc")
    .setScore(500)
    .setMinMembers(10)
    .setMaxMembers(25)
    .keys(Arrays.asList("name", "clan", "tag"))
    .excludes(Arrays.asList("battles"))
    .limit(10)
    .max(5)
    .page(2)
    .build());
```

```java
// get tournaments
Tournament tournament = api.getTournaments(TournamentRequest.builder()
    .tag("XYZHHG")
    .keys(Arrays.asList("name", "clan", "tag"))
    .excludes(Arrays.asList("battles"))
    .build());
```

```java
// get top clans
List<TopClan> topClansForEu = api.getTopClans(TopClanRequest.builder()
    .locationKey("EU")
    .keys(Arrays.asList("name", "clan", "tag"))
    .excludes(Arrays.asList("battles"))
    .limit(10)
    .max(5)
    .page(2)
    .build());
```

```java
// get top players
List<TopPlayer> topPlayersForEu = api.getTopPlayers(TopPlayerRequest.builder()
    .locationKey("EU")
    .keys(Arrays.asList("name", "clan", "tag"))
    .excludes(Arrays.asList("battles"))
    .limit(10)
    .max(5)
    .page(2)
    .build());
```

```java
// get endpoints
Endpoints endpoints = api.getEndpoints();
```

```java
// get popular clans
List<PopularClan> popularClans = api.getPopularClans(PopularClans.builder()
    .keys(Arrays.asList("name", "clan", "tag"))
    .excludes(Arrays.asList("battles"))
    .limit(10)
    .max(5)
    .page(2)
    .build());
```

```java
// get popular players
List<PopularPlayer> popularPlayers = api.getPopularPlayers(PopularPlayers.builder()
    .keys(Arrays.asList("name", "clan", "tag"))
    .excludes(Arrays.asList("battles"))
    .limit(10)
    .max(5)
    .page(2)
    .build());
```

```java
// get popular tournaments
List<PopularTournament> popularTournaments = api.getPopularTournaments(PopularTournaments.builder()
    .keys(Arrays.asList("name", "clan", "tag"))
    .excludes(Arrays.asList("battles"))
    .limit(10)
    .max(5)
    .page(2)
    .build());
```

```java
// get clan battles
List<Battle> clanBattles = api.getClanBattles(ClanBattleRequest.builder("RP88QQG")
    .keys(Arrays.asList("name", "clan", "tag"))
    .excludes(Arrays.asList("cards"))
    .limit(10)
    .max(5)
    .page(2)
    .build());
```

```java
// get clan history
ClanHistory clanHistory = api.getClanHistory(ClanHistoryRequest.builder("RP88QQG")
    .days(1)
    .keys(Arrays.asList("name", "clan", "tag"))
    .excludes(Arrays.asList("cards"))
    .limit(10)
    .max(5)
    .page(2)
    .build());
```

```java
// get clan war log
List<ClanWarLog> clanWarLogs = api.getClanWarLog(ClanWarLogRequest.builder("RP88QQG")
    .tag("RP88QQG");
    .keys(Arrays.asList("name", "clan", "tag"))
    .excludes(Arrays.asList("cards"))
    .limit(10)
    .max(5)
    .page(2)
    .build());
```

```java
// get clan war
ClanWar clanWar = api.getClanWarLog(ClanWarRequest.builder("RP88QQG")
    .tag("RP88QQG");
    .keys(Arrays.asList("name", "clan", "tag"))
    .excludes(Arrays.asList("cards"))
    .build());
```

```java
// get open tournaments
List<OpenTournament> openTournaments = api.getOpenTournaments(OpenTournamentsRequest.builder()
    .keys(Arrays.asList("name", "clan", "tag"))
    .excludes(Arrays.asList("cards"))
    .limit(10)
    .max(5)
    .page(2)
    .build());
```

```java
// get known tournaments
List<KnownTournament> knownTournaments = api.getKnownTournaments(KnownTournamentsRequest.builder()
    .keys(Arrays.asList("name", "clan", "tag"))
    .excludes(Arrays.asList("cards"))
    .limit(10)
    .max(5)
    .page(2)
    .build());
```

```java
// tournament search
List<Clan> clans = api.getTournamentSearch(TournamentSearchRequest.builder()
    .setName("abc")
    .keys(Arrays.asList("name", "clan", "tag"))
    .excludes(Arrays.asList("battles"))
    .limit(10)
    .max(5)
    .page(2)
    .build());
```

```java
// get player battles
List<List<Battle>> battles = api.getPlayerBattles(PlayerBattlesRequest.builder(Arrays.asList("L88P2282", "9CQ2U8QJ", "8L9L9GL"))
    .keys(Arrays.asList("name", "clan", "tag"))
    .excludes(Arrays.asList("cards"))
    .limit(10)
    .max(5)
    .page(2)
    .build());
```

```java
// get player chests
List<ChestCycle> chestCycles = api.getPlayerChests(PlayerChestsRequest.builder(Arrays.asList("L88P2282", "9CQ2U8QJ", "8L9L9GL"))
    .keys(Arrays.asList("name", "clan", "tag"))
    .excludes(Arrays.asList("cards"))
    .limit(10)
    .max(5)
    .page(2)
    .build());
```

```java
// get popular decks
List<PopularDeck> popularDecks = api.getPopularDecks(PopularDecksRequest.builder()
    .keys(Arrays.asList("name", "clan", "tag"))
    .excludes(Arrays.asList("cards"))
    .limit(10)
    .max(5)
    .page(2)
    .build());
```

```java
// get clan tracking
ClanTracking clanTracking = api.getClanTracking(ClanTrackingRequest.builder()
    .keys(Arrays.asList("name", "clan", "tag"))
    .excludes(Arrays.asList("cards"))
    .build());
```

```java
// get auth stats
AuthStats authStats = api.getAuthStats(AuthStatsRequest.builder()
    .keys(Arrays.asList("name", "clan", "tag"))
    .excludes(Arrays.asList("cards"))
    .build());
```

```java
// get thread safe last response object from last request 
Response response = api.getLastResponse();

String raw = response.getRaw();
Map<String, String> responseHeaders = response.getResponseHeaders();
int rateLimit = response.getRateLimit();
int rateRemaining = response.getRateRemaining();

```

## How to bind the bintray repository ##

```xml
<repository>
    <id>org-mili-repo</id>
    <url>http://dl.bintray.com/mlieshoff/maven</url>
    <releases>
        <enabled>true</enabled>
    </releases>
    <snapshots>
        <enabled>false</enabled>
    </snapshots>
</repository>
```
## Continuous Integration ##

https://travis-ci.org/mlieshoff/jcrapi

## Repository ##

https://bintray.com/mlieshoff/maven/jcrapi


