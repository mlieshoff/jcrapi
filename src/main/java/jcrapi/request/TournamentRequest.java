package jcrapi.request;

import java.util.List;
import java.util.Map;
import lombok.Builder;
import lombok.Getter;

/**
 * @author Michael Lieshoff
 */
@Getter
public class TournamentRequest extends LimitedRequest {

  private final boolean oneK;
  private final boolean open;
  private final boolean full;
  private final boolean prep;
  private final boolean joinable;

  @Builder(builderMethodName = "tournamentRequestBuilder")
  protected TournamentRequest(boolean oneK, boolean open, boolean full, boolean prep, boolean joinable, int limit,
                              int max, int page, List<String> excludes, List<String> keys) {
    super(limit, max, page, excludes, keys);
    this.oneK = oneK;
    this.open = open;
    this.full = full;
    this.prep = prep;
    this.joinable = joinable;
  }

  public Map<String, String> getQueryParameters() {
    Map<String, String> map = super.getQueryParameters();
    putOneIfTrue(map, oneK, "1k");
    putOneIfTrue(map, open, "open");
    putOneIfTrue(map, full, "full");
    putOneIfTrue(map, prep, "prep");
    putOneIfTrue(map, joinable, "joinable");
    return map;
  }

  private void putOneIfTrue(Map<String, String> map, boolean flag, String name) {
    if (flag) {
      map.put(name, "1");
    }
  }

}
