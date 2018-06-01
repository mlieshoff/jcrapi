package jcrapi.request;

import com.google.common.base.Preconditions;

import java.util.List;
import java.util.Map;

/**
 * @author Michael Lieshoff
 */
public abstract class PaginatedRequest extends Request {

    private final int max;
    private final int page;

    PaginatedRequest(int max, int page, List<String> excludes, List<String> keys) {
        super(excludes, keys);
        Preconditions.checkArgument(max >= 0, "max must be >= 0");
        Preconditions.checkArgument(page >= 0, "page must be >= 0");
        this.max = max;
        this.page = page;
    }

    public int getMax() {
        return max;
    }

    public int getPage() {
        return page;
    }

    public Map<String, String> getQueryParameters() {
        Map<String, String> map = super.getQueryParameters();
        if (max > 0) {
            map.put("max", String.valueOf(max));
        }
        if (page > 0) {
            map.put("page", String.valueOf(page));
        }
        return map;
    }

    static abstract class PaginatedRequestBuilder<R extends PaginatedRequest, B> extends RequestBuilder<R, B> {

        int max;
        int page;

        public B max(int max) {
            this.max = max;
            return getThis();
        }

        public B page(int page) {
            this.page = page;
            return getThis();
        }

    }

}
