package jcrapi.request;

import java.util.List;

/**
 * @author Michael Lieshoff
 */
public class KnownTournamentsRequest extends LimitedRequest {

    private KnownTournamentsRequest(int limit, List<String> excludes, List<String> includes) {
        super(limit, excludes, includes);
    }

    public static KnownTournamentsRequestBuilder builder() {
        return new KnownTournamentsRequestBuilder();
    }

    public static class KnownTournamentsRequestBuilder extends LimitedRequestBuilder<KnownTournamentsRequest, KnownTournamentsRequestBuilder> {

        @Override
        public KnownTournamentsRequest build() {
            return new KnownTournamentsRequest(limit, excludes, keys);
        }

        @Override
        public KnownTournamentsRequestBuilder getThis() {
            return this;
        }

    }

}
