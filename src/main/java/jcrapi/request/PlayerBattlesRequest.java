package jcrapi.request;

import com.google.common.base.Preconditions;

import org.apache.commons.collections.CollectionUtils;

import java.util.List;
import lombok.Builder;
import lombok.Getter;

/**
 * @author Michael Lieshoff
 */
@Getter
public class PlayerBattlesRequest extends LimitedRequest {

    private final List<String> tags;

    @Builder
    private PlayerBattlesRequest(List<String> tags, int limit, int max, int page, List<String> excludes, List<String> keys) {
        super(limit, max, page, excludes, keys);
        Preconditions.checkArgument(CollectionUtils.isNotEmpty(tags));
        this.tags = tags;
    }

    public static PlayerBattlesRequestBuilder builder(List<String> tags) {
        return new PlayerBattlesRequestBuilder().tags(tags);
    }

}
