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
public class ClanHistoryMemberTest {

  private ClanHistoryMember unitUnderTest;

  @Before
  public void setUp() {
    unitUnderTest = new ClanHistoryMember();
  }

  @Test
  public void shouldGetSetClanRank() {
    Integer expected = Integer.valueOf(815);
    unitUnderTest.setClanRank(expected);
    assertEquals(expected, unitUnderTest.getClanRank());
  }

  @Test
  public void shouldGetSetCrowns() {
    Integer expected = Integer.valueOf(815);
    unitUnderTest.setCrowns(expected);
    assertEquals(expected, unitUnderTest.getCrowns());
  }

  @Test
  public void shouldGetSetDonations() {
    Integer expected = Integer.valueOf(815);
    unitUnderTest.setDonations(expected);
    assertEquals(expected, unitUnderTest.getDonations());
  }

  @Test
  public void shouldGetSetName() {
    String expected = "astring";
    unitUnderTest.setName(expected);
    assertEquals(expected, unitUnderTest.getName());
  }

  @Test
  public void shouldGetSetTag() {
    String expected = "astring";
    unitUnderTest.setTag(expected);
    assertEquals(expected, unitUnderTest.getTag());
  }

  @Test
  public void shouldGetSetTrophies() {
    Integer expected = Integer.valueOf(815);
    unitUnderTest.setTrophies(expected);
    assertEquals(expected, unitUnderTest.getTrophies());
  }

  @Test
  public void shouldToString() {
    unitUnderTest.setClanRank(Integer.valueOf(815));
    unitUnderTest.setCrowns(Integer.valueOf(815));
    unitUnderTest.setDonations(Integer.valueOf(815));
    unitUnderTest.setName("astring");
    unitUnderTest.setTag("astring");
    unitUnderTest.setTrophies(Integer.valueOf(815));
    String expected = "ClanHistoryMember(clanRank=815, crowns=815, donations=815, name=astring, tag=astring, trophies=815)";
    String actual = unitUnderTest.toString();
    assertEquals(expected, actual);
  }

}