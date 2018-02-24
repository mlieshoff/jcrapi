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

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.http.HttpHeaders;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Michael Lieshoff
 */
public class TestJsonFileServlet extends HttpServlet {

    protected void doGet(String filename, HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (!checkAuth(req)) {
            resp.setStatus(503);
        } else {
            PrintWriter printWriter = resp.getWriter();
            printWriter.print(FileUtils.readFileToString(new File(filename)));
            printWriter.flush();
        }
    }

    public String getRestTagParameter(HttpServletRequest req) {
        String uri = req.getRequestURI();
        return uri.substring(uri.lastIndexOf("/") + 1);
    }

    public boolean checkAuth(HttpServletRequest req) {
        String auth = req.getHeader("auth");
        if (StringUtils.isBlank(auth)) {
            auth = req.getHeader(HttpHeaders.AUTHORIZATION);
        }
        return IntegrationTest.AUTH.equals(auth);
    }

}
