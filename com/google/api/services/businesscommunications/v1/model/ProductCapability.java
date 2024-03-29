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
 * The product capabilities that the partner supports.
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
public final class ProductCapability extends com.google.api.client.json.GenericJson {

  /**
   * Business Messages capability.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BusinessMessagesCapability businessMessagesCapability;

  /**
   * The product supported by the partner.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String product;

  /**
   * Verified SMS capability.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private VerifiedSmsCapability verifiedSmsCapability;

  /**
   * Business Messages capability.
   * @return value or {@code null} for none
   */
  public BusinessMessagesCapability getBusinessMessagesCapability() {
    return businessMessagesCapability;
  }

  /**
   * Business Messages capability.
   * @param businessMessagesCapability businessMessagesCapability or {@code null} for none
   */
  @com.google.errorprone.annotations.CanIgnoreReturnValue
  public ProductCapability setBusinessMessagesCapability(BusinessMessagesCapability businessMessagesCapability) {
    this.businessMessagesCapability = businessMessagesCapability;
    return this;
  }

  /**
   * The product supported by the partner.
   * @return value or {@code null} for none
   */
  public java.lang.String getProduct() {
    return product;
  }

  /**
   * The product supported by the partner.
   * @param product product or {@code null} for none
   */
  @com.google.errorprone.annotations.CanIgnoreReturnValue
  public ProductCapability setProduct(java.lang.String product) {
    this.product = product;
    return this;
  }

  /**
   * Verified SMS capability.
   * @return value or {@code null} for none
   */
  public VerifiedSmsCapability getVerifiedSmsCapability() {
    return verifiedSmsCapability;
  }

  /**
   * Verified SMS capability.
   * @param verifiedSmsCapability verifiedSmsCapability or {@code null} for none
   */
  @com.google.errorprone.annotations.CanIgnoreReturnValue
  public ProductCapability setVerifiedSmsCapability(VerifiedSmsCapability verifiedSmsCapability) {
    this.verifiedSmsCapability = verifiedSmsCapability;
    return this;
  }

  @Override
  public ProductCapability set(String fieldName, Object value) {
    return (ProductCapability) super.set(fieldName, value);
  }

  @Override
  public ProductCapability clone() {
    return (ProductCapability) super.clone();
  }

}
