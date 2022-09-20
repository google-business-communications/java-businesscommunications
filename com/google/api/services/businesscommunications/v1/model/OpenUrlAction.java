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
 * (build: 2022-09-14 21:13:25 UTC)
 * on 2022-09-14 at 21:13:50 UTC 
 * Modify at your own risk.
 */

package com.google.api.services.businesscommunications.v1.model;

/**
 * Opens the specified URL.
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
public final class OpenUrlAction extends com.google.api.client.json.GenericJson {

  /**
   * URL
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String url;

  /**
   * URL
   * @return value or {@code null} for none
   */
  public java.lang.String getUrl() {
    return url;
  }

  /**
   * URL
   * @param url url or {@code null} for none
   */
  @com.google.errorprone.annotations.CanIgnoreReturnValue
  public OpenUrlAction setUrl(java.lang.String url) {
    this.url = url;
    return this;
  }

  @Override
  public OpenUrlAction set(String fieldName, Object value) {
    return (OpenUrlAction) super.set(fieldName, value);
  }

  @Override
  public OpenUrlAction clone() {
    return (OpenUrlAction) super.clone();
  }

}
