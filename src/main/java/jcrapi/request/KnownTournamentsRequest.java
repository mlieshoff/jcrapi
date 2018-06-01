package jcrapi.request;

import java.util.List;

/**
 * @author Michael Lieshoff
 */
public class KnownTournamentsRequest extends LimitedRequest {

    private KnownTournamentsRequest(int limit, int max, int page, List<String> excludes, List<String> includes) {
        super(limit, max, page, excludes, includes);
    }

    public static KnownTournamentsRequestBuilder builder() {
        return new KnownTournamentsRequestBuilder();
    }

    public static class KnownTournamentsRequestBuilder extends LimitedRequestBuilder<KnownTournamentsRequest, KnownTournamentsRequestBuilder> {

        @Override
        public KnownTournamentsRequest build() {
            return new KnownTournamentsRequest(limit, max, page, excludes, keys);
        }

        @Override
        public KnownTournamentsRequestBuilder getThis() {
            return this;
        }

    }

}
