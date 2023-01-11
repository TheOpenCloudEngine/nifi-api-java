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
import io.swagger.client.model.ConnectableComponent;
import io.swagger.client.model.Position;
import java.util.ArrayList;
import java.util.List;


/**
 * VersionedConnection
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-11T13:57:19.352+09:00")
public class VersionedConnection   {
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

  @SerializedName("source")
  private ConnectableComponent source = null;

  @SerializedName("destination")
  private ConnectableComponent destination = null;

  @SerializedName("labelIndex")
  private Integer labelIndex = null;

  @SerializedName("zIndex")
  private Long zIndex = null;

  @SerializedName("selectedRelationships")
  private List<String> selectedRelationships = new ArrayList<String>();

  @SerializedName("backPressureObjectThreshold")
  private Long backPressureObjectThreshold = null;

  @SerializedName("backPressureDataSizeThreshold")
  private String backPressureDataSizeThreshold = null;

  @SerializedName("flowFileExpiration")
  private String flowFileExpiration = null;

  @SerializedName("prioritizers")
  private List<String> prioritizers = new ArrayList<String>();

  @SerializedName("bends")
  private List<Position> bends = new ArrayList<Position>();

  /**
   * The Strategy to use for load balancing data across the cluster, or null, if no Load Balance Strategy has been specified.
   */
  public enum LoadBalanceStrategyEnum {
    @SerializedName("DO_NOT_LOAD_BALANCE")
    DO_NOT_LOAD_BALANCE("DO_NOT_LOAD_BALANCE"),
    
    @SerializedName("PARTITION_BY_ATTRIBUTE")
    PARTITION_BY_ATTRIBUTE("PARTITION_BY_ATTRIBUTE"),
    
    @SerializedName("ROUND_ROBIN")
    ROUND_ROBIN("ROUND_ROBIN"),
    
    @SerializedName("SINGLE_NODE")
    SINGLE_NODE("SINGLE_NODE");

    private String value;

    LoadBalanceStrategyEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("loadBalanceStrategy")
  private LoadBalanceStrategyEnum loadBalanceStrategy = null;

  @SerializedName("partitioningAttribute")
  private String partitioningAttribute = null;

  /**
   * Whether or not compression should be used when transferring FlowFiles between nodes
   */
  public enum LoadBalanceCompressionEnum {
    @SerializedName("DO_NOT_COMPRESS")
    DO_NOT_COMPRESS("DO_NOT_COMPRESS"),
    
    @SerializedName("COMPRESS_ATTRIBUTES_ONLY")
    COMPRESS_ATTRIBUTES_ONLY("COMPRESS_ATTRIBUTES_ONLY"),
    
    @SerializedName("COMPRESS_ATTRIBUTES_AND_CONTENT")
    COMPRESS_ATTRIBUTES_AND_CONTENT("COMPRESS_ATTRIBUTES_AND_CONTENT");

    private String value;

    LoadBalanceCompressionEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("loadBalanceCompression")
  private LoadBalanceCompressionEnum loadBalanceCompression = null;

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

  @SerializedName("groupIdentifier")
  private String groupIdentifier = null;

  public VersionedConnection identifier(String identifier) {
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

  public VersionedConnection instanceIdentifier(String instanceIdentifier) {
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

  public VersionedConnection name(String name) {
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

  public VersionedConnection comments(String comments) {
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

  public VersionedConnection position(Position position) {
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

  public VersionedConnection source(ConnectableComponent source) {
    this.source = source;
    return this;
  }

   /**
   * The source of the connection.
   * @return source
  **/
  @ApiModelProperty(example = "null", value = "The source of the connection.")
  public ConnectableComponent getSource() {
    return source;
  }

  public void setSource(ConnectableComponent source) {
    this.source = source;
  }

  public VersionedConnection destination(ConnectableComponent destination) {
    this.destination = destination;
    return this;
  }

   /**
   * The destination of the connection.
   * @return destination
  **/
  @ApiModelProperty(example = "null", value = "The destination of the connection.")
  public ConnectableComponent getDestination() {
    return destination;
  }

  public void setDestination(ConnectableComponent destination) {
    this.destination = destination;
  }

  public VersionedConnection labelIndex(Integer labelIndex) {
    this.labelIndex = labelIndex;
    return this;
  }

   /**
   * The index of the bend point where to place the connection label.
   * @return labelIndex
  **/
  @ApiModelProperty(example = "null", value = "The index of the bend point where to place the connection label.")
  public Integer getLabelIndex() {
    return labelIndex;
  }

  public void setLabelIndex(Integer labelIndex) {
    this.labelIndex = labelIndex;
  }

  public VersionedConnection zIndex(Long zIndex) {
    this.zIndex = zIndex;
    return this;
  }

   /**
   * The z index of the connection.
   * @return zIndex
  **/
  @ApiModelProperty(example = "null", value = "The z index of the connection.")
  public Long getZIndex() {
    return zIndex;
  }

  public void setZIndex(Long zIndex) {
    this.zIndex = zIndex;
  }

  public VersionedConnection selectedRelationships(List<String> selectedRelationships) {
    this.selectedRelationships = selectedRelationships;
    return this;
  }

  public VersionedConnection addSelectedRelationshipsItem(String selectedRelationshipsItem) {
    this.selectedRelationships.add(selectedRelationshipsItem);
    return this;
  }

   /**
   * The selected relationship that comprise the connection.
   * @return selectedRelationships
  **/
  @ApiModelProperty(example = "null", value = "The selected relationship that comprise the connection.")
  public List<String> getSelectedRelationships() {
    return selectedRelationships;
  }

  public void setSelectedRelationships(List<String> selectedRelationships) {
    this.selectedRelationships = selectedRelationships;
  }

  public VersionedConnection backPressureObjectThreshold(Long backPressureObjectThreshold) {
    this.backPressureObjectThreshold = backPressureObjectThreshold;
    return this;
  }

   /**
   * The object count threshold for determining when back pressure is applied. Updating this value is a passive change in the sense that it won't impact whether existing files over the limit are affected but it does help feeder processors to stop pushing too much into this work queue.
   * @return backPressureObjectThreshold
  **/
  @ApiModelProperty(example = "null", value = "The object count threshold for determining when back pressure is applied. Updating this value is a passive change in the sense that it won't impact whether existing files over the limit are affected but it does help feeder processors to stop pushing too much into this work queue.")
  public Long getBackPressureObjectThreshold() {
    return backPressureObjectThreshold;
  }

  public void setBackPressureObjectThreshold(Long backPressureObjectThreshold) {
    this.backPressureObjectThreshold = backPressureObjectThreshold;
  }

  public VersionedConnection backPressureDataSizeThreshold(String backPressureDataSizeThreshold) {
    this.backPressureDataSizeThreshold = backPressureDataSizeThreshold;
    return this;
  }

   /**
   * The object data size threshold for determining when back pressure is applied. Updating this value is a passive change in the sense that it won't impact whether existing files over the limit are affected but it does help feeder processors to stop pushing too much into this work queue.
   * @return backPressureDataSizeThreshold
  **/
  @ApiModelProperty(example = "null", value = "The object data size threshold for determining when back pressure is applied. Updating this value is a passive change in the sense that it won't impact whether existing files over the limit are affected but it does help feeder processors to stop pushing too much into this work queue.")
  public String getBackPressureDataSizeThreshold() {
    return backPressureDataSizeThreshold;
  }

  public void setBackPressureDataSizeThreshold(String backPressureDataSizeThreshold) {
    this.backPressureDataSizeThreshold = backPressureDataSizeThreshold;
  }

  public VersionedConnection flowFileExpiration(String flowFileExpiration) {
    this.flowFileExpiration = flowFileExpiration;
    return this;
  }

   /**
   * The amount of time a flow file may be in the flow before it will be automatically aged out of the flow. Once a flow file reaches this age it will be terminated from the flow the next time a processor attempts to start work on it.
   * @return flowFileExpiration
  **/
  @ApiModelProperty(example = "null", value = "The amount of time a flow file may be in the flow before it will be automatically aged out of the flow. Once a flow file reaches this age it will be terminated from the flow the next time a processor attempts to start work on it.")
  public String getFlowFileExpiration() {
    return flowFileExpiration;
  }

  public void setFlowFileExpiration(String flowFileExpiration) {
    this.flowFileExpiration = flowFileExpiration;
  }

  public VersionedConnection prioritizers(List<String> prioritizers) {
    this.prioritizers = prioritizers;
    return this;
  }

  public VersionedConnection addPrioritizersItem(String prioritizersItem) {
    this.prioritizers.add(prioritizersItem);
    return this;
  }

   /**
   * The comparators used to prioritize the queue.
   * @return prioritizers
  **/
  @ApiModelProperty(example = "null", value = "The comparators used to prioritize the queue.")
  public List<String> getPrioritizers() {
    return prioritizers;
  }

  public void setPrioritizers(List<String> prioritizers) {
    this.prioritizers = prioritizers;
  }

  public VersionedConnection bends(List<Position> bends) {
    this.bends = bends;
    return this;
  }

  public VersionedConnection addBendsItem(Position bendsItem) {
    this.bends.add(bendsItem);
    return this;
  }

   /**
   * The bend points on the connection.
   * @return bends
  **/
  @ApiModelProperty(example = "null", value = "The bend points on the connection.")
  public List<Position> getBends() {
    return bends;
  }

  public void setBends(List<Position> bends) {
    this.bends = bends;
  }

  public VersionedConnection loadBalanceStrategy(LoadBalanceStrategyEnum loadBalanceStrategy) {
    this.loadBalanceStrategy = loadBalanceStrategy;
    return this;
  }

   /**
   * The Strategy to use for load balancing data across the cluster, or null, if no Load Balance Strategy has been specified.
   * @return loadBalanceStrategy
  **/
  @ApiModelProperty(example = "null", value = "The Strategy to use for load balancing data across the cluster, or null, if no Load Balance Strategy has been specified.")
  public LoadBalanceStrategyEnum getLoadBalanceStrategy() {
    return loadBalanceStrategy;
  }

  public void setLoadBalanceStrategy(LoadBalanceStrategyEnum loadBalanceStrategy) {
    this.loadBalanceStrategy = loadBalanceStrategy;
  }

  public VersionedConnection partitioningAttribute(String partitioningAttribute) {
    this.partitioningAttribute = partitioningAttribute;
    return this;
  }

   /**
   * The attribute to use for partitioning data as it is load balanced across the cluster. If the Load Balance Strategy is configured to use PARTITION_BY_ATTRIBUTE, the value returned by this method is the name of the FlowFile Attribute that will be used to determine which node in the cluster should receive a given FlowFile. If the Load Balance Strategy is unset or is set to any other value, the Partitioning Attribute has no effect.
   * @return partitioningAttribute
  **/
  @ApiModelProperty(example = "null", value = "The attribute to use for partitioning data as it is load balanced across the cluster. If the Load Balance Strategy is configured to use PARTITION_BY_ATTRIBUTE, the value returned by this method is the name of the FlowFile Attribute that will be used to determine which node in the cluster should receive a given FlowFile. If the Load Balance Strategy is unset or is set to any other value, the Partitioning Attribute has no effect.")
  public String getPartitioningAttribute() {
    return partitioningAttribute;
  }

  public void setPartitioningAttribute(String partitioningAttribute) {
    this.partitioningAttribute = partitioningAttribute;
  }

  public VersionedConnection loadBalanceCompression(LoadBalanceCompressionEnum loadBalanceCompression) {
    this.loadBalanceCompression = loadBalanceCompression;
    return this;
  }

   /**
   * Whether or not compression should be used when transferring FlowFiles between nodes
   * @return loadBalanceCompression
  **/
  @ApiModelProperty(example = "null", value = "Whether or not compression should be used when transferring FlowFiles between nodes")
  public LoadBalanceCompressionEnum getLoadBalanceCompression() {
    return loadBalanceCompression;
  }

  public void setLoadBalanceCompression(LoadBalanceCompressionEnum loadBalanceCompression) {
    this.loadBalanceCompression = loadBalanceCompression;
  }

  public VersionedConnection componentType(ComponentTypeEnum componentType) {
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

  public VersionedConnection groupIdentifier(String groupIdentifier) {
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
    VersionedConnection versionedConnection = (VersionedConnection) o;
    return Objects.equals(this.identifier, versionedConnection.identifier) &&
        Objects.equals(this.instanceIdentifier, versionedConnection.instanceIdentifier) &&
        Objects.equals(this.name, versionedConnection.name) &&
        Objects.equals(this.comments, versionedConnection.comments) &&
        Objects.equals(this.position, versionedConnection.position) &&
        Objects.equals(this.source, versionedConnection.source) &&
        Objects.equals(this.destination, versionedConnection.destination) &&
        Objects.equals(this.labelIndex, versionedConnection.labelIndex) &&
        Objects.equals(this.zIndex, versionedConnection.zIndex) &&
        Objects.equals(this.selectedRelationships, versionedConnection.selectedRelationships) &&
        Objects.equals(this.backPressureObjectThreshold, versionedConnection.backPressureObjectThreshold) &&
        Objects.equals(this.backPressureDataSizeThreshold, versionedConnection.backPressureDataSizeThreshold) &&
        Objects.equals(this.flowFileExpiration, versionedConnection.flowFileExpiration) &&
        Objects.equals(this.prioritizers, versionedConnection.prioritizers) &&
        Objects.equals(this.bends, versionedConnection.bends) &&
        Objects.equals(this.loadBalanceStrategy, versionedConnection.loadBalanceStrategy) &&
        Objects.equals(this.partitioningAttribute, versionedConnection.partitioningAttribute) &&
        Objects.equals(this.loadBalanceCompression, versionedConnection.loadBalanceCompression) &&
        Objects.equals(this.componentType, versionedConnection.componentType) &&
        Objects.equals(this.groupIdentifier, versionedConnection.groupIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifier, instanceIdentifier, name, comments, position, source, destination, labelIndex, zIndex, selectedRelationships, backPressureObjectThreshold, backPressureDataSizeThreshold, flowFileExpiration, prioritizers, bends, loadBalanceStrategy, partitioningAttribute, loadBalanceCompression, componentType, groupIdentifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionedConnection {\n");
    
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    instanceIdentifier: ").append(toIndentedString(instanceIdentifier)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    labelIndex: ").append(toIndentedString(labelIndex)).append("\n");
    sb.append("    zIndex: ").append(toIndentedString(zIndex)).append("\n");
    sb.append("    selectedRelationships: ").append(toIndentedString(selectedRelationships)).append("\n");
    sb.append("    backPressureObjectThreshold: ").append(toIndentedString(backPressureObjectThreshold)).append("\n");
    sb.append("    backPressureDataSizeThreshold: ").append(toIndentedString(backPressureDataSizeThreshold)).append("\n");
    sb.append("    flowFileExpiration: ").append(toIndentedString(flowFileExpiration)).append("\n");
    sb.append("    prioritizers: ").append(toIndentedString(prioritizers)).append("\n");
    sb.append("    bends: ").append(toIndentedString(bends)).append("\n");
    sb.append("    loadBalanceStrategy: ").append(toIndentedString(loadBalanceStrategy)).append("\n");
    sb.append("    partitioningAttribute: ").append(toIndentedString(partitioningAttribute)).append("\n");
    sb.append("    loadBalanceCompression: ").append(toIndentedString(loadBalanceCompression)).append("\n");
    sb.append("    componentType: ").append(toIndentedString(componentType)).append("\n");
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

