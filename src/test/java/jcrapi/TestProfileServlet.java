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

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Michael Lieshoff
 */
public class TestProfileServlet extends TestJsonFileServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String parameter = getRestTagParameter(req);
    String filename = null;
    if ("battles".equals(parameter)) {
      String[] tags = getTags(req, "/battles");
      if (tags.length == 1) {
        filename = "src/test/java/jcrapi/playerBattles.json";
      } else {
        filename = "src/test/java/jcrapi/multiPlayerBattles.json";
      }
    } else if ("chests".equals(parameter)) {
      String[] tags = getTags(req, "/chests");
      if (tags.length == 1) {
        filename = "src/test/java/jcrapi/playerChests.json";
      } else {
        filename = "src/test/java/jcrapi/multiPlayerChests.json";
      }
    } else if ("8L9L9GL".equals(parameter)) {
      filename = "src/test/java/jcrapi/profile.json";
    } else if ("L88P2282,9CQ2U8QJ,8L9L9GL".equals(parameter)) {
      filename = "src/test/java/jcrapi/profiles.json";
    }
    super.doGet(filename, req, resp);
  }

  private String[] getTags(HttpServletRequest req, String subUri) {
    String uri = req.getRequestURI()
        .replace("/test/jcrapi/player/", "")
        .replace(subUri, "");
    return uri.split(",");
  }

}
