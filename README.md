# Java CR-API Connector

## Simplest Usage ##

```java
// connect to api
Api api = new Api("http://api.cr-api.com/", "my-developer-key");
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
    .build());
```

```java
// get top players
List<TopPlayer> topPlayersForEu = api.getTopPlayers(TopPlayerRequest.builder()
    .locationKey("EU")
    .keys(Arrays.asList("name", "clan", "tag"))
    .excludes(Arrays.asList("battles"))
    .limit(10)
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
    .build());
```

```java
// get popular players
List<PopularPlayer> popularPlayers = api.getPopularPlayers(PopularPlayers.builder()
    .keys(Arrays.asList("name", "clan", "tag"))
    .excludes(Arrays.asList("battles"))
    .limit(10)
    .build());
```

```java
// get popular tournaments
List<PopularTournament> popularTournaments = api.getPopularTournaments(PopularTournaments.builder()
    .keys(Arrays.asList("name", "clan", "tag"))
    .excludes(Arrays.asList("battles"))
    .limit(10)
    .build());
```

```java
// get clan battles
List<Battle> clanBattles = api.getClanBattles(ClanBattleRequest.builder("RP88QQG")
    .keys(Arrays.asList("name", "clan", "tag"))
    .excludes(Arrays.asList("cards"))
    .limit(10)
    .build());
```

```java
// get clan history
ClanHistory clanHistory = api.getClanHistory(ClanHistoryRequest.builder("RP88QQG")
    .keys(Arrays.asList("name", "clan", "tag"))
    .excludes(Arrays.asList("cards"))
    .limit(10)
    .build());
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


