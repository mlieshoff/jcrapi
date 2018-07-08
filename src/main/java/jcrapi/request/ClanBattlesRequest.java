package jcrapi.request;

import com.google.common.base.Preconditions;
import lombok.Getter;

import java.util.List;

/**
 * @author Michael Lieshoff
 */
@Getter
public class ClanBattlesRequest extends LimitedRequest {

    private final String tag;

    private ClanBattlesRequest(String tag, int limit, int max, int page, List<String> excludes, List<String> includes) {
        super(limit, max, page, excludes, includes);
        Preconditions.checkNotNull(tag, "tag");
        Preconditions.checkArgument(tag.length() > 0, "tag");
        this.tag = tag;
    }

    public static ClanBattlesRequestBuilder builder(String tag) {
        return new ClanBattlesRequestBuilder(tag);
    }

    public static class ClanBattlesRequestBuilder extends LimitedRequestBuilder<ClanBattlesRequest, ClanBattlesRequestBuilder> {

        private final String tag;

        public ClanBattlesRequestBuilder(String tag) {
            this.tag = tag;
        }

        @Override
        public ClanBattlesRequest build() {
            return new ClanBattlesRequest(tag, limit, max, page, excludes, keys);
        }

        @Override
        public ClanBattlesRequestBuilder getThis() {
            return this;
        }

    }

}
