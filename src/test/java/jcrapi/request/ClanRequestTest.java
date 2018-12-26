package jcrapi.request;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author Michael Lieshoff
 */
public class ClanRequestTest extends RequestTestBase<ClanRequest> {

  @Override
  Object getBuilder() {
    return ClanRequest.builder("abc");
  }

  @Test(expected = NullPointerException.class)
  public void failIfTagIsNull() {
    ClanRequest.builder(null).build();
  }

  @Test(expected = IllegalArgumentException.class)
  public void failIfTagIsEmpty() {
    ClanRequest.builder("").build();
  }

  @Test
  public void shouldBeWithTag() {
    assertEquals("abc", ClanRequest.builder("abc").build().getTag());
  }

  @Test
  public void shouldCreateBuilderWithCorrectClass() {
    assertEquals(ClanRequest.ClanRequestBuilder.class, ClanRequest.builder("abc").getClass());
  }

}