package jcrapi.request;

import com.google.common.base.Preconditions;

import java.util.List;
import java.util.Map;
import lombok.Builder;
import lombok.Getter;

/**
 * @author Michael Lieshoff
 */
@Getter
public class PaginatedRequest extends Request {

  private final int max;
  private final int page;

  @Builder(builderMethodName = "paginatedRequestBuilder")
  PaginatedRequest(int max, int page, List<String> excludes, List<String> keys) {
    super(excludes, keys);
    Preconditions.checkArgument(max >= 0, "max must be >= 0");
    Preconditions.checkArgument(page >= 0, "page must be >= 0");
    this.max = max;
    this.page = page;
  }

  public Map<String, String> getQueryParameters() {
    Map<String, String> map = super.getQueryParameters();
    if (max > 0) {
      map.put("max", String.valueOf(max));
    }
    if (page > 0) {
      map.put("page", String.valueOf(page));
    }
    return map;
  }

}
