package jcrapi.request;

import com.google.common.base.Preconditions;

import java.util.List;

/**
 * @author Michael Lieshoff
 */
public class ClanBattlesRequest extends Request {

    private final String tag;

    private ClanBattlesRequest(String tag, int limit, List<String> excludes, List<String> includes) {
        super(limit, excludes, includes);
        Preconditions.checkNotNull(tag, "tag");
        Preconditions.checkArgument(tag.length() > 0, "tag");
        this.tag = tag;
    }

    public String getTag() {
        return tag;
    }

    public static ClanBattlesRequestBuilder builder(String tag) {
        return new ClanBattlesRequestBuilder(tag);
    }

    public static class ClanBattlesRequestBuilder extends RequestBuilder<ClanBattlesRequest, ClanBattlesRequestBuilder> {

        private final String tag;

        public ClanBattlesRequestBuilder(String tag) {
            this.tag = tag;
        }

        @Override
        public ClanBattlesRequest build() {
            return new ClanBattlesRequest(tag, limit, excludes, keys);
        }

        @Override
        public ClanBattlesRequestBuilder getThis() {
            return this;
        }

    }

}
