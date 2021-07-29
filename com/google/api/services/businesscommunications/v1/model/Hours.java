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
 * (build: 2021-06-24 22:17:16 UTC)
 * on 2021-06-24 at 22:17:25 UTC 
 * Modify at your own risk.
 */

package com.google.api.services.businesscommunications.v1.model;

/**
 * A range of hours that messaging is available.
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
public final class Hours extends com.google.api.client.json.GenericJson {

  /**
   * Required. End day. Includes the specified day.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String endDay;

  /**
   * Required. End time for each day within the day-of-week range.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TimeOfDay endTime;

  /**
   * Required. Start day.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String startDay;

  /**
   * Required. Start time for each day within the day-of-week range.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TimeOfDay startTime;

  /**
   * Required. The [IANA time zone](https://www.iana.org/time-zones) for the hours. For example,
   * "America/Los_Angeles".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String timeZone;

  /**
   * Required. End day. Includes the specified day.
   * @return value or {@code null} for none
   */
  public java.lang.String getEndDay() {
    return endDay;
  }

  /**
   * Required. End day. Includes the specified day.
   * @param endDay endDay or {@code null} for none
   */
  public Hours setEndDay(java.lang.String endDay) {
    this.endDay = endDay;
    return this;
  }

  /**
   * Required. End time for each day within the day-of-week range.
   * @return value or {@code null} for none
   */
  public TimeOfDay getEndTime() {
    return endTime;
  }

  /**
   * Required. End time for each day within the day-of-week range.
   * @param endTime endTime or {@code null} for none
   */
  public Hours setEndTime(TimeOfDay endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Required. Start day.
   * @return value or {@code null} for none
   */
  public java.lang.String getStartDay() {
    return startDay;
  }

  /**
   * Required. Start day.
   * @param startDay startDay or {@code null} for none
   */
  public Hours setStartDay(java.lang.String startDay) {
    this.startDay = startDay;
    return this;
  }

  /**
   * Required. Start time for each day within the day-of-week range.
   * @return value or {@code null} for none
   */
  public TimeOfDay getStartTime() {
    return startTime;
  }

  /**
   * Required. Start time for each day within the day-of-week range.
   * @param startTime startTime or {@code null} for none
   */
  public Hours setStartTime(TimeOfDay startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Required. The [IANA time zone](https://www.iana.org/time-zones) for the hours. For example,
   * "America/Los_Angeles".
   * @return value or {@code null} for none
   */
  public java.lang.String getTimeZone() {
    return timeZone;
  }

  /**
   * Required. The [IANA time zone](https://www.iana.org/time-zones) for the hours. For example,
   * "America/Los_Angeles".
   * @param timeZone timeZone or {@code null} for none
   */
  public Hours setTimeZone(java.lang.String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

  @Override
  public Hours set(String fieldName, Object value) {
    return (Hours) super.set(fieldName, value);
  }

  @Override
  public Hours clone() {
    return (Hours) super.clone();
  }

}
