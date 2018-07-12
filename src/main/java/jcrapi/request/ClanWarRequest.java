package jcrapi.request;

import com.google.common.base.Preconditions;

import java.util.List;
import lombok.Builder;
import lombok.Getter;

/**
 * @author Michael Lieshoff
 */
@Getter
public class ClanWarRequest extends Request {

    private final String tag;

    @Builder
    private ClanWarRequest(String tag, List<String> excludes, List<String> keys) {
        super(excludes, keys);
        Preconditions.checkNotNull(tag, "tag");
        Preconditions.checkArgument(tag.length() > 0, "tag");
        this.tag = tag;
    }

    public static ClanWarRequestBuilder builder(String tag) {
        return new ClanWarRequestBuilder().tag(tag);
    }

}
