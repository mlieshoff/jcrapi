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

package jcrapi;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.io.Charsets;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.WordUtils;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jcrapi.model.AuthStats;
import jcrapi.model.Battle;
import jcrapi.model.ChestCycle;
import jcrapi.model.Clan;
import jcrapi.model.ClanHistory;
import jcrapi.model.ClanTracking;
import jcrapi.model.ClanWarLog;
import jcrapi.model.Constants;
import jcrapi.model.Endpoints;
import jcrapi.model.KnownTournament;
import jcrapi.model.OpenTournament;
import jcrapi.model.PopularClan;
import jcrapi.model.PopularDeck;
import jcrapi.model.PopularPlayer;
import jcrapi.model.PopularTournament;
import jcrapi.model.Profile;
import jcrapi.model.Status;
import jcrapi.model.TopClan;
import jcrapi.model.TopPlayer;
import jcrapi.model.TopWar;

/**
 * @author Michael Lieshoff
 */
public class EndToEnd {

  private final String url;
  private final String developerKey;

  private final Map<String, Map<String, Field>> fields = new HashMap<>();
  private final Map<String, Class<?>> classes = new HashMap<>();

  private final Map<String, Integer> typeCount = new HashMap<>();
  private final Map<String, Map<String, Integer>> deprecatedFieldCount = new HashMap<>();

  public EndToEnd(String url, String developerKey) {
    this.url = url;
    this.developerKey = developerKey;
  }

  public static void main(String[] args) throws IOException, ClassNotFoundException {
    new EndToEnd("http://api-v3.royaleapi.com", args[0]).start();
  }

  private void start() throws IOException, ClassNotFoundException {
    loadModel();

//    testClan();
//    testClans();
//    testPlayer();
//    testPlayers();
//    testPlayerBattle();
//    testPlayerBattles(); broken
//    testPlayerChest();
//    testPlayerChests(); broken
//    testClanSearch();
//    testClan();
//    testClans();
//    testClanBattles(); empty / broken
//    testClanHistory(); empty / broken
//    testClanTracking();
//    testClanWarLog();
//    testOpenTournaments(); not found
//    testKnownTournaments(); not found
//    testTopClans(); not found
//    testTopPlayers(); not found
//    testTopWars(); not found
//    testPopularClans(); not found
//    testPopularPlayers(); not found
//    testPopularTournaments(); not found
//    testPopularDecks(); not found
//    testApiKeyStats(); not found
//    testEndpoints();
//    testConstants();
//    testStatus(); not found
  }

  private void printResults() {
    for (Map.Entry<String, Integer> entry : typeCount.entrySet()) {
      String type = entry.getKey();
      int max = entry.getValue();
      Map<String, Integer> map = deprecatedFieldCount.get(type);
      if (map != null) {
        for (Map.Entry<String, Integer> innerEntry : map.entrySet()) {
          String field = innerEntry.getKey();
          int fieldNotFoundCount = innerEntry.getValue();
          if (fieldNotFoundCount == max) {
            System.out.println(type + ".deprecated: " + field + " " + max + " / " + fieldNotFoundCount);
          }
        }
      }
    }
  }

  private void loadModel() throws ClassNotFoundException {
    File dir = new File("src/main/java/jcrapi/model");
    for (File file : dir.listFiles()) {
      registerTemplate(Class.forName("jcrapi.model." + file.getName().replace(".java", "")));
    }
  }

  private void registerTemplate(Class<?> clazz) {
    Map<String, Field> map = new HashMap<>();
    fields.put(clazz.getSimpleName(), map);
    Class<?> clazzToCheck = clazz;
    while (clazzToCheck != null && clazzToCheck != Object.class) {
      classes.put(clazzToCheck.getSimpleName(), clazzToCheck);
      for (Field field : clazzToCheck.getDeclaredFields()) {
        SerializedName serializedName = field.getAnnotation(SerializedName.class);
        if (serializedName != null && field.getAnnotation(Deprecated.class) == null) {
          map.put(serializedName.value(), field);
        }
      }
      clazzToCheck = clazzToCheck.getSuperclass();
    }
  }

  private void testPlayer() throws IOException {
    test(Arrays.asList(
        "/player/2PGGCJJL"/*,
        "/player/8L9L9GL",
        "/player/L88P2282",
        "/player/9CQ2U8QJ"*/
    ), Profile.class, false);
  }

  private void testPlayers() throws IOException {
    test(Arrays.asList("/players/8L9L9GL,L88P2282,9CQ2U8QJ"), Profile.class, true);
  }

