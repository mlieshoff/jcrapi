package jcrapi;

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

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import jcrapi.model.Clan;
import jcrapi.model.Constants;
import jcrapi.model.Profile;
import jcrapi.model.TopClan;
import jcrapi.model.TopPlayer;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Michael Lieshoff
 */
public class ModelAnalyzer {

    public static void main(String[] args) throws IOException {
        String json = FileUtils.readFileToString(new File("src/test/java/jcrapi/profile.json"));
        Gson gson = new Gson();
        Profile profile = gson.fromJson(json, Profile.class);
        System.out.println(profile.toString());

        json = FileUtils.readFileToString(new File("src/test/java/jcrapi/profiles.json"));
        Type listType = new TypeToken<ArrayList<Profile>>(){}.getType();
        List<Profile> profiles =  new Gson().fromJson(json, listType);
        for (Profile profile1 : profiles) {
            System.out.println(profile1.toString());
        }

        json = FileUtils.readFileToString(new File("src/test/java/jcrapi/topClans.json"));
        listType = new TypeToken<ArrayList<TopClan>>(){}.getType();
        List<TopClan> topClans =  new Gson().fromJson(json, listType);
        for (TopClan topClan : topClans) {
            System.out.println(topClan.toString());
        }

        json = FileUtils.readFileToString(new File("src/test/java/jcrapi/clan.json"));
        Clan clan = gson.fromJson(json, Clan.class);
        System.out.println(clan.toString());

        json = FileUtils.readFileToString(new File("src/test/java/jcrapi/multiClans.json"));
        listType = new TypeToken<ArrayList<Clan>>(){}.getType();
        List<Clan> clans =  new Gson().fromJson(json, listType);
        for (Clan clan1 : clans) {
            System.out.println(clan1.toString());
        }

        json = FileUtils.readFileToString(new File("src/test/java/jcrapi/topPlayers.json"));
        listType = new TypeToken<ArrayList<TopPlayer>>(){}.getType();
        List<TopPlayer> topPlayers =  new Gson().fromJson(json, listType);
        for (TopPlayer topPlayer : topPlayers) {
            System.out.println(topPlayer.toString());
        }

        json = FileUtils.readFileToString(new File("src/test/java/jcrapi/constants.json"));
        Constants constants = gson.fromJson(json, Constants.class);
        System.out.println(constants.toString());

    }

}
