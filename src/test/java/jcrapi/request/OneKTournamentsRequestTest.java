package jcrapi.request;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Michael Lieshoff
 */
public class OneKTournamentsRequestTest extends TournamentRequestTestBase<OneKTournamentsRequest> {

    @Override
    Object getBuilder() {
        return OneKTournamentsRequest.builder();
    }

    @Test
    public void shouldCreateBuilderWithCorrectClass() {
        assertEquals(OneKTournamentsRequest.OneKTournamentsRequestBuilder.class, OneKTournamentsRequest.builder().getClass());
    }

}