package jcrapi.request;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author Michael Lieshoff
 */
public class JoinableTournamentsRequestTest extends TournamentRequestTestBase<JoinableTournamentsRequest> {

  @Override
  Object getBuilder() {
    return JoinableTournamentsRequest.builder();
  }

  @Test
  public void shouldCreateBuilderWithCorrectClass() {
    assertEquals(JoinableTournamentsRequest.JoinableTournamentsRequestBuilder.class,
        JoinableTournamentsRequest.builder().getClass());
  }

}