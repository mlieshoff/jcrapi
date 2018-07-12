package jcrapi.request;

import java.util.List;
import lombok.Builder;

/**
 * @author Michael Lieshoff
 */
public class AuthStatsRequest extends Request {

    @Builder
    private AuthStatsRequest(List<String> excludes, List<String> keys) {
        super(excludes, keys);
    }

}
