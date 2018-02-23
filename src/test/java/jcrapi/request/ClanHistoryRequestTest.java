package jcrapi.request;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Michael Lieshoff
 */
public class ClanHistoryRequestTest extends RequestTestBase<ClanHistoryRequest, ClanHistoryRequest.ClanHistoryRequestBuilder> {

    @Override
    ClanHistoryRequest.ClanHistoryRequestBuilder getBuilder() {
        return ClanHistoryRequest.builder("abc");
    }

    @Test(expected = NullPointerException.class)
    public void failIfTagIsNull() {
        ClanHistoryRequest.builder(null).build();
    }

    @Test(expected = IllegalArgumentException.class)
    public void failIfTagIsEmpty() {
        ClanHistoryRequest.builder("").build();
    }

    @Test
    public void shouldBeWithTag() {
        assertEquals("abc", ClanHistoryRequest.builder("abc").build().getTag());
    }

    @Test
    public void shouldCreateBuilderWithCorrectClass() {
        assertEquals(ClanHistoryRequest.ClanHistoryRequestBuilder.class, ClanHistoryRequest.builder("abc").getClass());
    }

}