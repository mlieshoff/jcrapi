package jcrapi.request;

import com.google.common.base.Preconditions;

import java.util.List;
import lombok.Builder;
import lombok.Getter;

/**
 * @author Michael Lieshoff
 */
@Getter
public class ClanBattlesRequest extends LimitedRequest {

    private final String tag;

    @Builder
    private ClanBattlesRequest(String tag, int limit, int max, int page, List<String> excludes, List<String> keys) {
        super(limit, max, page, excludes, keys);
        Preconditions.checkNotNull(tag, "tag");
        Preconditions.checkArgument(tag.length() > 0, "tag");
        this.tag = tag;
    }

    public static ClanBattlesRequestBuilder builder(String tag) {
        return new ClanBattlesRequestBuilder().tag(tag);
    }

}
