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

package jcrapi.request;

import java.lang.reflect.Method;
import java.util.List;

/**
 * @author Michael Lieshoff
 */
public class BuilderTestUtil {

  public static <T> T invokeBuildMethod(Object builder) throws Exception {
    Method buildMethod = builder.getClass().getDeclaredMethod("build");
    try {
        return (T) buildMethod.invoke(builder);
    } catch (Exception e) {
      if (e.getCause() != null) {
        throw (Exception) e.getCause();
      }
      throw e;
    }
  }

  public static Object invokeExcludesMethod(Object builder, List<String> expected) throws Exception {
      return invokeMethod("excludes", builder, expected, List.class);
  }

  public static Object invokeMethod(String name, Object builder, Object expected, Class<?> clazz) throws Exception {
      Method excludesMethod = builder.getClass().getMethod(name, clazz);
      return excludesMethod.invoke(builder, expected);
  }

  public static Object invokeKeysMethod(Object builder, List<String> expected) throws Exception {
    return invokeMethod("keys", builder, expected, List.class);
  }

  public static Object invokeMaxMethod(Object builder, int max) throws Exception {
      return invokeMethod("max", builder, max, int.class);
  }

  public static Object invokePageMethod(Object builder, int page) throws Exception {
    return invokeMethod("page", builder, page, int.class);
  }

  public static Object invokeLimitMethod(Object builder, int limit) throws Exception {
    return invokeMethod("limit", builder, limit, int.class);
  }

  public static Object invokeLocationKeyMethod(Object builder, String locationKey) throws Exception {
    return invokeMethod("locationKey", builder, locationKey, String.class);
  }

  public static Object invokeOneKMethod(Object builder, boolean b) throws Exception {
    return invokeMethod("oneK", builder, b, boolean.class);
  }

  public static Object invokeOpenMethod(Object builder, boolean b) throws Exception {
    return invokeMethod("open", builder, b, boolean.class);
  }

  public static Object invokeFullMethod(Object builder, boolean b) throws Exception {
    return invokeMethod("full", builder, b, boolean.class);
  }

  public static Object invokePrepMethod(Object builder, boolean b) throws Exception {
    return invokeMethod("prep", builder, b, boolean.class);
  }

  public static Object invokeJoinableMethod(Object builder, boolean b) throws Exception {
    return invokeMethod("joinable", builder, b, boolean.class);
  }

}
