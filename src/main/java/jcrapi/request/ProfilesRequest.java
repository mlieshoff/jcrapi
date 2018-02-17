package jcrapi.request;

import com.google.common.base.Preconditions;
import org.apache.commons.collections.CollectionUtils;

import java.util.Collection;
import java.util.List;

/**
 * @author Michael Lieshoff
 */
public class ProfilesRequest extends Request {

    private final Collection<String> tags;

    private ProfilesRequest(Collection<String> tags, int limit, List<String> excludes, List<String> includes) {
        super(limit, excludes, includes);
        Preconditions.checkArgument(CollectionUtils.isNotEmpty(tags), "tags");
        this.tags = tags;
    }

    public Collection<String> getTags() {
        return tags;
    }

    public static ProfilesRequestBuilder builder(Collection<String> tags) {
        return new ProfilesRequestBuilder(tags);
    }

    public static class ProfilesRequestBuilder extends RequestBuilder<ProfilesRequest, ProfilesRequestBuilder> {

        private Collection<String> tags;

        public ProfilesRequestBuilder(Collection<String> tags) {
            this.tags = tags;
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
