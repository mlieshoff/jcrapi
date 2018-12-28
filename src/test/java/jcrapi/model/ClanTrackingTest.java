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
public class ClanTrackingTest {

  private ClanTracking unitUnderTest;

  @Before
  public void setUp() {
    unitUnderTest = new ClanTracking();
  }

  @Test
  public void shouldGetSetTag() {
    String expected = "astring";
    unitUnderTest.setTag(expected);
    assertEquals(expected, unitUnderTest.getTag());
  }

  @Test
  public void shouldGetSetActive() {
    boolean expected = false;
    unitUnderTest.setActive(expected);
    assertEquals(expected, unitUnderTest.isActive());
  }

  @Test
  public void shouldGetSetAvailable() {
    boolean expected = false;
    unitUnderTest.setAvailable(expected);
    assertEquals(expected, unitUnderTest.isAvailable());
  }

  @Test
  public void shouldGetSetSnapshotCount() {
    int expected = 815;
    unitUnderTest.setSnapshotCount(expected);
    assertEquals(expected, unitUnderTest.getSnapshotCount());
  }

  @Test
  public void shouldGetSetLegible() {
    boolean expected = false;
    unitUnderTest.setLegible(expected);
    assertEquals(expected, unitUnderTest.isLegible());
  }

  @Test
  public void shouldToString() {
    unitUnderTest.setTag("astring");
    unitUnderTest.setActive(false);
    unitUnderTest.setAvailable(false);
    unitUnderTest.setSnapshotCount(815);
    unitUnderTest.setLegible(false);
    String expected = "ClanTracking(tag=astring, active=false, available=false, snapshotCount=815, legible=false)";
    String actual = unitUnderTest.toString();
    assertEquals(expected, actual);
  }

}