package jcrapi.request;

import java.util.List;

/**
 * @author Michael Lieshoff
 */
public class InPreparationTournamentsRequest extends TournamentRequest {

    private InPreparationTournamentsRequest(boolean oneK, boolean open, boolean full, boolean prep, boolean joinable, int limit, int max, int page, List<String> excludes, List<String> includes) {
        super(oneK, open, full, prep, joinable, limit, max, page, excludes, includes);
    }

    public static InPreparationTournamentsRequestBuilder builder() {
        return new InPreparationTournamentsRequestBuilder();
    }

    public static class InPreparationTournamentsRequestBuilder extends TournamentRequestBuilder<InPreparationTournamentsRequest, InPreparationTournamentsRequestBuilder> {

        @Override
        public InPreparationTournamentsRequest build() {
            return new InPreparationTournamentsRequest(oneK, open, full, prep, joinable, limit, max, page, excludes, keys);
        }

        @Override
        public InPreparationTournamentsRequestBuilder getThis() {
            return this;
        }

    }

}
