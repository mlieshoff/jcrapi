package jcrapi.request;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author Michael Lieshoff
 */
public class AuthStatsRequestTest extends RequestTestBase<AuthStatsRequest> {

  @Override
  Object getBuilder() {
    return AuthStatsRequest.builder();
  }

  @Test
  public void shouldCreateBuilderWithCorrectClass() {
    assertEquals(AuthStatsRequest.AuthStatsRequestBuilder.class, AuthStatsRequest.builder().getClass());
  }

}