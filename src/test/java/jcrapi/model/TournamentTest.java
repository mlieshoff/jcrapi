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
public class TournamentTest {

  private Tournament unitUnderTest;

  @Before
  public void setUp() {
    unitUnderTest = new Tournament();
  }

  @Test
  public void shouldGetSetTag() {
    String expected = "astring";
    unitUnderTest.setTag(expected);
    assertEquals(expected, unitUnderTest.getTag());
  }

  @Test
  public void shouldGetSetType() {
    String expected = "astring";
    unitUnderTest.setType(expected);
    assertEquals(expected, unitUnderTest.getType());
  }

  @Test
  public void shouldGetSetStatus() {
    String expected = "astring";
    unitUnderTest.setStatus(expected);
    assertEquals(expected, unitUnderTest.getStatus());
  }

  @Test
  public void shouldGetSetName() {
    String expected = "astring";
    unitUnderTest.setName(expected);
    assertEquals(expected, unitUnderTest.getName());
  }

  @Test
  public void shouldGetSetDescription() {
    String expected = "astring";
    unitUnderTest.setDescription(expected);
    assertEquals(expected, unitUnderTest.getDescription());
  }

  @Test
  public void shouldGetSetCapacity() {
    int expected = 815;
    unitUnderTest.setCapacity(expected);
    assertEquals(expected, unitUnderTest.getCapacity());
  }

  @Test
  public void shouldGetSetMaxCapacity() {
    int expected = 815;
    unitUnderTest.setMaxCapacity(expected);
    assertEquals(expected, unitUnderTest.getMaxCapacity());
  }

  @Test
  public void shouldGetSetMaxPlayers() {
    int expected = 815;
    unitUnderTest.setMaxPlayers(expected);
    assertEquals(expected, unitUnderTest.getMaxPlayers());
  }

  @Test
  public void shouldGetSetPreparationDuration() {
    int expected = 815;
    unitUnderTest.setPreparationDuration(expected);
    assertEquals(expected, unitUnderTest.getPreparationDuration());
  }

  @Test
  public void shouldGetSetPrepTime() {
    int expected = 815;
    unitUnderTest.setPrepTime(expected);
    assertEquals(expected, unitUnderTest.getPrepTime());
  }

  @Test
  public void shouldGetSetDuration() {
    int expected = 815;
    unitUnderTest.setDuration(expected);
    assertEquals(expected, unitUnderTest.getDuration());
  }

  @Test
  public void shouldGetSetEndedTime() {
    String expected = "astring";
    unitUnderTest.setEndedTime(expected);
    assertEquals(expected, unitUnderTest.getEndedTime());
  }

  @Test
  public void shouldGetSetEndTime() {
    long expected = 4711L;
    unitUnderTest.setEndTime(expected);
    assertEquals(expected, unitUnderTest.getEndTime());
  }

  @Test
  public void shouldGetSetStartTime() {
    long expected = 4711L;
    unitUnderTest.setStartTime(expected);
    assertEquals(expected, unitUnderTest.getStartTime());
  }

  @Test
  public void shouldGetSetCreateTime() {
    long expected = 4711L;
    unitUnderTest.setCreateTime(expected);
    assertEquals(expected, unitUnderTest.getCreateTime());
  }

  @Test
  public void shouldGetSetCreator() {
    TournamentParticipant expected = new TournamentParticipant();
    unitUnderTest.setCreator(expected);
    assertEquals(expected, unitUnderTest.getCreator());
  }

  @Test
  public void shouldGetSetMembers() {
    java.util.List<TournamentParticipant> expected = new java.util.ArrayList<TournamentParticipant>();
    unitUnderTest.setMembers(expected);
    assertEquals(expected, unitUnderTest.getMembers());
  }

  @Test
  public void shouldToString() {
    unitUnderTest.setTag("astring");
    unitUnderTest.setType("astring");
    unitUnderTest.setStatus("astring");
    unitUnderTest.setName("astring");
    unitUnderTest.setDescription("astring");
    unitUnderTest.setCapacity(815);
    unitUnderTest.setMaxCapacity(815);
    unitUnderTest.setMaxPlayers(815);
    unitUnderTest.setPreparationDuration(815);
    unitUnderTest.setPrepTime(815);
    unitUnderTest.setDuration(815);
    unitUnderTest.setEndedTime("astring");
    unitUnderTest.setEndTime(4711L);
    unitUnderTest.setStartTime(4711L);
    unitUnderTest.setCreateTime(4711L);
    unitUnderTest.setCreator(new TournamentParticipant());
    unitUnderTest.setMembers(new java.util.ArrayList<TournamentParticipant>());
    String expected = "Tournament(tag=astring, type=astring, status=astring, name=astring, description=astring, capacity=815, maxCapacity=815, maxPlayers=815, preparationDuration=815, prepTime=815, duration=815, endedTime=astring, endTime=4711, startTime=4711, createTime=4711, creator=" + new TournamentParticipant() + ", members=" + new java.util.ArrayList<TournamentParticipant>() + ")";
    String actual = unitUnderTest.toString();
    assertEquals(expected, actual);
  }

}