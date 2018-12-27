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
public class ConstantsCardsStatsTest {

  private ConstantsCardsStats unitUnderTest;

  @Before
  public void setUp() {
    unitUnderTest = new ConstantsCardsStats();
  }

  @Test
  public void shouldGetSetBuilding() {
    java.util.List<ConstantsBuilding> expected = new java.util.ArrayList<ConstantsBuilding>();
    unitUnderTest.setBuilding(expected);
    assertEquals(expected, unitUnderTest.getBuilding());
  }

  @Test
  public void shouldGetSetSpell() {
    java.util.List<ConstantsSpell> expected = new java.util.ArrayList<ConstantsSpell>();
    unitUnderTest.setSpell(expected);
    assertEquals(expected, unitUnderTest.getSpell());
  }

  @Test
  public void shouldGetSetTroop() {
    java.util.List<ConstantsTroop> expected = new java.util.ArrayList<ConstantsTroop>();
    unitUnderTest.setTroop(expected);
    assertEquals(expected, unitUnderTest.getTroop());
  }

  @Test
  public void shouldToString() {
    unitUnderTest.setBuilding(new java.util.ArrayList<ConstantsBuilding>());
    unitUnderTest.setSpell(new java.util.ArrayList<ConstantsSpell>());
    unitUnderTest.setTroop(new java.util.ArrayList<ConstantsTroop>());
    String expected = "ConstantsCardsStats(building=" + new java.util.ArrayList<ConstantsBuilding>() + ", spell=" + new java.util.ArrayList<ConstantsSpell>() + ", troop=" + new java.util.ArrayList<ConstantsTroop>() + ")";
    String actual = unitUnderTest.toString();
    assertEquals(expected, actual);
  }

}