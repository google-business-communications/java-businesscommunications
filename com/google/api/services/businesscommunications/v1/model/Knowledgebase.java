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
public final class Knowledgebase extends com.google.api.client.json.GenericJson {

  /**
   * Required. Knowledge base display name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Output only. Knowledge base documents.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Document> documents;

  /**
   * Output only. Knowledge base ID. Unique identifier returned by Dialogflow service, after
   * creation of a knowledge base. Format - projects//knowledgeBases/.
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
  public Knowledgebase setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Output only. Knowledge base documents.
   * @return value or {@code null} for none
   */
  public java.util.List<Document> getDocuments() {
    return documents;
  }

  /**
   * Output only. Knowledge base documents.
   * @param documents documents or {@code null} for none
   */
  @com.google.errorprone.annotations.CanIgnoreReturnValue
  public Knowledgebase setDocuments(java.util.List<Document> documents) {
    this.documents = documents;
    return this;
  }

  /**
   * Output only. Knowledge base ID. Unique identifier returned by Dialogflow service, after
   * creation of a knowledge base. Format - projects//knowledgeBases/.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. Knowledge base ID. Unique identifier returned by Dialogflow service, after
   * creation of a knowledge base. Format - projects//knowledgeBases/.
   * @param name name or {@code null} for none
   */
  @com.google.errorprone.annotations.CanIgnoreReturnValue
  public Knowledgebase setName(java.lang.String name) {
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
  public Knowledgebase setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public Knowledgebase set(String fieldName, Object value) {
    return (Knowledgebase) super.set(fieldName, value);
  }

  @Override
  public Knowledgebase clone() {
    return (Knowledgebase) super.clone();
  }

}
