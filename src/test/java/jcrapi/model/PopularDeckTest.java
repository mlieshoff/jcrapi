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
public class PopularDeckTest {

    private PopularDeck unitUnderTest;

    @Before
    public void setUp() {
        unitUnderTest = new PopularDeck();
    }

    @Test
    public void shouldGetSetDecklink() {
        String expected = "astring";
        unitUnderTest.setDecklink(expected);
        assertEquals(expected, unitUnderTest.getDecklink());
    }

    @Test
    public void shouldGetSetPopularity() {
        int expected = 815;
        unitUnderTest.setPopularity(expected);
        assertEquals(expected, unitUnderTest.getPopularity());
    }

    @Test
    public void shouldGetSetCards() {
        java.util.List<PopularCard> expected = new java.util.ArrayList<PopularCard>();
        unitUnderTest.setCards(expected);
        assertEquals(expected, unitUnderTest.getCards());
    }

    @Test
    public void shouldToString() {
        unitUnderTest.setDecklink("astring");
        unitUnderTest.setPopularity(815);
        unitUnderTest.setCards(new java.util.ArrayList<PopularCard>());
        String expected = "PopularDeck{decklink=astring, popularity=815, cards=" + new java.util.ArrayList<PopularCard>() + "}";
        String actual = unitUnderTest.toString();
        assertEquals(expected, actual);
    }

}