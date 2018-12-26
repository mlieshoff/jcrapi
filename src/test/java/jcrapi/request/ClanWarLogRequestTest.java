package jcrapi.request;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author Michael Lieshoff
 */
public class ClanWarLogRequestTest extends RequestTestBase<ClanWeeklyHistoryRequest> {

  @Override
  Object getBuilder() {
    return ClanWarLogRequest.builder("abc");
  }

  @Test(expected = NullPointerException.class)
  public void failIfTagIsNull() {
    ClanWarLogRequest.builder(null).build();
  }

  @Test(expected = IllegalArgumentException.class)
  public void failIfTagIsEmpty() {
    ClanWarLogRequest.builder("").build();
  }

  @Test
  public void shouldBeWithTag() {
    assertEquals("abc", ClanWarLogRequest.builder("abc").build().getTag());
  }

  @Test
  public void shouldCreateBuilderWithCorrectClass() {
    assertEquals(ClanWarLogRequest.ClanWarLogRequestBuilder.class, ClanWarLogRequest.builder("abc").getClass());
  }

}