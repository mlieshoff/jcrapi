package jcrapi.request;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Michael Lieshoff
 */
public class ClanRequestTest extends RequestTestBase<ClanRequest, ClanRequest.ClanRequestBuilder> {

    @Override
    ClanRequest.ClanRequestBuilder getBuilder() {
        return ClanRequest.builder("abc");
    }

    @Test(expected = NullPointerException.class)
    public void failIfTagIsNull() {
        ClanRequest.builder(null).build();
    }

    @Test(expected = IllegalArgumentException.class)
    public void failIfTagIsEmpty() {
        ClanRequest.builder("").build();
    }

    @Test
    public void shouldBeWithTag() {
        assertEquals("abc", ClanRequest.builder("abc").build().getTag());
    }

    @Test
    public void shouldCreateBuilderWithCorrectClass() {
        assertEquals(ClanRequest.ClanRequestBuilder.class, ClanRequest.builder("abc").getClass());
    }

    @Test
    public void shouldBeWithLimit() {
        assertEquals(100, ClanRequest.builder("abc").limit(100).build().getLimit());
    }

}