package jcrapi.request;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Michael Lieshoff
 */
public class ClanTrackingRequestTest extends RequestTestBase<ClanTrackingRequest> {

    @Override
    Object getBuilder() {
        return ClanTrackingRequest.builder("abc");
    }

    @Test(expected = NullPointerException.class)
    public void failIfTagIsNull() {
        ClanTrackingRequest.builder(null).build();
    }

    @Test(expected = IllegalArgumentException.class)
    public void failIfTagIsEmpty() {
        ClanTrackingRequest.builder("").build();
    }

    @Test
    public void shouldBeWithTag() {
        assertEquals("abc", ClanTrackingRequest.builder("abc").build().getTag());
    }

    @Test
    public void shouldCreateBuilderWithCorrectClass() {
        assertEquals(ClanTrackingRequest.ClanTrackingRequestBuilder.class, ClanTrackingRequest.builder("abc").getClass());
    }

}