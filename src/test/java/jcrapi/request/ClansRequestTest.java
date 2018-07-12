package jcrapi.request;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * @author Michael Lieshoff
 */
public class ClansRequestTest extends LimitedRequestTestBase<ClansRequest> {

    @Override
    Object getBuilder() {
        return ClansRequest.builder(Arrays.asList("abc"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void failIfTagsAreNull() {
        ClansRequest.builder(null).build();
    }

    @Test(expected = IllegalArgumentException.class)
    public void failIfTagsAreEmpty() {
        ClansRequest.builder(Collections.<String>emptyList()).build();
    }

    @Test
    public void shouldBeWithTags() {
        List<String> tags = Arrays.asList("abc");
        assertEquals(tags, ClansRequest.builder(tags).build().getTags());
    }

    @Test
    public void shouldCreateBuilderWithCorrectClassForListVersion() {
        List<String> tags = Arrays.asList("abc");
        assertEquals(ClansRequest.ClansRequestBuilder.class, ClansRequest.builder(tags).getClass());
    }
    
}