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
public class ConstantsV1Test {

  private ConstantsV1 unitUnderTest;

  @Before
  public void setUp() {
    unitUnderTest = new ConstantsV1();
  }

  @Test
  public void shouldGetSetCards() {
    java.util.List<Long> expected = new java.util.ArrayList<Long>();
    unitUnderTest.setCards(expected);
    assertEquals(expected, unitUnderTest.getCards());
  }

  @Test
  public void shouldGetSetGold() {
    java.util.List<Long> expected = new java.util.ArrayList<Long>();
    unitUnderTest.setGold(expected);
    assertEquals(expected, unitUnderTest.getGold());
  }

  @Test
  public void shouldGetSetThresholds() {
    java.util.List<Long> expected = new java.util.ArrayList<Long>();
    unitUnderTest.setThresholds(expected);
    assertEquals(expected, unitUnderTest.getThresholds());
  }

  @Test
  public void shouldToString() {
    unitUnderTest.setCards(new java.util.ArrayList<Long>());
    unitUnderTest.setGold(new java.util.ArrayList<Long>());
    unitUnderTest.setThresholds(new java.util.ArrayList<Long>());
    String expected = "ConstantsV1(cards=" + new java.util.ArrayList<Long>() + ", gold=" + new java.util.ArrayList<Long>() + ", thresholds=" + new java.util.ArrayList<Long>() + ")";
    String actual = unitUnderTest.toString();
    assertEquals(expected, actual);
  }

}