package jcrapi.request;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * @author Michael Lieshoff
 */
public class ProfilesRequestTest {

    @Test(expected = IllegalArgumentException.class)
    public void failIfTagsAreNull() {
        ProfilesRequest.builder(null).build();
    }

    @Test(expected = IllegalArgumentException.class)
    public void failIfTagsAreEmpty() {
        ProfilesRequest.builder(Collections.<String>emptyList()).build();
    }

    @Test
    public void shouldBeWithTags() {
        List<String> tags = Arrays.asList("abc");
        assertEquals(tags, ProfilesRequest.builder(tags).build().getTags());
    }

    @Test
    public void shouldCreateBuilderWithCorrectClassForListVersion() {
        List<String> tags = Arrays.asList("abc");
        assertEquals(ProfilesRequest.ProfilesRequestBuilder.class, ProfilesRequest.builder(tags).getClass());
    }

}