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
 * A suggested reply.
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
public final class Suggestion extends com.google.api.client.json.GenericJson {

  /**
   * A suggested action that initiates a native action on the device.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SuggestedAction action;

  /**
   * Users can tap a suggested reply to send the text back to the agent as a reply.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SuggestedReply reply;

  /**
   * A suggested action that initiates a native action on the device.
   * @return value or {@code null} for none
   */
  public SuggestedAction getAction() {
    return action;
  }

  /**
   * A suggested action that initiates a native action on the device.
   * @param action action or {@code null} for none
   */
  @com.google.errorprone.annotations.CanIgnoreReturnValue
  public Suggestion setAction(SuggestedAction action) {
    this.action = action;
    return this;
  }

  /**
   * Users can tap a suggested reply to send the text back to the agent as a reply.
   * @return value or {@code null} for none
   */
  public SuggestedReply getReply() {
    return reply;
  }

  /**
   * Users can tap a suggested reply to send the text back to the agent as a reply.
   * @param reply reply or {@code null} for none
   */
  @com.google.errorprone.annotations.CanIgnoreReturnValue
  public Suggestion setReply(SuggestedReply reply) {
    this.reply = reply;
    return this;
  }

  @Override
  public Suggestion set(String fieldName, Object value) {
    return (Suggestion) super.set(fieldName, value);
  }

  @Override
  public Suggestion clone() {
    return (Suggestion) super.clone();
  }

}
