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
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Generated("org.mili.generator")
@Getter
@Setter
@ToString
public class ConstantsChestOrder {

  @SerializedName("MainCycle")
  private java.util.List<String> mainCycle;

  @SerializedName("Quest_arena3_super")
  private java.util.List<ConstantsQuestArena3Super> questArena3Super;

  @SerializedName("Quest_earlygame_1")
  private java.util.List<ConstantsQuestEarlygame1> questEarlygame1;

  @SerializedName("Quest_earlygame_2")
  private java.util.List<ConstantsQuestEarlygame2> questEarlygame2;

  @SerializedName("Quest_lategame_1")
  private java.util.List<ConstantsQuestLategame1> questLategame1;

  @SerializedName("Quest_lategame_10")
  private java.util.List<ConstantsQuestLategame10> questLategame10;

  @SerializedName("Quest_lategame_2")
  private java.util.List<ConstantsQuestLategame2> questLategame2;

  @SerializedName("Quest_lategame_3")
  private java.util.List<ConstantsQuestLategame3> questLategame3;

  @SerializedName("Quest_lategame_4")
  private java.util.List<ConstantsQuestLategame4> questLategame4;

  @SerializedName("Quest_lategame_5")
  private java.util.List<ConstantsQuestLategame5> questLategame5;

  @SerializedName("Quest_lategame_6")
  private java.util.List<ConstantsQuestLategame6> questLategame6;

  @SerializedName("Quest_lategame_7")
  private java.util.List<ConstantsQuestLategame7> questLategame7;

  @SerializedName("Quest_lategame_8")
  private java.util.List<ConstantsQuestLategame8> questLategame8;

  @SerializedName("Quest_lategame_9")
  private java.util.List<ConstantsQuestLategame9> questLategame9;

  @SerializedName("Quest_arena3_UNUSED")
  private java.util.List<ConstantsQuestArena3Unused> QuestArena3Unused;

}