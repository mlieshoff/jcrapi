package jcrapi.request;

import java.util.List;

/**
 * @author Michael Lieshoff
 */
public class PopularPlayersRequest extends LimitedRequest {

    private PopularPlayersRequest(int limit, int max, int page, List<String> excludes, List<String> includes) {
        super(limit, max, page, excludes, includes);
    }

    public static PopularPlayersRequestBuilder builder() {
        return new PopularPlayersRequestBuilder();
    }

    public static class PopularPlayersRequestBuilder extends LimitedRequestBuilder<PopularPlayersRequest, PopularPlayersRequestBuilder> {

        @Override
        public PopularPlayersRequest build() {
            return new PopularPlayersRequest(limit, max, page, excludes, keys);
        }

        @Override
        public PopularPlayersRequestBuilder getThis() {
            return this;
        }

    }

}
