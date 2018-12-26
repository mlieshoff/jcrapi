package jcrapi.request;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author Michael Lieshoff
 */
public class ClanBattlesRequestTest extends LimitedRequestTestBase<ClanBattlesRequest> {

  @Override
  Object getBuilder() {
    return ClanBattlesRequest.builder("abc");
  }

  @Test(expected = NullPointerException.class)
  public void failIfTagIsNull() {
    ClanBattlesRequest.builder(null).build();
  }

  @Test(expected = IllegalArgumentException.class)
  public void failIfTagIsEmpty() {
    ClanBattlesRequest.builder("").build();
  }

  @Test
  public void shouldBeWithTag() {
    assertEquals("abc", ClanBattlesRequest.builder("abc").build().getTag());
  }

  @Test
  public void shouldCreateBuilderWithCorrectClass() {
    assertEquals(ClanBattlesRequest.ClanBattlesRequestBuilder.class, ClanBattlesRequest.builder("abc").getClass());
  }

}