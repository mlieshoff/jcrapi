package jcrapi.request;

import java.util.List;
import lombok.Builder;

/**
 * @author Michael Lieshoff
 */
public class TopClansRequest extends LocationedRequest {

    @Builder
    private TopClansRequest(String locationKey, int limit, int max, int page, List<String> excludes, List<String> keys) {
        super(locationKey, limit, max, page, excludes, keys);
    }

}
