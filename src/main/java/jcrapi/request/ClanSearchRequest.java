package jcrapi.request;

import java.util.List;

/**
 * @author Michael Lieshoff
 */
public class ClanSearchRequest extends Request {

    private final String name;

    private final Integer score;
    private final Integer minMembers;
    private final Integer maxMembers;

    public ClanSearchRequest(String name, Integer score, Integer minMembers, Integer maxMembers, int limit, List<String> excludes,
                             List<String> keys) {
        super(limit, excludes, keys);
        this.name = name;
        this.score = score;
        this.minMembers = minMembers;
        this.maxMembers = maxMembers;
    }

    public String getName() {
        return name;
    }

    public Integer getScore() {
        return score;
    }

    public Integer getMinMembers() {
        return minMembers;
    }

    public Integer getMaxMembers() {
        return maxMembers;
    }

    public static ClanSearchRequestBuilder builder() {
        return new ClanSearchRequestBuilder();
    }

    public static class ClanSearchRequestBuilder extends RequestBuilder<ClanSearchRequest, ClanSearchRequestBuilder> {

        private String name;

        private Integer score;
        private Integer minMembers;
        private Integer maxMembers;

        public ClanSearchRequestBuilder name(String name) {
            this.name = name;
            return getThis();
        }

        public ClanSearchRequestBuilder score(int score) {
            this.score = score;
            return getThis();
        }

        public ClanSearchRequestBuilder minMembers(int minMembers) {
            this.minMembers = minMembers;
            return getThis();
        }

        public ClanSearchRequestBuilder maxMembers(int maxMembers) {
            this.maxMembers = maxMembers;
            return getThis();
        }

        @Override
        public ClanSearchRequest build() {
            return new ClanSearchRequest(name, score, minMembers, maxMembers, limit, excludes, keys);
        }

        @Override
        public ClanSearchRequestBuilder getThis() {
            return this;
        }

    }

}
