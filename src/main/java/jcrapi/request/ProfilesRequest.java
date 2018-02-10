package jcrapi.request;

import com.google.common.base.Preconditions;
import org.apache.commons.collections.CollectionUtils;

import java.util.List;

/**
 * @author Michael Lieshoff
 */
public class ProfilesRequest extends Request {

    private final List<String> tags;

    private ProfilesRequest(List<String> tags, int limit, List<String> excludes, List<String> includes) {
        super(limit, excludes, includes);
        Preconditions.checkArgument(CollectionUtils.isNotEmpty(tags), "tags");
        this.tags = tags;
    }

    public List<String> getTags() {
        return tags;
    }

    public static ProfilesRequestBuilder builder() {
        return new ProfilesRequestBuilder();
    }

    public static class ProfilesRequestBuilder extends RequestBuilder<ProfilesRequest, ProfilesRequestBuilder> {

        private List<String> tags;

        public ProfilesRequestBuilder tags(List<String> tags) {
            this.tags = tags;
            return getThis();
        }

        @Override
        public ProfilesRequest build() {
            return new ProfilesRequest(tags, limit, excludes, keys);
        }

        @Override
        public ProfilesRequestBuilder getThis() {
            return this;
        }

    }

}
