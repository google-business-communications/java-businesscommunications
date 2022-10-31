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
 * Knowledge base information. A knowledge base can have multiple FAQ URLs.
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
public final class DialogflowKnowledgebase extends com.google.api.client.json.GenericJson {

  /**
   * Required. Knowledge base display name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Knowledge base documents. Optional
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<DialogflowDocument> documents;

  /**
   * Output only. Knowledgebase ID. Unique identifier returned by Dialogflow service after creation
   * of a knowledge base. If the brand identifier is "1234", the agent identifier is "5678", the
   * integration identifier is "9092", and the knowledge base identifier is "1111", this parameter
   * resolves to "brands/1234/agents/5678/integrations/9092/knowledgebases/1111".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. Time at which the knowledge base was created or updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Required. Knowledge base display name.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Required. Knowledge base display name.
   * @param displayName displayName or {@code null} for none
   */
  @com.google.errorprone.annotations.CanIgnoreReturnValue
  public DialogflowKnowledgebase setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Knowledge base documents. Optional
   * @return value or {@code null} for none
   */
  public java.util.List<DialogflowDocument> getDocuments() {
    return documents;
  }

  /**
   * Knowledge base documents. Optional
   * @param documents documents or {@code null} for none
   */
  @com.google.errorprone.annotations.CanIgnoreReturnValue
  public DialogflowKnowledgebase setDocuments(java.util.List<DialogflowDocument> documents) {
    this.documents = documents;
    return this;
  }

  /**
   * Output only. Knowledgebase ID. Unique identifier returned by Dialogflow service after creation
   * of a knowledge base. If the brand identifier is "1234", the agent identifier is "5678", the
   * integration identifier is "9092", and the knowledge base identifier is "1111", this parameter
   * resolves to "brands/1234/agents/5678/integrations/9092/knowledgebases/1111".
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. Knowledgebase ID. Unique identifier returned by Dialogflow service after creation
   * of a knowledge base. If the brand identifier is "1234", the agent identifier is "5678", the
   * integration identifier is "9092", and the knowledge base identifier is "1111", this parameter
   * resolves to "brands/1234/agents/5678/integrations/9092/knowledgebases/1111".
   * @param name name or {@code null} for none
   */
  @com.google.errorprone.annotations.CanIgnoreReturnValue
  public DialogflowKnowledgebase setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. Time at which the knowledge base was created or updated.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. Time at which the knowledge base was created or updated.
   * @param updateTime updateTime or {@code null} for none
   */
  @com.google.errorprone.annotations.CanIgnoreReturnValue
  public DialogflowKnowledgebase setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public DialogflowKnowledgebase set(String fieldName, Object value) {
    return (DialogflowKnowledgebase) super.set(fieldName, value);
  }

  @Override
  public DialogflowKnowledgebase clone() {
    return (DialogflowKnowledgebase) super.clone();
  }

}