package jcrapi.request;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

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
        ProfileRequest.builder().tag(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void failIfTagIsEmpty() {
        ProfileRequest.builder().tag("");
    }

    @Test
    public void shouldBeWithTag() {
        assertEquals("abc", ProfileRequest.builder().tag("abc").build().getTag());
    }

    @Test
    public void shouldBeWithLimit() {
        assertEquals(100, ProfileRequest.builder().limit(100).build().getLimit());
    }

    @Test
    public void shouldBeWithExcludes() {
        List<String> expected = Arrays.asList("a", "b");
        assertEquals(expected, ProfileRequest.builder().excludes(expected).build().getExcludes());
    }

    @Test
    public void shouldBeWithIncludes() {
        List<String> expected = Arrays.asList("a", "b");
        assertEquals(expected, ProfileRequest.builder().includes(expected).build().getIncludes());
    }

}