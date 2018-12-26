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
public class StatsTest {

  private Stats unitUnderTest;

  @Before
  public void setUp() {
    unitUnderTest = new Stats();
  }

  @Test
  public void shouldGetSetTournamentCardsWon() {
    int expected = 815;
    unitUnderTest.setTournamentCardsWon(expected);
    assertEquals(expected, unitUnderTest.getTournamentCardsWon());
  }

  @Test
  public void shouldGetSetMaxTrophies() {
    int expected = 815;
    unitUnderTest.setMaxTrophies(expected);
    assertEquals(expected, unitUnderTest.getMaxTrophies());
  }

  @Test
  public void shouldGetSetThreeCrownWins() {
    int expected = 815;
    unitUnderTest.setThreeCrownWins(expected);
    assertEquals(expected, unitUnderTest.getThreeCrownWins());
  }

  @Test
  public void shouldGetSetCardsFound() {
    int expected = 815;
    unitUnderTest.setCardsFound(expected);
    assertEquals(expected, unitUnderTest.getCardsFound());
  }

  @Test
  public void shouldGetSetFavoriteCard() {
    FavoriteCard expected = new FavoriteCard();
    unitUnderTest.setFavoriteCard(expected);
    assertEquals(expected, unitUnderTest.getFavoriteCard());
  }

  @Test
  public void shouldGetSetTotalDonations() {
    int expected = 815;
    unitUnderTest.setTotalDonations(expected);
    assertEquals(expected, unitUnderTest.getTotalDonations());
  }

  @Test
  public void shouldGetSetChallengeMaxWins() {
    int expected = 815;
    unitUnderTest.setChallengeMaxWins(expected);
    assertEquals(expected, unitUnderTest.getChallengeMaxWins());
  }

  @Test
  public void shouldGetSetChallengeCardsWon() {
    int expected = 815;
    unitUnderTest.setChallengeCardsWon(expected);
    assertEquals(expected, unitUnderTest.getChallengeCardsWon());
  }

  @Test
  public void shouldGetSetLevel() {
    int expected = 815;
    unitUnderTest.setLevel(expected);
    assertEquals(expected, unitUnderTest.getLevel());
  }

  @Test
  public void shouldGetSetClanCardsCollected() {
    int expected = 815;
    unitUnderTest.setClanCardsCollected(expected);
    assertEquals(expected, unitUnderTest.getClanCardsCollected());
  }

  @Test
  public void shouldToString() {
    unitUnderTest.setTournamentCardsWon(815);
    unitUnderTest.setMaxTrophies(815);
    unitUnderTest.setThreeCrownWins(815);
    unitUnderTest.setCardsFound(815);
    unitUnderTest.setFavoriteCard(new FavoriteCard());
    unitUnderTest.setTotalDonations(815);
    unitUnderTest.setChallengeMaxWins(815);
    unitUnderTest.setChallengeCardsWon(815);
    unitUnderTest.setLevel(815);
    unitUnderTest.setClanCardsCollected(815);
    String expected = "Stats(tournamentCardsWon=815, maxTrophies=815, threeCrownWins=815, cardsFound=815, favoriteCard=" + new FavoriteCard() + ", totalDonations=815, challengeMaxWins=815, challengeCardsWon=815, level=815, clanCardsCollected=815)";
    String actual = unitUnderTest.toString();
    assertEquals(expected, actual);
  }

}