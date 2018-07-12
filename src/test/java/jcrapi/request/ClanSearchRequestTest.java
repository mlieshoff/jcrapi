package jcrapi.request;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * @author Michael Lieshoff
 */
public class ClanSearchRequestTest extends LimitedRequestTestBase<ClanSearchRequest> {

    @Override
    Object getBuilder() {
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
    public void shouldQueryWithName() {
        assertEquals("abc", ClanSearchRequest.builder().name("abc").build().getQueryParameters().get("name"));
    }

    @Test
    public void shouldBeWithLocationId() {
        assertEquals("EU", ClanSearchRequest.builder().locationId("EU").name("abc").build().getLocationId());
    }

    @Test
    public void shouldQueryWithLocationId() {
        assertEquals("EU", ClanSearchRequest.builder().locationId("EU").name("abc").build().getQueryParameters().get("locationId"));
    }

    @Test
    public void shouldBeWithScore() {
        assertEquals(42, ClanSearchRequest.builder().score(42).build().getScore().intValue());
    }

    @Test
    public void shouldQueryWithScore() {
        assertEquals("42", ClanSearchRequest.builder().score(42).build().getQueryParameters().get("score"));
    }

    @Test
    public void shouldBeWithMinMembers() {
        assertEquals(20, ClanSearchRequest.builder().minMembers(20).build().getMinMembers().intValue());
    }

    @Test
    public void shouldQueryWithMinMembers() {
        assertEquals("20", ClanSearchRequest.builder().minMembers(20).build().getQueryParameters().get("minMembers"));
    }

    @Test
    public void shouldBeWithMaxMembers() {
        assertEquals(50, ClanSearchRequest.builder().maxMembers(50).build().getMaxMembers().intValue());
    }

    @Test
    public void shouldQueryWithMaxMembers() {
        assertEquals("50", ClanSearchRequest.builder().maxMembers(50).build().getQueryParameters().get("maxMembers"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void failWhenNotAtLeastWithOneSearchCriteria() {
        ClanSearchRequest.builder().build();
    }

}