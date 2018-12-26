package jcrapi.request;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

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
    assertEquals(KnownTournamentsRequest.KnownTournamentsRequestBuilder.class,
        KnownTournamentsRequest.builder().getClass());
  }

}