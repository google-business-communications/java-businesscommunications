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
 * A knowledge base document. A document can be either a website URL or a URL to a CSV file. URLs
 * must be publicly available. CSV files must contain one or more question/answer pairs, with one
 * row for each pair.
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
public final class DialogflowDocument extends com.google.api.client.json.GenericJson {

  /**
   * Required. Display name of a FAQ document.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * URL of a FAQ document.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String faqUrl;

  /**
   * System-generated Document ID. If the brand identifier is "1234", the agent identifier is
   * "5678", the integration identifier is "9092", the knowledge base identifier is "1111", and the
   * document identifier is "2222", this parameter resolves to
   * "brands/1234/agents/5678/integrations/9092/knowledgebases/1111/documents/2222".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. Operation Information is populated only when a document is added to an existing
   * knowledge base.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private OperationInfo operationInfo;

  /**
   * The raw content of the document.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String rawContent;

  /**
   * Output only. Time at which the document was created/updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Required. Display name of a FAQ document.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Required. Display name of a FAQ document.
   * @param displayName displayName or {@code null} for none
   */
  @com.google.errorprone.annotations.CanIgnoreReturnValue
  public DialogflowDocument setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * URL of a FAQ document.
   * @return value or {@code null} for none
   */
  public java.lang.String getFaqUrl() {
    return faqUrl;
  }

  /**
   * URL of a FAQ document.
   * @param faqUrl faqUrl or {@code null} for none
   */
  @com.google.errorprone.annotations.CanIgnoreReturnValue
  public DialogflowDocument setFaqUrl(java.lang.String faqUrl) {
    this.faqUrl = faqUrl;
    return this;
  }

  /**
   * System-generated Document ID. If the brand identifier is "1234", the agent identifier is
   * "5678", the integration identifier is "9092", the knowledge base identifier is "1111", and the
   * document identifier is "2222", this parameter resolves to
   * "brands/1234/agents/5678/integrations/9092/knowledgebases/1111/documents/2222".
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * System-generated Document ID. If the brand identifier is "1234", the agent identifier is
   * "5678", the integration identifier is "9092", the knowledge base identifier is "1111", and the
   * document identifier is "2222", this parameter resolves to
   * "brands/1234/agents/5678/integrations/9092/knowledgebases/1111/documents/2222".
   * @param name name or {@code null} for none
   */
  @com.google.errorprone.annotations.CanIgnoreReturnValue
  public DialogflowDocument setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. Operation Information is populated only when a document is added to an existing
   * knowledge base.
   * @return value or {@code null} for none
   */
  public OperationInfo getOperationInfo() {
    return operationInfo;
  }

  /**
   * Output only. Operation Information is populated only when a document is added to an existing
   * knowledge base.
   * @param operationInfo operationInfo or {@code null} for none
   */
  @com.google.errorprone.annotations.CanIgnoreReturnValue
  public DialogflowDocument setOperationInfo(OperationInfo operationInfo) {
    this.operationInfo = operationInfo;
    return this;
  }

  /**
   * The raw content of the document.
   * @see #decodeRawContent()
   * @return value or {@code null} for none
   */
  public java.lang.String getRawContent() {
    return rawContent;
  }

  /**
   * The raw content of the document.
   * @see #getRawContent()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeRawContent() {
    return com.google.api.client.util.Base64.decodeBase64(rawContent);
  }

  /**
   * The raw content of the document.
   * @see #encodeRawContent()
   * @param rawContent rawContent or {@code null} for none
   */
  @com.google.errorprone.annotations.CanIgnoreReturnValue
  public DialogflowDocument setRawContent(java.lang.String rawContent) {
    this.rawContent = rawContent;
    return this;
  }

  /**
   * The raw content of the document.
   * @see #setRawContent()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  @com.google.errorprone.annotations.CanIgnoreReturnValue
  public DialogflowDocument encodeRawContent(byte[] rawContent) {
    this.rawContent = com.google.api.client.util.Base64.encodeBase64URLSafeString(rawContent);
    return this;
  }

  /**
   * Output only. Time at which the document was created/updated.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. Time at which the document was created/updated.
   * @param updateTime updateTime or {@code null} for none
   */
  @com.google.errorprone.annotations.CanIgnoreReturnValue
  public DialogflowDocument setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public DialogflowDocument set(String fieldName, Object value) {
    return (DialogflowDocument) super.set(fieldName, value);
  }

  @Override
  public DialogflowDocument clone() {
    return (DialogflowDocument) super.clone();
  }

}
