package jcrapi.request;

import java.util.List;
import lombok.Builder;

/**
 * @author Michael Lieshoff
 */
public class TopWarsRequest extends LocationedRequest {

  @Builder
  private TopWarsRequest(String locationKey, int limit, int max, int page, List<String> excludes, List<String> keys) {
    super(locationKey, limit, max, page, excludes, keys);
  }

}
