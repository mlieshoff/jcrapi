package jcrapi.request;

import java.util.List;

/**
 * @author Michael Lieshoff
 */
public class OneKTournamentsRequest extends TournamentRequest {

    private OneKTournamentsRequest(boolean oneK, boolean open, boolean full, boolean prep, boolean joinable, int limit, int max, int page, List<String> excludes, List<String> includes) {
        super(oneK, open, full, prep, joinable, limit, max, page, excludes, includes);
    }

    public static OneKTournamentsRequestBuilder builder() {
        return new OneKTournamentsRequestBuilder();
    }

    public static class OneKTournamentsRequestBuilder extends TournamentRequestBuilder<OneKTournamentsRequest, OneKTournamentsRequestBuilder> {

        @Override
        public OneKTournamentsRequest build() {
            return new OneKTournamentsRequest(oneK, open, full, prep, joinable, limit, max, page, excludes, keys);
        }

        @Override
        public OneKTournamentsRequestBuilder getThis() {
            return this;
        }

    }

}
