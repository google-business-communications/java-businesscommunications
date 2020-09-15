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
 * (build: 2020-09-15 16:44:21 EDT)
 * on 2020-09-15 at 20:44:50 UTC 
 * Modify at your own risk.
 */

package com.google.api.services.businesscommunications.v1.model;

/**
 * Request to launch an agent.
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
public final class RequestAgentLaunchRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. The agent launch to create. Name and Launch status are ignored.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AgentLaunch agentLaunch;

  /**
   * Required. The agent launch to create. Name and Launch status are ignored.
   * @return value or {@code null} for none
   */
  public AgentLaunch getAgentLaunch() {
    return agentLaunch;
  }

  /**
   * Required. The agent launch to create. Name and Launch status are ignored.
   * @param agentLaunch agentLaunch or {@code null} for none
   */
  public RequestAgentLaunchRequest setAgentLaunch(AgentLaunch agentLaunch) {
    this.agentLaunch = agentLaunch;
    return this;
  }

  @Override
  public RequestAgentLaunchRequest set(String fieldName, Object value) {
    return (RequestAgentLaunchRequest) super.set(fieldName, value);
  }

  @Override
  public RequestAgentLaunchRequest clone() {
    return (RequestAgentLaunchRequest) super.clone();
  }

}
