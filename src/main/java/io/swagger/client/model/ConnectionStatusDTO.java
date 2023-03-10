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
 * ConnectionStatusDTO
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-11T13:57:19.352+09:00")
public class ConnectionStatusDTO {
    @SerializedName("id")
    private String id = null;

    @SerializedName("groupId")
    private String groupId = null;

    @SerializedName("name")
    private String name = null;

    @SerializedName("statsLastRefreshed")
    private String statsLastRefreshed = null;

    @SerializedName("sourceId")
    private String sourceId = null;

    @SerializedName("sourceName")
    private String sourceName = null;

    @SerializedName("destinationId")
    private String destinationId = null;

    @SerializedName("destinationName")
    private String destinationName = null;

    @SerializedName("aggregateSnapshot")
    private ConnectionStatusSnapshotDTO aggregateSnapshot = null;

    @SerializedName("nodeSnapshots")
    private List<NodeConnectionStatusSnapshotDTO> nodeSnapshots = new ArrayList<NodeConnectionStatusSnapshotDTO>();

    public ConnectionStatusDTO id(String id) {
        this.id = id;
        return this;
    }

    /**
     * The ID of the connection
     * @return id
     **/
    @ApiModelProperty(example = "null", value = "The ID of the connection")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ConnectionStatusDTO groupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * The ID of the Process Group that the connection belongs to
     * @return groupId
     **/
    @ApiModelProperty(example = "null", value = "The ID of the Process Group that the connection belongs to")
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public ConnectionStatusDTO name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the connection
     * @return name
     **/
    @ApiModelProperty(example = "null", value = "The name of the connection")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ConnectionStatusDTO statsLastRefreshed(String statsLastRefreshed) {
        this.statsLastRefreshed = statsLastRefreshed;
        return this;
    }

    /**
     * The timestamp of when the stats were last refreshed
     * @return statsLastRefreshed
     **/
    @ApiModelProperty(example = "null", value = "The timestamp of when the stats were last refreshed")
    public String getStatsLastRefreshed() {
        return statsLastRefreshed;
    }

    public void setStatsLastRefreshed(String statsLastRefreshed) {
        this.statsLastRefreshed = statsLastRefreshed;
    }

    public ConnectionStatusDTO sourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    /**
     * The ID of the source component
     * @return sourceId
     **/
    @ApiModelProperty(example = "null", value = "The ID of the source component")
    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public ConnectionStatusDTO sourceName(String sourceName) {
        this.sourceName = sourceName;
        return this;
    }

    /**
     * The name of the source component
     * @return sourceName
     **/
    @ApiModelProperty(example = "null", value = "The name of the source component")
    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public ConnectionStatusDTO destinationId(String destinationId) {
        this.destinationId = destinationId;
        return this;
    }

    /**
     * The ID of the destination component
     * @return destinationId
     **/
    @ApiModelProperty(example = "null", value = "The ID of the destination component")
    public String getDestinationId() {
        return destinationId;
    }

    public void setDestinationId(String destinationId) {
        this.destinationId = destinationId;
    }

    public ConnectionStatusDTO destinationName(String destinationName) {
        this.destinationName = destinationName;
        return this;
    }

    /**
     * The name of the destination component
     * @return destinationName
     **/
    @ApiModelProperty(example = "null", value = "The name of the destination component")
    public String getDestinationName() {
        return destinationName;
    }

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    public ConnectionStatusDTO aggregateSnapshot(ConnectionStatusSnapshotDTO aggregateSnapshot) {
        this.aggregateSnapshot = aggregateSnapshot;
        return this;
    }

    /**
     * The status snapshot that represents the aggregate stats of the cluster
     * @return aggregateSnapshot
     **/
    @ApiModelProperty(example = "null", value = "The status snapshot that represents the aggregate stats of the cluster")
    public ConnectionStatusSnapshotDTO getAggregateSnapshot() {
        return aggregateSnapshot;
    }

    public void setAggregateSnapshot(ConnectionStatusSnapshotDTO aggregateSnapshot) {
        this.aggregateSnapshot = aggregateSnapshot;
    }

    public ConnectionStatusDTO nodeSnapshots(List<NodeConnectionStatusSnapshotDTO> nodeSnapshots) {
        this.nodeSnapshots = nodeSnapshots;
        return this;
    }

    public ConnectionStatusDTO addNodeSnapshotsItem(NodeConnectionStatusSnapshotDTO nodeSnapshotsItem) {
        this.nodeSnapshots.add(nodeSnapshotsItem);
        return this;
    }

    /**
     * A list of status snapshots for each node
     * @return nodeSnapshots
     **/
    @ApiModelProperty(example = "null", value = "A list of status snapshots for each node")
    public List<NodeConnectionStatusSnapshotDTO> getNodeSnapshots() {
        return nodeSnapshots;
    }

    public void setNodeSnapshots(List<NodeConnectionStatusSnapshotDTO> nodeSnapshots) {
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
        ConnectionStatusDTO connectionStatusDTO = (ConnectionStatusDTO) o;
        return Objects.equals(this.id, connectionStatusDTO.id) &&
                Objects.equals(this.groupId, connectionStatusDTO.groupId) &&
                Objects.equals(this.name, connectionStatusDTO.name) &&
                Objects.equals(this.statsLastRefreshed, connectionStatusDTO.statsLastRefreshed) &&
                Objects.equals(this.sourceId, connectionStatusDTO.sourceId) &&
                Objects.equals(this.sourceName, connectionStatusDTO.sourceName) &&
                Objects.equals(this.destinationId, connectionStatusDTO.destinationId) &&
                Objects.equals(this.destinationName, connectionStatusDTO.destinationName) &&
                Objects.equals(this.aggregateSnapshot, connectionStatusDTO.aggregateSnapshot) &&
                Objects.equals(this.nodeSnapshots, connectionStatusDTO.nodeSnapshots);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, groupId, name, statsLastRefreshed, sourceId, sourceName, destinationId, destinationName, aggregateSnapshot, nodeSnapshots);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConnectionStatusDTO {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    statsLastRefreshed: ").append(toIndentedString(statsLastRefreshed)).append("\n");
        sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
        sb.append("    sourceName: ").append(toIndentedString(sourceName)).append("\n");
        sb.append("    destinationId: ").append(toIndentedString(destinationId)).append("\n");
        sb.append("    destinationName: ").append(toIndentedString(destinationName)).append("\n");
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

