package jcrapi.request;

import org.apache.commons.lang.StringUtils;

import java.util.List;
import java.util.Map;

/**
 * @author Michael Lieshoff
 */
public abstract class LocationedRequest extends LimitedRequest {

    private final String locationKey;

    LocationedRequest(String locationKey, int limit, List<String> excludes, List<String> keys) {
        super(limit, excludes, keys);
        this.locationKey = locationKey;
    }

    public String getLocationKey() {
        return locationKey;
    }

    public Map<String, String> getQueryParameters() {
        Map<String, String> map = super.getQueryParameters();
        if (StringUtils.isNotBlank(locationKey)) {
            map.put("locationId", locationKey);
            map.put("locationKey", locationKey);
        }
        return map;
    }

    static abstract class LocationedRequestBuilder<R extends LocationedRequest, B> extends LimitedRequestBuilder<R, B> {

        String locationKey;

        public B locationKey(String locationKey) {
            this.locationKey = locationKey;
            return getThis();
        }

    }

}
