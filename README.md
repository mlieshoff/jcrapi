# Java CR-API Connector

## Simplest Usage ##

```java
// connect to api
Api api = new Api(Endpoints.BASE.getCode(), "my-developer-key");
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


