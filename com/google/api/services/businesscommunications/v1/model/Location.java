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
 * (build: 2021-06-24 22:17:16 UTC)
 * on 2021-06-24 at 22:17:25 UTC 
 * Modify at your own risk.
 */

package com.google.api.services.businesscommunications.v1.model;

/**
 * Information about a physical location of a brand.
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
public final class Location extends com.google.api.client.json.GenericJson {

  /**
   * Required. The name of the agent associated with the location. If the brand identifier is "1234"
   * and the agent identifier is "5678", this field resolves to "brands/1234/agents/5678".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String agent;

  /**
   * Optional. Conversational settings for an location, mapped to a locale. Locale is represented by
   * a well-formed [IETF BCP 47](https://tools.ietf.org/html/bcp47) language tag.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, ConversationalSetting> conversationalSettings;

  static {
    // hack to force ProGuard to consider ConversationalSetting used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ConversationalSetting.class);
  }

  /**
   * Required. The default locale for the location.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String defaultLocale;

  /**
   * Output only. Identifies the Google My Business Listing this Location is associated with.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long listingId;

  /**
   * Required. List of entry point configurations for locations. Not modifiable after being
   * available to users through an agent.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<LocationEntryPointConfig> locationEntryPointConfigs;

  /**
   * Output only. The URL for testing the location's conversational experience. Defined by the
   * platform.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String locationTestUrl;

  /**
   * The unique identifier of the location. Read-only. Defined by the platform.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Required. The [Place ID](https://developers.google.com/places/place-id), or unique identifier
   * used in Google Maps, for the location. Not modifiable after being available to users through an
   * agent.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String placeId;

  /**
   * Output only. URLs for testing the location's conversational experience. Defined by the
   * platform.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<TestUrl> testUrls;

  static {
    // hack to force ProGuard to consider TestUrl used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(TestUrl.class);
  }

  /**
   * Required. The name of the agent associated with the location. If the brand identifier is "1234"
   * and the agent identifier is "5678", this field resolves to "brands/1234/agents/5678".
   * @return value or {@code null} for none
   */
  public java.lang.String getAgent() {
    return agent;
  }

  /**
   * Required. The name of the agent associated with the location. If the brand identifier is "1234"
   * and the agent identifier is "5678", this field resolves to "brands/1234/agents/5678".
   * @param agent agent or {@code null} for none
   */
  public Location setAgent(java.lang.String agent) {
    this.agent = agent;
    return this;
  }

  /**
   * Optional. Conversational settings for an location, mapped to a locale. Locale is represented by
   * a well-formed [IETF BCP 47](https://tools.ietf.org/html/bcp47) language tag.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, ConversationalSetting> getConversationalSettings() {
    return conversationalSettings;
  }

  /**
   * Optional. Conversational settings for an location, mapped to a locale. Locale is represented by
   * a well-formed [IETF BCP 47](https://tools.ietf.org/html/bcp47) language tag.
   * @param conversationalSettings conversationalSettings or {@code null} for none
   */
  public Location setConversationalSettings(java.util.Map<String, ConversationalSetting> conversationalSettings) {
    this.conversationalSettings = conversationalSettings;
    return this;
  }

  /**
   * Required. The default locale for the location.
   * @return value or {@code null} for none
   */
  public java.lang.String getDefaultLocale() {
    return defaultLocale;
  }

  /**
   * Required. The default locale for the location.
   * @param defaultLocale defaultLocale or {@code null} for none
   */
  public Location setDefaultLocale(java.lang.String defaultLocale) {
    this.defaultLocale = defaultLocale;
    return this;
  }

  /**
   * Output only. Identifies the Google My Business Listing this Location is associated with.
   * @return value or {@code null} for none
   */
  public java.lang.Long getListingId() {
    return listingId;
  }

  /**
   * Output only. Identifies the Google My Business Listing this Location is associated with.
   * @param listingId listingId or {@code null} for none
   */
  public Location setListingId(java.lang.Long listingId) {
    this.listingId = listingId;
    return this;
  }

  /**
   * Required. List of entry point configurations for locations. Not modifiable after being
   * available to users through an agent.
   * @return value or {@code null} for none
   */
  public java.util.List<LocationEntryPointConfig> getLocationEntryPointConfigs() {
    return locationEntryPointConfigs;
  }

  /**
   * Required. List of entry point configurations for locations. Not modifiable after being
   * available to users through an agent.
   * @param locationEntryPointConfigs locationEntryPointConfigs or {@code null} for none
   */
  public Location setLocationEntryPointConfigs(java.util.List<LocationEntryPointConfig> locationEntryPointConfigs) {
    this.locationEntryPointConfigs = locationEntryPointConfigs;
    return this;
  }

  /**
   * Output only. The URL for testing the location's conversational experience. Defined by the
   * platform.
   * @return value or {@code null} for none
   */
  public java.lang.String getLocationTestUrl() {
    return locationTestUrl;
  }

  /**
   * Output only. The URL for testing the location's conversational experience. Defined by the
   * platform.
   * @param locationTestUrl locationTestUrl or {@code null} for none
   */
  public Location setLocationTestUrl(java.lang.String locationTestUrl) {
    this.locationTestUrl = locationTestUrl;
    return this;
  }

  /**
   * The unique identifier of the location. Read-only. Defined by the platform.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The unique identifier of the location. Read-only. Defined by the platform.
   * @param name name or {@code null} for none
   */
  public Location setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Required. The [Place ID](https://developers.google.com/places/place-id), or unique identifier
   * used in Google Maps, for the location. Not modifiable after being available to users through an
   * agent.
   * @return value or {@code null} for none
   */
  public java.lang.String getPlaceId() {
    return placeId;
  }

  /**
   * Required. The [Place ID](https://developers.google.com/places/place-id), or unique identifier
   * used in Google Maps, for the location. Not modifiable after being available to users through an
   * agent.
   * @param placeId placeId or {@code null} for none
   */
  public Location setPlaceId(java.lang.String placeId) {
    this.placeId = placeId;
    return this;
  }

  /**
   * Output only. URLs for testing the location's conversational experience. Defined by the
   * platform.
   * @return value or {@code null} for none
   */
  public java.util.List<TestUrl> getTestUrls() {
    return testUrls;
  }

  /**
   * Output only. URLs for testing the location's conversational experience. Defined by the
   * platform.
   * @param testUrls testUrls or {@code null} for none
   */
  public Location setTestUrls(java.util.List<TestUrl> testUrls) {
    this.testUrls = testUrls;
    return this;
  }

  @Override
  public Location set(String fieldName, Object value) {
    return (Location) super.set(fieldName, value);
  }

  @Override
  public Location clone() {
    return (Location) super.clone();
  }

}
