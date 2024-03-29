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
 * Information about an associated Dialogflow project and knowledge base.
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
public final class DialogflowAssociation extends com.google.api.client.json.GenericJson {

  /**
   * Required. The Dialogflow project ID. Non-editable. To change this value, you must disassociate
   * the Dialogflow project from this agent, then create a new association.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dfProjectId;

  /**
   * Output only. The service account that must be configured in the Dialogflow project with the
   * "Dialogflow Console Agent Editor" role. This is required to provide access to the Dialogflow
   * API.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dfServiceAccountEmail;

  /**
   * If `true`, Business Messages automatically sends the Dialogflow responses to users.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableAutoResponse;

  /**
   * Output only. Knowledge bases associated with the Dialogflow project.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Knowledgebase> knowledgeBases;

  /**
   * Output only. The identifier for the Dialogflow association.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. The Dialogflow association operation information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private OperationInfo operationInfo;

  /**
   * Required. The Dialogflow project ID. Non-editable. To change this value, you must disassociate
   * the Dialogflow project from this agent, then create a new association.
   * @return value or {@code null} for none
   */
  public java.lang.String getDfProjectId() {
    return dfProjectId;
  }

  /**
   * Required. The Dialogflow project ID. Non-editable. To change this value, you must disassociate
   * the Dialogflow project from this agent, then create a new association.
   * @param dfProjectId dfProjectId or {@code null} for none
   */
  @com.google.errorprone.annotations.CanIgnoreReturnValue
  public DialogflowAssociation setDfProjectId(java.lang.String dfProjectId) {
    this.dfProjectId = dfProjectId;
    return this;
  }

  /**
   * Output only. The service account that must be configured in the Dialogflow project with the
   * "Dialogflow Console Agent Editor" role. This is required to provide access to the Dialogflow
   * API.
   * @return value or {@code null} for none
   */
  public java.lang.String getDfServiceAccountEmail() {
    return dfServiceAccountEmail;
  }

  /**
   * Output only. The service account that must be configured in the Dialogflow project with the
   * "Dialogflow Console Agent Editor" role. This is required to provide access to the Dialogflow
   * API.
   * @param dfServiceAccountEmail dfServiceAccountEmail or {@code null} for none
   */
  @com.google.errorprone.annotations.CanIgnoreReturnValue
  public DialogflowAssociation setDfServiceAccountEmail(java.lang.String dfServiceAccountEmail) {
    this.dfServiceAccountEmail = dfServiceAccountEmail;
    return this;
  }

  /**
   * If `true`, Business Messages automatically sends the Dialogflow responses to users.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableAutoResponse() {
    return enableAutoResponse;
  }

  /**
   * If `true`, Business Messages automatically sends the Dialogflow responses to users.
   * @param enableAutoResponse enableAutoResponse or {@code null} for none
   */
  @com.google.errorprone.annotations.CanIgnoreReturnValue
  public DialogflowAssociation setEnableAutoResponse(java.lang.Boolean enableAutoResponse) {
    this.enableAutoResponse = enableAutoResponse;
    return this;
  }

  /**
   * Output only. Knowledge bases associated with the Dialogflow project.
   * @return value or {@code null} for none
   */
  public java.util.List<Knowledgebase> getKnowledgeBases() {
    return knowledgeBases;
  }

  /**
   * Output only. Knowledge bases associated with the Dialogflow project.
   * @param knowledgeBases knowledgeBases or {@code null} for none
   */
  @com.google.errorprone.annotations.CanIgnoreReturnValue
  public DialogflowAssociation setKnowledgeBases(java.util.List<Knowledgebase> knowledgeBases) {
    this.knowledgeBases = knowledgeBases;
    return this;
  }

  /**
   * Output only. The identifier for the Dialogflow association.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. The identifier for the Dialogflow association.
   * @param name name or {@code null} for none
   */
  @com.google.errorprone.annotations.CanIgnoreReturnValue
  public DialogflowAssociation setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. The Dialogflow association operation information.
   * @return value or {@code null} for none
   */
  public OperationInfo getOperationInfo() {
    return operationInfo;
  }

  /**
   * Output only. The Dialogflow association operation information.
   * @param operationInfo operationInfo or {@code null} for none
   */
  @com.google.errorprone.annotations.CanIgnoreReturnValue
  public DialogflowAssociation setOperationInfo(OperationInfo operationInfo) {
    this.operationInfo = operationInfo;
    return this;
  }

  @Override
  public DialogflowAssociation set(String fieldName, Object value) {
    return (DialogflowAssociation) super.set(fieldName, value);
  }

  @Override
  public DialogflowAssociation clone() {
    return (DialogflowAssociation) super.clone();
  }

}
