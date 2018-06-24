package jcrapi.request;

import java.util.List;

/**
 * @author Michael Lieshoff
 */
public class KnownTournamentsRequest extends TournamentRequest {

    private KnownTournamentsRequest(boolean oneK, boolean open, boolean full, boolean prep, boolean joinable, int limit, int max, int page, List<String> excludes, List<String> includes) {
        super(oneK, open, full, prep, joinable, limit, max, page, excludes, includes);
    }

    public static KnownTournamentsRequestBuilder builder() {
        return new KnownTournamentsRequestBuilder();
    }

    public static class KnownTournamentsRequestBuilder extends TournamentRequestBuilder<KnownTournamentsRequest, KnownTournamentsRequestBuilder> {

        @Override
        public KnownTournamentsRequest build() {
            return new KnownTournamentsRequest(oneK, open, full, prep, joinable, limit, max, page, excludes, keys);
        }

        @Override
        public KnownTournamentsRequestBuilder getThis() {
            return this;
        }

    }

}
