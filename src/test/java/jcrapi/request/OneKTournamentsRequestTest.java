package jcrapi.request;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Michael Lieshoff
 */
public class OneKTournamentsRequestTest extends TournamentRequestTestBase<OneKTournamentsRequest, OneKTournamentsRequest.OneKTournamentsRequestBuilder> {

    @Override
    OneKTournamentsRequest.OneKTournamentsRequestBuilder getBuilder() {
        return OneKTournamentsRequest.builder();
    }

    @Test
    public void shouldCreateBuilderWithCorrectClass() {
        assertEquals(OneKTournamentsRequest.OneKTournamentsRequestBuilder.class, OneKTournamentsRequest.builder().getClass());
    }

}