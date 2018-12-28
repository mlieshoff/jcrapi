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
public class PopularTournamentTest {

  private PopularTournament unitUnderTest;

  @Before
  public void setUp() {
    unitUnderTest = new PopularTournament();
  }

  @Test
  public void shouldGetSetPopularity() {
    Popularity expected = new Popularity();
    unitUnderTest.setPopularity(expected);
    assertEquals(expected, unitUnderTest.getPopularity());
  }

  @Test
  public void shouldGetSetPlayerCount() {
    int expected = 815;
    unitUnderTest.setPlayerCount(expected);
    assertEquals(expected, unitUnderTest.getPlayerCount());
  }

  @Test
  public void shouldGetSetCurrentPlayers() {
    int expected = 815;
    unitUnderTest.setCurrentPlayers(expected);
    assertEquals(expected, unitUnderTest.getCurrentPlayers());
  }

  @Test
  public void shouldGetSetUpdatedAt() {
    long expected = 4711L;
    unitUnderTest.setUpdatedAt(expected);
    assertEquals(expected, unitUnderTest.getUpdatedAt());
  }

  @Test
  public void shouldGetSetOpen() {
    boolean expected = false;
    unitUnderTest.setOpen(expected);
    assertEquals(expected, unitUnderTest.isOpen());
  }

  @Test
  public void shouldToString() {
    unitUnderTest.setPopularity(new Popularity());
    unitUnderTest.setPlayerCount(815);
    unitUnderTest.setCurrentPlayers(815);
    unitUnderTest.setUpdatedAt(4711L);
    unitUnderTest.setOpen(false);
    String expected = "PopularTournament(popularity=" + new Popularity() + ", playerCount=815, currentPlayers=815, updatedAt=4711, open=false)";
    String actual = unitUnderTest.toString();
    assertEquals(expected, actual);
  }

}