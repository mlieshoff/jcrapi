package jcrapi.request;

import java.util.List;

/**
 * @author Michael Lieshoff
 */
public class PopularPlayersRequest extends LimitedRequest {

    private PopularPlayersRequest(int limit, List<String> excludes, List<String> includes) {
        super(limit, excludes, includes);
    }

    public static PopularPlayersRequestBuilder builder() {
        return new PopularPlayersRequestBuilder();
    }

    public static class PopularPlayersRequestBuilder extends LimitedRequestBuilder<PopularPlayersRequest, PopularPlayersRequestBuilder> {

        @Override
        public PopularPlayersRequest build() {
            return new PopularPlayersRequest(limit, excludes, keys);
        }

        @Override
        public PopularPlayersRequestBuilder getThis() {
            return this;
        }

    }

}
