package jcrapi.request;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * @author Michael Lieshoff
 */
public class PlayerBattlesRequestTest extends LimitedRequestTestBase<PlayerBattlesRequest> {

    @Override
    Object getBuilder() {
        return PlayerBattlesRequest.builder(Arrays.asList("abc"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void failIfTagsAreNull() {
        PlayerBattlesRequest.builder(null).build();
    }

    @Test(expected = IllegalArgumentException.class)
    public void failIfTagsAreEmpty() {
        PlayerBattlesRequest.builder(Collections.<String>emptyList()).build();
    }

    @Test
    public void shouldBeWithTags() {
        List<String> tags = Arrays.asList("abc");
        assertEquals(tags, PlayerBattlesRequest.builder(tags).build().getTags());
    }

    @Test
    public void shouldCreateBuilderWithCorrectClassForListVersion() {
        List<String> tags = Arrays.asList("abc");
        assertEquals(PlayerBattlesRequest.PlayerBattlesRequestBuilder.class, PlayerBattlesRequest.builder(tags).getClass());
    }

}