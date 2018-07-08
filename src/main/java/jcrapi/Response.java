/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package jcrapi;

import com.google.common.base.Optional;
import org.apache.commons.lang.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Michael Lieshoff
 */
public class Response {

    public static final String X_RATELIMIT_LIMIT = "x-ratelimit-limit";
    public static final String X_RATELIMIT_REMAINING = "x-ratelimit-remaining";
    public static final String X_RATELIMIT_RESET = "x-ratelimit-reset";
    public static final String X_CACHED = "x-cached";
    public static final String X_RATELIMIT_RETRY_AFTER = "x-ratelimit-retry-after";

    private final Map<String, String> responseHeaders = new HashMap<>();
    
    private String raw;

    public String getRaw() {
        return raw;
    }

    public void setRaw(String raw) {
        this.raw = raw;
    }

    public Map<String, String> getResponseHeaders() {
        return responseHeaders;
    }

    public Optional<Integer> getRateLimit() {
        return getInt(X_RATELIMIT_LIMIT);
    }

    public Optional<Integer> getRateRemaining() {
        return getInt(X_RATELIMIT_REMAINING);
    }

    private Optional<Integer> getInt(String headerName) {
        String value = responseHeaders.get(headerName);
        if (StringUtils.isNotBlank(value)) {
            return Optional.of(Integer.valueOf(value));
        }
        return Optional.absent();
    }

    public Optional<Long> getRateReset() {
        return getLong(X_RATELIMIT_RESET);
    }

    private Optional<Long> getLong(String headerName) {
        String value = responseHeaders.get(headerName);
        if (StringUtils.isNotBlank(value)) {
            return Optional.of(Long.valueOf(value));
        }
        return Optional.absent();
    }

    public boolean isCached() {
        return Boolean.valueOf(responseHeaders.get(X_CACHED));
    }

    public Optional<Integer> getRateRetryAfter() {
        return getInt(X_RATELIMIT_RETRY_AFTER);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Response response = (Response) o;

        if (!responseHeaders.equals(response.responseHeaders))
            return false;
        return raw != null ? raw.equals(response.raw) : response.raw == null;
    }

    @Override
    public int hashCode() {
        int result = responseHeaders.hashCode();
        result = 31 * result + (raw != null ? raw.hashCode() : 0);
        return result;
    }

}
