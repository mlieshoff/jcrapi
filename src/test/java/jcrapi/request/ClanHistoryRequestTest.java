package jcrapi.request;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * @author Michael Lieshoff
 */
public class ClanHistoryRequestTest {

    @Test
    public void shouldCreateBuilder() {
        assertNotNull(ClanHistoryRequest.builder());
    }

    @Test
    public void shouldCreateBuilderWithCorrectClass() {
        assertEquals(ClanHistoryRequest.ClanHistoryRequestBuilder.class, ClanHistoryRequest.builder().getClass());
    }

    @Test(expected = NullPointerException.class)
    public void failIfTagIsNull() {
        ClanHistoryRequest.builder().tag(null).build();
    }

    @Test(expected = IllegalArgumentException.class)
    public void failIfTagIsEmpty() {
        ClanHistoryRequest.builder().tag("").build();
    }

    @Test
    public void shouldBeWithTag() {
        assertEquals("abc", ClanHistoryRequest.builder().tag("abc").build().getTag());
    }

}