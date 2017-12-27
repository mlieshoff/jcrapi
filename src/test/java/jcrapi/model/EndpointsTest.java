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
public class EndpointsTest {

    @Test
    public void shouldBASE() {
        assertEquals( "http://api.cr-api.com/", Endpoints.BASE.getCode());
    }

    @Test
    public void shouldPROFILE() {
        assertEquals( Endpoints.BASE.getCode() + "player", Endpoints.PROFILE.getCode());
    }

    @Test
    public void shouldMULTIPLE_PROFILES() {
        assertEquals( Endpoints.BASE.getCode() + "player", Endpoints.MULTIPLE_PROFILES.getCode());
    }

    @Test
    public void shouldTOP_CLANS() {
        assertEquals( Endpoints.BASE.getCode() + "top/clans", Endpoints.TOP_CLANS.getCode());
    }

    @Test
    public void shouldSINGLE_CLANS() {
        assertEquals( Endpoints.BASE.getCode() + "clan", Endpoints.SINGLE_CLANS.getCode());
    }

    @Test
    public void shouldMULTIPLE_CLANS() {
        assertEquals( Endpoints.BASE.getCode() + "clan", Endpoints.MULTIPLE_CLANS.getCode());
    }

    @Test
    public void shouldTOP_PLAYERS() {
        assertEquals( Endpoints.BASE.getCode() + "top/players", Endpoints.TOP_PLAYERS.getCode());
    }

    @Test
    public void shouldCONSTANTS() {
        assertEquals( Endpoints.BASE.getCode() + "constants", Endpoints.CONSTANTS.getCode());
    }

    @Test
    public void shouldCONSTANTS_ALLIANCE() {
        assertEquals( Endpoints.CONSTANTS.getCode() + "/alliance/", Endpoints.CONSTANTS_ALLIANCE.getCode());
    }

    @Test
    public void shouldCONSTANTS_ARENAS() {
        assertEquals( Endpoints.CONSTANTS.getCode() + "/arenas/", Endpoints.CONSTANTS_ARENAS.getCode());
    }

    @Test
    public void shouldCONSTANTS_BADGES() {
        assertEquals( Endpoints.CONSTANTS.getCode() + "/badges/", Endpoints.CONSTANTS_BADGES.getCode());
    }

    @Test
    public void shouldCONSTANTS_CHESTCYCLE() {
        assertEquals( Endpoints.CONSTANTS.getCode() + "/chestCycle/", Endpoints.CONSTANTS_CHESTCYCLE.getCode());
    }

    @Test
    public void shouldCONSTANTS_COUNTRYCODES() {
        assertEquals( Endpoints.CONSTANTS.getCode() + "/countryCodes/", Endpoints.CONSTANTS_COUNTRYCODES.getCode());
    }

    @Test
    public void shouldCONSTANTS_RARITIES() {
        assertEquals( Endpoints.CONSTANTS.getCode() + "/rarities/", Endpoints.CONSTANTS_RARITIES.getCode());
    }

    @Test
    public void shouldCONSTANTS_CARDS() {
        assertEquals( Endpoints.CONSTANTS.getCode() + "/cards/", Endpoints.CONSTANTS_CARDS.getCode());
    }

    @Test
    public void shouldVERSION() {
        assertEquals( Endpoints.BASE.getCode() + "version", Endpoints.VERSION.getCode());
    }

}