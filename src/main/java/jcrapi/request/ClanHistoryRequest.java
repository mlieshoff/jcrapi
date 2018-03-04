package jcrapi.request;

import com.google.common.base.Preconditions;

import java.util.List;
import java.util.Map;

/**
 * @author Michael Lieshoff
 */
public class ClanHistoryRequest extends LimitedRequest {

    private final String tag;

    private final Integer days;

    private ClanHistoryRequest(String tag, Integer days, int limit, List<String> excludes, List<String> includes) {
        super(limit, excludes, includes);
        Preconditions.checkNotNull(tag, "tag");
        Preconditions.checkArgument(tag.length() > 0, "tag");
        if (days != null) {
            Preconditions.checkArgument(days >= 0, "days");
        }
        this.tag = tag;
        this.days = days;
    }

    public String getTag() {
        return tag;
    }

    public Integer getDays() {
        return days;
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String>  parameters = super.getQueryParameters();
        if (days != null) {
            parameters.put("days", days.toString());
        }
        return parameters;
    }

    public static ClanHistoryRequestBuilder builder(String tag) {
        return new ClanHistoryRequestBuilder(tag);
    }

    public static class ClanHistoryRequestBuilder extends LimitedRequestBuilder<ClanHistoryRequest, ClanHistoryRequestBuilder> {

        private final String tag;

        private Integer days;

        public ClanHistoryRequestBuilder(String tag) {
            this.tag = tag;
        }

        public ClanHistoryRequestBuilder days(Integer days) {
            this.days = days;
            return getThis();
        }

        @Override
        public ClanHistoryRequest build() {
            return new ClanHistoryRequest(tag, days, limit, excludes, keys);
        }

        @Override
        public ClanHistoryRequestBuilder getThis() {
            return this;
        }

    }

}
