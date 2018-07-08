package jcrapi.request;

import java.util.List;

/**
 * @author Michael Lieshoff
 */
public class FullTournamentsRequest extends TournamentRequest {

    private FullTournamentsRequest(boolean oneK, boolean open, boolean full, boolean prep, boolean joinable, int limit, int max, int page, List<String> excludes, List<String> includes) {
        super(oneK, open, full, prep, joinable, limit, max, page, excludes, includes);
    }

    public static FullTournamentsRequestBuilder builder() {
        return new FullTournamentsRequestBuilder();
    }

    public static class FullTournamentsRequestBuilder extends TournamentRequestBuilder<FullTournamentsRequest, FullTournamentsRequestBuilder> {

        @Override
        public FullTournamentsRequest build() {
            return new FullTournamentsRequest(oneK, open, full, prep, joinable, limit, max, page, excludes, keys);
        }

        @Override
        public FullTournamentsRequestBuilder getThis() {
            return this;
        }

    }

}
