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
 * Card content.
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
public final class GoogleCommunicationsBusinessmessagesV1CardContent extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Description of the card. Maximum 2,000 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Optional. Media to include in the card.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCommunicationsBusinessmessagesV1Media media;

  /**
   * Optional. List of suggestions to include in the card. Maximum 4 suggestions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCommunicationsBusinessmessagesV1Suggestion> suggestions;

  /**
   * Optional. Title of the card. Maximum 200 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * Optional. Description of the card. Maximum 2,000 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Optional. Description of the card. Maximum 2,000 characters.
   * @param description description or {@code null} for none
   */
  @com.google.errorprone.annotations.CanIgnoreReturnValue
  public GoogleCommunicationsBusinessmessagesV1CardContent setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Optional. Media to include in the card.
   * @return value or {@code null} for none
   */
  public GoogleCommunicationsBusinessmessagesV1Media getMedia() {
    return media;
  }

  /**
   * Optional. Media to include in the card.
   * @param media media or {@code null} for none
   */
  @com.google.errorprone.annotations.CanIgnoreReturnValue
  public GoogleCommunicationsBusinessmessagesV1CardContent setMedia(GoogleCommunicationsBusinessmessagesV1Media media) {
    this.media = media;
    return this;
  }

  /**
   * Optional. List of suggestions to include in the card. Maximum 4 suggestions.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCommunicationsBusinessmessagesV1Suggestion> getSuggestions() {
    return suggestions;
  }

  /**
   * Optional. List of suggestions to include in the card. Maximum 4 suggestions.
   * @param suggestions suggestions or {@code null} for none
   */
  @com.google.errorprone.annotations.CanIgnoreReturnValue
  public GoogleCommunicationsBusinessmessagesV1CardContent setSuggestions(java.util.List<GoogleCommunicationsBusinessmessagesV1Suggestion> suggestions) {
    this.suggestions = suggestions;
    return this;
  }

  /**
   * Optional. Title of the card. Maximum 200 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * Optional. Title of the card. Maximum 200 characters.
   * @param title title or {@code null} for none
   */
  @com.google.errorprone.annotations.CanIgnoreReturnValue
  public GoogleCommunicationsBusinessmessagesV1CardContent setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  @Override
  public GoogleCommunicationsBusinessmessagesV1CardContent set(String fieldName, Object value) {
    return (GoogleCommunicationsBusinessmessagesV1CardContent) super.set(fieldName, value);
  }

  @Override
  public GoogleCommunicationsBusinessmessagesV1CardContent clone() {
    return (GoogleCommunicationsBusinessmessagesV1CardContent) super.clone();
  }

}
