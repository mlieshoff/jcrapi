package jcrapi.request;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * @author Michael Lieshoff
 */
public class RequestTest {

    private static class TestRequest extends Request {

        TestRequest(int limit, List<String> excludes, List<String> includes) {
            super(limit, excludes, includes);
        }

        static TestRequestBuilder builder() {
            return new TestRequestBuilder();
        }

        public static class TestRequestBuilder extends RequestBuilder<TestRequest, TestRequest.TestRequestBuilder> {

            @Override
            public TestRequest build() {
                return new TestRequest(limit, excludes, keys);
            }

            @Override
            public TestRequestBuilder getThis() {
                return this;
            }

        }

    }

    @Test
    public void shouldCreateBuilder() {
        assertNotNull(TestRequest.builder());
    }

    @Test
    public void shouldCreateBuilderWithCorrectClass() {
        assertEquals(TestRequest.TestRequestBuilder.class, TestRequest.builder().getClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void failBecauseLimitIsNegative() {
        TestRequest.builder().limit(-1).build();
    }

    @Test
    public void shouldBeWithLimit() {
        TestRequest testRequest = TestRequest.builder().limit(100).build();
        assertEquals(100, testRequest.getLimit());
        assertEquals("100", testRequest.getQueryParameters().get("limit"));
    }

    @Test
    public void shouldBeWithExcludes() {
        List<String> expected = Arrays.asList("a", "b");
        TestRequest testRequest = TestRequest.builder().excludes(expected).build();
        assertEquals(expected, testRequest.getExcludes());
        assertEquals("a,b", testRequest.getQueryParameters().get("excludes"));
    }

    @Test
    public void shouldBeWithKeys() {
        List<String> expected = Arrays.asList("a", "b");
        TestRequest testRequest = TestRequest.builder().keys(expected).build();
        assertEquals(expected, testRequest.getKeys());
        assertEquals("a,b", testRequest.getQueryParameters().get("includes"));
    }

}