package jcrapi.request;

import java.util.List;

/**
 * @author Michael Lieshoff
 */
public class PopularDecksRequest extends LimitedRequest {

    private PopularDecksRequest(int limit, List<String> excludes, List<String> includes) {
        super(limit, excludes, includes);
    }

    public static PopularDecksRequestBuilder builder() {
        return new PopularDecksRequestBuilder();
    }

    public static class PopularDecksRequestBuilder extends LimitedRequestBuilder<PopularDecksRequest, PopularDecksRequestBuilder> {

        @Override
        public PopularDecksRequest build() {
            return new PopularDecksRequest(limit, excludes, keys);
        }

        @Override
        public PopularDecksRequestBuilder getThis() {
            return this;
        }

    }

}
