package jcrapi.request;

import com.google.common.base.Preconditions;

import java.util.List;
import java.util.Map;
import lombok.Builder;
import lombok.Getter;

/**
 * @author Michael Lieshoff
 */
@Getter
public class ClanWeeklyHistoryRequest extends LimitedRequest {

    private final String tag;

    private final Integer days;

    @Builder
    private ClanWeeklyHistoryRequest(String tag, Integer days, int limit, int max, int page, List<String> excludes, List<String> keys) {
        super(limit, max, page, excludes, keys);
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
        return new ClanWeeklyHistoryRequestBuilder().tag(tag);
    }

}
