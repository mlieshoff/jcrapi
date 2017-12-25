package jcrapi;
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

import jcrapi.model.DetailedClan;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.junit.Before;
import org.junit.Ignore;

import static org.junit.Assert.assertEquals;

/**
 * @author Michael Lieshoff
 */
public class LiveTest {

    private static final String URL = "http://api.cr-api.com/";

    private Api api;

    @Before
    public void setUp() {
        api = new Api(URL, "9432a8cf9a2a4839be327bb8f8afcafb8bec1566b0954a93a605b6eb1d860d76");
    }

    @Ignore
    public void version() throws Exception {
        assertEquals("4.0.3", api.getVersion());
    }

    @Ignore
    public void getClan() throws Exception {
        DetailedClan detailedClan = api.getClan("2cccp");
        System.out.println(ReflectionToStringBuilder.reflectionToString(detailedClan));
    }

}
