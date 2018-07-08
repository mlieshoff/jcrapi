package jcrapi.request;

import java.util.List;

/**
 * @author Michael Lieshoff
 */
public class JoinableTournamentsRequest extends TournamentRequest {

    private JoinableTournamentsRequest(boolean oneK, boolean open, boolean full, boolean prep, boolean joinable, int limit, int max, int page, List<String> excludes, List<String> includes) {
        super(oneK, open, full, prep, joinable, limit, max, page, excludes, includes);
    }

    public static JoinableTournamentsRequestBuilder builder() {
        return new JoinableTournamentsRequestBuilder();
    }

    public static class JoinableTournamentsRequestBuilder extends TournamentRequestBuilder<JoinableTournamentsRequest, JoinableTournamentsRequestBuilder> {

        @Override
        public JoinableTournamentsRequest build() {
            return new JoinableTournamentsRequest(oneK, open, full, prep, joinable, limit, max, page, excludes, keys);
        }

        @Override
        public JoinableTournamentsRequestBuilder getThis() {
            return this;
        }

    }

}
