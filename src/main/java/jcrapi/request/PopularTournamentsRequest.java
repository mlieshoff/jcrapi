package jcrapi.request;

import java.util.List;

/**
 * @author Michael Lieshoff
 */
public class PopularTournamentsRequest extends LimitedRequest {

    private PopularTournamentsRequest(int limit, int max, int page, List<String> excludes, List<String> includes) {
        super(limit, max, page, excludes, includes);
    }

    public static PopularTournamentsRequestBuilder builder() {
        return new PopularTournamentsRequestBuilder();
    }

    public static class PopularTournamentsRequestBuilder extends LimitedRequestBuilder<PopularTournamentsRequest, PopularTournamentsRequestBuilder> {

        @Override
        public PopularTournamentsRequest build() {
            return new PopularTournamentsRequest(limit, max, page, excludes, keys);
        }

        @Override
        public PopularTournamentsRequestBuilder getThis() {
            return this;
        }

    }

}
