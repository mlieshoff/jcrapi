package jcrapi.request;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * @author Michael Lieshoff
 */
public class ProfilesRequestTest {

    @Test
    public void shouldCreateBuilder() {
        assertNotNull(ProfilesRequest.builder());
    }

    @Test
    public void shouldCreateBuilderWithCorrectClass() {
        assertEquals(ProfilesRequest.ProfilesRequestBuilder.class, ProfilesRequest.builder().getClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void failIfTagsAreNull() {
        ProfilesRequest.builder().tags(null).build();
    }

    @Test(expected = IllegalArgumentException.class)
    public void failIfTagsAreEmpty() {
        ProfilesRequest.builder().tags(Collections.<String>emptyList()).build();
    }

    @Test
    public void shouldBeWithTags() {
        List<String> tags = Arrays.asList("abc");
        assertEquals(tags, ProfilesRequest.builder().tags(tags).build().getTags());
    }

}