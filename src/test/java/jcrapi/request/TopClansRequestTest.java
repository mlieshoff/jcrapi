package jcrapi.request;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/**
 * @author Michael Lieshoff
 */
public class TopClansRequestTest extends LocationedRequestTestBase<TopClansRequest> {

  @Override
  Object getBuilder() {
    return TopClansRequest.builder();
  }

  @Test
  public void shouldCreateBuilder() {
    assertNotNull(TopClansRequest.builder());
  }

  @Test
  public void shouldCreateBuilderWithCorrectClass() {
    assertEquals(TopClansRequest.TopClansRequestBuilder.class, TopClansRequest.builder().getClass());
  }

}