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
public class ConstantsTournamentTest {

  private ConstantsTournament unitUnderTest;

  @Before
  public void setUp() {
    unitUnderTest = new ConstantsTournament();
  }

  @Test
  public void shouldGetSetCards() {
    java.util.List<Long> expected = new java.util.ArrayList<Long>();
    unitUnderTest.setCards(expected);
    assertEquals(expected, unitUnderTest.getCards());
  }

  @Test
  public void shouldGetSetCreateCost() {
    long expected = 4711L;
    unitUnderTest.setCreateCost(expected);
    assertEquals(expected, unitUnderTest.getCreateCost());
  }

  @Test
  public void shouldGetSetKey() {
    String expected = "astring";
    unitUnderTest.setKey(expected);
    assertEquals(expected, unitUnderTest.getKey());
  }

  @Test
  public void shouldGetSetMaxPlayers() {
    long expected = 4711L;
    unitUnderTest.setMaxPlayers(expected);
    assertEquals(expected, unitUnderTest.getMaxPlayers());
  }

  @Test
  public void shouldGetSetPrizes() {
    java.util.List<ConstantsPrize> expected = new java.util.ArrayList<ConstantsPrize>();
    unitUnderTest.setPrizes(expected);
    assertEquals(expected, unitUnderTest.getPrizes());
  }

  @Test
  public void shouldToString() {
    unitUnderTest.setCards(new java.util.ArrayList<Long>());
    unitUnderTest.setCreateCost(4711L);
    unitUnderTest.setKey("astring");
    unitUnderTest.setMaxPlayers(4711L);
    unitUnderTest.setPrizes(new java.util.ArrayList<ConstantsPrize>());
    String expected = "ConstantsTournament(cards=" + new java.util.ArrayList<Long>() + ", createCost=4711, key=astring, maxPlayers=4711, prizes=" + new java.util.ArrayList<ConstantsPrize>() + ")";
    String actual = unitUnderTest.toString();
    assertEquals(expected, actual);
  }

}