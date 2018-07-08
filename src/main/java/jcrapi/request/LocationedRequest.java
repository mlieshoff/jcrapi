package jcrapi.request;

import lombok.Getter;

import java.util.List;

/**
 * @author Michael Lieshoff
 */
@Getter
public abstract class LocationedRequest extends LimitedRequest {

    private final String locationKey;

    LocationedRequest(String locationKey, int limit, int max, int page, List<String> excludes, List<String> keys) {
        super(limit, max, page, excludes, keys);
        this.locationKey = locationKey;
    }

    static abstract class LocationedRequestBuilder<R extends LocationedRequest, B> extends LimitedRequestBuilder<R, B> {

        String locationKey;

        public B locationKey(String locationKey) {
            this.locationKey = locationKey;
            return getThis();
        }

    }

}
