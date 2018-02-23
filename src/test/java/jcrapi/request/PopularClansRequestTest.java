package jcrapi.request;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * @author Michael Lieshoff
 */
public class PopularClansRequestTest extends LimitedRequestTestBase<PopularClansRequest, PopularClansRequest.PopularClansRequestBuilder> {

    @Override
    PopularClansRequest.PopularClansRequestBuilder getBuilder() {
        return PopularClansRequest.builder();
    }

    @Test
    public void shouldCreateBuilder() {
        assertNotNull(PopularClansRequest.builder());
    }

    @Test
    public void shouldCreateBuilderWithCorrectClass() {
        assertEquals(PopularClansRequest.PopularClansRequestBuilder.class, PopularClansRequest.builder().getClass());
    }

}