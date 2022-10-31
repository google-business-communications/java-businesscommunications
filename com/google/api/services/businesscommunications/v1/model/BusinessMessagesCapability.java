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
 * Business Messages capabilities
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
public final class BusinessMessagesCapability extends com.google.api.client.json.GenericJson {

  /**
   * Required. The webhook URL where the messages are delivered.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String webhookUrl;

  /**
   * Required. The webhook URL where the messages are delivered.
   * @return value or {@code null} for none
   */
  public java.lang.String getWebhookUrl() {
    return webhookUrl;
  }

  /**
   * Required. The webhook URL where the messages are delivered.
   * @param webhookUrl webhookUrl or {@code null} for none
   */
  @com.google.errorprone.annotations.CanIgnoreReturnValue
  public BusinessMessagesCapability setWebhookUrl(java.lang.String webhookUrl) {
    this.webhookUrl = webhookUrl;
    return this;
  }

  @Override
  public BusinessMessagesCapability set(String fieldName, Object value) {
    return (BusinessMessagesCapability) super.set(fieldName, value);
  }

  @Override
  public BusinessMessagesCapability clone() {
    return (BusinessMessagesCapability) super.clone();
  }

}
