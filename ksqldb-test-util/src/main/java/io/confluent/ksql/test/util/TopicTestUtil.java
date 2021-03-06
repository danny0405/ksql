/*
 * Copyright 2018 Confluent Inc.
 *
 * Licensed under the Confluent Community License (the "License"); you may not use
 * this file except in compliance with the License.  You may obtain a copy of the
 * License at
 *
 * http://www.confluent.io/confluent-community-license
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OF ANY KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations under the License.
 */

package io.confluent.ksql.test.util;

import java.util.UUID;

public final class TopicTestUtil {

  private TopicTestUtil() {
  }

  /**
   * Use this method to create a unique name for each topic used within a test.
   *
   * <p>This stops one test from interfering with each other - a common gotcha!
   *
   * @param prefix a prefix for the topic name.
   * @return a unique topic name starting with {@code prefix}.
   */
  public static String uniqueTopicName(final String prefix) {
    return prefix + '-' + uniqueTopicName();
  }

  /**
   * Use this method to create a unique name for each topic used within a test.
   *
   * <p>This stops one test from interfering with each other - a common gotcha!
   *
   * @return a unique topic name.
   */
  public static String uniqueTopicName() {
    return "topic-" + UUID.randomUUID();
  }
}
