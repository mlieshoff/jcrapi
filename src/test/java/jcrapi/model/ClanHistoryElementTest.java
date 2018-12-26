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
public class ClanHistoryElementTest {

  private ClanHistoryElement unitUnderTest;

  @Before
  public void setUp() {
    unitUnderTest = new ClanHistoryElement();
  }

  @Test
  public void shouldGetSetDonations() {
    Integer expected = Integer.valueOf(815);
    unitUnderTest.setDonations(expected);
    assertEquals(expected, unitUnderTest.getDonations());
  }

  @Test
  public void shouldGetSetMemberCount() {
    Integer expected = Integer.valueOf(815);
    unitUnderTest.setMemberCount(expected);
    assertEquals(expected, unitUnderTest.getMemberCount());
  }

  @Test
  public void shouldGetSetMembers() {
    java.util.List<ClanHistoryMember> expected = new java.util.ArrayList<ClanHistoryMember>();
    unitUnderTest.setMembers(expected);
    assertEquals(expected, unitUnderTest.getMembers());
  }

  @Test
  public void shouldGetSetScore() {
    Integer expected = Integer.valueOf(815);
    unitUnderTest.setScore(expected);
    assertEquals(expected, unitUnderTest.getScore());
  }

  @Test
  public void shouldGetSetCrowns() {
    int expected = 815;
    unitUnderTest.setCrowns(expected);
    assertEquals(expected, unitUnderTest.getCrowns());
  }

  @Test
  public void shouldToString() {
    unitUnderTest.setDonations(Integer.valueOf(815));
    unitUnderTest.setMemberCount(Integer.valueOf(815));
    unitUnderTest.setMembers(new java.util.ArrayList<ClanHistoryMember>());
    unitUnderTest.setScore(Integer.valueOf(815));
    unitUnderTest.setCrowns(815);
    String expected = "ClanHistoryElement(donations=815, memberCount=815, members=" + new java.util.ArrayList<ClanHistoryMember>() + ", score=815, crowns=815)";
    String actual = unitUnderTest.toString();
    assertEquals(expected, actual);
  }

}