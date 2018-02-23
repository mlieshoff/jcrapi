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
        A request = getBuilder().limit(100).build();
        assertEquals(100, request.getLimit());
        assertEquals("100", request.getQueryParameters().get("limit"));
    }

}