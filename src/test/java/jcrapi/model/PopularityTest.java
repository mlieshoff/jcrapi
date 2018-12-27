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
public class PopularityTest {

  private Popularity unitUnderTest;

  @Before
  public void setUp() {
    unitUnderTest = new Popularity();
  }

  @Test
  public void shouldGetSetHits() {
    String expected = "astring";
    unitUnderTest.setHits(expected);
    assertEquals(expected, unitUnderTest.getHits());
  }

  @Test
  public void shouldGetSetHitsPerDayAvg() {
    double expected = 1.41;
    unitUnderTest.setHitsPerDayAvg(expected);
    assertEquals(expected, unitUnderTest.getHitsPerDayAvg(), 0.0);
  }

  @Test
  public void shouldToString() {
    unitUnderTest.setHits("astring");
    unitUnderTest.setHitsPerDayAvg(1.41);
    String expected = "Popularity(hits=astring, hitsPerDayAvg=1.41)";
    String actual = unitUnderTest.toString();
    assertEquals(expected, actual);
  }

}