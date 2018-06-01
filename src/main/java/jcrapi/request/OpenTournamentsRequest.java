package jcrapi.request;

import java.util.List;

/**
 * @author Michael Lieshoff
 */
public class OpenTournamentsRequest extends LimitedRequest {

    private OpenTournamentsRequest(int limit, int max, int page, List<String> excludes, List<String> includes) {
        super(limit, max, page, excludes, includes);
    }

    public static OpenTournamentsRequestBuilder builder() {
        return new OpenTournamentsRequestBuilder();
    }

    public static class OpenTournamentsRequestBuilder extends LimitedRequestBuilder<OpenTournamentsRequest, OpenTournamentsRequestBuilder> {

        @Override
        public OpenTournamentsRequest build() {
            return new OpenTournamentsRequest(limit, max, page, excludes, keys);
        }

        @Override
        public OpenTournamentsRequestBuilder getThis() {
            return this;
        }

    }

}
