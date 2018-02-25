package jcrapi.request;

import com.google.common.base.Preconditions;

import java.util.List;

/**
 * @author Michael Lieshoff
 */
public class ClanTrackingRequest extends Request {

    private final String tag;

    private ClanTrackingRequest(String tag, List<String> excludes, List<String> includes) {
        super(excludes, includes);
        Preconditions.checkNotNull(tag, "tag");
        Preconditions.checkArgument(tag.length() > 0, "tag");
        this.tag = tag;
    }

    public String getTag() {
        return tag;
    }

    public static ClanTrackingRequestBuilder builder(String tag) {
        return new ClanTrackingRequestBuilder(tag);
    }

    public static class ClanTrackingRequestBuilder extends RequestBuilder<ClanTrackingRequest, ClanTrackingRequestBuilder> {

        private final String tag;

        public ClanTrackingRequestBuilder(String tag) {
            this.tag = tag;
        }

        @Override
        public ClanTrackingRequest build() {
            return new ClanTrackingRequest(tag, excludes, keys);
        }

        @Override
        public ClanTrackingRequestBuilder getThis() {
            return this;
        }

    }

}
