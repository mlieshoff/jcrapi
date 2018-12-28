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
public class StatusTest {

  private Status unitUnderTest;

  @Before
  public void setUp() {
    unitUnderTest = new Status();
  }

  @Test
  public void shouldGetSetEnv() {
    String expected = "astring";
    unitUnderTest.setEnv(expected);
    assertEquals(expected, unitUnderTest.getEnv());
  }

  @Test
  public void shouldGetSetServerTime() {
    String expected = "astring";
    unitUnderTest.setServerTime(expected);
    assertEquals(expected, unitUnderTest.getServerTime());
  }

  @Test
  public void shouldGetSetServerVersion() {
    String expected = "astring";
    unitUnderTest.setServerVersion(expected);
    assertEquals(expected, unitUnderTest.getServerVersion());
  }

  @Test
  public void shouldGetSetNodeVersion() {
    String expected = "astring";
    unitUnderTest.setNodeVersion(expected);
    assertEquals(expected, unitUnderTest.getNodeVersion());
  }

  @Test
  public void shouldGetSetHost() {
    String expected = "astring";
    unitUnderTest.setHost(expected);
    assertEquals(expected, unitUnderTest.getHost());
  }

  @Test
  public void shouldGetSetUptime() {
    double expected = 1.41;
    unitUnderTest.setUptime(expected);
    assertEquals(expected, unitUnderTest.getUptime(), 0.0);
  }

  @Test
  public void shouldGetSetUptimeHuman() {
    String expected = "astring";
    unitUnderTest.setUptimeHuman(expected);
    assertEquals(expected, unitUnderTest.getUptimeHuman());
  }

  @Test
  public void shouldGetSetFreeMemory() {
    String expected = "astring";
    unitUnderTest.setFreeMemory(expected);
    assertEquals(expected, unitUnderTest.getFreeMemory());
  }

  @Test
  public void shouldGetSetMemoryUsage() {
    String expected = "astring";
    unitUnderTest.setMemoryUsage(expected);
    assertEquals(expected, unitUnderTest.getMemoryUsage());
  }

  @Test
  public void shouldToString() {
    unitUnderTest.setEnv("astring");
    unitUnderTest.setServerTime("astring");
    unitUnderTest.setServerVersion("astring");
    unitUnderTest.setNodeVersion("astring");
    unitUnderTest.setHost("astring");
    unitUnderTest.setUptime(1.41);
    unitUnderTest.setUptimeHuman("astring");
    unitUnderTest.setFreeMemory("astring");
    unitUnderTest.setMemoryUsage("astring");
    String expected = "Status(env=astring, serverTime=astring, serverVersion=astring, nodeVersion=astring, host=astring, uptime=1.41, uptimeHuman=astring, freeMemory=astring, memoryUsage=astring)";
    String actual = unitUnderTest.toString();
    assertEquals(expected, actual);
  }

}