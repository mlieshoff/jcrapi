package jcrapi.request;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Michael Lieshoff
 */
public class ClanWeeklyHistoryRequestTest extends LimitedRequestTestBase<ClanWeeklyHistoryRequest> {

    @Override
    Object getBuilder() {
        return ClanWeeklyHistoryRequest.builder("abc");
    }

    @Test(expected = NullPointerException.class)
    public void failIfTagIsNull() {
        ClanWeeklyHistoryRequest.builder(null).build();
    }

    @Test(expected = IllegalArgumentException.class)
    public void failIfTagIsEmpty() {
        ClanWeeklyHistoryRequest.builder("").build();
    }

    @Test
    public void shouldBeWithTag() {
        assertEquals("abc", ClanWeeklyHistoryRequest.builder("abc").build().getTag());
    }

    @Test
    public void shouldCreateBuilderWithCorrectClass() {
        assertEquals(ClanWeeklyHistoryRequest.ClanWeeklyHistoryRequestBuilder.class, ClanWeeklyHistoryRequest.builder("abc").getClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void failBecauseDaysIsNegatives() {
        ClanWeeklyHistoryRequest.builder("abc").days(-1).build();
    }

    @Test
    public void shouldBeWithDays() {
        assertEquals(4, ClanWeeklyHistoryRequest.builder("abc").days(4).build().getDays().intValue());
    }

    @Test
    public void shouldQueryWithDays() {
        assertEquals("4", ClanWeeklyHistoryRequest.builder("abc").days(4).build().getQueryParameters().get("days"));
    }

}