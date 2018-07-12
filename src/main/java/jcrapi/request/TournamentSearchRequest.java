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
public class TournamentSearchRequest extends LimitedRequest {

    private final String name;

    @Builder
    private TournamentSearchRequest(String name, int limit, int max, int page, List<String> excludes, List<String> keys) {
        super(limit, max, page, excludes, keys);
        Preconditions.checkNotNull(name, "name");
        Preconditions.checkArgument(name.length() > 0, "name");
        this.name = name;
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> parameters = super.getQueryParameters();
        parameters.put("name", name);
        return parameters;
    }

    public static TournamentSearchRequestBuilder builder(String name) {
        return new TournamentSearchRequestBuilder().name(name);
    }

}
