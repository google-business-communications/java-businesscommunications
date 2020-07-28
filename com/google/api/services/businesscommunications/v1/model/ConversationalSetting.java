/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/*
 * This code was generated by https://github.com/google/apis-client-generator/
 * (build: 2020-07-27 19:09:43 EDT)
 * on 2020-07-27 at 23:09:44 UTC 
 * Modify at your own risk.
 */

package com.google.api.services.businesscommunications.v1.model;

/**
 * Conversational setting for an agent.
 *
 * Each locale has its own conversational settings. Locale is represented by a well-formed [IETF BCP
 * 47](https://tools.ietf.org/html/bcp47) language tag.
 *
 * Note: Currently, Business Messages only supports the "en" locale.
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
public final class ConversationalSetting extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Details about the agent's conversation starters. Maximum 5.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ConversationStarters> conversationStarters;

  /**
   * Required. Details about the agent's privacy policy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PrivacyPolicy privacyPolicy;

  /**
   * Required. Details about the welcome message for an agent.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private WelcomeMessage welcomeMessage;

  /**
   * Optional. Details about the agent's conversation starters. Maximum 5.
   * @return value or {@code null} for none
   */
  public java.util.List<ConversationStarters> getConversationStarters() {
    return conversationStarters;
  }

  /**
   * Optional. Details about the agent's conversation starters. Maximum 5.
   * @param conversationStarters conversationStarters or {@code null} for none
   */
  public ConversationalSetting setConversationStarters(java.util.List<ConversationStarters> conversationStarters) {
    this.conversationStarters = conversationStarters;
    return this;
  }

  /**
   * Required. Details about the agent's privacy policy.
   * @return value or {@code null} for none
   */
  public PrivacyPolicy getPrivacyPolicy() {
    return privacyPolicy;
  }

  /**
   * Required. Details about the agent's privacy policy.
   * @param privacyPolicy privacyPolicy or {@code null} for none
   */
  public ConversationalSetting setPrivacyPolicy(PrivacyPolicy privacyPolicy) {
    this.privacyPolicy = privacyPolicy;
    return this;
  }

  /**
   * Required. Details about the welcome message for an agent.
   * @return value or {@code null} for none
   */
  public WelcomeMessage getWelcomeMessage() {
    return welcomeMessage;
  }

  /**
   * Required. Details about the welcome message for an agent.
   * @param welcomeMessage welcomeMessage or {@code null} for none
   */
  public ConversationalSetting setWelcomeMessage(WelcomeMessage welcomeMessage) {
    this.welcomeMessage = welcomeMessage;
    return this;
  }

  @Override
  public ConversationalSetting set(String fieldName, Object value) {
    return (ConversationalSetting) super.set(fieldName, value);
  }

  @Override
  public ConversationalSetting clone() {
    return (ConversationalSetting) super.clone();
  }

}
