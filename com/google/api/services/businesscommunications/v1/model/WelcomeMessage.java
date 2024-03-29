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
 * The greeting shown to users when they enter a conversation with the agent for the first time.
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
public final class WelcomeMessage extends com.google.api.client.json.GenericJson {

  /**
   * Image message.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCommunicationsBusinessmessagesV1Image image;

  /**
   * Rich card message. Could be either standalone card or carousel.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCommunicationsBusinessmessagesV1RichCard richCard;

  /**
   * Rich text message in valid markdown formatting.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String richText;

  /**
   * Text message. Maximum length 1000 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String text;

  /**
   * Image message.
   * @return value or {@code null} for none
   */
  public GoogleCommunicationsBusinessmessagesV1Image getImage() {
    return image;
  }

  /**
   * Image message.
   * @param image image or {@code null} for none
   */
  @com.google.errorprone.annotations.CanIgnoreReturnValue
  public WelcomeMessage setImage(GoogleCommunicationsBusinessmessagesV1Image image) {
    this.image = image;
    return this;
  }

  /**
   * Rich card message. Could be either standalone card or carousel.
   * @return value or {@code null} for none
   */
  public GoogleCommunicationsBusinessmessagesV1RichCard getRichCard() {
    return richCard;
  }

  /**
   * Rich card message. Could be either standalone card or carousel.
   * @param richCard richCard or {@code null} for none
   */
  @com.google.errorprone.annotations.CanIgnoreReturnValue
  public WelcomeMessage setRichCard(GoogleCommunicationsBusinessmessagesV1RichCard richCard) {
    this.richCard = richCard;
    return this;
  }

  /**
   * Rich text message in valid markdown formatting.
   * @return value or {@code null} for none
   */
  public java.lang.String getRichText() {
    return richText;
  }

  /**
   * Rich text message in valid markdown formatting.
   * @param richText richText or {@code null} for none
   */
  @com.google.errorprone.annotations.CanIgnoreReturnValue
  public WelcomeMessage setRichText(java.lang.String richText) {
    this.richText = richText;
    return this;
  }

  /**
   * Text message. Maximum length 1000 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getText() {
    return text;
  }

  /**
   * Text message. Maximum length 1000 characters.
   * @param text text or {@code null} for none
   */
  @com.google.errorprone.annotations.CanIgnoreReturnValue
  public WelcomeMessage setText(java.lang.String text) {
    this.text = text;
    return this;
  }

  @Override
  public WelcomeMessage set(String fieldName, Object value) {
    return (WelcomeMessage) super.set(fieldName, value);
  }

  @Override
  public WelcomeMessage clone() {
    return (WelcomeMessage) super.clone();
  }

}
