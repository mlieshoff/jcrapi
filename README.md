# Java CR-API Connector

## Simplest Usage ##

Api api = new Api("http://api.cr-api.com/");

String version = api.getVersion();

Profile profile = api.getProfile("2PGGCJJL");

List<DetailedClan> detailedClans = api.getClans(Arrays.asList("RP88QQG", "2CCCP"));

Constants constants = api.getConstants();

TopClans topClans = api.getTopClans();

## Continuous Integration ##

https://travis-ci.org/mlieshoff/jcrapi

## Repository ##

https://bintray.com/mlieshoff/maven/jcrapi


