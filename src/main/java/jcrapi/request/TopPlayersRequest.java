package jcrapi.request;

import lombok.Builder;

import java.util.List;

/**
 * @author Michael Lieshoff
 */
public class TopPlayersRequest extends LocationedRequest {

    @Builder
    private TopPlayersRequest(String locationKey, int limit, int max, int page, List<String> excludes, List<String> keys) {
        super(locationKey, limit, max, page, excludes, keys);
    }

}
