package jcrapi.request;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * @author Michael Lieshoff
 */
public class TournamentsRequestTest {

    @Test
    public void shouldCreateBuilder() {
        assertNotNull(TournamentsRequest.builder());
    }

    @Test
    public void shouldCreateBuilderWithCorrectClass() {
        assertEquals(TournamentsRequest.TournamentsRequestBuilder.class, TournamentsRequest.builder().getClass());
    }

    @Test(expected = NullPointerException.class)
    public void failIfTagIsNull() {
        TournamentsRequest.builder().tag(null).build();
    }

    @Test(expected = IllegalArgumentException.class)
    public void failIfTagIsEmpty() {
        TournamentsRequest.builder().tag("").build();
    }

    @Test
    public void shouldBeWithTag() {
        assertEquals("abc", TournamentsRequest.builder().tag("abc").build().getTag());
    }

}