package jcrapi.request;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

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
    assertEquals(InPreparationTournamentsRequest.InPreparationTournamentsRequestBuilder.class,
        InPreparationTournamentsRequest.builder().getClass());
  }

}