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
 * A suggestion within a chip list.
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
public final class GoogleCommunicationsBusinessmessagesV1Suggestion extends com.google.api.client.json.GenericJson {

  /**
   * A suggested action that initiates a native action on the device.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCommunicationsBusinessmessagesV1SuggestedAction action;

  /**
   * A request to start authentication flow.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCommunicationsBusinessmessagesV1AuthenticationRequest authenticationRequest;

  /**
   * A request to have a live agent join the conversation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCommunicationsBusinessmessagesV1LiveAgentRequest liveAgentRequest;

  /**
   * A suggestion for the user to reply with specified text.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCommunicationsBusinessmessagesV1SuggestedReply reply;

  /**
   * A suggested action that initiates a native action on the device.
   * @return value or {@code null} for none
   */
  public GoogleCommunicationsBusinessmessagesV1SuggestedAction getAction() {
    return action;
  }

  /**
   * A suggested action that initiates a native action on the device.
   * @param action action or {@code null} for none
   */
  @com.google.errorprone.annotations.CanIgnoreReturnValue
  public GoogleCommunicationsBusinessmessagesV1Suggestion setAction(GoogleCommunicationsBusinessmessagesV1SuggestedAction action) {
    this.action = action;
    return this;
  }

  /**
   * A request to start authentication flow.
   * @return value or {@code null} for none
   */
  public GoogleCommunicationsBusinessmessagesV1AuthenticationRequest getAuthenticationRequest() {
    return authenticationRequest;
  }

  /**
   * A request to start authentication flow.
   * @param authenticationRequest authenticationRequest or {@code null} for none
   */
  @com.google.errorprone.annotations.CanIgnoreReturnValue
  public GoogleCommunicationsBusinessmessagesV1Suggestion setAuthenticationRequest(GoogleCommunicationsBusinessmessagesV1AuthenticationRequest authenticationRequest) {
    this.authenticationRequest = authenticationRequest;
    return this;
  }

  /**
   * A request to have a live agent join the conversation.
   * @return value or {@code null} for none
   */
  public GoogleCommunicationsBusinessmessagesV1LiveAgentRequest getLiveAgentRequest() {
    return liveAgentRequest;
  }

  /**
   * A request to have a live agent join the conversation.
   * @param liveAgentRequest liveAgentRequest or {@code null} for none
   */
  @com.google.errorprone.annotations.CanIgnoreReturnValue
  public GoogleCommunicationsBusinessmessagesV1Suggestion setLiveAgentRequest(GoogleCommunicationsBusinessmessagesV1LiveAgentRequest liveAgentRequest) {
    this.liveAgentRequest = liveAgentRequest;
    return this;
  }

  /**
   * A suggestion for the user to reply with specified text.
   * @return value or {@code null} for none
   */
  public GoogleCommunicationsBusinessmessagesV1SuggestedReply getReply() {
    return reply;
  }

  /**
   * A suggestion for the user to reply with specified text.
   * @param reply reply or {@code null} for none
   */
  @com.google.errorprone.annotations.CanIgnoreReturnValue
  public GoogleCommunicationsBusinessmessagesV1Suggestion setReply(GoogleCommunicationsBusinessmessagesV1SuggestedReply reply) {
    this.reply = reply;
    return this;
  }

  @Override
  public GoogleCommunicationsBusinessmessagesV1Suggestion set(String fieldName, Object value) {
    return (GoogleCommunicationsBusinessmessagesV1Suggestion) super.set(fieldName, value);
  }

  @Override
  public GoogleCommunicationsBusinessmessagesV1Suggestion clone() {
    return (GoogleCommunicationsBusinessmessagesV1Suggestion) super.clone();
  }

}
