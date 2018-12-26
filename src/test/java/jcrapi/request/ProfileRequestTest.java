package jcrapi.request;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author Michael Lieshoff
 */
public class ProfileRequestTest extends RequestTestBase<ProfileRequest> {

  @Override
  Object getBuilder() {
    return ProfileRequest.builder("abc");
  }

  @Test(expected = NullPointerException.class)
  public void failIfTagIsNull() {
    ProfileRequest.builder(null).build();
  }

  @Test(expected = IllegalArgumentException.class)
  public void failIfTagIsEmpty() {
    ProfileRequest.builder("").build();
  }

  @Test
  public void shouldBeWithTag() {
    assertEquals("abc", ProfileRequest.builder("abc").build().getTag());
  }

  @Test
  public void shouldCreateBuilderWithCorrectClass() {
    assertEquals(ProfileRequest.ProfileRequestBuilder.class, ProfileRequest.builder("abc").getClass());
  }
}