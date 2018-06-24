package jcrapi.request;

import java.util.List;

/**
 * @author Michael Lieshoff
 */
public class OpenTournamentsRequest extends TournamentRequest {

    private OpenTournamentsRequest(boolean oneK, boolean open, boolean full, boolean prep, boolean joinable, int limit, int max, int page, List<String> excludes, List<String> includes) {
        super(oneK, open, full, prep, joinable, limit, max, page, excludes, includes);
    }

    public static OpenTournamentsRequestBuilder builder() {
        return new OpenTournamentsRequestBuilder();
    }

    public static class OpenTournamentsRequestBuilder extends TournamentRequestBuilder<OpenTournamentsRequest, OpenTournamentsRequestBuilder> {

        @Override
        public OpenTournamentsRequest build() {
            return new OpenTournamentsRequest(oneK, open, full, prep, joinable, limit, max, page, excludes, keys);
        }

        @Override
        public OpenTournamentsRequestBuilder getThis() {
            return this;
        }

    }

}
