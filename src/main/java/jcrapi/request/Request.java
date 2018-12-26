package jcrapi.request;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import lombok.Builder;
import lombok.Getter;

/**
 * @author Michael Lieshoff
 */
@Getter
public class Request {

  private final List<String> excludes = new ArrayList<>();
  private final List<String> keys = new ArrayList<>();

  @Builder(builderMethodName = "requestBuilder")
  Request(List<String> excludes, List<String> keys) {
    if (CollectionUtils.isNotEmpty(excludes)) {
      this.excludes.addAll(excludes);
    }
    if (CollectionUtils.isNotEmpty(keys)) {
      this.keys.addAll(keys);
    }
  }

  public Map<String, String> getQueryParameters() {
    Map<String, String> map = new LinkedHashMap<>();
    if (CollectionUtils.isNotEmpty(keys)) {
      map.put("keys", StringUtils.join(keys, ','));
    }
    if (CollectionUtils.isNotEmpty(excludes)) {
      map.put("excludes", StringUtils.join(excludes, ','));
    }
    return map;
  }

}
