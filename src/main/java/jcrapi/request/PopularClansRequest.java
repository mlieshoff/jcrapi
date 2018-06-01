package jcrapi.request;

import java.util.List;

/**
 * @author Michael Lieshoff
 */
public class PopularClansRequest extends LimitedRequest {

    private PopularClansRequest(int limit, int max, int page, List<String> excludes, List<String> includes) {
        super(limit, max, page, excludes, includes);
    }

    public static PopularClansRequestBuilder builder() {
        return new PopularClansRequestBuilder();
    }

    public static class PopularClansRequestBuilder extends LimitedRequestBuilder<PopularClansRequest, PopularClansRequestBuilder> {

        @Override
        public PopularClansRequest build() {
            return new PopularClansRequest(limit, max, page, excludes, keys);
        }

        @Override
        public PopularClansRequestBuilder getThis() {
            return this;
        }

    }

}
