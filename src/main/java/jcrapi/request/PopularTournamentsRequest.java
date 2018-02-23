package jcrapi.request;

import java.util.List;

/**
 * @author Michael Lieshoff
 */
public class PopularTournamentsRequest extends LimitedRequest {

    private PopularTournamentsRequest(int limit, List<String> excludes, List<String> includes) {
        super(limit, excludes, includes);
    }

    public static PopularTournamentsRequestBuilder builder() {
        return new PopularTournamentsRequestBuilder();
    }

    public static class PopularTournamentsRequestBuilder extends LimitedRequestBuilder<PopularTournamentsRequest, PopularTournamentsRequestBuilder> {

        @Override
        public PopularTournamentsRequest build() {
            return new PopularTournamentsRequest(limit, excludes, keys);
        }

        @Override
        public PopularTournamentsRequestBuilder getThis() {
            return this;
        }

    }

}
