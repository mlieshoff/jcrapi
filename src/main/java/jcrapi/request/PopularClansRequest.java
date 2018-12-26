package jcrapi.request;

import java.util.List;
import lombok.Builder;

/**
 * @author Michael Lieshoff
 */
public class PopularClansRequest extends LimitedRequest {

  @Builder
  private PopularClansRequest(int limit, int max, int page, List<String> excludes, List<String> keys) {
    super(limit, max, page, excludes, keys);
  }

}
