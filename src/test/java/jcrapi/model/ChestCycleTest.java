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
public class ChestCycleTest {

  private ChestCycle unitUnderTest;

  @Before
  public void setUp() {
    unitUnderTest = new ChestCycle();
  }

  @Test
  public void shouldGetSetUpcoming() {
    java.util.List<String> expected = new java.util.ArrayList<String>();
    unitUnderTest.setUpcoming(expected);
    assertEquals(expected, unitUnderTest.getUpcoming());
  }

  @Test
  public void shouldGetSetSuperMagical() {
    int expected = 815;
    unitUnderTest.setSuperMagical(expected);
    assertEquals(expected, unitUnderTest.getSuperMagical());
  }

  @Test
  public void shouldGetSetMagical() {
    int expected = 815;
    unitUnderTest.setMagical(expected);
    assertEquals(expected, unitUnderTest.getMagical());
  }

  @Test
  public void shouldGetSetLegendary() {
    int expected = 815;
    unitUnderTest.setLegendary(expected);
    assertEquals(expected, unitUnderTest.getLegendary());
  }

  @Test
  public void shouldGetSetEpic() {
    int expected = 815;
    unitUnderTest.setEpic(expected);
    assertEquals(expected, unitUnderTest.getEpic());
  }

  @Test
  public void shouldGetSetGiant() {
    int expected = 815;
    unitUnderTest.setGiant(expected);
    assertEquals(expected, unitUnderTest.getGiant());
  }

  @Test
  public void shouldToString() {
    unitUnderTest.setUpcoming(new java.util.ArrayList<String>());
    unitUnderTest.setSuperMagical(815);
    unitUnderTest.setMagical(815);
    unitUnderTest.setLegendary(815);
    unitUnderTest.setEpic(815);
    unitUnderTest.setGiant(815);
    String expected = "ChestCycle(upcoming=" + new java.util.ArrayList<String>() + ", superMagical=815, magical=815, legendary=815, epic=815, giant=815)";
    String actual = unitUnderTest.toString();
    assertEquals(expected, actual);
  }

}