package jcrapi.request;

import org.apache.commons.collections.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Michael Lieshoff
 */
class Request {

    private final List<String> excludes = new ArrayList<>();
    private final List<String> includes = new ArrayList<>();

    private final int limit;

    Request(int limit, List<String> excludes, List<String> includes) {
        this.limit = limit;
        if (CollectionUtils.isNotEmpty(excludes)) {
            this.excludes.addAll(excludes);
        }
        if (CollectionUtils.isNotEmpty(includes)) {
            this.includes.addAll(includes);
        }
    }

    public List<String> getExcludes() {
        return excludes;
    }

    public List<String> getIncludes() {
        return includes;
    }

    public int getLimit() {
        return limit;
    }

    static abstract class RequestBuilder<R extends Request, B> {

        protected List<String> excludes;
        protected List<String> includes;

        protected int limit;

        public B limit(int limit) {
            this.limit = limit;
            return getThis();
        }

        public B excludes(List<String> excludes) {
            this.excludes = excludes;
            return getThis();
        }

        public B includes(List<String> includes) {
            this.includes = includes;
            return getThis();
        }

        public abstract R build();

        public abstract B getThis();

    }

}
