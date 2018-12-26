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
public class ClansRequest extends LimitedRequest {

  private final Collection<String> tags;

  @Builder
  private ClansRequest(Collection<String> tags, int limit, int max, int page, List<String> excludes,
                       List<String> keys) {
    super(limit, max, page, excludes, keys);
    Preconditions.checkArgument(CollectionUtils.isNotEmpty(tags), "tags");
    this.tags = tags;
  }

  public static ClansRequest.ClansRequestBuilder builder(Collection<String> tags) {
    return new ClansRequest.ClansRequestBuilder().tags(tags);
  }

}
