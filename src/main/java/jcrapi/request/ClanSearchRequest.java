package jcrapi.request;

import com.google.common.base.Preconditions;
import lombok.Builder;
import lombok.Getter;
import org.apache.commons.lang.StringUtils;

import java.util.List;
import java.util.Map;

/**
 * @author Michael Lieshoff
 */
@Getter
public class ClanSearchRequest extends LimitedRequest {

    private final String locationId;

    private final String name;

    private final Integer score;
    private final Integer minMembers;
    private final Integer maxMembers;

    @Builder
    private ClanSearchRequest(String locationId, String name, Integer score, Integer minMembers, Integer maxMembers,
                              int limit, int max, int page, List<String> excludes, List<String> keys) {
        super(limit, max, page, excludes, keys);
        Preconditions.checkArgument(
                !(StringUtils.isBlank(name)
                        && score == null
                        && minMembers == null
                        && maxMembers == null), "set at least one search criteria!");
        this.locationId = locationId;
        this.name = name;
        this.score = score;
        this.minMembers = minMembers;
        this.maxMembers = maxMembers;
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> parameters = super.getQueryParameters();
        if (StringUtils.isNotBlank(locationId)) {
            parameters.put("locationId", locationId);
        }
        if (StringUtils.isNotBlank(name)) {
            parameters.put("name", name);
        }
        if (score != null) {
            parameters.put("score", score.toString());
        }
        if (minMembers != null) {
            parameters.put("minMembers", minMembers.toString());
        }
        if (maxMembers != null) {
            parameters.put("maxMembers", maxMembers.toString());
        }
        return parameters;
    }

}
