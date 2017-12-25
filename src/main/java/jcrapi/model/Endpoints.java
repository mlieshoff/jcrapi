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
    VERSION(BASE + "version");

    private final String code;

    private Endpoints(String code) {
        this.code = code;
    }

}