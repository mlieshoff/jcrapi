package jcrapi.request;

import com.google.common.base.Preconditions;

import java.util.List;
import java.util.Map;
import lombok.Builder;
import lombok.Getter;

/**
 * @author Michael Lieshoff
 */
@Getter
public class LimitedRequest extends PaginatedRequest {

    private final int limit;

    @Builder(builderMethodName = "limitedRequestBuilder")
    LimitedRequest(int limit, int max, int page, List<String> excludes, List<String> keys) {
        super(max, page, excludes, keys);
        Preconditions.checkArgument(limit >= 0, "limit must be > 0");
        this.limit = limit;
    }

    public Map<String, String> getQueryParameters() {
        Map<String, String> map = super.getQueryParameters();
        if (limit > 0) {
            map.put("limit", String.valueOf(limit));
        }
        return map;
    }

}
