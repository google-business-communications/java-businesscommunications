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
 * Response for ListIntegrations.
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
public final class ListIntegrationsResponse extends com.google.api.client.json.GenericJson {

  /**
   * List of integrations.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Integration> integrations;

  static {
    // hack to force ProGuard to consider Integration used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Integration.class);
  }

  /**
   * Currently this field is unsupported because the number of agent-level integrations is too few
   * for pagination to be needed. The pagination token to retrieve the next page of results. If the
   * value is "", it means no further results for the request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * List of integrations.
   * @return value or {@code null} for none
   */
  public java.util.List<Integration> getIntegrations() {
    return integrations;
  }

  /**
   * List of integrations.
   * @param integrations integrations or {@code null} for none
   */
  @com.google.errorprone.annotations.CanIgnoreReturnValue
  public ListIntegrationsResponse setIntegrations(java.util.List<Integration> integrations) {
    this.integrations = integrations;
    return this;
  }

  /**
   * Currently this field is unsupported because the number of agent-level integrations is too few
   * for pagination to be needed. The pagination token to retrieve the next page of results. If the
   * value is "", it means no further results for the request.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * Currently this field is unsupported because the number of agent-level integrations is too few
   * for pagination to be needed. The pagination token to retrieve the next page of results. If the
   * value is "", it means no further results for the request.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  @com.google.errorprone.annotations.CanIgnoreReturnValue
  public ListIntegrationsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public ListIntegrationsResponse set(String fieldName, Object value) {
    return (ListIntegrationsResponse) super.set(fieldName, value);
  }

  @Override
  public ListIntegrationsResponse clone() {
    return (ListIntegrationsResponse) super.clone();
  }

}
