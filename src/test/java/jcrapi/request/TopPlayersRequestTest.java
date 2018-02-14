package jcrapi.request;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * @author Michael Lieshoff
 */
public class TopPlayersRequestTest {

    @Test
    public void shouldCreateBuilder() {
        assertNotNull(TopPlayersRequest.builder());
    }

    @Test
    public void shouldCreateBuilderWithCorrectClass() {
        assertEquals(TopPlayersRequest.TopPlayersRequestBuilder.class, TopPlayersRequest.builder().getClass());
    }

    @Test
    public void shouldBeWithLocationKey() {
        assertEquals("abc", TopPlayersRequest.builder().locationKey("abc").build().getLocationKey());
    }

}