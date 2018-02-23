package jcrapi.request;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Michael Lieshoff
 */
public class ClanBattlesRequestTest extends LimitedRequestTestBase<ClanBattlesRequest, ClanBattlesRequest.ClanBattlesRequestBuilder> {

    @Override
    ClanBattlesRequest.ClanBattlesRequestBuilder getBuilder() {
        return ClanBattlesRequest.builder("abc");
    }

    @Test(expected = NullPointerException.class)
    public void failIfTagIsNull() {
        ClanBattlesRequest.builder(null).build();
    }

    @Test(expected = IllegalArgumentException.class)
    public void failIfTagIsEmpty() {
        ClanBattlesRequest.builder("").build();
    }

    @Test
    public void shouldBeWithTag() {
        assertEquals("abc", ClanBattlesRequest.builder("abc").build().getTag());
    }

    @Test
    public void shouldCreateBuilderWithCorrectClass() {
        assertEquals(ClanBattlesRequest.ClanBattlesRequestBuilder.class, ClanBattlesRequest.builder("abc").getClass());
    }

}