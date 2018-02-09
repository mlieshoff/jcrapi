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
Profile profile = api.getProfile("2PGGCJJL");
```

```java
// get profile
Profile profile = api.getProfile(ProfileRequest.builder()
    .tag("2PGGCJJL")
    .includes(Arrays.asList("name", "clan", "tag"))
    .excludes(Arrays.asList("battles"))
    .build()
);
```

```java
// get profiles
List<Profile> profiles = api.getProfiles("L88P2282,9CQ2U8QJ,8L9L9GL");
```

```java
// get clan
Clan clan = api.getClan("RP88QQG"));

// instead of
// DetailedClan detailedClan = api.getClan("RP88QQG"));
```

```java
// get list of clans
List<Clan> clans = api.getClans(Arrays.asList("RP88QQG", "2CCCP"));

// instead of
// List<DetailedClan> clans = api.getClans(Arrays.asList("RP88QQG", "2CCCP"));
```

```java
// clan search
List<Clan> clans = api.getClanSearch();

// all set values are optional
ClanSearch clanSearch = new ClanSearch();
clanSearch.setName("abc");
clanSearch.setScore(500);
clanSearch.setMinMembers(10);
clanSearch.setMaxMembers(25);
List<Clan> clansWithCriteria = api.getClanSearch(clanSearch);
```

```java
// get top clans
List<TopClan> topClans = api.getTopClans();
List<TopClan> topClansForEu = api.getTopClans("EU");

// instead of
// TopClans topClans = api.getTopClans();
```

```java
// get top players
List<TopPlayer> topPlayers = api.getTopPlayers();
List<TopPlayer> topPlayersForEu = api.getTopPlayers("EU");
```

```java
// constants
Constants constants = api.getConstants();
Alliance alliance = api.getAllianceConstants();
List<Arena> arenas = api.getArenasConstants();
Badges badges = api.getBadgesConstants();
ChestCycleList chestCycleList = api.getChestCycleConstants();
List<CountryCode> countryCodes = api.getCountryCodesConstants();
List<Rarity> rarities = api.getRaritiesConstants();
List<ConstantCard> constantCards = api.getCardsConstants();
```

```java
// get endpoints
Endpoints endpoints = api.getEndpoints();
```

```java
// get popular clans
List<PopularClan> popularClans = api.getPopularClans();
```

```java
// get popular players
List<PopularPlayer> popularPlayers = api.getPopularPlayers();
```

```java
// get popular tournaments
List<PopularTournament> popularTournaments = api.getPopularTournaments();
```

```java
// get clan battles
List<Battle> clanBattles = api.getClanBattles("RP88QQG");
```

```java
// get clan history
ClanHistory clanHistory = api.getClanHistory("RP88QQG");
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


