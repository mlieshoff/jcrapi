package jcrapi.request;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Michael Lieshoff
 */
public class KnownTournamentsRequestTest extends TournamentRequestTestBase<KnownTournamentsRequest> {

    @Override
    Object getBuilder() {
        return KnownTournamentsRequest.builder();
    }

    @Test
    public void shouldCreateBuilderWithCorrectClass() {
        assertEquals(KnownTournamentsRequest.KnownTournamentsRequestBuilder.class, KnownTournamentsRequest.builder().getClass());
    }

}