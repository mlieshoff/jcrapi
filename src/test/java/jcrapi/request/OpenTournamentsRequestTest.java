package jcrapi.request;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author Michael Lieshoff
 */
public class OpenTournamentsRequestTest extends TournamentRequestTestBase<OpenTournamentsRequest> {

  @Override
  Object getBuilder() {
    return OpenTournamentsRequest.builder();
  }

  @Test
  public void shouldCreateBuilderWithCorrectClass() {
    assertEquals(OpenTournamentsRequest.OpenTournamentsRequestBuilder.class,
        OpenTournamentsRequest.builder().getClass());
  }

}