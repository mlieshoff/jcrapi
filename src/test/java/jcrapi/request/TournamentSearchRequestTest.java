package jcrapi.request;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/**
 * @author Michael Lieshoff
 */
public class TournamentSearchRequestTest extends LimitedRequestTestBase<TournamentSearchRequest> {

  @Override
  Object getBuilder() {
    return TournamentSearchRequest.builder("abc");
  }

  @Test
  public void shouldCreateBuilder() {
    assertNotNull(TournamentSearchRequest.builder("abc"));
  }

  @Test(expected = NullPointerException.class)
  public void failIfTagIsNull() {
    TournamentSearchRequest.builder(null).build();
  }

  @Test(expected = IllegalArgumentException.class)
  public void failIfTagIsEmpty() {
    TournamentSearchRequest.builder("").build();
  }

  @Test
  public void shouldCreateBuilderWithCorrectClass() {
    assertEquals(TournamentSearchRequest.TournamentSearchRequestBuilder.class, getBuilder().getClass());
  }

  @Test
  public void shouldBeWithName() {
    assertEquals("abc", TournamentSearchRequest.builder("abc").build().getName());
  }

  @Test
  public void shouldQueryWithName() {
    assertEquals("abc", TournamentSearchRequest.builder("abc").build().getQueryParameters().get("name"));
  }

}