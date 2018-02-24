package jcrapi.request;

import java.util.List;

/**
 * @author Michael Lieshoff
 */
public class OpenTournamentsRequest extends LimitedRequest {

    private OpenTournamentsRequest(int limit, List<String> excludes, List<String> includes) {
        super(limit, excludes, includes);
    }

    public static OpenTournamentsRequestBuilder builder() {
        return new OpenTournamentsRequestBuilder();
    }

    public static class OpenTournamentsRequestBuilder extends LimitedRequestBuilder<OpenTournamentsRequest, OpenTournamentsRequestBuilder> {

        @Override
        public OpenTournamentsRequest build() {
            return new OpenTournamentsRequest(limit, excludes, keys);
        }

        @Override
        public OpenTournamentsRequestBuilder getThis() {
            return this;
        }

    }

}
