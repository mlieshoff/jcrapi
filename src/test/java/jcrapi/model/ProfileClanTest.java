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
public class ProfileClanTest {

    private ProfileClan unitUnderTest;

    @Before
    public void setUp() {
        unitUnderTest = new ProfileClan();
    }

    @Test
    public void shouldGetSetTag() {
        String expected = "astring";
        unitUnderTest.setTag(expected);
        assertEquals(expected, unitUnderTest.getTag());
    }

    @Test
    public void shouldGetSetName() {
        String expected = "astring";
        unitUnderTest.setName(expected);
        assertEquals(expected, unitUnderTest.getName());
    }

    @Test
    public void shouldGetSetRole() {
        String expected = "astring";
        unitUnderTest.setRole(expected);
        assertEquals(expected, unitUnderTest.getRole());
    }

    @Test
    public void shouldGetSetDonations() {
        int expected = 815;
        unitUnderTest.setDonations(expected);
        assertEquals(expected, unitUnderTest.getDonations());
    }

    @Test
    public void shouldGetSetDonationsReceived() {
        int expected = 815;
        unitUnderTest.setDonationsReceived(expected);
        assertEquals(expected, unitUnderTest.getDonationsReceived());
    }

    @Test
    public void shouldGetSetDonationsDelta() {
        int expected = 815;
        unitUnderTest.setDonationsDelta(expected);
        assertEquals(expected, unitUnderTest.getDonationsDelta());
    }

    @Test
    public void shouldGetSetBadge() {
        Badge expected = new Badge();
        unitUnderTest.setBadge(expected);
        assertEquals(expected, unitUnderTest.getBadge());
    }

    @Test
    public void shouldToString() {
        unitUnderTest.setTag("astring");
        unitUnderTest.setName("astring");
        unitUnderTest.setRole("astring");
        unitUnderTest.setDonations(815);
        unitUnderTest.setDonationsReceived(815);
        unitUnderTest.setDonationsDelta(815);
        unitUnderTest.setBadge(new Badge());
        String expected = "ProfileClan{tag=astring, name=astring, role=astring, donations=815, donationsReceived=815, donationsDelta=815, badge=" + new Badge() + "}";
        String actual = unitUnderTest.toString();
        assertEquals(expected, actual);
    }

}