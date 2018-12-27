package jcrapi.request;

import java.util.List;
import lombok.Builder;

/**
 * @author Michael Lieshoff
 */
public class ConstantsRequest extends LimitedRequest {

  @Builder
  private ConstantsRequest(int limit, int max, int page, List<String> excludes, List<String> keys) {
    super(limit, max, page, excludes, keys);
  }

}
