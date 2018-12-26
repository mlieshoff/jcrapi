package jcrapi.request;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/**
 * @author Michael Lieshoff
 */
public class PopularDecksRequestTest extends LimitedRequestTestBase<PopularDecksRequest> {

  @Override
  Object getBuilder() {
    return PopularDecksRequest.builder();
  }

  @Test
  public void shouldCreateBuilder() {
    assertNotNull(PopularDecksRequest.builder());
  }

  @Test
  public void shouldCreateBuilderWithCorrectClass() {
    assertEquals(PopularDecksRequest.PopularDecksRequestBuilder.class, PopularDecksRequest.builder().getClass());
  }

}