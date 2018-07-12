package jcrapi.request;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Michael Lieshoff
 */
public class FullTournamentsRequestTest extends TournamentRequestTestBase<FullTournamentsRequest> {

    @Override
    Object getBuilder() {
        return FullTournamentsRequest.builder();
    }

    @Test
    public void shouldCreateBuilderWithCorrectClass() {
        assertEquals(FullTournamentsRequest.FullTournamentsRequestBuilder.class, FullTournamentsRequest.builder().getClass());
    }

}