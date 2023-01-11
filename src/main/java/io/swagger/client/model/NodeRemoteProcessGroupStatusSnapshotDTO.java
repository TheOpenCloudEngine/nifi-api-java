/**
 * NiFi Rest API
 * The Rest API provides programmatic access to command and control a NiFi instance in real time. Start and                                             stop processors, monitor queues, query provenance data, and more. Each endpoint below includes a description,                                             definitions of the expected input and output, potential response codes, and the authorizations required                                             to invoke each service.
 * <p>
 * OpenAPI spec version: 1.19.1
 * Contact: dev@nifi.apache.org
 * <p>
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;


/**
 * NodeRemoteProcessGroupStatusSnapshotDTO
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-11T13:57:19.352+09:00")
public class NodeRemoteProcessGroupStatusSnapshotDTO {
    @SerializedName("nodeId")
    private String nodeId = null;

    @SerializedName("address")
    private String address = null;

    @SerializedName("apiPort")
    private Integer apiPort = null;

    @SerializedName("statusSnapshot")
    private RemoteProcessGroupStatusSnapshotDTO statusSnapshot = null;

    public NodeRemoteProcessGroupStatusSnapshotDTO nodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * The unique ID that identifies the node
     * @return nodeId
     **/
    @ApiModelProperty(example = "null", value = "The unique ID that identifies the node")
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public NodeRemoteProcessGroupStatusSnapshotDTO address(String address) {
        this.address = address;
        return this;
    }

    /**
     * The API address of the node
     * @return address
     **/
    @ApiModelProperty(example = "null", value = "The API address of the node")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public NodeRemoteProcessGroupStatusSnapshotDTO apiPort(Integer apiPort) {
        this.apiPort = apiPort;
        return this;
    }

    /**
     * The API port used to communicate with the node
     * @return apiPort
     **/
    @ApiModelProperty(example = "null", value = "The API port used to communicate with the node")
    public Integer getApiPort() {
        return apiPort;
    }

    public void setApiPort(Integer apiPort) {
        this.apiPort = apiPort;
    }

    public NodeRemoteProcessGroupStatusSnapshotDTO statusSnapshot(RemoteProcessGroupStatusSnapshotDTO statusSnapshot) {
        this.statusSnapshot = statusSnapshot;
        return this;
    }

    /**
     * The remote process group status snapshot from the node.
     * @return statusSnapshot
     **/
    @ApiModelProperty(example = "null", value = "The remote process group status snapshot from the node.")
    public RemoteProcessGroupStatusSnapshotDTO getStatusSnapshot() {
        return statusSnapshot;
    }

    public void setStatusSnapshot(RemoteProcessGroupStatusSnapshotDTO statusSnapshot) {
        this.statusSnapshot = statusSnapshot;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NodeRemoteProcessGroupStatusSnapshotDTO nodeRemoteProcessGroupStatusSnapshotDTO = (NodeRemoteProcessGroupStatusSnapshotDTO) o;
        return Objects.equals(this.nodeId, nodeRemoteProcessGroupStatusSnapshotDTO.nodeId) &&
                Objects.equals(this.address, nodeRemoteProcessGroupStatusSnapshotDTO.address) &&
                Objects.equals(this.apiPort, nodeRemoteProcessGroupStatusSnapshotDTO.apiPort) &&
                Objects.equals(this.statusSnapshot, nodeRemoteProcessGroupStatusSnapshotDTO.statusSnapshot);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeId, address, apiPort, statusSnapshot);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeRemoteProcessGroupStatusSnapshotDTO {\n");

        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    apiPort: ").append(toIndentedString(apiPort)).append("\n");
        sb.append("    statusSnapshot: ").append(toIndentedString(statusSnapshot)).append("\n");
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

