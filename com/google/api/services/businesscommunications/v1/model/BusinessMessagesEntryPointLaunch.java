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
 * (build: 2022-10-18 16:21:26 UTC)
 * on 2022-10-18 at 16:21:49 UTC 
 * Modify at your own risk.
 */

package com.google.api.services.businesscommunications.v1.model;

/**
 * Details about Business Messages agent launch for each entry point.
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
public final class BusinessMessagesEntryPointLaunch extends com.google.api.client.json.GenericJson {

  /**
   * Entry point for which launch information is provided.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String entryPoint;

  /**
   * The launch state for entry point.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String launchState;

  /**
   * List of [CLDR region codes](https://www.iana.org/assignments/language-subtag-registry/language-
   * subtag-registry) for countries where the agent should launch `NON_LOCAL` entry points. Required
   * for `NON_LOCAL` entry points. This must be a subset of the region codes specified in the
   * agent's `nonLocalConfig`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> regionCodes;

  /**
   * Entry point for which launch information is provided.
   * @return value or {@code null} for none
   */
  public java.lang.String getEntryPoint() {
    return entryPoint;
  }

  /**
   * Entry point for which launch information is provided.
   * @param entryPoint entryPoint or {@code null} for none
   */
  @com.google.errorprone.annotations.CanIgnoreReturnValue
  public BusinessMessagesEntryPointLaunch setEntryPoint(java.lang.String entryPoint) {
    this.entryPoint = entryPoint;
    return this;
  }

  /**
   * The launch state for entry point.
   * @return value or {@code null} for none
   */
  public java.lang.String getLaunchState() {
    return launchState;
  }

  /**
   * The launch state for entry point.
   * @param launchState launchState or {@code null} for none
   */
  @com.google.errorprone.annotations.CanIgnoreReturnValue
  public BusinessMessagesEntryPointLaunch setLaunchState(java.lang.String launchState) {
    this.launchState = launchState;
    return this;
  }

  /**
   * List of [CLDR region codes](https://www.iana.org/assignments/language-subtag-registry/language-
   * subtag-registry) for countries where the agent should launch `NON_LOCAL` entry points. Required
   * for `NON_LOCAL` entry points. This must be a subset of the region codes specified in the
   * agent's `nonLocalConfig`.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getRegionCodes() {
    return regionCodes;
  }

  /**
   * List of [CLDR region codes](https://www.iana.org/assignments/language-subtag-registry/language-
   * subtag-registry) for countries where the agent should launch `NON_LOCAL` entry points. Required
   * for `NON_LOCAL` entry points. This must be a subset of the region codes specified in the
   * agent's `nonLocalConfig`.
   * @param regionCodes regionCodes or {@code null} for none
   */
  @com.google.errorprone.annotations.CanIgnoreReturnValue
  public BusinessMessagesEntryPointLaunch setRegionCodes(java.util.List<java.lang.String> regionCodes) {
    this.regionCodes = regionCodes;
    return this;
  }

  @Override
  public BusinessMessagesEntryPointLaunch set(String fieldName, Object value) {
    return (BusinessMessagesEntryPointLaunch) super.set(fieldName, value);
  }

  @Override
  public BusinessMessagesEntryPointLaunch clone() {
    return (BusinessMessagesEntryPointLaunch) super.clone();
  }

}
