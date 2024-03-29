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
 * Information about a Business Messages agent and Dialogflow ES project association.
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
public final class DialogflowEsIntegration extends com.google.api.client.json.GenericJson {

  /**
   * Required. If `ENABLED`, Business Messages automatically sends the Dialogflow responses to
   * users.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String autoResponseStatus;

  /**
   * Knowledge bases associated with the Dialogflow project. Optional
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<DialogflowKnowledgebase> dialogflowKnowledgeBases;

  /**
   * Required. The Dialogflow project ID. Non-editable. To change this value, you must delete the
   * Dialogflow project from this agent, then create a new integration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dialogflowProjectId;

  /**
   * Output only. The service account that must be configured in the Dialogflow project with the
   * "Dialogflow Console Agent Editor" and "Dialogflow API Client" roles. This is required to
   * provide access to the Dialogflow API.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dialogflowServiceAccountEmail;

  /**
   * Output only. Information about the operating state of the Dialogflow integration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private OperationInfo operationInfo;

  /**
   * Required. If `ENABLED`, Business Messages automatically sends the Dialogflow responses to
   * users.
   * @return value or {@code null} for none
   */
  public java.lang.String getAutoResponseStatus() {
    return autoResponseStatus;
  }

  /**
   * Required. If `ENABLED`, Business Messages automatically sends the Dialogflow responses to
   * users.
   * @param autoResponseStatus autoResponseStatus or {@code null} for none
   */
  @com.google.errorprone.annotations.CanIgnoreReturnValue
  public DialogflowEsIntegration setAutoResponseStatus(java.lang.String autoResponseStatus) {
    this.autoResponseStatus = autoResponseStatus;
    return this;
  }

  /**
   * Knowledge bases associated with the Dialogflow project. Optional
   * @return value or {@code null} for none
   */
  public java.util.List<DialogflowKnowledgebase> getDialogflowKnowledgeBases() {
    return dialogflowKnowledgeBases;
  }

  /**
   * Knowledge bases associated with the Dialogflow project. Optional
   * @param dialogflowKnowledgeBases dialogflowKnowledgeBases or {@code null} for none
   */
  @com.google.errorprone.annotations.CanIgnoreReturnValue
  public DialogflowEsIntegration setDialogflowKnowledgeBases(java.util.List<DialogflowKnowledgebase> dialogflowKnowledgeBases) {
    this.dialogflowKnowledgeBases = dialogflowKnowledgeBases;
    return this;
  }

  /**
   * Required. The Dialogflow project ID. Non-editable. To change this value, you must delete the
   * Dialogflow project from this agent, then create a new integration.
   * @return value or {@code null} for none
   */
  public java.lang.String getDialogflowProjectId() {
    return dialogflowProjectId;
  }

  /**
   * Required. The Dialogflow project ID. Non-editable. To change this value, you must delete the
   * Dialogflow project from this agent, then create a new integration.
   * @param dialogflowProjectId dialogflowProjectId or {@code null} for none
   */
  @com.google.errorprone.annotations.CanIgnoreReturnValue
  public DialogflowEsIntegration setDialogflowProjectId(java.lang.String dialogflowProjectId) {
    this.dialogflowProjectId = dialogflowProjectId;
    return this;
  }

  /**
   * Output only. The service account that must be configured in the Dialogflow project with the
   * "Dialogflow Console Agent Editor" and "Dialogflow API Client" roles. This is required to
   * provide access to the Dialogflow API.
   * @return value or {@code null} for none
   */
  public java.lang.String getDialogflowServiceAccountEmail() {
    return dialogflowServiceAccountEmail;
  }

  /**
   * Output only. The service account that must be configured in the Dialogflow project with the
   * "Dialogflow Console Agent Editor" and "Dialogflow API Client" roles. This is required to
   * provide access to the Dialogflow API.
   * @param dialogflowServiceAccountEmail dialogflowServiceAccountEmail or {@code null} for none
   */
  @com.google.errorprone.annotations.CanIgnoreReturnValue
  public DialogflowEsIntegration setDialogflowServiceAccountEmail(java.lang.String dialogflowServiceAccountEmail) {
    this.dialogflowServiceAccountEmail = dialogflowServiceAccountEmail;
    return this;
  }

  /**
   * Output only. Information about the operating state of the Dialogflow integration.
   * @return value or {@code null} for none
   */
  public OperationInfo getOperationInfo() {
    return operationInfo;
  }

  /**
   * Output only. Information about the operating state of the Dialogflow integration.
   * @param operationInfo operationInfo or {@code null} for none
   */
  @com.google.errorprone.annotations.CanIgnoreReturnValue
  public DialogflowEsIntegration setOperationInfo(OperationInfo operationInfo) {
    this.operationInfo = operationInfo;
    return this;
  }

  @Override
  public DialogflowEsIntegration set(String fieldName, Object value) {
    return (DialogflowEsIntegration) super.set(fieldName, value);
  }

  @Override
  public DialogflowEsIntegration clone() {
    return (DialogflowEsIntegration) super.clone();
  }

}
