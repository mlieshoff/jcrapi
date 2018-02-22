package jcrapi.request;

import com.google.common.base.Preconditions;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Michael Lieshoff
 */
public abstract class Request {

    private final List<String> excludes = new ArrayList<>();
    private final List<String> keys = new ArrayList<>();

    private final int limit;

    Request(int limit, List<String> excludes, List<String> keys) {
        Preconditions.checkArgument(limit >= 0, "limit must be > 0");
        this.limit = limit;
        if (CollectionUtils.isNotEmpty(excludes)) {
            this.excludes.addAll(excludes);
        }
        if (CollectionUtils.isNotEmpty(keys)) {
            this.keys.addAll(keys);
        }
    }

    public List<String> getExcludes() {
        return excludes;
    }

    public List<String> getKeys() {
        return keys;
    }

    public int getLimit() {
        return limit;
    }

    public Map<String, String> getQueryParameters() {
        Map<String, String>  map = new LinkedHashMap<>();
        if (limit > 0) {
            map.put("limit", String.valueOf(limit));
            map.put("max", String.valueOf(limit));
        }
        if (CollectionUtils.isNotEmpty(keys)) {
            map.put("keys", StringUtils.join(keys, ','));
        }
        if (CollectionUtils.isNotEmpty(excludes)) {
            map.put("excludes", StringUtils.join(excludes, ','));
        }
        return map;
    }

    static abstract class RequestBuilder<R extends Request, B> {

        List<String> excludes;
        List<String> keys;

        int limit;

        public B limit(int limit) {
            this.limit = limit;
            return getThis();
        }

        public B excludes(List<String> excludes) {
            this.excludes = excludes;
            return getThis();
        }

        public B keys(List<String> keys) {
            this.keys = keys;
            return getThis();
        }

        public abstract R build();

        public abstract B getThis();

    }

}
