package jcrapi.request;

import com.google.common.base.Preconditions;

import org.apache.commons.collections.CollectionUtils;

import java.util.Collection;
import java.util.List;
import lombok.Builder;
import lombok.Getter;

/**
 * @author Michael Lieshoff
 */
@Getter
public class ProfilesRequest extends LimitedRequest {

    private final Collection<String> tags;

    @Builder
    private ProfilesRequest(Collection<String> tags, int limit, int max, int page, List<String> excludes, List<String> keys) {
        super(limit, max, page, excludes, keys);
        Preconditions.checkArgument(CollectionUtils.isNotEmpty(tags), "tags");
        this.tags = tags;
    }

    public static ProfilesRequestBuilder builder(Collection<String> tags) {
        return new ProfilesRequestBuilder().tags(tags);
    }

}
