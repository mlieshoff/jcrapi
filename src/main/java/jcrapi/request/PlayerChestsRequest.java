package jcrapi.request;

import com.google.common.base.Preconditions;
import org.apache.commons.collections.CollectionUtils;

import java.util.List;

/**
 * @author Michael Lieshoff
 */
public class PlayerChestsRequest extends LimitedRequest {

    private final List<String> tags;

    private PlayerChestsRequest(List<String> tags, int limit, int max, int page, List<String> excludes, List<String> includes) {
        super(limit, max, page, excludes, includes);
        Preconditions.checkArgument(CollectionUtils.isNotEmpty(tags));
        this.tags = tags;
    }

    public List<String> getTags() {
        return tags;
    }

    public static PlayerChestsRequestBuilder builder(List<String> tags) {
        return new PlayerChestsRequestBuilder(tags);
    }

    public static class PlayerChestsRequestBuilder extends LimitedRequestBuilder<PlayerChestsRequest, PlayerChestsRequestBuilder> {

        private final List<String> tags;

        public PlayerChestsRequestBuilder(List<String> tags) {
            this.tags = tags;
        }

        @Override
        public PlayerChestsRequest build() {
            return new PlayerChestsRequest(tags, limit, max, page, excludes, keys);
        }

        @Override
        public PlayerChestsRequestBuilder getThis() {
            return this;
        }

    }

}
