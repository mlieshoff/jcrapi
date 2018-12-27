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
public class ConstantsPrizeTest {

  private ConstantsPrize unitUnderTest;

  @Before
  public void setUp() {
    unitUnderTest = new ConstantsPrize();
  }

  @Test
  public void shouldGetSetCards() {
    long expected = 4711L;
    unitUnderTest.setCards(expected);
    assertEquals(expected, unitUnderTest.getCards());
  }

  @Test
  public void shouldGetSetRank() {
    long expected = 4711L;
    unitUnderTest.setRank(expected);
    assertEquals(expected, unitUnderTest.getRank());
  }

  @Test
  public void shouldGetSetTier() {
    long expected = 4711L;
    unitUnderTest.setTier(expected);
    assertEquals(expected, unitUnderTest.getTier());
  }

  @Test
  public void shouldToString() {
    unitUnderTest.setCards(4711L);
    unitUnderTest.setRank(4711L);
    unitUnderTest.setTier(4711L);
    String expected = "ConstantsPrize(cards=4711, rank=4711, tier=4711)";
    String actual = unitUnderTest.toString();
    assertEquals(expected, actual);
  }

}