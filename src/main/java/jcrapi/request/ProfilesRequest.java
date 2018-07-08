package jcrapi.request;

import com.google.common.base.Preconditions;
import lombok.Getter;
import org.apache.commons.collections.CollectionUtils;

import java.util.Collection;
import java.util.List;

/**
 * @author Michael Lieshoff
 */
@Getter
public class ProfilesRequest extends LimitedRequest {

    private final Collection<String> tags;

    private ProfilesRequest(Collection<String> tags, int limit, int max, int page, List<String> excludes, List<String> includes) {
        super(limit, max, page, excludes, includes);
        Preconditions.checkArgument(CollectionUtils.isNotEmpty(tags), "tags");
        this.tags = tags;
    }

    public static ProfilesRequestBuilder builder(Collection<String> tags) {
        return new ProfilesRequestBuilder(tags);
    }

    public static class ProfilesRequestBuilder extends LimitedRequestBuilder<ProfilesRequest, ProfilesRequestBuilder> {

        private final Collection<String> tags;

        public ProfilesRequestBuilder(Collection<String> tags) {
            this.tags = tags;
        }

        @Override
        public ProfilesRequest build() {
            return new ProfilesRequest(tags, limit, max, page, excludes, keys);
        }

        @Override
        public ProfilesRequestBuilder getThis() {
            return this;
        }

    }

}
