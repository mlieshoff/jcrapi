package jcrapi.request;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * @author Michael Lieshoff
 */
public class ClanBattlesRequestTest {

    @Test
    public void shouldCreateBuilder() {
        assertNotNull(ClanBattlesRequest.builder());
    }

    @Test
    public void shouldCreateBuilderWithCorrectClass() {
        assertEquals(ClanBattlesRequest.ClanBattlesRequestBuilder.class, ClanBattlesRequest.builder().getClass());
    }

    @Test(expected = NullPointerException.class)
    public void failIfTagIsNull() {
        ClanBattlesRequest.builder().tag(null).build();
    }

    @Test(expected = IllegalArgumentException.class)
    public void failIfTagIsEmpty() {
        ClanBattlesRequest.builder().tag("").build();
    }

    @Test
    public void shouldBeWithTag() {
        assertEquals("abc", ClanBattlesRequest.builder().tag("abc").build().getTag());
    }

}