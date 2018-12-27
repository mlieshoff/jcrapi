package jcrapi.request;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/**
 * @author Michael Lieshoff
 */
public class ConstantsRequestTest extends LimitedRequestTestBase<ConstantsRequest> {

  @Override
  Object getBuilder() {
    return ConstantsRequest.builder();
  }

  @Test
  public void shouldCreateBuilder() {
    assertNotNull(ConstantsRequest.builder());
  }

  @Test
  public void shouldCreateBuilderWithCorrectClass() {
    assertEquals(ConstantsRequest.ConstantsRequestBuilder.class, ConstantsRequest.builder().getClass());
  }

}