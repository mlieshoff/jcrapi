package jcrapi.model;

public enum Endpoints {

    BASE("http://api.cr-api.com/"),
    PROFILE(BASE + "player"),
    MULTIPLE_PROFILES(BASE + "player"),
    TOP_CLANS(BASE + "top/clans"),
    SINGLE_CLANS(BASE + "clan"),
    MULTIPLE_CLANS(BASE + "clan"),
    TOP_PLAYERS(BASE + "top/players"),
    CONSTANTS(BASE + "constants"),
    CONSTANTS_ALLIANCE(CONSTANTS + "/alliance/"),
    CONSTANTS_ARENAS(CONSTANTS + "/arenas/"),
    CONSTANTS_BADGES(CONSTANTS + "/badges/"),
    CONSTANTS_CHESTCYCLE(CONSTANTS + "/chestCycle/"),
    CONSTANTS_COUNTRYCODES(CONSTANTS + "/countryCodes/"),
    CONSTANTS_RARITIES(CONSTANTS + "/rarities/"),
    CONSTANTS_CARDS(CONSTANTS + "/cards/"),
    VERSION(BASE + "version");

    private final String code;

    private Endpoints(String code) {
        this.code = code;
    }

}