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
public class ConstantsRegionTest {

  private ConstantsRegion unitUnderTest;

  @Before
  public void setUp() {
    unitUnderTest = new ConstantsRegion();
  }

  @Test
  public void shouldGetSetId() {
    long expected = 4711L;
    unitUnderTest.setId(expected);
    assertEquals(expected, unitUnderTest.getId());
  }

  @Test
  public void shouldGetSetCountry() {
    boolean expected = false;
    unitUnderTest.setCountry(expected);
    assertEquals(expected, unitUnderTest.isCountry());
  }

  @Test
  public void shouldGetSetKey() {
    String expected = "astring";
    unitUnderTest.setKey(expected);
    assertEquals(expected, unitUnderTest.getKey());
  }

  @Test
  public void shouldGetSetName() {
    String expected = "astring";
    unitUnderTest.setName(expected);
    assertEquals(expected, unitUnderTest.getName());
  }

  @Test
  public void shouldToString() {
    unitUnderTest.setId(4711L);
    unitUnderTest.setCountry(false);
    unitUnderTest.setKey("astring");
    unitUnderTest.setName("astring");
    String expected = "ConstantsRegion(id=4711, Country=false, key=astring, name=astring)";
    String actual = unitUnderTest.toString();
    assertEquals(expected, actual);
  }

}