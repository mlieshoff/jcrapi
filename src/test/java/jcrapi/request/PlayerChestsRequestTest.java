package jcrapi.request;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Michael Lieshoff
 */
public class PlayerChestsRequestTest extends LimitedRequestTestBase<PlayerChestsRequest> {

  @Override
  Object getBuilder() {
    return PlayerChestsRequest.builder(Arrays.asList("abc"));
  }

  @Test(expected = IllegalArgumentException.class)
  public void failIfTagsAreNull() {
    PlayerChestsRequest.builder(null).build();
  }

  @Test(expected = IllegalArgumentException.class)
  public void failIfTagsAreEmpty() {
    PlayerChestsRequest.builder(Collections.<String>emptyList()).build();
  }

  @Test
  public void shouldBeWithTags() {
    List<String> tags = Arrays.asList("abc");
    assertEquals(tags, PlayerChestsRequest.builder(tags).build().getTags());
  }

  @Test
  public void shouldCreateBuilderWithCorrectClassForListVersion() {
    List<String> tags = Arrays.asList("abc");
    assertEquals(PlayerChestsRequest.PlayerChestsRequestBuilder.class, PlayerChestsRequest.builder(tags).getClass());
  }

}