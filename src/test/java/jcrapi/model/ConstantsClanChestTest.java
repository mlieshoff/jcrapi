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
public class ConstantsClanChestTest {

  private ConstantsClanChest unitUnderTest;

  @Before
  public void setUp() {
    unitUnderTest = new ConstantsClanChest();
  }

  @Test
  public void shouldGetSetV1() {
    ConstantsV1 expected = new ConstantsV1();
    unitUnderTest.setV1(expected);
    assertEquals(expected, unitUnderTest.getV1());
  }

  @Test
  public void shouldGetSetV2() {
    ConstantsV2 expected = new ConstantsV2();
    unitUnderTest.setV2(expected);
    assertEquals(expected, unitUnderTest.getV2());
  }

  @Test
  public void shouldToString() {
    unitUnderTest.setV1(new ConstantsV1());
    unitUnderTest.setV2(new ConstantsV2());
    String expected = "ConstantsClanChest(v1=" + new ConstantsV1() + ", v2=" + new ConstantsV2() + ")";
    String actual = unitUnderTest.toString();
    assertEquals(expected, actual);
  }

}