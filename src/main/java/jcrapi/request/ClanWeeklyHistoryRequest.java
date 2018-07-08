package jcrapi.request;

import com.google.common.base.Preconditions;
import lombok.Getter;

import java.util.List;
import java.util.Map;

/**
 * @author Michael Lieshoff
 */
@Getter
public class ClanWeeklyHistoryRequest extends LimitedRequest {

    private final String tag;

    private final Integer days;

    private ClanWeeklyHistoryRequest(String tag, Integer days, int limit, int max, int page, List<String> excludes, List<String> includes) {
        super(limit, max, page, excludes, includes);
        Preconditions.checkNotNull(tag, "tag");
        Preconditions.checkArgument(tag.length() > 0, "tag");
        if (days != null) {
            Preconditions.checkArgument(days >= 0, "days");
        }
        this.tag = tag;
        this.days = days;
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String>  parameters = super.getQueryParameters();
        if (days != null) {
            parameters.put("days", days.toString());
        }
        return parameters;
    }

    public static ClanWeeklyHistoryRequestBuilder builder(String tag) {
        return new ClanWeeklyHistoryRequestBuilder(tag);
    }

    public static class ClanWeeklyHistoryRequestBuilder extends LimitedRequestBuilder<ClanWeeklyHistoryRequest, ClanWeeklyHistoryRequestBuilder> {

        private final String tag;

        private Integer days;

        public ClanWeeklyHistoryRequestBuilder(String tag) {
            this.tag = tag;
        }

        public ClanWeeklyHistoryRequestBuilder days(Integer days) {
            this.days = days;
            return getThis();
        }

        @Override
        public ClanWeeklyHistoryRequest build() {
            return new ClanWeeklyHistoryRequest(tag, days, limit, max, page, excludes, keys);
        }

        @Override
        public ClanWeeklyHistoryRequestBuilder getThis() {
            return this;
        }

    }

}
