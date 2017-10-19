# Java CR-API Connector

## Simplest Usage ##

```java
// connect to api
Api api = new Api("http://api.cr-api.com/");
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
// get clan
DetailedClan detailedClan = api.getClan("RP88QQG"));
```

```java
// get list of clans
List<DetailedClan> detailedClans = api.getClans(Arrays.asList("RP88QQG", "2CCCP"));
```

```java
// constants
Constants constants = api.getConstants();
```

```java
// get top clans
TopClans topClans = api.getTopClans();
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


