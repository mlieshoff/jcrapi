package jcrapi.request;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Michael Lieshoff
 */
public class ProfileRequestTest {

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