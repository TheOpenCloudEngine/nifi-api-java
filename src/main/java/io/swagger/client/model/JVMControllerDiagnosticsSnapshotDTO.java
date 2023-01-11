/**
 * NiFi Rest API
 * The Rest API provides programmatic access to command and control a NiFi instance in real time. Start and                                             stop processors, monitor queues, query provenance data, and more. Each endpoint below includes a description,                                             definitions of the expected input and output, potential response codes, and the authorizations required                                             to invoke each service.
 *
 * OpenAPI spec version: 1.19.1
 * Contact: dev@nifi.apache.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * JVMControllerDiagnosticsSnapshotDTO
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-11T13:57:19.352+09:00")
public class JVMControllerDiagnosticsSnapshotDTO   {
  @SerializedName("primaryNode")
  private Boolean primaryNode = null;

  @SerializedName("clusterCoordinator")
  private Boolean clusterCoordinator = null;

  @SerializedName("maxTimerDrivenThreads")
  private Integer maxTimerDrivenThreads = null;

  @SerializedName("maxEventDrivenThreads")
  private Integer maxEventDrivenThreads = null;

  public JVMControllerDiagnosticsSnapshotDTO primaryNode(Boolean primaryNode) {
    this.primaryNode = primaryNode;
    return this;
  }

   /**
   * Whether or not this node is primary node
   * @return primaryNode
  **/
  @ApiModelProperty(example = "null", value = "Whether or not this node is primary node")
  public Boolean getPrimaryNode() {
    return primaryNode;
  }

  public void setPrimaryNode(Boolean primaryNode) {
    this.primaryNode = primaryNode;
  }

  public JVMControllerDiagnosticsSnapshotDTO clusterCoordinator(Boolean clusterCoordinator) {
    this.clusterCoordinator = clusterCoordinator;
    return this;
  }

   /**
   * Whether or not this node is cluster coordinator
   * @return clusterCoordinator
  **/
  @ApiModelProperty(example = "null", value = "Whether or not this node is cluster coordinator")
  public Boolean getClusterCoordinator() {
    return clusterCoordinator;
  }

  public void setClusterCoordinator(Boolean clusterCoordinator) {
    this.clusterCoordinator = clusterCoordinator;
  }

  public JVMControllerDiagnosticsSnapshotDTO maxTimerDrivenThreads(Integer maxTimerDrivenThreads) {
    this.maxTimerDrivenThreads = maxTimerDrivenThreads;
    return this;
  }

   /**
   * The maximum number of timer-driven threads
   * @return maxTimerDrivenThreads
  **/
  @ApiModelProperty(example = "null", value = "The maximum number of timer-driven threads")
  public Integer getMaxTimerDrivenThreads() {
    return maxTimerDrivenThreads;
  }

  public void setMaxTimerDrivenThreads(Integer maxTimerDrivenThreads) {
    this.maxTimerDrivenThreads = maxTimerDrivenThreads;
  }

  public JVMControllerDiagnosticsSnapshotDTO maxEventDrivenThreads(Integer maxEventDrivenThreads) {
    this.maxEventDrivenThreads = maxEventDrivenThreads;
    return this;
  }

   /**
   * The maximum number of event-driven threads
   * @return maxEventDrivenThreads
  **/
  @ApiModelProperty(example = "null", value = "The maximum number of event-driven threads")
  public Integer getMaxEventDrivenThreads() {
    return maxEventDrivenThreads;
  }

  public void setMaxEventDrivenThreads(Integer maxEventDrivenThreads) {
    this.maxEventDrivenThreads = maxEventDrivenThreads;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JVMControllerDiagnosticsSnapshotDTO jVMControllerDiagnosticsSnapshotDTO = (JVMControllerDiagnosticsSnapshotDTO) o;
    return Objects.equals(this.primaryNode, jVMControllerDiagnosticsSnapshotDTO.primaryNode) &&
        Objects.equals(this.clusterCoordinator, jVMControllerDiagnosticsSnapshotDTO.clusterCoordinator) &&
        Objects.equals(this.maxTimerDrivenThreads, jVMControllerDiagnosticsSnapshotDTO.maxTimerDrivenThreads) &&
        Objects.equals(this.maxEventDrivenThreads, jVMControllerDiagnosticsSnapshotDTO.maxEventDrivenThreads);
  }

  @Override
  public int hashCode() {
    return Objects.hash(primaryNode, clusterCoordinator, maxTimerDrivenThreads, maxEventDrivenThreads);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JVMControllerDiagnosticsSnapshotDTO {\n");
    
    sb.append("    primaryNode: ").append(toIndentedString(primaryNode)).append("\n");
    sb.append("    clusterCoordinator: ").append(toIndentedString(clusterCoordinator)).append("\n");
    sb.append("    maxTimerDrivenThreads: ").append(toIndentedString(maxTimerDrivenThreads)).append("\n");
    sb.append("    maxEventDrivenThreads: ").append(toIndentedString(maxEventDrivenThreads)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

