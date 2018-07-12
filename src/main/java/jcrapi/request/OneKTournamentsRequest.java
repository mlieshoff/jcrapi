package jcrapi.request;

import java.util.List;
import lombok.Builder;

/**
 * @author Michael Lieshoff
 */
public class OneKTournamentsRequest extends TournamentRequest {

    @Builder
    private OneKTournamentsRequest(boolean oneK, boolean open, boolean full, boolean prep, boolean joinable, int limit, int max, int page, List<String> excludes, List<String> keys) {
        super(oneK, open, full, prep, joinable, limit, max, page, excludes, keys);
    }

}