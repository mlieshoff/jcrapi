package jcrapi.request;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * @author Michael Lieshoff
 */
public class PopularDecksRequestTest extends LimitedRequestTestBase<PopularDecksRequest> {

    @Override
    Object getBuilder() {
        return PopularDecksRequest.builder();
    }

    @Test
    public void shouldCreateBuilder() {
        assertNotNull(PopularDecksRequest.builder());
    }

    @Test
    public void shouldCreateBuilderWithCorrectClass() {
        assertEquals(PopularDecksRequest.PopularDecksRequestBuilder.class, PopularDecksRequest.builder().getClass());
    }

}