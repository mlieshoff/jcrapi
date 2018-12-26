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
public class LeagueStatisticsTest {

  private LeagueStatistics unitUnderTest;

  @Before
  public void setUp() {
    unitUnderTest = new LeagueStatistics();
  }

  @Test
  public void shouldGetSetCurrentSeason() {
    CurrentSeason expected = new CurrentSeason();
    unitUnderTest.setCurrentSeason(expected);
    assertEquals(expected, unitUnderTest.getCurrentSeason());
  }

  @Test
  public void shouldGetSetPreviousSeason() {
    PreviousSeason expected = new PreviousSeason();
    unitUnderTest.setPreviousSeason(expected);
    assertEquals(expected, unitUnderTest.getPreviousSeason());
  }

  @Test
  public void shouldGetSetBestSeason() {
    BestSeason expected = new BestSeason();
    unitUnderTest.setBestSeason(expected);
    assertEquals(expected, unitUnderTest.getBestSeason());
  }

  @Test
  public void shouldToString() {
    unitUnderTest.setCurrentSeason(new CurrentSeason());
    unitUnderTest.setPreviousSeason(new PreviousSeason());
    unitUnderTest.setBestSeason(new BestSeason());
    String expected = "LeagueStatistics(currentSeason=" + new CurrentSeason() + ", previousSeason=" + new PreviousSeason() + ", bestSeason=" + new BestSeason() + ")";
    String actual = unitUnderTest.toString();
    assertEquals(expected, actual);
  }

}