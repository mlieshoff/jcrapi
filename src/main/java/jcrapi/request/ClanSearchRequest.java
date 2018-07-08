package jcrapi.request;

import com.google.common.base.Preconditions;
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

    public static ClanSearchRequestBuilder builder() {
        return new ClanSearchRequestBuilder();
    }

    public static class ClanSearchRequestBuilder extends LimitedRequestBuilder<ClanSearchRequest, ClanSearchRequestBuilder> {

        private String locationId;
        private String name;

        private Integer score;
        private Integer minMembers;
        private Integer maxMembers;

        public ClanSearchRequestBuilder locationId(String locationId) {
            this.locationId = locationId;
            return getThis();
        }

        public ClanSearchRequestBuilder name(String name) {
            this.name = name;
            return getThis();
        }

        public ClanSearchRequestBuilder score(int score) {
            this.score = score;
            return getThis();
        }

        public ClanSearchRequestBuilder minMembers(int minMembers) {
            this.minMembers = minMembers;
            return getThis();
        }

        public ClanSearchRequestBuilder maxMembers(int maxMembers) {
            this.maxMembers = maxMembers;
            return getThis();
        }

        @Override
        public ClanSearchRequest build() {
            return new ClanSearchRequest(locationId, name, score, minMembers, maxMembers, limit, max, page, excludes, keys);
        }

        @Override
        public ClanSearchRequestBuilder getThis() {
            return this;
        }

    }

}
