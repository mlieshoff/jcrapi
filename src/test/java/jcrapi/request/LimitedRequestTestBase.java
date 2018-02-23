package jcrapi.request;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Michael Lieshoff
 */
public abstract class LimitedRequestTestBase<A extends LimitedRequest, B extends LimitedRequest.LimitedRequestBuilder<A, B>> extends RequestTestBase<A, B> {

    @Test(expected = IllegalArgumentException.class)
    public void failBecauseLimitIsNegative() {
        getBuilder().limit(-1).build();
    }

    @Test
    public void shouldBeWithLimit() {
        assertEquals(100, getLimitedRequest().getLimit());
    }

    private A getLimitedRequest() {
        return getBuilder().limit(100).build();
    }

    @Test
    public void shouldQueryWithLimit() {
        assertEquals("100", getLimitedRequest().getQueryParameters().get("limit"));
    }

    @Test
    public void shouldQueryWithMax() {
        assertEquals("100", getLimitedRequest().getQueryParameters().get("max"));
    }

}