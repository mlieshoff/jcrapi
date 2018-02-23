package jcrapi.request;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * @author Michael Lieshoff
 */
public abstract class RequestTestBase<A extends Request, B extends Request.RequestBuilder<A, B>> {

    abstract B getBuilder();
    
    @Test
    public void shouldBeWithExcludes() {
        List<String> expected = Arrays.asList("a", "b");
        A request = getBuilder().excludes(expected).build();
        assertEquals(expected, request.getExcludes());
        assertEquals("a,b", request.getQueryParameters().get("excludes"));
    }

    @Test
    public void shouldBeWithKeys() {
        List<String> expected = Arrays.asList("a", "b");
        A request = getBuilder().keys(expected).build();
        assertEquals(expected, request.getKeys());
        assertEquals("a,b", request.getQueryParameters().get("keys"));
    }

}