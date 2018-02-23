package jcrapi.request;

import java.util.List;

/**
 * @author Michael Lieshoff
 */
public class TopPlayersRequest extends Request {

    private final String locationKey;

    private TopPlayersRequest(String locationKey, int limit, List<String> excludes, List<String> includes) {
        super(limit, excludes, includes);
        this.locationKey = locationKey;
    }

    public String getLocationKey() {
        return locationKey;
    }

    public static TopPlayersRequestBuilder builder() {
        return new TopPlayersRequestBuilder();
    }

    public static class TopPlayersRequestBuilder extends RequestBuilder<TopPlayersRequest, TopPlayersRequestBuilder> {

        private String locationKey;

        public TopPlayersRequestBuilder locationKey(String locationKey) {
            this.locationKey = locationKey;
            return getThis();
        }

        @Override
        public TopPlayersRequest build() {
            return new TopPlayersRequest(locationKey, limit, excludes, keys);
        }

        @Override
        public TopPlayersRequestBuilder getThis() {
            return this;
        }

    }

}
