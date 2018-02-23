package jcrapi.request;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * @author Michael Lieshoff
 */
public class ClanSearchRequestTest extends LocationedRequestTestBase<ClanSearchRequest, ClanSearchRequest.ClanSearchRequestBuilder> {

    @Override
    ClanSearchRequest.ClanSearchRequestBuilder getBuilder() {
        return ClanSearchRequest.builder().score(50);
    }

    @Test
    public void shouldCreateBuilder() {
        assertNotNull(ClanSearchRequest.builder());
    }

    @Test
    public void shouldCreateBuilderWithCorrectClass() {
        assertEquals(ClanSearchRequest.ClanSearchRequestBuilder.class, ClanSearchRequest.builder().getClass());
    }

    @Test
    public void shouldBeWithName() {
        assertEquals("abc", ClanSearchRequest.builder().name("abc").build().getName());
    }

    @Test
    public void shouldBeWithScore() {
        assertEquals(42, ClanSearchRequest.builder().score(42).build().getScore().intValue());
    }

    @Test
    public void shouldBeWithMinMembers() {
        assertEquals(20, ClanSearchRequest.builder().minMembers(20).build().getMinMembers().intValue());
    }

    @Test
    public void shouldBeWithMaxMembers() {
        assertEquals(50, ClanSearchRequest.builder().maxMembers(50).build().getMaxMembers().intValue());
    }

    @Test(expected = IllegalArgumentException.class)
    public void failWhenNotAtLeastWithOneSearchCriteria() {
        ClanSearchRequest.builder().build();
    }

}