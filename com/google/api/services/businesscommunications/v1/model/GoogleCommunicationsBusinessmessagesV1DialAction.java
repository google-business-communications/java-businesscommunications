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
 * Opens the user's default dialer app with the specified phone number filled in.
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
public final class GoogleCommunicationsBusinessmessagesV1DialAction extends com.google.api.client.json.GenericJson {

  /**
   * Required. The specified phone number, in [RFC 3966](https://tools.ietf.org/html/rfc3966)
   * format. For example, "+1-201-555-0123".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String phoneNumber;

  /**
   * Required. The specified phone number, in [RFC 3966](https://tools.ietf.org/html/rfc3966)
   * format. For example, "+1-201-555-0123".
   * @return value or {@code null} for none
   */
  public java.lang.String getPhoneNumber() {
    return phoneNumber;
  }

  /**
   * Required. The specified phone number, in [RFC 3966](https://tools.ietf.org/html/rfc3966)
   * format. For example, "+1-201-555-0123".
   * @param phoneNumber phoneNumber or {@code null} for none
   */
  @com.google.errorprone.annotations.CanIgnoreReturnValue
  public GoogleCommunicationsBusinessmessagesV1DialAction setPhoneNumber(java.lang.String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  @Override
  public GoogleCommunicationsBusinessmessagesV1DialAction set(String fieldName, Object value) {
    return (GoogleCommunicationsBusinessmessagesV1DialAction) super.set(fieldName, value);
  }

  @Override
  public GoogleCommunicationsBusinessmessagesV1DialAction clone() {
    return (GoogleCommunicationsBusinessmessagesV1DialAction) super.clone();
  }

}
