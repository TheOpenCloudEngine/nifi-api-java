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
 * ProcessGroupStatusDTO
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-11T13:57:19.352+09:00")
public class ProcessGroupStatusDTO {
    @SerializedName("id")
    private String id = null;

    @SerializedName("name")
    private String name = null;

    @SerializedName("statsLastRefreshed")
    private String statsLastRefreshed = null;

    @SerializedName("aggregateSnapshot")
    private ProcessGroupStatusSnapshotDTO aggregateSnapshot = null;

    @SerializedName("nodeSnapshots")
    private List<NodeProcessGroupStatusSnapshotDTO> nodeSnapshots = new ArrayList<NodeProcessGroupStatusSnapshotDTO>();

    public ProcessGroupStatusDTO id(String id) {
        this.id = id;
        return this;
    }

    /**
     * The ID of the Process Group
     * @return id
     **/
    @ApiModelProperty(example = "null", value = "The ID of the Process Group")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ProcessGroupStatusDTO name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the Process Group
     * @return name
     **/
    @ApiModelProperty(example = "null", value = "The name of the Process Group")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProcessGroupStatusDTO statsLastRefreshed(String statsLastRefreshed) {
        this.statsLastRefreshed = statsLastRefreshed;
        return this;
    }

    /**
     * The time the status for the process group was last refreshed.
     * @return statsLastRefreshed
     **/
    @ApiModelProperty(example = "null", value = "The time the status for the process group was last refreshed.")
    public String getStatsLastRefreshed() {
        return statsLastRefreshed;
    }

    public void setStatsLastRefreshed(String statsLastRefreshed) {
        this.statsLastRefreshed = statsLastRefreshed;
    }

    public ProcessGroupStatusDTO aggregateSnapshot(ProcessGroupStatusSnapshotDTO aggregateSnapshot) {
        this.aggregateSnapshot = aggregateSnapshot;
        return this;
    }

    /**
     * The aggregate status of all nodes in the cluster
     * @return aggregateSnapshot
     **/
    @ApiModelProperty(example = "null", value = "The aggregate status of all nodes in the cluster")
    public ProcessGroupStatusSnapshotDTO getAggregateSnapshot() {
        return aggregateSnapshot;
    }

    public void setAggregateSnapshot(ProcessGroupStatusSnapshotDTO aggregateSnapshot) {
        this.aggregateSnapshot = aggregateSnapshot;
    }

    public ProcessGroupStatusDTO nodeSnapshots(List<NodeProcessGroupStatusSnapshotDTO> nodeSnapshots) {
        this.nodeSnapshots = nodeSnapshots;
        return this;
    }

    public ProcessGroupStatusDTO addNodeSnapshotsItem(NodeProcessGroupStatusSnapshotDTO nodeSnapshotsItem) {
        this.nodeSnapshots.add(nodeSnapshotsItem);
        return this;
    }

    /**
     * The status reported by each node in the cluster. If the NiFi instance is a standalone instance, rather than a clustered instance, this value may be null.
     * @return nodeSnapshots
     **/
    @ApiModelProperty(example = "null", value = "The status reported by each node in the cluster. If the NiFi instance is a standalone instance, rather than a clustered instance, this value may be null.")
    public List<NodeProcessGroupStatusSnapshotDTO> getNodeSnapshots() {
        return nodeSnapshots;
    }

    public void setNodeSnapshots(List<NodeProcessGroupStatusSnapshotDTO> nodeSnapshots) {
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
        ProcessGroupStatusDTO processGroupStatusDTO = (ProcessGroupStatusDTO) o;
        return Objects.equals(this.id, processGroupStatusDTO.id) &&
                Objects.equals(this.name, processGroupStatusDTO.name) &&
                Objects.equals(this.statsLastRefreshed, processGroupStatusDTO.statsLastRefreshed) &&
                Objects.equals(this.aggregateSnapshot, processGroupStatusDTO.aggregateSnapshot) &&
                Objects.equals(this.nodeSnapshots, processGroupStatusDTO.nodeSnapshots);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, statsLastRefreshed, aggregateSnapshot, nodeSnapshots);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProcessGroupStatusDTO {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    statsLastRefreshed: ").append(toIndentedString(statsLastRefreshed)).append("\n");
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

