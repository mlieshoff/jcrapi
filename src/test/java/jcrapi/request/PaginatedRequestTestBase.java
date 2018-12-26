package jcrapi.request;

import static jcrapi.request.BuilderTestUtil.invokeBuildMethod;
import static jcrapi.request.BuilderTestUtil.invokeMaxMethod;
import static jcrapi.request.BuilderTestUtil.invokePageMethod;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import jcrapi.request.PaginatedRequest.PaginatedRequestBuilder;

/**
 * @author Michael Lieshoff
 */
public abstract class PaginatedRequestTestBase<A extends PaginatedRequest> extends RequestTestBase<A> {

  @Test
  public void shouldCreatePaginatedRequestBuilder() {
    assertTrue(PaginatedRequest.paginatedRequestBuilder() instanceof PaginatedRequestBuilder);
  }

  @Test(expected = IllegalArgumentException.class)
  public void failBecauseMaxIsNegative() throws Exception {
    Object builder = getBuilder();
    builder = invokeMaxMethod(builder, -1);
    invokeBuildMethod(builder);
  }

  @Test
  public void shouldBeWithMax() throws Exception {
    assertEquals(50, getPaginatedRequest().getMax());
  }

  private A getPaginatedRequest() throws Exception {
    Object builder = getBuilder();
    builder = invokeMaxMethod(builder, 50);
    builder = invokePageMethod(builder, 75);
    return invokeBuildMethod(builder);
  }

  @Test
  public void shouldQueryWithMax() throws Exception {
    assertEquals("50", getPaginatedRequest().getQueryParameters().get("max"));
  }

  @Test(expected = IllegalArgumentException.class)
  public void failBecausePageIsNegative() throws Exception {
    Object builder = getBuilder();
    builder = invokePageMethod(builder, -1);
    invokeBuildMethod(builder);
  }

  @Test
  public void shouldBeWithPage() throws Exception {
    assertEquals(75, getPaginatedRequest().getPage());
  }

  @Test
  public void shouldQueryWithPage() throws Exception {
    assertEquals("75", getPaginatedRequest().getQueryParameters().get("page"));
  }

}