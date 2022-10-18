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
 * Details about a Business Messages agent launch.
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
public final class BusinessMessagesLaunch extends com.google.api.client.json.GenericJson {

  /**
   * Required. Launch details for each supported entry point. Key represented by
   * BusinessMessagesEntryPointConfig.EntryPoint
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, BusinessMessagesEntryPointLaunch> launchDetails;

  /**
   * Required. Launch details for each supported entry point. Key represented by
   * BusinessMessagesEntryPointConfig.EntryPoint
   * @return value or {@code null} for none
   */
  public java.util.Map<String, BusinessMessagesEntryPointLaunch> getLaunchDetails() {
    return launchDetails;
  }

  /**
   * Required. Launch details for each supported entry point. Key represented by
   * BusinessMessagesEntryPointConfig.EntryPoint
   * @param launchDetails launchDetails or {@code null} for none
   */
  @com.google.errorprone.annotations.CanIgnoreReturnValue
  public BusinessMessagesLaunch setLaunchDetails(java.util.Map<String, BusinessMessagesEntryPointLaunch> launchDetails) {
    this.launchDetails = launchDetails;
    return this;
  }

  @Override
  public BusinessMessagesLaunch set(String fieldName, Object value) {
    return (BusinessMessagesLaunch) super.set(fieldName, value);
  }

  @Override
  public BusinessMessagesLaunch clone() {
    return (BusinessMessagesLaunch) super.clone();
  }

}
