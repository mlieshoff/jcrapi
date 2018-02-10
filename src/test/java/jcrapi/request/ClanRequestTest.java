package jcrapi.request;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * @author Michael Lieshoff
 */
public class ClanRequestTest {

    @Test
    public void shouldCreateBuilder() {
        assertNotNull(ClanRequest.builder());
    }

    @Test
    public void shouldCreateBuilderWithCorrectClass() {
        assertEquals(ClanRequest.ClanRequestBuilder.class, ClanRequest.builder().getClass());
    }

    @Test(expected = NullPointerException.class)
    public void failIfTagIsNull() {
        ClanRequest.builder().tag(null).build();
    }

    @Test(expected = IllegalArgumentException.class)
    public void failIfTagIsEmpty() {
        ClanRequest.builder().tag("").build();
    }

    @Test
    public void shouldBeWithTag() {
        assertEquals("abc", ClanRequest.builder().tag("abc").build().getTag());
    }

}