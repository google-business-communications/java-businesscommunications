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
 * Details about a greeting.
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
public final class Greeting extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The ad link corresponding to this greeting (go/bm-link-spec).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String adLink;

  /**
   * Optional. Details about the conversation starters. Maximum 5.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ConversationStarters> conversationStarters;

  static {
    // hack to force ProGuard to consider ConversationStarters used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ConversationStarters.class);
  }

  /**
   * Optional. A custom identifier defined by the partner.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String customId;

  /**
   * Required. The locale is a well-formed IETF BCP 47 language tag. It must match a locale defined
   * in {@link ConversationalSettings}.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String locale;

  /**
   * Output only. The name of the greeting, as set by Business Messages. Resolves to
   * "brands/{brand_id}/agents/{agent_id}/greetings/{greeting_id}" where {greeting_id} is the unique
   * ID of the greeting.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Required. Welcome message content. A greeting must have at least one welcome message defined.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<WelcomeMessage> welcomeMessages;

  static {
    // hack to force ProGuard to consider WelcomeMessage used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(WelcomeMessage.class);
  }

  /**
   * Output only. The ad link corresponding to this greeting (go/bm-link-spec).
   * @return value or {@code null} for none
   */
  public java.lang.String getAdLink() {
    return adLink;
  }

  /**
   * Output only. The ad link corresponding to this greeting (go/bm-link-spec).
   * @param adLink adLink or {@code null} for none
   */
  @com.google.errorprone.annotations.CanIgnoreReturnValue
  public Greeting setAdLink(java.lang.String adLink) {
    this.adLink = adLink;
    return this;
  }

  /**
   * Optional. Details about the conversation starters. Maximum 5.
   * @return value or {@code null} for none
   */
  public java.util.List<ConversationStarters> getConversationStarters() {
    return conversationStarters;
  }

  /**
   * Optional. Details about the conversation starters. Maximum 5.
   * @param conversationStarters conversationStarters or {@code null} for none
   */
  @com.google.errorprone.annotations.CanIgnoreReturnValue
  public Greeting setConversationStarters(java.util.List<ConversationStarters> conversationStarters) {
    this.conversationStarters = conversationStarters;
    return this;
  }

  /**
   * Optional. A custom identifier defined by the partner.
   * @return value or {@code null} for none
   */
  public java.lang.String getCustomId() {
    return customId;
  }

  /**
   * Optional. A custom identifier defined by the partner.
   * @param customId customId or {@code null} for none
   */
  @com.google.errorprone.annotations.CanIgnoreReturnValue
  public Greeting setCustomId(java.lang.String customId) {
    this.customId = customId;
    return this;
  }

  /**
   * Required. The locale is a well-formed IETF BCP 47 language tag. It must match a locale defined
   * in {@link ConversationalSettings}.
   * @return value or {@code null} for none
   */
  public java.lang.String getLocale() {
    return locale;
  }

  /**
   * Required. The locale is a well-formed IETF BCP 47 language tag. It must match a locale defined
   * in {@link ConversationalSettings}.
   * @param locale locale or {@code null} for none
   */
  @com.google.errorprone.annotations.CanIgnoreReturnValue
  public Greeting setLocale(java.lang.String locale) {
    this.locale = locale;
    return this;
  }

  /**
   * Output only. The name of the greeting, as set by Business Messages. Resolves to
   * "brands/{brand_id}/agents/{agent_id}/greetings/{greeting_id}" where {greeting_id} is the unique
   * ID of the greeting.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. The name of the greeting, as set by Business Messages. Resolves to
   * "brands/{brand_id}/agents/{agent_id}/greetings/{greeting_id}" where {greeting_id} is the unique
   * ID of the greeting.
   * @param name name or {@code null} for none
   */
  @com.google.errorprone.annotations.CanIgnoreReturnValue
  public Greeting setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Required. Welcome message content. A greeting must have at least one welcome message defined.
   * @return value or {@code null} for none
   */
  public java.util.List<WelcomeMessage> getWelcomeMessages() {
    return welcomeMessages;
  }

  /**
   * Required. Welcome message content. A greeting must have at least one welcome message defined.
   * @param welcomeMessages welcomeMessages or {@code null} for none
   */
  @com.google.errorprone.annotations.CanIgnoreReturnValue
  public Greeting setWelcomeMessages(java.util.List<WelcomeMessage> welcomeMessages) {
    this.welcomeMessages = welcomeMessages;
    return this;
  }

  @Override
  public Greeting set(String fieldName, Object value) {
    return (Greeting) super.set(fieldName, value);
  }

  @Override
  public Greeting clone() {
    return (Greeting) super.clone();
  }

}
