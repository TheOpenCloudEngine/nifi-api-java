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
import io.swagger.client.model.BatchSize;
import io.swagger.client.model.Position;


/**
 * VersionedRemoteGroupPort
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-11T13:57:19.352+09:00")
public class VersionedRemoteGroupPort   {
  @SerializedName("identifier")
  private String identifier = null;

  @SerializedName("instanceIdentifier")
  private String instanceIdentifier = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("comments")
  private String comments = null;

  @SerializedName("position")
  private Position position = null;

  @SerializedName("remoteGroupId")
  private String remoteGroupId = null;

  @SerializedName("concurrentlySchedulableTaskCount")
  private Integer concurrentlySchedulableTaskCount = null;

  @SerializedName("useCompression")
  private Boolean useCompression = null;

  @SerializedName("batchSize")
  private BatchSize batchSize = null;

  /**
   * Gets or Sets componentType
   */
  public enum ComponentTypeEnum {
    @SerializedName("CONNECTION")
    CONNECTION("CONNECTION"),
    
    @SerializedName("PROCESSOR")
    PROCESSOR("PROCESSOR"),
    
    @SerializedName("PROCESS_GROUP")
    PROCESS_GROUP("PROCESS_GROUP"),
    
    @SerializedName("REMOTE_PROCESS_GROUP")
    REMOTE_PROCESS_GROUP("REMOTE_PROCESS_GROUP"),
    
    @SerializedName("INPUT_PORT")
    INPUT_PORT("INPUT_PORT"),
    
    @SerializedName("OUTPUT_PORT")
    OUTPUT_PORT("OUTPUT_PORT"),
    
    @SerializedName("REMOTE_INPUT_PORT")
    REMOTE_INPUT_PORT("REMOTE_INPUT_PORT"),
    
    @SerializedName("REMOTE_OUTPUT_PORT")
    REMOTE_OUTPUT_PORT("REMOTE_OUTPUT_PORT"),
    
    @SerializedName("FUNNEL")
    FUNNEL("FUNNEL"),
    
    @SerializedName("LABEL")
    LABEL("LABEL"),
    
    @SerializedName("CONTROLLER_SERVICE")
    CONTROLLER_SERVICE("CONTROLLER_SERVICE"),
    
    @SerializedName("REPORTING_TASK")
    REPORTING_TASK("REPORTING_TASK"),
    
    @SerializedName("PARAMETER_CONTEXT")
    PARAMETER_CONTEXT("PARAMETER_CONTEXT"),
    
    @SerializedName("PARAMETER_PROVIDER")
    PARAMETER_PROVIDER("PARAMETER_PROVIDER"),
    
    @SerializedName("TEMPLATE")
    TEMPLATE("TEMPLATE"),
    
    @SerializedName("FLOW_REGISTRY_CLIENT")
    FLOW_REGISTRY_CLIENT("FLOW_REGISTRY_CLIENT");

    private String value;

    ComponentTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("componentType")
  private ComponentTypeEnum componentType = null;

  @SerializedName("targetId")
  private String targetId = null;

  /**
   * The scheduled state of the component
   */
  public enum ScheduledStateEnum {
    @SerializedName("ENABLED")
    ENABLED("ENABLED"),
    
    @SerializedName("DISABLED")
    DISABLED("DISABLED"),
    
    @SerializedName("RUNNING")
    RUNNING("RUNNING");

    private String value;

    ScheduledStateEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("scheduledState")
  private ScheduledStateEnum scheduledState = null;

  @SerializedName("groupIdentifier")
  private String groupIdentifier = null;

  public VersionedRemoteGroupPort identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

   /**
   * The component's unique identifier
   * @return identifier
  **/
  @ApiModelProperty(example = "null", value = "The component's unique identifier")
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public VersionedRemoteGroupPort instanceIdentifier(String instanceIdentifier) {
    this.instanceIdentifier = instanceIdentifier;
    return this;
  }

   /**
   * The instance ID of an existing component that is described by this VersionedComponent, or null if this is not mapped to an instantiated component
   * @return instanceIdentifier
  **/
  @ApiModelProperty(example = "null", value = "The instance ID of an existing component that is described by this VersionedComponent, or null if this is not mapped to an instantiated component")
  public String getInstanceIdentifier() {
    return instanceIdentifier;
  }

  public void setInstanceIdentifier(String instanceIdentifier) {
    this.instanceIdentifier = instanceIdentifier;
  }

  public VersionedRemoteGroupPort name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The component's name
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "The component's name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public VersionedRemoteGroupPort comments(String comments) {
    this.comments = comments;
    return this;
  }

   /**
   * The user-supplied comments for the component
   * @return comments
  **/
  @ApiModelProperty(example = "null", value = "The user-supplied comments for the component")
  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }

  public VersionedRemoteGroupPort position(Position position) {
    this.position = position;
    return this;
  }

   /**
   * The component's position on the graph
   * @return position
  **/
  @ApiModelProperty(example = "null", value = "The component's position on the graph")
  public Position getPosition() {
    return position;
  }

  public void setPosition(Position position) {
    this.position = position;
  }

  public VersionedRemoteGroupPort remoteGroupId(String remoteGroupId) {
    this.remoteGroupId = remoteGroupId;
    return this;
  }

   /**
   * The id of the remote process group that the port resides in.
   * @return remoteGroupId
  **/
  @ApiModelProperty(example = "null", value = "The id of the remote process group that the port resides in.")
  public String getRemoteGroupId() {
    return remoteGroupId;
  }

  public void setRemoteGroupId(String remoteGroupId) {
    this.remoteGroupId = remoteGroupId;
  }

  public VersionedRemoteGroupPort concurrentlySchedulableTaskCount(Integer concurrentlySchedulableTaskCount) {
    this.concurrentlySchedulableTaskCount = concurrentlySchedulableTaskCount;
    return this;
  }

   /**
   * The number of task that may transmit flowfiles to the target port concurrently.
   * @return concurrentlySchedulableTaskCount
  **/
  @ApiModelProperty(example = "null", value = "The number of task that may transmit flowfiles to the target port concurrently.")
  public Integer getConcurrentlySchedulableTaskCount() {
    return concurrentlySchedulableTaskCount;
  }

  public void setConcurrentlySchedulableTaskCount(Integer concurrentlySchedulableTaskCount) {
    this.concurrentlySchedulableTaskCount = concurrentlySchedulableTaskCount;
  }

  public VersionedRemoteGroupPort useCompression(Boolean useCompression) {
    this.useCompression = useCompression;
    return this;
  }

   /**
   * Whether the flowfiles are compressed when sent to the target port.
   * @return useCompression
  **/
  @ApiModelProperty(example = "null", value = "Whether the flowfiles are compressed when sent to the target port.")
  public Boolean getUseCompression() {
    return useCompression;
  }

  public void setUseCompression(Boolean useCompression) {
    this.useCompression = useCompression;
  }

  public VersionedRemoteGroupPort batchSize(BatchSize batchSize) {
    this.batchSize = batchSize;
    return this;
  }

   /**
   * The batch settings for data transmission.
   * @return batchSize
  **/
  @ApiModelProperty(example = "null", value = "The batch settings for data transmission.")
  public BatchSize getBatchSize() {
    return batchSize;
  }

  public void setBatchSize(BatchSize batchSize) {
    this.batchSize = batchSize;
  }

  public VersionedRemoteGroupPort componentType(ComponentTypeEnum componentType) {
    this.componentType = componentType;
    return this;
  }

   /**
   * Get componentType
   * @return componentType
  **/
  @ApiModelProperty(example = "null", value = "")
  public ComponentTypeEnum getComponentType() {
    return componentType;
  }

  public void setComponentType(ComponentTypeEnum componentType) {
    this.componentType = componentType;
  }

  public VersionedRemoteGroupPort targetId(String targetId) {
    this.targetId = targetId;
    return this;
  }

   /**
   * The ID of the port on the target NiFi instance
   * @return targetId
  **/
  @ApiModelProperty(example = "null", value = "The ID of the port on the target NiFi instance")
  public String getTargetId() {
    return targetId;
  }

  public void setTargetId(String targetId) {
    this.targetId = targetId;
  }

  public VersionedRemoteGroupPort scheduledState(ScheduledStateEnum scheduledState) {
    this.scheduledState = scheduledState;
    return this;
  }

   /**
   * The scheduled state of the component
   * @return scheduledState
  **/
  @ApiModelProperty(example = "null", value = "The scheduled state of the component")
  public ScheduledStateEnum getScheduledState() {
    return scheduledState;
  }

  public void setScheduledState(ScheduledStateEnum scheduledState) {
    this.scheduledState = scheduledState;
  }

  public VersionedRemoteGroupPort groupIdentifier(String groupIdentifier) {
    this.groupIdentifier = groupIdentifier;
    return this;
  }

   /**
   * The ID of the Process Group that this component belongs to
   * @return groupIdentifier
  **/
  @ApiModelProperty(example = "null", value = "The ID of the Process Group that this component belongs to")
  public String getGroupIdentifier() {
    return groupIdentifier;
  }

  public void setGroupIdentifier(String groupIdentifier) {
    this.groupIdentifier = groupIdentifier;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VersionedRemoteGroupPort versionedRemoteGroupPort = (VersionedRemoteGroupPort) o;
    return Objects.equals(this.identifier, versionedRemoteGroupPort.identifier) &&
        Objects.equals(this.instanceIdentifier, versionedRemoteGroupPort.instanceIdentifier) &&
        Objects.equals(this.name, versionedRemoteGroupPort.name) &&
        Objects.equals(this.comments, versionedRemoteGroupPort.comments) &&
        Objects.equals(this.position, versionedRemoteGroupPort.position) &&
        Objects.equals(this.remoteGroupId, versionedRemoteGroupPort.remoteGroupId) &&
        Objects.equals(this.concurrentlySchedulableTaskCount, versionedRemoteGroupPort.concurrentlySchedulableTaskCount) &&
        Objects.equals(this.useCompression, versionedRemoteGroupPort.useCompression) &&
        Objects.equals(this.batchSize, versionedRemoteGroupPort.batchSize) &&
        Objects.equals(this.componentType, versionedRemoteGroupPort.componentType) &&
        Objects.equals(this.targetId, versionedRemoteGroupPort.targetId) &&
        Objects.equals(this.scheduledState, versionedRemoteGroupPort.scheduledState) &&
        Objects.equals(this.groupIdentifier, versionedRemoteGroupPort.groupIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifier, instanceIdentifier, name, comments, position, remoteGroupId, concurrentlySchedulableTaskCount, useCompression, batchSize, componentType, targetId, scheduledState, groupIdentifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionedRemoteGroupPort {\n");
    
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    instanceIdentifier: ").append(toIndentedString(instanceIdentifier)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    remoteGroupId: ").append(toIndentedString(remoteGroupId)).append("\n");
    sb.append("    concurrentlySchedulableTaskCount: ").append(toIndentedString(concurrentlySchedulableTaskCount)).append("\n");
    sb.append("    useCompression: ").append(toIndentedString(useCompression)).append("\n");
    sb.append("    batchSize: ").append(toIndentedString(batchSize)).append("\n");
    sb.append("    componentType: ").append(toIndentedString(componentType)).append("\n");
    sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
    sb.append("    scheduledState: ").append(toIndentedString(scheduledState)).append("\n");
    sb.append("    groupIdentifier: ").append(toIndentedString(groupIdentifier)).append("\n");
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

