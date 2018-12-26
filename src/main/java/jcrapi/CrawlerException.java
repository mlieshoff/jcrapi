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

import com.google.common.base.Preconditions;

import org.apache.commons.lang.StringUtils;
import org.apache.http.StatusLine;

import java.io.IOException;
import lombok.Getter;

/**
 * @author Michael Lieshoff
 */
@Getter
public class CrawlerException extends IOException {

  private final String message;
  private final String reason;

  private final int statusCode;

  public CrawlerException(StatusLine statusLine) {
    Preconditions.checkNotNull(statusLine, "statusLine cannot be null!");
    statusCode = statusLine.getStatusCode();
    reason = statusLine.getReasonPhrase();
    message = createMessage();
  }

  private String createMessage() {
    StringBuilder s = new StringBuilder();
    s.append("crapi: " + statusCode);
    if (StringUtils.isNotBlank(reason)) {
      s.append(": " + reason);
    }
    return s.toString();
  }

}
