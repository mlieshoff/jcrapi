package jcrapi.request;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Michael Lieshoff
 */
public class ClanHistoryRequestTest extends LimitedRequestTestBase<ClanHistoryRequest, ClanHistoryRequest.ClanHistoryRequestBuilder> {

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

    @Test(expected = IllegalArgumentException.class)
    public void failBecauseDaysIsNegatives() {
        ClanHistoryRequest.builder("abc").days(-1).build();
    }

    @Test
    public void shouldBeWithDays() {
        assertEquals(4, ClanHistoryRequest.builder("abc").days(4).build().getDays().intValue());
    }

    @Test
    public void shouldQueryWithDays() {
        assertEquals("4", ClanHistoryRequest.builder("abc").days(4).build().getQueryParameters().get("days"));
    }

}