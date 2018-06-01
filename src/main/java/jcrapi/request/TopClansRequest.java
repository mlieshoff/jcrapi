package jcrapi.request;

import java.util.List;

/**
 * @author Michael Lieshoff
 */
public class TopClansRequest extends LocationedRequest {

    private TopClansRequest(String locationKey, int limit, int max, int page, List<String> excludes, List<String> includes) {
        super(locationKey, limit, max, page, excludes, includes);
    }

    public static TopClansRequestBuilder builder() {
        return new TopClansRequestBuilder();
    }

    public static class TopClansRequestBuilder extends LocationedRequestBuilder<TopClansRequest, TopClansRequestBuilder> {

        @Override
        public TopClansRequest build() {
            return new TopClansRequest(locationKey, limit, max, page, excludes, keys);
        }

        @Override
        public TopClansRequestBuilder getThis() {
            return this;
        }

    }

}
