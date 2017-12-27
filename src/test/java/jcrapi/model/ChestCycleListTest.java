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
public class ChestCycleListTest {

    private ChestCycleList unitUnderTest;

    @Before
    public void setUp() {
        unitUnderTest = new ChestCycleList();
    }

    @Test
    public void shouldGetSetOrder() {
        java.util.List<String> expected = new java.util.ArrayList<>();
        unitUnderTest.setOrder(expected);
        assertEquals(expected, unitUnderTest.getOrder());
    }

    @Test
    public void shouldToString() {
        unitUnderTest.setOrder(new java.util.ArrayList<String>());
        String expected = "ChestCycleList{order=" + new java.util.ArrayList<>() + "}";
        String actual = unitUnderTest.toString();
        assertEquals(expected, actual);
    }

}