  private void testPlayerBattle() throws IOException {
    test(Arrays.asList(
        "/player/8L9L9GL/battles",
        "/player/L88P2282/battles",
        "/player/9CQ2U8QJ/battles"
    ), Battle.class, true);
  }

  private void testPlayerBattles() throws IOException {
    test(Arrays.asList("/player/8L9L9GL,L88P2282,9CQ2U8QJ/battles"), Battle.class, true);
  }

  private void testPlayerChest() throws IOException {
    test(Arrays.asList(
        "/player/8L9L9GL/chests",
        "/player/L88P2282/chests",
        "/player/9CQ2U8QJ/chests"
    ), ChestCycle.class, false);
  }

  private void testPlayerChests() throws IOException {
    test(Arrays.asList("/player/8L9L9GL,L88P2282,9CQ2U8QJ/chests"), ChestCycle.class, true);
  }

  private void testClanSearch() throws IOException {
    test(Arrays.asList(
        "/clan/search?name=Puzzles&score=300&minMembers=1&maxMembers=50&locationId=57000000"
    ), Clan.class, true);
  }

  private void testClan() throws IOException {
    test(Arrays.asList(
        "/clan/2CCCP",
        "/clan/2U2GGQJ"
    ), Clan.class, false);
  }

  private void testClans() throws IOException {
    test(Arrays.asList("/clans/2CCCP,2U2GGQJ"), Clan.class, true);
  }

  private void testClanBattles() throws IOException {
    test(Arrays.asList(
        "/clan/2CCCP/battles",
        "/clan/2U2GGQJ/battles"
    ), Battle.class, true);
  }

  private void testClanHistory() throws IOException {
    test(Arrays.asList(
        "/clan/2CCCP/history",
        "/clan/2U2GGQJ/history"
    ), ClanHistory.class, false);
  }

  private void testClanTracking() throws IOException {
    test(Arrays.asList(
        "/clan/2CCCP/tracking",
        "/clan/2U2GGQJ/tracking"
    ), ClanTracking.class, false);
  }

  private void testClanWarLog() throws IOException {
    test(Arrays.asList(
        "/clan/2CCCP/warlog",
        "/clan/2U2GGQJ/warlog"
    ), ClanWarLog.class, true);
  }

  private void testOpenTournaments() throws IOException {
    test(Arrays.asList(
        "/tournaments/open"
    ), OpenTournament.class, true);
  }

  private void testKnownTournaments() throws IOException {
    test(Arrays.asList(
        "/tournaments/known"
    ), KnownTournament.class, true);
  }

  private void testTopClans() throws IOException {
    test(Arrays.asList(
        "/top/clans",
        "/top/clans/_EU",
        "/top/clans/US"
    ), TopClan.class, true);
  }

  private void testTopPlayers() throws IOException {
    test(Arrays.asList(
        "/top/players",
        "/top/players/_EU",
        "/top/players/US"
    ), TopPlayer.class, true);
  }

  private void testTopWars() throws IOException {
    test(Arrays.asList(
        "/top/war",
        "/top/war/_EU",
        "/top/war/US"
    ), TopWar.class, true);
  }

  private void testPopularClans() throws IOException {
    test(Arrays.asList(
        "/popular/clans?max=10"
    ), PopularClan.class, true);
  }

  private void testPopularPlayers() throws IOException {
    test(Arrays.asList(
        "/popular/players?max=10"
    ), PopularPlayer.class, true);
  }

  private void testPopularTournaments() throws IOException {
    test(Arrays.asList(
        "/popular/tournaments?max=10"
    ), PopularTournament.class, true);
  }

  private void testPopularDecks() throws IOException {
    test(Arrays.asList(
        "/popular/decks?max=10"
    ), PopularDeck.class, true);
  }

  private void testApiKeyStats() throws IOException {
    test(Arrays.asList(
        "/auth/stats"
    ), AuthStats.class, false);
  }

  private void testEndpoints() throws IOException {
    test(Arrays.asList(
        "/endpoints"
    ), Endpoints.class, true);
  }

  private void testConstants() throws IOException {
    test(Arrays.asList(
        "/constants"
    ), Constants.class, false);
  }

  private void testStatus() throws IOException {
    test(Arrays.asList(
        "/status"
    ), Status.class, false);
  }

