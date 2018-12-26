package jcrapi.request;

import static jcrapi.request.BuilderTestUtil.invokeBuildMethod;
import static jcrapi.request.BuilderTestUtil.invokeExcludesMethod;
import static jcrapi.request.BuilderTestUtil.invokeKeysMethod;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import jcrapi.request.Request.RequestBuilder;

/**
 * @author Michael Lieshoff
 */
public abstract class RequestTestBase<T extends Request> {

  abstract Object getBuilder();

  @Test
  public void shouldCreateRequestBuilder() {
    assertTrue(Request.requestBuilder() instanceof RequestBuilder);
  }

  @Test
  public void shouldBeWithExcludes() throws Exception {
    List<String> expected = Arrays.asList("a", "b");
    Object builder = getBuilder();
    builder = invokeExcludesMethod(builder, expected);
    T request = invokeBuildMethod(builder);
    assertEquals(expected, request.getExcludes());
    assertEquals("a,b", request.getQueryParameters().get("excludes"));
  }

  @Test
  public void shouldBeWithKeys() throws Exception {
    List<String> expected = Arrays.asList("a", "b");
    Object builder = getBuilder();
    builder = invokeKeysMethod(builder, expected);
    T request = invokeBuildMethod(builder);
    assertEquals(expected, request.getKeys());
    assertEquals("a,b", request.getQueryParameters().get("keys"));
  }

}