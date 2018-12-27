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
public class ClanChestTest {

  private ClanChest unitUnderTest;

  @Before
  public void setUp() {
    unitUnderTest = new ClanChest();
  }

  @Test
  public void shouldGetSetStatus() {
    String expected = "astring";
    unitUnderTest.setStatus(expected);
    assertEquals(expected, unitUnderTest.getStatus());
  }

  @Test
  public void shouldGetSetCrowns() {
    int expected = 815;
    unitUnderTest.setCrowns(expected);
    assertEquals(expected, unitUnderTest.getCrowns());
  }

  @Test
  public void shouldGetSetLevel() {
    int expected = 815;
    unitUnderTest.setLevel(expected);
    assertEquals(expected, unitUnderTest.getLevel());
  }

  @Test
  public void shouldGetSetMaxLevel() {
    int expected = 815;
    unitUnderTest.setMaxLevel(expected);
    assertEquals(expected, unitUnderTest.getMaxLevel());
  }

  @Test
  public void shouldToString() {
    unitUnderTest.setStatus("astring");
    unitUnderTest.setCrowns(815);
    unitUnderTest.setLevel(815);
    unitUnderTest.setMaxLevel(815);
    String expected = "ClanChest(status=astring, crowns=815, level=815, maxLevel=815)";
    String actual = unitUnderTest.toString();
    assertEquals(expected, actual);
  }

}