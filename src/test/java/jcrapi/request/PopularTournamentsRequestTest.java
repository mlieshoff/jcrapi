package jcrapi.request;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * @author Michael Lieshoff
 */
public class PopularTournamentsRequestTest extends LimitedRequestTestBase<PopularTournamentsRequest> {

    @Override
    Object getBuilder() {
        return PopularTournamentsRequest.builder();
    }

    @Test
    public void shouldCreateBuilder() {
        assertNotNull(PopularTournamentsRequest.builder());
    }

    @Test
    public void shouldCreateBuilderWithCorrectClass() {
        assertEquals(PopularTournamentsRequest.PopularTournamentsRequestBuilder.class, PopularTournamentsRequest.builder().getClass());
    }

}