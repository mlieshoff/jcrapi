package jcrapi.request;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * @author Michael Lieshoff
 */
public class TopPlayersRequestTest extends LocationedRequestTestBase<TopPlayersRequest> {

    @Override
    Object getBuilder() {
        return TopPlayersRequest.builder();
    }

    @Test
    public void shouldCreateBuilder() {
        assertNotNull(TopPlayersRequest.builder());
    }

    @Test
    public void shouldCreateBuilderWithCorrectClass() {
        assertEquals(TopPlayersRequest.TopPlayersRequestBuilder.class, TopPlayersRequest.builder().getClass());
    }

}