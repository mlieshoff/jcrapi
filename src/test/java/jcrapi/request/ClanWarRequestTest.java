package jcrapi.request;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author Michael Lieshoff
 */
public class ClanWarRequestTest extends RequestTestBase<ClanWarRequest> {

  @Override
  Object getBuilder() {
    return ClanWarRequest.builder("abc");
  }

  @Test(expected = NullPointerException.class)
  public void failIfTagIsNull() {
    ClanWarRequest.builder(null).build();
  }

  @Test(expected = IllegalArgumentException.class)
  public void failIfTagIsEmpty() {
    ClanWarRequest.builder("").build();
  }

  @Test
  public void shouldBeWithTag() {
    assertEquals("abc", ClanWarRequest.builder("abc").build().getTag());
  }

  @Test
  public void shouldCreateBuilderWithCorrectClass() {
    assertEquals(ClanWarRequest.ClanWarRequestBuilder.class, ClanWarRequest.builder("abc").getClass());
  }

}