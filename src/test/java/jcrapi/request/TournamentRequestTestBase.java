package jcrapi.request;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * @author Michael Lieshoff
 */
public abstract class TournamentRequestTestBase<A extends TournamentRequest, B extends TournamentRequest.TournamentRequestBuilder<A, B>> extends LimitedRequestTestBase<A, B> {

    @Test
    public void shouldBeWithOneK() {
        assertTrue(getTournamentRequest().isOneK());
    }

    private A getTournamentRequest() {
        return getBuilder().oneK().open().full().prep().joinable().build();
    }

    @Test
    public void shouldQueryWithOneK() {
        assertEquals("1", getTournamentRequest().getQueryParameters().get("oneK"));
    }

    @Test
    public void shouldBeWithOpen() {
        assertTrue(getTournamentRequest().isOpen());
    }

    @Test
    public void shouldQueryWithOpen() {
        assertEquals("1", getTournamentRequest().getQueryParameters().get("open"));
    }

    @Test
    public void shouldBeWithFull() {
        assertTrue(getTournamentRequest().isFull());
    }

    @Test
    public void shouldQueryWithFull() {
        assertEquals("1", getTournamentRequest().getQueryParameters().get("full"));
    }

    @Test
    public void shouldBeWithPrep() {
        assertTrue(getTournamentRequest().isPrep());
    }

    @Test
    public void shouldQueryWithPrep() {
        assertEquals("1", getTournamentRequest().getQueryParameters().get("prep"));
    }

    @Test
    public void shouldBeWithJoinable() {
        assertTrue(getTournamentRequest().isJoinable());
    }

    @Test
    public void shouldQueryWithJoinable() {
        assertEquals("1", getTournamentRequest().getQueryParameters().get("joinable"));
    }

}