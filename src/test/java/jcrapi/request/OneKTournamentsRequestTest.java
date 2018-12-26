package jcrapi.request;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

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
    assertEquals(OneKTournamentsRequest.OneKTournamentsRequestBuilder.class,
        OneKTournamentsRequest.builder().getClass());
  }

}