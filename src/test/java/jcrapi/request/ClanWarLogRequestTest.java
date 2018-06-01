package jcrapi.request;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Michael Lieshoff
 */
public class ClanWarLogRequestTest extends RequestTestBase<ClanWarLogRequest, ClanWarLogRequest.ClanWarLogRequestBuilder> {

    @Override
    ClanWarLogRequest.ClanWarLogRequestBuilder getBuilder() {
        return ClanWarLogRequest.builder("abc");
    }

    @Test(expected = NullPointerException.class)
    public void failIfTagIsNull() {
        ClanWarLogRequest.builder(null).build();
    }

    @Test(expected = IllegalArgumentException.class)
    public void failIfTagIsEmpty() {
        ClanWarLogRequest.builder("").build();
    }

    @Test
    public void shouldBeWithTag() {
        assertEquals("abc", ClanWarLogRequest.builder("abc").build().getTag());
    }

    @Test
    public void shouldCreateBuilderWithCorrectClass() {
        assertEquals(ClanWarLogRequest.ClanWarLogRequestBuilder.class, ClanWarLogRequest.builder("abc").getClass());
    }

}