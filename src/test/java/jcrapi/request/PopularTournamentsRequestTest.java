package jcrapi.request;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/**
 * @author Michael Lieshoff
 */
public class PopularTournamentsRequestTest extends LimitedRequestTestBase<PopularTournamentsRequest> {

  @Override
  Object getBuilder() {
    return PopularTournamentsRequest.builder();
  }

  @Test
  public void shouldCreateBuilder() {
    assertNotNull(PopularTournamentsRequest.builder());
  }

  @Test
  public void shouldCreateBuilderWithCorrectClass() {
    assertEquals(PopularTournamentsRequest.PopularTournamentsRequestBuilder.class,
        PopularTournamentsRequest.builder().getClass());
  }

}