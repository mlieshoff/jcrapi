package jcrapi.request;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/**
 * @author Michael Lieshoff
 */
public class TopWarsRequestTest extends LocationedRequestTestBase<TopWarsRequest> {

  @Override
  Object getBuilder() {
    return TopWarsRequest.builder();
  }

  @Test
  public void shouldCreateBuilder() {
    assertNotNull(TopWarsRequest.builder());
  }

  @Test
  public void shouldCreateBuilderWithCorrectClass() {
    assertEquals(TopWarsRequest.TopWarsRequestBuilder.class, TopWarsRequest.builder().getClass());
  }

}