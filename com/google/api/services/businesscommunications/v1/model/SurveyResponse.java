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
 * The content for a survey question response.
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
public final class SurveyResponse extends com.google.api.client.json.GenericJson {

  /**
   * Required. Text that is shown in the survey and sent back to the agent when the user taps it.
   * Maximum 35 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String content;

  /**
   * The string the agent receives when the user taps the question response.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String postbackData;

  /**
   * Required. Text that is shown in the survey and sent back to the agent when the user taps it.
   * Maximum 35 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getContent() {
    return content;
  }

  /**
   * Required. Text that is shown in the survey and sent back to the agent when the user taps it.
   * Maximum 35 characters.
   * @param content content or {@code null} for none
   */
  @com.google.errorprone.annotations.CanIgnoreReturnValue
  public SurveyResponse setContent(java.lang.String content) {
    this.content = content;
    return this;
  }

  /**
   * The string the agent receives when the user taps the question response.
   * @return value or {@code null} for none
   */
  public java.lang.String getPostbackData() {
    return postbackData;
  }

  /**
   * The string the agent receives when the user taps the question response.
   * @param postbackData postbackData or {@code null} for none
   */
  @com.google.errorprone.annotations.CanIgnoreReturnValue
  public SurveyResponse setPostbackData(java.lang.String postbackData) {
    this.postbackData = postbackData;
    return this;
  }

  @Override
  public SurveyResponse set(String fieldName, Object value) {
    return (SurveyResponse) super.set(fieldName, value);
  }

  @Override
  public SurveyResponse clone() {
    return (SurveyResponse) super.clone();
  }

}
