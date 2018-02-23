package jcrapi.request;

import com.google.common.base.Preconditions;

import java.util.List;

/**
 * @author Michael Lieshoff
 */
public class ProfileRequest extends Request {

    private final String tag;

    private ProfileRequest(String tag, int limit, List<String> excludes, List<String> includes) {
        super(limit, excludes, includes);
        Preconditions.checkNotNull(tag, "tag");
        Preconditions.checkArgument(tag.length() > 0, "tag");
        this.tag = tag;
    }

    public String getTag() {
        return tag;
    }

    public static ProfileRequestBuilder builder(String tag) {
        return new ProfileRequestBuilder(tag);
    }

    public static class ProfileRequestBuilder extends RequestBuilder<ProfileRequest, ProfileRequestBuilder> {

        private final String tag;

        public ProfileRequestBuilder(String tag) {
            this.tag = tag;
        }

        @Override
        public ProfileRequest build() {
            return new ProfileRequest(tag, limit, excludes, keys);
        }

        @Override
        public ProfileRequestBuilder getThis() {
            return this;
        }

    }

}
