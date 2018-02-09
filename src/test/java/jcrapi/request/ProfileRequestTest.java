package jcrapi.request;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * @author Michael Lieshoff
 */
public class ProfileRequestTest {

    @Test
    public void shouldCreateBuilder() {
        assertNotNull(ProfileRequest.builder());
    }

    @Test
    public void shouldCreateBuilderWithCorrectClass() {
        assertEquals(ProfileRequest.ProfileRequestBuilder.class, ProfileRequest.builder().getClass());
    }

    @Test(expected = NullPointerException.class)
    public void failIfTagIsNull() {
        ProfileRequest.builder().tag(null).build();
    }

    @Test(expected = IllegalArgumentException.class)
    public void failIfTagIsEmpty() {
        ProfileRequest.builder().tag("").build();
    }

    @Test
    public void shouldBeWithTag() {
        assertEquals("abc", ProfileRequest.builder().tag("abc").build().getTag());
    }

    @Test(expected = IllegalArgumentException.class)
    public void failBecauseLimitIsNegative() {
        ProfileRequest.builder().limit(-1).build();
    }

}