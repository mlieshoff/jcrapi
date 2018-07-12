package jcrapi.request;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Michael Lieshoff
 */
public class InPreparationTournamentsRequestTest extends TournamentRequestTestBase<InPreparationTournamentsRequest> {

    @Override
    Object getBuilder() {
        return InPreparationTournamentsRequest.builder();
    }

    @Test
    public void shouldCreateBuilderWithCorrectClass() {
        assertEquals(InPreparationTournamentsRequest.InPreparationTournamentsRequestBuilder.class, InPreparationTournamentsRequest.builder().getClass());
    }

}