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
 * The entry point configuration for a location.
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
public final class LocationEntryPointConfig extends com.google.api.client.json.GenericJson {

  /**
   * Required. The Google surfaces the location is enabled to appear on.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String allowedEntryPoint;

  /**
   * Required. The Google surfaces the location is enabled to appear on.
   * @return value or {@code null} for none
   */
  public java.lang.String getAllowedEntryPoint() {
    return allowedEntryPoint;
  }

  /**
   * Required. The Google surfaces the location is enabled to appear on.
   * @param allowedEntryPoint allowedEntryPoint or {@code null} for none
   */
  @com.google.errorprone.annotations.CanIgnoreReturnValue
  public LocationEntryPointConfig setAllowedEntryPoint(java.lang.String allowedEntryPoint) {
    this.allowedEntryPoint = allowedEntryPoint;
    return this;
  }

  @Override
  public LocationEntryPointConfig set(String fieldName, Object value) {
    return (LocationEntryPointConfig) super.set(fieldName, value);
  }

  @Override
  public LocationEntryPointConfig clone() {
    return (LocationEntryPointConfig) super.clone();
  }

}
