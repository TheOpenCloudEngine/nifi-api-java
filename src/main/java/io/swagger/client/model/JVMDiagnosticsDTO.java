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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * JVMDiagnosticsDTO
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-11T13:57:19.352+09:00")
public class JVMDiagnosticsDTO {
    @SerializedName("clustered")
    private Boolean clustered = null;

    @SerializedName("connected")
    private Boolean connected = null;

    @SerializedName("aggregateSnapshot")
    private JVMDiagnosticsSnapshotDTO aggregateSnapshot = null;

    @SerializedName("nodeSnapshots")
    private List<NodeJVMDiagnosticsSnapshotDTO> nodeSnapshots = new ArrayList<NodeJVMDiagnosticsSnapshotDTO>();

    public JVMDiagnosticsDTO clustered(Boolean clustered) {
        this.clustered = clustered;
        return this;
    }

    /**
     * Whether or not the NiFi instance is clustered
     * @return clustered
     **/
    @ApiModelProperty(example = "null", value = "Whether or not the NiFi instance is clustered")
    public Boolean getClustered() {
        return clustered;
    }

    public void setClustered(Boolean clustered) {
        this.clustered = clustered;
    }

    public JVMDiagnosticsDTO connected(Boolean connected) {
        this.connected = connected;
        return this;
    }

    /**
     * Whether or not the node is connected to the cluster
     * @return connected
     **/
    @ApiModelProperty(example = "null", value = "Whether or not the node is connected to the cluster")
    public Boolean getConnected() {
        return connected;
    }

    public void setConnected(Boolean connected) {
        this.connected = connected;
    }

    public JVMDiagnosticsDTO aggregateSnapshot(JVMDiagnosticsSnapshotDTO aggregateSnapshot) {
        this.aggregateSnapshot = aggregateSnapshot;
        return this;
    }

    /**
     * Aggregate JVM diagnostic information about the entire cluster
     * @return aggregateSnapshot
     **/
    @ApiModelProperty(example = "null", value = "Aggregate JVM diagnostic information about the entire cluster")
    public JVMDiagnosticsSnapshotDTO getAggregateSnapshot() {
        return aggregateSnapshot;
    }

    public void setAggregateSnapshot(JVMDiagnosticsSnapshotDTO aggregateSnapshot) {
        this.aggregateSnapshot = aggregateSnapshot;
    }

    public JVMDiagnosticsDTO nodeSnapshots(List<NodeJVMDiagnosticsSnapshotDTO> nodeSnapshots) {
        this.nodeSnapshots = nodeSnapshots;
        return this;
    }

    public JVMDiagnosticsDTO addNodeSnapshotsItem(NodeJVMDiagnosticsSnapshotDTO nodeSnapshotsItem) {
        this.nodeSnapshots.add(nodeSnapshotsItem);
        return this;
    }

    /**
     * Node-wise breakdown of JVM diagnostic information
     * @return nodeSnapshots
     **/
    @ApiModelProperty(example = "null", value = "Node-wise breakdown of JVM diagnostic information")
    public List<NodeJVMDiagnosticsSnapshotDTO> getNodeSnapshots() {
        return nodeSnapshots;
    }

    public void setNodeSnapshots(List<NodeJVMDiagnosticsSnapshotDTO> nodeSnapshots) {
        this.nodeSnapshots = nodeSnapshots;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        JVMDiagnosticsDTO jVMDiagnosticsDTO = (JVMDiagnosticsDTO) o;
        return Objects.equals(this.clustered, jVMDiagnosticsDTO.clustered) &&
                Objects.equals(this.connected, jVMDiagnosticsDTO.connected) &&
                Objects.equals(this.aggregateSnapshot, jVMDiagnosticsDTO.aggregateSnapshot) &&
                Objects.equals(this.nodeSnapshots, jVMDiagnosticsDTO.nodeSnapshots);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clustered, connected, aggregateSnapshot, nodeSnapshots);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JVMDiagnosticsDTO {\n");

        sb.append("    clustered: ").append(toIndentedString(clustered)).append("\n");
        sb.append("    connected: ").append(toIndentedString(connected)).append("\n");
        sb.append("    aggregateSnapshot: ").append(toIndentedString(aggregateSnapshot)).append("\n");
        sb.append("    nodeSnapshots: ").append(toIndentedString(nodeSnapshots)).append("\n");
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

