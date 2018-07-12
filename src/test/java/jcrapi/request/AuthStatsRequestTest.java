package jcrapi.request;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Michael Lieshoff
 */
public class AuthStatsRequestTest extends RequestTestBase<AuthStatsRequest> {

    @Override
    Object getBuilder() {
        return AuthStatsRequest.builder();
    }

    @Test
    public void shouldCreateBuilderWithCorrectClass() {
        assertEquals(AuthStatsRequest.AuthStatsRequestBuilder.class, AuthStatsRequest.builder().getClass());
    }

}