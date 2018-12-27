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
public class BadgeTest {

  private Badge unitUnderTest;

  @Before
  public void setUp() {
    unitUnderTest = new Badge();
  }

  @Test
  public void shouldGetSetName() {
    String expected = "astring";
    unitUnderTest.setName(expected);
    assertEquals(expected, unitUnderTest.getName());
  }

  @Test
  public void shouldGetSetCategory() {
    String expected = "astring";
    unitUnderTest.setCategory(expected);
    assertEquals(expected, unitUnderTest.getCategory());
  }

  @Test
  public void shouldGetSetId() {
    int expected = 815;
    unitUnderTest.setId(expected);
    assertEquals(expected, unitUnderTest.getId());
  }

  @Test
  public void shouldGetSetImage() {
    String expected = "astring";
    unitUnderTest.setImage(expected);
    assertEquals(expected, unitUnderTest.getImage());
  }

  @Test
  public void shouldToString() {
    unitUnderTest.setName("astring");
    unitUnderTest.setCategory("astring");
    unitUnderTest.setId(815);
    unitUnderTest.setImage("astring");
    String expected = "Badge(name=astring, category=astring, id=815, image=astring)";
    String actual = unitUnderTest.toString();
    assertEquals(expected, actual);
  }

}