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
public class CurrentSeasonTest {

  private CurrentSeason unitUnderTest;

  @Before
  public void setUp() {
    unitUnderTest = new CurrentSeason();
  }

  @Test
  public void shouldGetSetRank() {
    int expected = 815;
    unitUnderTest.setRank(expected);
    assertEquals(expected, unitUnderTest.getRank());
  }

  @Test
  public void shouldGetSetTrophies() {
    int expected = 815;
    unitUnderTest.setTrophies(expected);
    assertEquals(expected, unitUnderTest.getTrophies());
  }

  @Test
  public void shouldGetSetBestTrophies() {
    int expected = 815;
    unitUnderTest.setBestTrophies(expected);
    assertEquals(expected, unitUnderTest.getBestTrophies());
  }

  @Test
  public void shouldToString() {
    unitUnderTest.setRank(815);
    unitUnderTest.setTrophies(815);
    unitUnderTest.setBestTrophies(815);
    String expected = "CurrentSeason(rank=815, trophies=815, bestTrophies=815)";
    String actual = unitUnderTest.toString();
    assertEquals(expected, actual);
  }

}