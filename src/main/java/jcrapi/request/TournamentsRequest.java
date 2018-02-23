package jcrapi.request;

import com.google.common.base.Preconditions;

import java.util.List;

/**
 * @author Michael Lieshoff
 */
public class TournamentsRequest extends Request {

    private final String tag;

    private TournamentsRequest(String tag, List<String> excludes, List<String> includes) {
        super(excludes, includes);
        Preconditions.checkNotNull(tag, "tag");
        Preconditions.checkArgument(tag.length() > 0, "tag");
        this.tag = tag;
    }

    public String getTag() {
        return tag;
    }

    public static TournamentsRequestBuilder builder(String tag) {
        return new TournamentsRequestBuilder(tag);
    }

    public static class TournamentsRequestBuilder extends RequestBuilder<TournamentsRequest, TournamentsRequestBuilder> {

        private final String tag;

        public TournamentsRequestBuilder(String tag) {
            this.tag = tag;
        }

        @Override
        public TournamentsRequest build() {
            return new TournamentsRequest(tag, excludes, keys);
        }

        @Override
        public TournamentsRequestBuilder getThis() {
            return this;
        }

    }

}
