package jcrapi.request;

import static jcrapi.request.BuilderTestUtil.invokeBuildMethod;
import static jcrapi.request.BuilderTestUtil.invokeLimitMethod;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import jcrapi.request.LimitedRequest.LimitedRequestBuilder;

/**
 * @author Michael Lieshoff
 */
public abstract class LimitedRequestTestBase<A extends LimitedRequest> extends PaginatedRequestTestBase<A> {

    @Test
    public void shouldCreateLimitedRequestBuilder() {
        assertTrue(LimitedRequest.limitedRequestBuilder() instanceof LimitedRequestBuilder);
    }

    @Test(expected = IllegalArgumentException.class)
    public void failBecauseLimitIsNegative() throws Exception {
        Object builder = getBuilder();
        builder = invokeLimitMethod(builder, -1);
        invokeBuildMethod(builder);
    }

    @Test
    public void shouldBeWithLimit() throws Exception {
        assertEquals(100, getLimitedRequest().getLimit());
    }

    private A getLimitedRequest() throws Exception {
        Object builder = getBuilder();
        builder = invokeLimitMethod(builder, 100);
        return invokeBuildMethod(builder);
    }

    @Test
    public void shouldQueryWithLimit() throws Exception {
        assertEquals("100", getLimitedRequest().getQueryParameters().get("limit"));
    }

}