package jcrapi.request;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Michael Lieshoff
 */
public class TournamentsRequestTest extends RequestTestBase<TournamentsRequest> {

    @Override
    Object getBuilder() {
        return TournamentsRequest.builder("abc");
    }

    @Test(expected = NullPointerException.class)
    public void failIfTagIsNull() {
        TournamentsRequest.builder(null).build();
    }

    @Test(expected = IllegalArgumentException.class)
    public void failIfTagIsEmpty() {
        TournamentsRequest.builder("").build();
    }

    @Test
    public void shouldBeWithTag() {
        assertEquals("abc", TournamentsRequest.builder("abc").build().getTag());
    }

    @Test
    public void shouldCreateBuilderWithCorrectClass() {
        assertEquals(TournamentsRequest.TournamentsRequestBuilder.class, TournamentsRequest.builder("abc").getClass());
    }

}