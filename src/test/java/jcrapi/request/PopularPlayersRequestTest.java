package jcrapi.request;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/**
 * @author Michael Lieshoff
 */
public class PopularPlayersRequestTest extends LimitedRequestTestBase<PopularPlayersRequest> {

  @Override
  Object getBuilder() {
    return PopularPlayersRequest.builder();
  }

  @Test
  public void shouldCreateBuilder() {
    assertNotNull(PopularPlayersRequest.builder());
  }

  @Test
  public void shouldCreateBuilderWithCorrectClass() {
    assertEquals(PopularPlayersRequest.PopularPlayersRequestBuilder.class, PopularPlayersRequest.builder().getClass());
  }

}