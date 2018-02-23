package jcrapi.request;

import java.util.List;

/**
 * @author Michael Lieshoff
 */
public class TopPlayersRequest extends LocationedRequest {

    private TopPlayersRequest(String locationKey, int limit, List<String> excludes, List<String> includes) {
        super(locationKey, limit, excludes, includes);
    }

    public static TopPlayersRequestBuilder builder() {
        return new TopPlayersRequestBuilder();
    }

    public static class TopPlayersRequestBuilder extends LocationedRequestBuilder<TopPlayersRequest, TopPlayersRequestBuilder> {

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
