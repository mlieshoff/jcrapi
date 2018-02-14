package jcrapi.request;

import java.util.List;

/**
 * @author Michael Lieshoff
 */
public class TopClansRequest extends Request {

    private final String locationKey;

    private TopClansRequest(String locationKey, int limit, List<String> excludes, List<String> includes) {
        super(limit, excludes, includes);
        this.locationKey = locationKey;
    }

    public String getLocationKey() {
        return locationKey;
    }

    public static TopClansRequestBuilder builder() {
        return new TopClansRequestBuilder();
    }

    public static class TopClansRequestBuilder extends RequestBuilder<TopClansRequest, TopClansRequestBuilder> {

        private String locationKey;

        public TopClansRequestBuilder locationKey(String locationKey) {
            this.locationKey = locationKey;
            return getThis();
        }

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
