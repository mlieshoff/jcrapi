package jcrapi.request;

import java.util.List;

/**
 * @author Michael Lieshoff
 */
public class TopPlayersRequest extends LocationedRequest {

    private TopPlayersRequest(String locationKey, int limit, int max, int page, List<String> excludes, List<String> includes) {
        super(locationKey, limit, max, page, excludes, includes);
    }

    public static TopPlayersRequestBuilder builder() {
        return new TopPlayersRequestBuilder();
    }

    public static class TopPlayersRequestBuilder extends LocationedRequestBuilder<TopPlayersRequest, TopPlayersRequestBuilder> {

        @Override
        public TopPlayersRequest build() {
            return new TopPlayersRequest(locationKey, limit, max, page, excludes, keys);
        }

        @Override
        public TopPlayersRequestBuilder getThis() {
            return this;
        }

    }

}
