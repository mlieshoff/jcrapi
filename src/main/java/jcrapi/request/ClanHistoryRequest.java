package jcrapi.request;

import com.google.common.base.Preconditions;

import java.util.List;

/**
 * @author Michael Lieshoff
 */
public class ClanHistoryRequest extends Request {

    private final String tag;

    private ClanHistoryRequest(String tag, int limit, List<String> excludes, List<String> includes) {
        super(limit, excludes, includes);
        Preconditions.checkNotNull(tag, "tag");
        Preconditions.checkArgument(tag.length() > 0, "tag");
        this.tag = tag;
    }

    public String getTag() {
        return tag;
    }

    public static ClanHistoryRequestBuilder builder(String tag) {
        return new ClanHistoryRequestBuilder(tag);
    }

    public static class ClanHistoryRequestBuilder extends RequestBuilder<ClanHistoryRequest, ClanHistoryRequestBuilder> {

        private String tag;

        public ClanHistoryRequestBuilder(String tag) {
            this.tag = tag;
        }

        @Override
        public ClanHistoryRequest build() {
            return new ClanHistoryRequest(tag, limit, excludes, keys);
        }

        @Override
        public ClanHistoryRequestBuilder getThis() {
            return this;
        }

    }

}
