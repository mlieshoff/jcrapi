package jcrapi.request;

import com.google.common.base.Preconditions;

import java.util.List;

/**
 * @author Michael Lieshoff
 */
public class ClanWarRequest extends Request {

    private final String tag;

    private ClanWarRequest(String tag, List<String> excludes, List<String> includes) {
        super(excludes, includes);
        Preconditions.checkNotNull(tag, "tag");
        Preconditions.checkArgument(tag.length() > 0, "tag");
        this.tag = tag;
    }

    public String getTag() {
        return tag;
    }

    public static ClanWarRequestBuilder builder(String tag) {
        return new ClanWarRequestBuilder(tag);
    }

    public static class ClanWarRequestBuilder extends RequestBuilder<ClanWarRequest, ClanWarRequestBuilder> {

        private final String tag;

        public ClanWarRequestBuilder(String tag) {
            this.tag = tag;
        }

        @Override
        public ClanWarRequest build() {
            return new ClanWarRequest(tag, excludes, keys);
        }

        @Override
        public ClanWarRequestBuilder getThis() {
            return this;
        }

    }

}
