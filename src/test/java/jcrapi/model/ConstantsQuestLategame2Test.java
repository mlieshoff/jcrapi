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
public class ConstantsQuestLategame2Test {

  private ConstantsQuestLategame2 unitUnderTest;

  @Before
  public void setUp() {
    unitUnderTest = new ConstantsQuestLategame2();
  }

  @Test
  public void shouldGetSetArenaThreshold() {
    String expected = "astring";
    unitUnderTest.setArenaThreshold(expected);
    assertEquals(expected, unitUnderTest.getArenaThreshold());
  }

  @Test
  public void shouldGetSetChest() {
    String expected = "astring";
    unitUnderTest.setChest(expected);
    assertEquals(expected, unitUnderTest.getChest());
  }

  @Test
  public void shouldGetSetOneTime() {
    boolean expected = false;
    unitUnderTest.setOneTime(expected);
    assertEquals(expected, unitUnderTest.isOneTime());
  }

  @Test
  public void shouldToString() {
    unitUnderTest.setArenaThreshold("astring");
    unitUnderTest.setChest("astring");
    unitUnderTest.setOneTime(false);
    String expected = "ConstantsQuestLategame2(arenaThreshold=astring, chest=astring, oneTime=false)";
    String actual = unitUnderTest.toString();
    assertEquals(expected, actual);
  }

}