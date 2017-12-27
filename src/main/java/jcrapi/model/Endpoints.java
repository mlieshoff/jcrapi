package jcrapi.model;

public enum Endpoints {

    BASE("http://api.cr-api.com/"),
    PROFILE(BASE.getCode() + "player"),
    MULTIPLE_PROFILES(BASE.getCode() + "player"),
    TOP_CLANS(BASE.getCode() + "top/clans"),
    SINGLE_CLANS(BASE.getCode() + "clan"),
    MULTIPLE_CLANS(BASE.getCode() + "clan"),
    TOP_PLAYERS(BASE.getCode() + "top/players"),
    CONSTANTS(BASE.getCode() + "constants"),
    CONSTANTS_ALLIANCE(CONSTANTS.getCode() + "/alliance/"),
    CONSTANTS_ARENAS(CONSTANTS.getCode() + "/arenas/"),
    CONSTANTS_BADGES(CONSTANTS.getCode() + "/badges/"),
    CONSTANTS_CHESTCYCLE(CONSTANTS.getCode() + "/chestCycle/"),
    CONSTANTS_COUNTRYCODES(CONSTANTS.getCode() + "/countryCodes/"),
    CONSTANTS_RARITIES(CONSTANTS.getCode() + "/rarities/"),
    CONSTANTS_CARDS(CONSTANTS.getCode() + "/cards/"),
    VERSION(BASE.getCode() + "version");

    private final String code;

    private Endpoints(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

}