package jcrapi.request;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Michael Lieshoff
 */
public abstract class PaginatedRequestTestBase<A extends PaginatedRequest, B extends PaginatedRequest.PaginatedRequestBuilder<A, B>> extends RequestTestBase<A, B> {

    @Test(expected = IllegalArgumentException.class)
    public void failBecauseMaxIsNegative() {
        getBuilder().max(-1).build();
    }

    @Test
    public void shouldBeWithMax() {
        assertEquals(50, getPaginatedRequest().getMax());
    }

    private A getPaginatedRequest() {
        return getBuilder().max(50).page(75).build();
    }

    @Test
    public void shouldQueryWithMax() {
        assertEquals("50", getPaginatedRequest().getQueryParameters().get("max"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void failBecausePageIsNegative() {
        getBuilder().page(-1).build();
    }

    @Test
    public void shouldBeWithPage() {
        assertEquals(75, getPaginatedRequest().getPage());
    }

    @Test
    public void shouldQueryWithPage() {
        assertEquals("75", getPaginatedRequest().getQueryParameters().get("page"));
    }

}