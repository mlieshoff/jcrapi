package jcrapi.request;

import java.util.List;
import lombok.Builder;
import lombok.Getter;

/**
 * @author Michael Lieshoff
 */
@Getter
public class LocationedRequest extends LimitedRequest {

  private final String locationKey;

  @Builder(builderMethodName = "locationedRequestBuilder")
  LocationedRequest(String locationKey, int limit, int max, int page, List<String> excludes, List<String> keys) {
    super(limit, max, page, excludes, keys);
    this.locationKey = locationKey;
  }

}
