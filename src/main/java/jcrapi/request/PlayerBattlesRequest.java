package jcrapi.request;

import com.google.common.base.Preconditions;
import org.apache.commons.collections.CollectionUtils;

import java.util.List;

/**
 * @author Michael Lieshoff
 */
public class PlayerBattlesRequest extends LimitedRequest {

    private final List<String> tags;

    private PlayerBattlesRequest(List<String> tags, int limit, List<String> excludes, List<String> includes) {
        super(limit, excludes, includes);
        Preconditions.checkArgument(CollectionUtils.isNotEmpty(tags));
        this.tags = tags;
    }

    public List<String> getTags() {
        return tags;
    }

    public static PlayerBattlesRequestBuilder builder(List<String> tags) {
        return new PlayerBattlesRequestBuilder(tags);
    }

    public static class PlayerBattlesRequestBuilder extends LimitedRequestBuilder<PlayerBattlesRequest, PlayerBattlesRequestBuilder> {

        private final List<String> tags;

        public PlayerBattlesRequestBuilder(List<String> tags) {
            this.tags = tags;
        }

        @Override
        public PlayerBattlesRequest build() {
            return new PlayerBattlesRequest(tags, limit, excludes, keys);
        }

        @Override
        public PlayerBattlesRequestBuilder getThis() {
            return this;
        }

    }

}
