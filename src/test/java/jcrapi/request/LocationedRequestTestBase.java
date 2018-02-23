package jcrapi.request;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Michael Lieshoff
 */
public abstract class LocationedRequestTestBase<A extends LocationedRequest, B extends LocationedRequest.LocationedRequestBuilder<A, B>> extends LimitedRequestTestBase<A, B> {

    @Test
    public void shouldBeWithLocationKey() {
        assertEquals("EU", getLocationedRequest().getLocationKey());
    }

    private A getLocationedRequest() {
        return getBuilder().locationKey("EU").build();
    }

    @Test
    public void shouldGetLocationKey() {
        assertEquals("EU", getLocationedRequest().getLocationKey());
    }

}