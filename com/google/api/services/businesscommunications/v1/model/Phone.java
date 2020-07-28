/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/*
 * This code was generated by https://github.com/google/apis-client-generator/
 * (build: 2020-07-27 19:09:43 EDT)
 * on 2020-07-27 at 23:09:44 UTC 
 * Modify at your own risk.
 */

package com.google.api.services.businesscommunications.v1.model;

/**
 * Phone number.
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
public final class Phone extends com.google.api.client.json.GenericJson {

  /**
   * Required. Phone number in E.164 format. For example, "+12223334444".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String number;

  /**
   * Required. Phone number in E.164 format. For example, "+12223334444".
   * @return value or {@code null} for none
   */
  public java.lang.String getNumber() {
    return number;
  }

  /**
   * Required. Phone number in E.164 format. For example, "+12223334444".
   * @param number number or {@code null} for none
   */
  public Phone setNumber(java.lang.String number) {
    this.number = number;
    return this;
  }

  @Override
  public Phone set(String fieldName, Object value) {
    return (Phone) super.set(fieldName, value);
  }

  @Override
  public Phone clone() {
    return (Phone) super.clone();
  }

}
