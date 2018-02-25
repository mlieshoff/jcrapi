package jcrapi.request;

import java.util.List;

/**
 * @author Michael Lieshoff
 */
public class AuthStatsRequest extends Request {

    private AuthStatsRequest(List<String> excludes, List<String> includes) {
        super(excludes, includes);
    }

    public static AuthStatsRequestBuilder builder() {
        return new AuthStatsRequestBuilder();
    }

    public static class AuthStatsRequestBuilder extends RequestBuilder<AuthStatsRequest, AuthStatsRequestBuilder> {

        @Override
        public AuthStatsRequest build() {
            return new AuthStatsRequest(excludes, keys);
        }

        @Override
        public AuthStatsRequestBuilder getThis() {
            return this;
        }

    }

}
