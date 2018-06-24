package jcrapi.request;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Michael Lieshoff
 */
public class OpenTournamentsRequestTest extends TournamentRequestTestBase<OpenTournamentsRequest, OpenTournamentsRequest.OpenTournamentsRequestBuilder> {

    @Override
    OpenTournamentsRequest.OpenTournamentsRequestBuilder getBuilder() {
        return OpenTournamentsRequest.builder();
    }

    @Test
    public void shouldCreateBuilderWithCorrectClass() {
        assertEquals(OpenTournamentsRequest.OpenTournamentsRequestBuilder.class, OpenTournamentsRequest.builder().getClass());
    }

}