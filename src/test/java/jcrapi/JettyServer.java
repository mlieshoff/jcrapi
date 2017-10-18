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

import org.mortbay.jetty.Server;
import org.mortbay.jetty.servlet.Context;
import org.mortbay.jetty.servlet.ServletHolder;

import javax.servlet.Servlet;

/**
 * @author Michael Lieshoff
 */
public class JettyServer {

    private Server _server;

    private Context _context;

    public JettyServer(int port, String contextPath) {
        _server = new Server(port);
        _context = new Context(_server, contextPath, Context.SESSIONS);
        _context.setContextPath(contextPath);
        _server.setHandler(_context);
    }

    public void addServlet(String pathSpec, Servlet servlet) {
        _context.addServlet(new ServletHolder(servlet), pathSpec);
    }

    public void start() throws Exception {
        if (_server != null) {
            _server.start();
        }
    }

    public void stop() throws Exception {
        if (_server != null) {
            _server.stop();
        }
    }

}