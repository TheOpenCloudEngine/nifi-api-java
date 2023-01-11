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
import io.swagger.client.model.ConnectionDTO;
import io.swagger.client.model.ControllerServiceDTO;
import io.swagger.client.model.FunnelDTO;
import io.swagger.client.model.LabelDTO;
import io.swagger.client.model.PortDTO;
import io.swagger.client.model.ProcessGroupDTO;
import io.swagger.client.model.ProcessorDTO;
import io.swagger.client.model.RemoteProcessGroupDTO;
import java.util.ArrayList;
import java.util.List;


/**
 * FlowSnippetDTO
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-11T13:57:19.352+09:00")
public class FlowSnippetDTO   {
  @SerializedName("processGroups")
  private List<ProcessGroupDTO> processGroups = new ArrayList<ProcessGroupDTO>();

  @SerializedName("remoteProcessGroups")
  private List<RemoteProcessGroupDTO> remoteProcessGroups = new ArrayList<RemoteProcessGroupDTO>();

  @SerializedName("processors")
  private List<ProcessorDTO> processors = new ArrayList<ProcessorDTO>();

  @SerializedName("inputPorts")
  private List<PortDTO> inputPorts = new ArrayList<PortDTO>();

  @SerializedName("outputPorts")
  private List<PortDTO> outputPorts = new ArrayList<PortDTO>();

  @SerializedName("connections")
  private List<ConnectionDTO> connections = new ArrayList<ConnectionDTO>();

  @SerializedName("labels")
  private List<LabelDTO> labels = new ArrayList<LabelDTO>();

  @SerializedName("funnels")
  private List<FunnelDTO> funnels = new ArrayList<FunnelDTO>();

  @SerializedName("controllerServices")
  private List<ControllerServiceDTO> controllerServices = new ArrayList<ControllerServiceDTO>();

  public FlowSnippetDTO processGroups(List<ProcessGroupDTO> processGroups) {
    this.processGroups = processGroups;
    return this;
  }

  public FlowSnippetDTO addProcessGroupsItem(ProcessGroupDTO processGroupsItem) {
    this.processGroups.add(processGroupsItem);
    return this;
  }

   /**
   * The process groups in this flow snippet.
   * @return processGroups
  **/
  @ApiModelProperty(example = "null", value = "The process groups in this flow snippet.")
  public List<ProcessGroupDTO> getProcessGroups() {
    return processGroups;
  }

  public void setProcessGroups(List<ProcessGroupDTO> processGroups) {
    this.processGroups = processGroups;
  }

  public FlowSnippetDTO remoteProcessGroups(List<RemoteProcessGroupDTO> remoteProcessGroups) {
    this.remoteProcessGroups = remoteProcessGroups;
    return this;
  }

  public FlowSnippetDTO addRemoteProcessGroupsItem(RemoteProcessGroupDTO remoteProcessGroupsItem) {
    this.remoteProcessGroups.add(remoteProcessGroupsItem);
    return this;
  }

   /**
   * The remote process groups in this flow snippet.
   * @return remoteProcessGroups
  **/
  @ApiModelProperty(example = "null", value = "The remote process groups in this flow snippet.")
  public List<RemoteProcessGroupDTO> getRemoteProcessGroups() {
    return remoteProcessGroups;
  }

  public void setRemoteProcessGroups(List<RemoteProcessGroupDTO> remoteProcessGroups) {
    this.remoteProcessGroups = remoteProcessGroups;
  }

  public FlowSnippetDTO processors(List<ProcessorDTO> processors) {
    this.processors = processors;
    return this;
  }

  public FlowSnippetDTO addProcessorsItem(ProcessorDTO processorsItem) {
    this.processors.add(processorsItem);
    return this;
  }

   /**
   * The processors in this flow snippet.
   * @return processors
  **/
  @ApiModelProperty(example = "null", value = "The processors in this flow snippet.")
  public List<ProcessorDTO> getProcessors() {
    return processors;
  }

  public void setProcessors(List<ProcessorDTO> processors) {
    this.processors = processors;
  }

  public FlowSnippetDTO inputPorts(List<PortDTO> inputPorts) {
    this.inputPorts = inputPorts;
    return this;
  }

  public FlowSnippetDTO addInputPortsItem(PortDTO inputPortsItem) {
    this.inputPorts.add(inputPortsItem);
    return this;
  }

   /**
   * The input ports in this flow snippet.
   * @return inputPorts
  **/
  @ApiModelProperty(example = "null", value = "The input ports in this flow snippet.")
  public List<PortDTO> getInputPorts() {
    return inputPorts;
  }

  public void setInputPorts(List<PortDTO> inputPorts) {
    this.inputPorts = inputPorts;
  }

  public FlowSnippetDTO outputPorts(List<PortDTO> outputPorts) {
    this.outputPorts = outputPorts;
    return this;
  }

  public FlowSnippetDTO addOutputPortsItem(PortDTO outputPortsItem) {
    this.outputPorts.add(outputPortsItem);
    return this;
  }

   /**
   * The output ports in this flow snippet.
   * @return outputPorts
  **/
  @ApiModelProperty(example = "null", value = "The output ports in this flow snippet.")
  public List<PortDTO> getOutputPorts() {
    return outputPorts;
  }

  public void setOutputPorts(List<PortDTO> outputPorts) {
    this.outputPorts = outputPorts;
  }

  public FlowSnippetDTO connections(List<ConnectionDTO> connections) {
    this.connections = connections;
    return this;
  }

  public FlowSnippetDTO addConnectionsItem(ConnectionDTO connectionsItem) {
    this.connections.add(connectionsItem);
    return this;
  }

   /**
   * The connections in this flow snippet.
   * @return connections
  **/
  @ApiModelProperty(example = "null", value = "The connections in this flow snippet.")
  public List<ConnectionDTO> getConnections() {
    return connections;
  }

  public void setConnections(List<ConnectionDTO> connections) {
    this.connections = connections;
  }

  public FlowSnippetDTO labels(List<LabelDTO> labels) {
    this.labels = labels;
    return this;
  }

  public FlowSnippetDTO addLabelsItem(LabelDTO labelsItem) {
    this.labels.add(labelsItem);
    return this;
  }

   /**
   * The labels in this flow snippet.
   * @return labels
  **/
  @ApiModelProperty(example = "null", value = "The labels in this flow snippet.")
  public List<LabelDTO> getLabels() {
    return labels;
  }

  public void setLabels(List<LabelDTO> labels) {
    this.labels = labels;
  }

  public FlowSnippetDTO funnels(List<FunnelDTO> funnels) {
    this.funnels = funnels;
    return this;
  }

  public FlowSnippetDTO addFunnelsItem(FunnelDTO funnelsItem) {
    this.funnels.add(funnelsItem);
    return this;
  }

   /**
   * The funnels in this flow snippet.
   * @return funnels
  **/
  @ApiModelProperty(example = "null", value = "The funnels in this flow snippet.")
  public List<FunnelDTO> getFunnels() {
    return funnels;
  }

  public void setFunnels(List<FunnelDTO> funnels) {
    this.funnels = funnels;
  }

  public FlowSnippetDTO controllerServices(List<ControllerServiceDTO> controllerServices) {
    this.controllerServices = controllerServices;
    return this;
  }

  public FlowSnippetDTO addControllerServicesItem(ControllerServiceDTO controllerServicesItem) {
    this.controllerServices.add(controllerServicesItem);
    return this;
  }

   /**
   * The controller services in this flow snippet.
   * @return controllerServices
  **/
  @ApiModelProperty(example = "null", value = "The controller services in this flow snippet.")
  public List<ControllerServiceDTO> getControllerServices() {
    return controllerServices;
  }

  public void setControllerServices(List<ControllerServiceDTO> controllerServices) {
    this.controllerServices = controllerServices;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlowSnippetDTO flowSnippetDTO = (FlowSnippetDTO) o;
    return Objects.equals(this.processGroups, flowSnippetDTO.processGroups) &&
        Objects.equals(this.remoteProcessGroups, flowSnippetDTO.remoteProcessGroups) &&
        Objects.equals(this.processors, flowSnippetDTO.processors) &&
        Objects.equals(this.inputPorts, flowSnippetDTO.inputPorts) &&
        Objects.equals(this.outputPorts, flowSnippetDTO.outputPorts) &&
        Objects.equals(this.connections, flowSnippetDTO.connections) &&
        Objects.equals(this.labels, flowSnippetDTO.labels) &&
        Objects.equals(this.funnels, flowSnippetDTO.funnels) &&
        Objects.equals(this.controllerServices, flowSnippetDTO.controllerServices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processGroups, remoteProcessGroups, processors, inputPorts, outputPorts, connections, labels, funnels, controllerServices);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowSnippetDTO {\n");
    
    sb.append("    processGroups: ").append(toIndentedString(processGroups)).append("\n");
    sb.append("    remoteProcessGroups: ").append(toIndentedString(remoteProcessGroups)).append("\n");
    sb.append("    processors: ").append(toIndentedString(processors)).append("\n");
    sb.append("    inputPorts: ").append(toIndentedString(inputPorts)).append("\n");
    sb.append("    outputPorts: ").append(toIndentedString(outputPorts)).append("\n");
    sb.append("    connections: ").append(toIndentedString(connections)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    funnels: ").append(toIndentedString(funnels)).append("\n");
    sb.append("    controllerServices: ").append(toIndentedString(controllerServices)).append("\n");
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

