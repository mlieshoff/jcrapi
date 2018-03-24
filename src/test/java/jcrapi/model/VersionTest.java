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
package jcrapi.model;

import org.junit.Before;
import org.junit.Test;

import javax.annotation.Generated;

import static org.junit.Assert.assertEquals;

@Generated("org.mili.generator")
public class VersionTest {

    private Version unitUnderTest;

    @Before
    public void setUp() {
        unitUnderTest = new Version();
    }

    @Test
    public void shouldGetVERSION() {
        assertEquals( "v10.6.18", unitUnderTest.VERSION);
    }
    
    @Test
    public void shouldToString() {
        String expected = "Version{}";
        String actual = unitUnderTest.toString();
        assertEquals(expected, actual);
    }

}