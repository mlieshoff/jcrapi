package jcrapi.request;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Michael Lieshoff
 */
public class JoinableTournamentsRequestTest extends TournamentRequestTestBase<JoinableTournamentsRequest, JoinableTournamentsRequest.JoinableTournamentsRequestBuilder> {

    @Override
    JoinableTournamentsRequest.JoinableTournamentsRequestBuilder getBuilder() {
        return JoinableTournamentsRequest.builder();
    }

    @Test
    public void shouldCreateBuilderWithCorrectClass() {
        assertEquals(JoinableTournamentsRequest.JoinableTournamentsRequestBuilder.class, JoinableTournamentsRequest.builder().getClass());
    }

}