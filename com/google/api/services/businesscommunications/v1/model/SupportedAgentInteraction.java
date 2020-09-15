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
 * (build: 2020-09-15 16:44:21 EDT)
 * on 2020-09-15 at 20:44:50 UTC 
 * Modify at your own risk.
 */

package com.google.api.services.businesscommunications.v1.model;

/**
 * Interactions supported by an agent.
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
public final class SupportedAgentInteraction extends com.google.api.client.json.GenericJson {

  /**
   * Bot representative details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BotRepresentative botRepresentative;

  /**
   * Human representative details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private HumanRepresentative humanRepresentative;

  /**
   * Required. The type of interaction supported by the agent.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String interactionType;

  /**
   * Bot representative details.
   * @return value or {@code null} for none
   */
  public BotRepresentative getBotRepresentative() {
    return botRepresentative;
  }

  /**
   * Bot representative details.
   * @param botRepresentative botRepresentative or {@code null} for none
   */
  public SupportedAgentInteraction setBotRepresentative(BotRepresentative botRepresentative) {
    this.botRepresentative = botRepresentative;
    return this;
  }

  /**
   * Human representative details.
   * @return value or {@code null} for none
   */
  public HumanRepresentative getHumanRepresentative() {
    return humanRepresentative;
  }

  /**
   * Human representative details.
   * @param humanRepresentative humanRepresentative or {@code null} for none
   */
  public SupportedAgentInteraction setHumanRepresentative(HumanRepresentative humanRepresentative) {
    this.humanRepresentative = humanRepresentative;
    return this;
  }

  /**
   * Required. The type of interaction supported by the agent.
   * @return value or {@code null} for none
   */
  public java.lang.String getInteractionType() {
    return interactionType;
  }

  /**
   * Required. The type of interaction supported by the agent.
   * @param interactionType interactionType or {@code null} for none
   */
  public SupportedAgentInteraction setInteractionType(java.lang.String interactionType) {
    this.interactionType = interactionType;
    return this;
  }

  @Override
  public SupportedAgentInteraction set(String fieldName, Object value) {
    return (SupportedAgentInteraction) super.set(fieldName, value);
  }

  @Override
  public SupportedAgentInteraction clone() {
    return (SupportedAgentInteraction) super.clone();
  }

}
