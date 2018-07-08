package jcrapi.request;

import com.google.common.base.Preconditions;
import lombok.Getter;

import java.util.List;

/**
 * @author Michael Lieshoff
 */
@Getter
public class ClanWarLogRequest extends Request {

    private final String tag;

    private ClanWarLogRequest(String tag, List<String> excludes, List<String> includes) {
        super(excludes, includes);
        Preconditions.checkNotNull(tag, "tag");
        Preconditions.checkArgument(tag.length() > 0, "tag");
        this.tag = tag;
    }

    public static ClanWarLogRequestBuilder builder(String tag) {
        return new ClanWarLogRequestBuilder(tag);
    }

    public static class ClanWarLogRequestBuilder extends RequestBuilder<ClanWarLogRequest, ClanWarLogRequestBuilder> {

        private final String tag;

        public ClanWarLogRequestBuilder(String tag) {
            this.tag = tag;
        }

        @Override
        public ClanWarLogRequest build() {
            return new ClanWarLogRequest(tag, excludes, keys);
        }

        @Override
        public ClanWarLogRequestBuilder getThis() {
            return this;
        }

    }

}
