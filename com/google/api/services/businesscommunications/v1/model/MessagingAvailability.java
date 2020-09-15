/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/google/apis-client-generator/
 * (build: 2020-09-15 16:44:21 EDT)
 * on 2020-09-15 at 20:44:50 UTC 
 * Modify at your own risk.
 */

package com.google.api.services.businesscommunications.v1.model;

/**
 * The hours of each day of the week that messaging is available. You can group hours for multiple
 * days together. For example, * 08:00–16:00 hrs PDT Monday–Wednesday * 10:00–14:00 hrs PDT
 * Thursday–Friday * 15:00–18:00 hrs PDT Thursday–Friday * 10:00–14:00 hrs PDT Saturday–Saturday If
 * there are gaps in availability, such as no specified availability on Sunday, messaging is
 * unavailable during those gaps.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Business Communications. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MessagingAvailability extends com.google.api.client.json.GenericJson {

  /**
   * Required. Hours of messaging availability.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Hours> hours;

  /**
   * Required. Hours of messaging availability.
   * @return value or {@code null} for none
   */
  public java.util.List<Hours> getHours() {
    return hours;
  }

  /**
   * Required. Hours of messaging availability.
   * @param hours hours or {@code null} for none
   */
  public MessagingAvailability setHours(java.util.List<Hours> hours) {
    this.hours = hours;
    return this;
  }

  @Override
  public MessagingAvailability set(String fieldName, Object value) {
    return (MessagingAvailability) super.set(fieldName, value);
  }

  @Override
  public MessagingAvailability clone() {
    return (MessagingAvailability) super.clone();
  }

}
