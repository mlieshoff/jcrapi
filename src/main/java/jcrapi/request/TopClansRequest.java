package jcrapi.request;

import java.util.List;

/**
 * @author Michael Lieshoff
 */
public class TopClansRequest extends LocationedRequest {

    private TopClansRequest(String locationKey, int limit, List<String> excludes, List<String> includes) {
        super(locationKey, limit, excludes, includes);
    }

    public static TopClansRequestBuilder builder() {
        return new TopClansRequestBuilder();
    }

    public static class TopClansRequestBuilder extends LocationedRequestBuilder<TopClansRequest, TopClansRequestBuilder> {

        @Override
        public TopClansRequest build() {
            return new TopClansRequest(locationKey, limit, excludes, keys);
        }

        @Override
        public TopClansRequestBuilder getThis() {
            return this;
        }

    }

}
