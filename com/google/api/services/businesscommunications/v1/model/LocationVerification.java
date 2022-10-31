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
 * Details about the verification information for a location.
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
public final class LocationVerification extends com.google.api.client.json.GenericJson {

  /**
   * Required. The identifier for verification.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The verification state.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String verificationState;

  /**
   * Required. The identifier for verification.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Required. The identifier for verification.
   * @param name name or {@code null} for none
   */
  @com.google.errorprone.annotations.CanIgnoreReturnValue
  public LocationVerification setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The verification state.
   * @return value or {@code null} for none
   */
  public java.lang.String getVerificationState() {
    return verificationState;
  }

  /**
   * The verification state.
   * @param verificationState verificationState or {@code null} for none
   */
  @com.google.errorprone.annotations.CanIgnoreReturnValue
  public LocationVerification setVerificationState(java.lang.String verificationState) {
    this.verificationState = verificationState;
    return this;
  }

  @Override
  public LocationVerification set(String fieldName, Object value) {
    return (LocationVerification) super.set(fieldName, value);
  }

  @Override
  public LocationVerification clone() {
    return (LocationVerification) super.clone();
  }

}
