package jcrapi.request;

import static jcrapi.request.BuilderTestUtil.invokeBuildMethod;
import static jcrapi.request.BuilderTestUtil.invokeLocationKeyMethod;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import jcrapi.request.LocationedRequest.LocationedRequestBuilder;

/**
 * @author Michael Lieshoff
 */
public abstract class LocationedRequestTestBase<A extends LocationedRequest> extends LimitedRequestTestBase<A> {

  @Test
  public void shouldCreateLocationedRequestBuilder() {
    assertTrue(LocationedRequest.locationedRequestBuilder() instanceof LocationedRequestBuilder);
  }

  @Test
  public void shouldBeWithLocationKey() throws Exception {
    assertEquals("EU", getLocationedRequest().getLocationKey());
  }

  private A getLocationedRequest() throws Exception {
    Object builder = getBuilder();
    builder = invokeLocationKeyMethod(builder, "EU");
    return invokeBuildMethod(builder);
  }

  @Test
  public void shouldGetLocationKey() throws Exception {
    assertEquals("EU", getLocationedRequest().getLocationKey());
  }

}