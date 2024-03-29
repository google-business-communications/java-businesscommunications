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
 * (build: 2022-10-26 23:10:20 UTC)
 * on 2022-10-26 at 23:10:36 UTC 
 * Modify at your own risk.
 */

package com.google.api.services.businesscommunications.v1.model;

/**
 * Details about a location launch.
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
public final class LocationLaunch extends com.google.api.client.json.GenericJson {

  /**
   * The launch state.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String launchState;

  /**
   * Required. The identifier for launch.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The launch state.
   * @return value or {@code null} for none
   */
  public java.lang.String getLaunchState() {
    return launchState;
  }

  /**
   * The launch state.
   * @param launchState launchState or {@code null} for none
   */
  @com.google.errorprone.annotations.CanIgnoreReturnValue
  public LocationLaunch setLaunchState(java.lang.String launchState) {
    this.launchState = launchState;
    return this;
  }

  /**
   * Required. The identifier for launch.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Required. The identifier for launch.
   * @param name name or {@code null} for none
   */
  @com.google.errorprone.annotations.CanIgnoreReturnValue
  public LocationLaunch setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public LocationLaunch set(String fieldName, Object value) {
    return (LocationLaunch) super.set(fieldName, value);
  }

  @Override
  public LocationLaunch clone() {
    return (LocationLaunch) super.clone();
  }

}
