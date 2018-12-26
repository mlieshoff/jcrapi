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

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import javax.annotation.Generated;

@Generated("org.mili.generator")
public class LocationTest {

  private Location unitUnderTest;

  @Before
  public void setUp() {
    unitUnderTest = new Location();
  }

  @Test
  public void shouldGetSetName() {
    String expected = "astring";
    unitUnderTest.setName(expected);
    assertEquals(expected, unitUnderTest.getName());
  }

  @Test
  public void shouldGetSetCountry() {
    boolean expected = false;
    unitUnderTest.setCountry(expected);
    assertEquals(expected, unitUnderTest.isCountry());
  }

  @Test
  public void shouldGetSetCode() {
    String expected = "astring";
    unitUnderTest.setCode(expected);
    assertEquals(expected, unitUnderTest.getCode());
  }

  @Test
  public void shouldToString() {
    unitUnderTest.setName("astring");
    unitUnderTest.setCountry(false);
    unitUnderTest.setCode("astring");
    String expected = "Location(name=astring, Country=false, code=astring)";
    String actual = unitUnderTest.toString();
    assertEquals(expected, actual);
  }

}