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
public class ConstantsTreasureChestsTest {

  private ConstantsTreasureChests unitUnderTest;

  @Before
  public void setUp() {
    unitUnderTest = new ConstantsTreasureChests();
  }

  @Test
  public void shouldGetSetCrown() {
    java.util.List<ConstantsCrown> expected = new java.util.ArrayList<ConstantsCrown>();
    unitUnderTest.setCrown(expected);
    assertEquals(expected, unitUnderTest.getCrown());
  }

  @Test
  public void shouldGetSetCycle() {
    java.util.List<ConstantsCycle> expected = new java.util.ArrayList<ConstantsCycle>();
    unitUnderTest.setCycle(expected);
    assertEquals(expected, unitUnderTest.getCycle());
  }

  @Test
  public void shouldGetSetShop() {
    java.util.List<ConstantsShop> expected = new java.util.ArrayList<ConstantsShop>();
    unitUnderTest.setShop(expected);
    assertEquals(expected, unitUnderTest.getShop());
  }

  @Test
  public void shouldToString() {
    unitUnderTest.setCrown(new java.util.ArrayList<ConstantsCrown>());
    unitUnderTest.setCycle(new java.util.ArrayList<ConstantsCycle>());
    unitUnderTest.setShop(new java.util.ArrayList<ConstantsShop>());
    String expected = "ConstantsTreasureChests(crown=" + new java.util.ArrayList<ConstantsCrown>() + ", cycle=" + new java.util.ArrayList<ConstantsCycle>() + ", shop=" + new java.util.ArrayList<ConstantsShop>() + ")";
    String actual = unitUnderTest.toString();
    assertEquals(expected, actual);
  }

}