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

import javax.annotation.Generated;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

@Generated("org.mili.generator")
public class ClanSearchTest {

    private ClanSearch unitUnderTest;

    @Before
    public void setUp() {
        unitUnderTest = new ClanSearch();
    }

    @Test
    public void shouldGetSetName() {
        String expected = "astring";
        unitUnderTest.setName(expected);
        assertEquals(expected, unitUnderTest.getName());
    }

    @Test
    public void shouldGetSetScore() {
        Integer expected = Integer.valueOf(815);
        unitUnderTest.setScore(expected);
        assertEquals(expected, unitUnderTest.getScore());
    }

    @Test
    public void shouldGetSetMinMembers() {
        Integer expected = Integer.valueOf(815);
        unitUnderTest.setMinMembers(expected);
        assertEquals(expected, unitUnderTest.getMinMembers());
    }

    @Test
    public void shouldGetSetMaxMembers() {
        Integer expected = Integer.valueOf(815);
        unitUnderTest.setMaxMembers(expected);
        assertEquals(expected, unitUnderTest.getMaxMembers());
    }

    @Test
    public void shouldToString() {
        unitUnderTest.setName("astring");
        unitUnderTest.setScore(Integer.valueOf(815));
        unitUnderTest.setMinMembers(Integer.valueOf(815));
        unitUnderTest.setMaxMembers(Integer.valueOf(815));
        String expected = "ClanSearch(name=astring, score=815, minMembers=815, maxMembers=815)";
        String actual = unitUnderTest.toString();
        assertEquals(expected, actual);
    }

}