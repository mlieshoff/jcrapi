package jcrapi.request;

import java.util.List;

/**
 * @author Michael Lieshoff
 */
public class PopularClansRequest extends LimitedRequest {

    private PopularClansRequest(int limit, List<String> excludes, List<String> includes) {
        super(limit, excludes, includes);
    }

    public static PopularClansRequestBuilder builder() {
        return new PopularClansRequestBuilder();
    }

    public static class PopularClansRequestBuilder extends LimitedRequestBuilder<PopularClansRequest, PopularClansRequestBuilder> {

        @Override
        public PopularClansRequest build() {
            return new PopularClansRequest(limit, excludes, keys);
        }

        @Override
        public PopularClansRequestBuilder getThis() {
            return this;
        }

    }

}
