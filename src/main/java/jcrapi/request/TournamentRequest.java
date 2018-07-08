package jcrapi.request;

import lombok.Getter;

import java.util.List;
import java.util.Map;

/**
 * @author Michael Lieshoff
 */
@Getter
public class TournamentRequest extends LimitedRequest {

    private final boolean oneK;
    private final boolean open;
    private final boolean full;
    private final boolean prep;
    private final boolean joinable;

    protected TournamentRequest(boolean oneK, boolean open, boolean full, boolean prep, boolean joinable, int limit, int max, int page, List<String> excludes, List<String> includes) {
        super(limit, max, page, excludes, includes);
        this.oneK = oneK;
        this.open = open;
        this.full = full;
        this.prep = prep;
        this.joinable = joinable;
    }

    public Map<String, String> getQueryParameters() {
        Map<String, String> map = super.getQueryParameters();
        putOneIfTrue(map, oneK, "1k");
        putOneIfTrue(map, open, "open");
        putOneIfTrue(map, full, "full");
        putOneIfTrue(map, prep, "prep");
        putOneIfTrue(map, joinable, "joinable");
        return map;
    }

    private void putOneIfTrue(Map<String,String> map, boolean flag, String name) {
        if (flag) {
            map.put(name, "1");
        }
    }

    public abstract static class TournamentRequestBuilder<R extends TournamentRequest, B> extends LimitedRequestBuilder<R, B> {

        protected boolean oneK;
        protected boolean open;
        protected boolean full;
        protected boolean prep;
        protected boolean joinable;

        public B oneK() {
            this.oneK = true;
            return getThis();
        }

        public B open() {
            this.open = true;
            return getThis();
        }

        public B full() {
            this.full = true;
            return getThis();
        }

        public B prep() {
            this.prep = true;
            return getThis();
        }

        public B joinable() {
            this.joinable = true;
            return getThis();
        }

    }

}