  private void test(List<String> parts, Class<?> clazz, boolean isList) throws IOException {
    typeCount.clear();
    deprecatedFieldCount.clear();
    try {
      for (String part : parts) {
        String completeUrl = url + part;
        System.out.println("> " + completeUrl);
        File file = new File("/tmp/" + completeUrl.hashCode() + ".json");
        String json;
        if (file.exists()) {
          json = FileUtils.readFileToString(file);
        } else {
          json = new Crawler(new HttpClientFactory()).get(completeUrl, createHeader());
          FileUtils.write(file, json, Charsets.UTF_8.name());
        }
        System.out.println(json);
        if (json.startsWith("{")) {
          isList = false;
        }
        JsonElement jelement = new JsonParser().parse(json);
        if (isList) {
          jelement = jelement.getAsJsonArray();
        } else {
          jelement = jelement.getAsJsonObject();
        }
        compare(jelement, null, clazz.getSimpleName());
      }
      printResults();
    } catch (Throwable t) {
      System.out.println("ERROR: " + t.getMessage());
    }
  }

  private Collection<String> compare(JsonElement jsonElement, Field sourceField, String templateName) {
    Collection<String> foundFields = new HashSet<>();
    Collection<String> expectedFields = new HashSet<>();
    Class<?> clazz = classes.get(templateName);
    Map<String, Field> map = fields.get(templateName);

    if (map != null) {
      expectedFields.addAll(map.keySet());
    } else {
      if (templateName.equalsIgnoreCase(String.class.getName())) {
        return Collections.emptyList();
      }
      System.out.println("type not found: " + templateName + " " + sourceField);
    }

    if (jsonElement.isJsonArray()) {
      for (Iterator<JsonElement> iterator = jsonElement.getAsJsonArray().iterator(); iterator.hasNext(); ) {
        JsonElement jsonListElement = iterator.next();
        if (!jsonListElement.isJsonPrimitive()) {
          Collection<String> collection = compare(jsonListElement, sourceField, WordUtils.capitalize(templateName));
          if (collection.size() > 0) {
            foundFields.addAll(collection);
          }
        }
      }
    } else if (jsonElement.isJsonObject()) {
      JsonObject jsonObject = jsonElement.getAsJsonObject();

      for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
        String jsonFieldName = entry.getKey();
        foundFields.add(jsonFieldName);
        JsonElement jsonElement1 = entry.getValue();
        Field field = map != null ? map.get(jsonFieldName) : null;
        if (field == null) {
          if (clazz != null && Map.class.isAssignableFrom(clazz)) {
            if (templateName.equals("ClanHistory")) {
              compare(jsonElement1, null, "ClanHistoryElement");
            }
          } else {
            System.out.println(templateName + ".missing: " + jsonFieldName + " -> " + jsonElement1.toString());
          }
        } else {
          if (!jsonElement1.isJsonPrimitive()) {
            if (isCollection(field) || isArray(field)) {
              // hot fix for compiling to java 7.
              String typeName = ((ParameterizedType) field.getGenericType()).getActualTypeArguments()[0].getTypeName();
              compare(jsonElement1, field, WordUtils.capitalize(typeName.replace("jcrapi.model.", "")));
            } else if (jsonElement1.isJsonObject()) {
              compare(jsonElement1, field, field.getType().getSimpleName());
            }
          }
        }
      }
    }
    typeCount.put(templateName, Optional.fromNullable(typeCount.get(templateName)).or(0) + 1);
    Collection<String> notExpected = CollectionUtils.subtract(expectedFields, foundFields);
    Collection<String> notDefined = CollectionUtils.subtract(foundFields, expectedFields);
    if (notExpected.size() > 0) {
      Map<String, Integer> deprecatedMap = deprecatedFieldCount.get(templateName);
      if (deprecatedMap == null) {
        deprecatedMap = new HashMap<>();
        deprecatedFieldCount.put(templateName, deprecatedMap);
      }
      for (String deprecatedFieldName : notExpected) {
        String id = templateName + "." + deprecatedFieldName;
        deprecatedMap.put(id, Optional.fromNullable(deprecatedMap.get(id)).or(0) + 1);
      }
    }
    if (notDefined.size() > 0) {
      System.out.println(templateName + ".not defined in model: " + notDefined);
    }
    return foundFields;
  }

  private boolean isCollection(Field field) {
    return Collection.class.isAssignableFrom(field.getType());
  }

  private boolean isArray(Field field) {
    return Array.class.isAssignableFrom(field.getType());
  }

  private Map<String, String> createHeader() {
    return ImmutableMap.<String, String>builder().put("auth", developerKey).build();
  }

}
