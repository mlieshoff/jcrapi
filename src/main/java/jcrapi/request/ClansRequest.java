package jcrapi.request;

import com.google.common.base.Preconditions;
import org.apache.commons.collections.CollectionUtils;

import java.util.Collection;
import java.util.List;

/**
 * @author Michael Lieshoff
 */
public class ClansRequest extends LimitedRequest {

    private final Collection<String> tags;

    private ClansRequest(Collection<String> tags, int limit, List<String> excludes, List<String> includes) {
        super(limit, excludes, includes);
        Preconditions.checkArgument(CollectionUtils.isNotEmpty(tags), "tags");
        this.tags = tags;
    }

    public Collection<String> getTags() {
        return tags;
    }

    public static ClansRequestBuilder builder(Collection<String> tags) {
        return new ClansRequestBuilder(tags);
    }

    public static class ClansRequestBuilder extends LimitedRequestBuilder<ClansRequest, ClansRequestBuilder> {

        private final Collection<String> tags;

        public ClansRequestBuilder(Collection<String> tags) {
            this.tags = tags;
        }

        @Override
        public ClansRequest build() {
            return new ClansRequest(tags, limit, excludes, keys);
        }

        @Override
        public ClansRequestBuilder getThis() {
            return this;
        }

    }

}
