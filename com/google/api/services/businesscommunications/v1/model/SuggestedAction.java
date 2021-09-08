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
 * (build: 2021-09-08 15:02:56 EDT)
 * on 2021-09-08 at 19:02:57 UTC 
 * Modify at your own risk.
 */

package com.google.api.services.businesscommunications.v1.model;

/**
 * When tapped, initiates the corresponding native action on the device.
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
public final class SuggestedAction extends com.google.api.client.json.GenericJson {

  /**
   * Opens the specified URL.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private OpenUrlAction openUrlAction;

  /**
   * The string that the agent receives when a user taps the suggested action.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String postbackData;

  /**
   * Text that is shown in the suggested action. Maximum 35 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String text;

  /**
   * Opens the specified URL.
   * @return value or {@code null} for none
   */
  public OpenUrlAction getOpenUrlAction() {
    return openUrlAction;
  }

  /**
   * Opens the specified URL.
   * @param openUrlAction openUrlAction or {@code null} for none
   */
  public SuggestedAction setOpenUrlAction(OpenUrlAction openUrlAction) {
    this.openUrlAction = openUrlAction;
    return this;
  }

  /**
   * The string that the agent receives when a user taps the suggested action.
   * @return value or {@code null} for none
   */
  public java.lang.String getPostbackData() {
    return postbackData;
  }

  /**
   * The string that the agent receives when a user taps the suggested action.
   * @param postbackData postbackData or {@code null} for none
   */
  public SuggestedAction setPostbackData(java.lang.String postbackData) {
    this.postbackData = postbackData;
    return this;
  }

  /**
   * Text that is shown in the suggested action. Maximum 35 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getText() {
    return text;
  }

  /**
   * Text that is shown in the suggested action. Maximum 35 characters.
   * @param text text or {@code null} for none
   */
  public SuggestedAction setText(java.lang.String text) {
    this.text = text;
    return this;
  }

  @Override
  public SuggestedAction set(String fieldName, Object value) {
    return (SuggestedAction) super.set(fieldName, value);
  }

  @Override
  public SuggestedAction clone() {
    return (SuggestedAction) super.clone();
  }

}
