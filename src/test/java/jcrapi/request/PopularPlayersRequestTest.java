package jcrapi.request;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * @author Michael Lieshoff
 */
public class PopularPlayersRequestTest extends LimitedRequestTestBase<PopularPlayersRequest, PopularPlayersRequest.PopularPlayersRequestBuilder> {

    @Override
    PopularPlayersRequest.PopularPlayersRequestBuilder getBuilder() {
        return PopularPlayersRequest.builder();
    }

    @Test
    public void shouldCreateBuilder() {
        assertNotNull(PopularPlayersRequest.builder());
    }

    @Test
    public void shouldCreateBuilderWithCorrectClass() {
        assertEquals(PopularPlayersRequest.PopularPlayersRequestBuilder.class, PopularPlayersRequest.builder().getClass());
    }

}