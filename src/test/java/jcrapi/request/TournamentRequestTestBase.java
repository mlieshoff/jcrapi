package jcrapi.request;

import static jcrapi.request.BuilderTestUtil.invokeBuildMethod;
import static jcrapi.request.BuilderTestUtil.invokeFullMethod;
import static jcrapi.request.BuilderTestUtil.invokeJoinableMethod;
import static jcrapi.request.BuilderTestUtil.invokeOneKMethod;
import static jcrapi.request.BuilderTestUtil.invokeOpenMethod;
import static jcrapi.request.BuilderTestUtil.invokePrepMethod;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import jcrapi.request.TournamentRequest.TournamentRequestBuilder;

/**
 * @author Michael Lieshoff
 */
public abstract class TournamentRequestTestBase<A extends TournamentRequest> extends LimitedRequestTestBase<A> {

    @Test
    public void shouldCreateTournamentRequestBuilder() {
        assertTrue(TournamentRequest.tournamentRequestBuilder() instanceof TournamentRequestBuilder);
    }

    @Test
    public void shouldBeWithOneK() throws Exception {
        assertTrue(getTournamentRequest().isOneK());
    }

    private A getTournamentRequest() throws Exception {
        Object builder = getBuilder();
        builder = invokeOneKMethod(builder, true);
        builder = invokeOpenMethod(builder, true);
        builder = invokeFullMethod(builder, true);
        builder = invokePrepMethod(builder, true);
        builder = invokeJoinableMethod(builder, true);
        return invokeBuildMethod(builder);
    }

    @Test
    public void shouldQueryWithOneK() throws Exception {
        assertEquals("1", getTournamentRequest().getQueryParameters().get("1k"));
    }

    @Test
    public void shouldBeWithOpen() throws Exception {
        assertTrue(getTournamentRequest().isOpen());
    }

    @Test
    public void shouldQueryWithOpen() throws Exception {
        assertEquals("1", getTournamentRequest().getQueryParameters().get("open"));
    }

    @Test
    public void shouldBeWithFull() throws Exception {
        assertTrue(getTournamentRequest().isFull());
    }

    @Test
    public void shouldQueryWithFull() throws Exception {
        assertEquals("1", getTournamentRequest().getQueryParameters().get("full"));
    }

    @Test
    public void shouldBeWithPrep() throws Exception {
        assertTrue(getTournamentRequest().isPrep());
    }

    @Test
    public void shouldQueryWithPrep() throws Exception {
        assertEquals("1", getTournamentRequest().getQueryParameters().get("prep"));
    }

    @Test
    public void shouldBeWithJoinable() throws Exception {
        assertTrue(getTournamentRequest().isJoinable());
    }

    @Test
    public void shouldQueryWithJoinable() throws Exception {
        assertEquals("1", getTournamentRequest().getQueryParameters().get("joinable"));
    }

}