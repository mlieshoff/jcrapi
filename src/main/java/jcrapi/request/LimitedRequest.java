package jcrapi.request;

import com.google.common.base.Preconditions;

import java.util.List;
import java.util.Map;

/**
 * @author Michael Lieshoff
 */
public abstract class LimitedRequest extends Request {

    private final int limit;

    LimitedRequest(int limit, List<String> excludes, List<String> keys) {
        super(excludes, keys);
        Preconditions.checkArgument(limit >= 0, "limit must be > 0");
        this.limit = limit;
    }

    public int getLimit() {
        return limit;
    }

    public Map<String, String> getQueryParameters() {
        Map<String, String> map = super.getQueryParameters();
        if (limit > 0) {
            map.put("limit", String.valueOf(limit));
            map.put("max", String.valueOf(limit));
        }
        return map;
    }

    static abstract class LimitedRequestBuilder<R extends LimitedRequest, B> extends RequestBuilder<R, B> {

        int limit;

        public B limit(int limit) {
            this.limit = limit;
            return getThis();
        }

    }

}
