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
 * ConnectionStatusSnapshotDTO
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-11T13:57:19.352+09:00")
public class ConnectionStatusSnapshotDTO {
    @SerializedName("id")
    private String id = null;

    @SerializedName("groupId")
    private String groupId = null;

    @SerializedName("name")
    private String name = null;

    @SerializedName("sourceId")
    private String sourceId = null;

    @SerializedName("sourceName")
    private String sourceName = null;

    @SerializedName("destinationId")
    private String destinationId = null;

    @SerializedName("destinationName")
    private String destinationName = null;

    @SerializedName("predictions")
    private ConnectionStatusPredictionsSnapshotDTO predictions = null;

    @SerializedName("flowFilesIn")
    private Integer flowFilesIn = null;

    @SerializedName("bytesIn")
    private Long bytesIn = null;

    @SerializedName("input")
    private String input = null;

    @SerializedName("flowFilesOut")
    private Integer flowFilesOut = null;

    @SerializedName("bytesOut")
    private Long bytesOut = null;

    @SerializedName("output")
    private String output = null;

    @SerializedName("flowFilesQueued")
    private Integer flowFilesQueued = null;

    @SerializedName("bytesQueued")
    private Long bytesQueued = null;

    @SerializedName("queued")
    private String queued = null;

    @SerializedName("queuedSize")
    private String queuedSize = null;

    @SerializedName("queuedCount")
    private String queuedCount = null;

    @SerializedName("percentUseCount")
    private Integer percentUseCount = null;

    @SerializedName("percentUseBytes")
    private Integer percentUseBytes = null;

    @SerializedName("flowFileAvailability")
    private String flowFileAvailability = null;

    public ConnectionStatusSnapshotDTO id(String id) {
        this.id = id;
        return this;
    }

    /**
     * The id of the connection.
     * @return id
     **/
    @ApiModelProperty(example = "null", value = "The id of the connection.")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ConnectionStatusSnapshotDTO groupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * The id of the process group the connection belongs to.
     * @return groupId
     **/
    @ApiModelProperty(example = "null", value = "The id of the process group the connection belongs to.")
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public ConnectionStatusSnapshotDTO name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the connection.
     * @return name
     **/
    @ApiModelProperty(example = "null", value = "The name of the connection.")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ConnectionStatusSnapshotDTO sourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    /**
     * The id of the source of the connection.
     * @return sourceId
     **/
    @ApiModelProperty(example = "null", value = "The id of the source of the connection.")
    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public ConnectionStatusSnapshotDTO sourceName(String sourceName) {
        this.sourceName = sourceName;
        return this;
    }

    /**
     * The name of the source of the connection.
     * @return sourceName
     **/
    @ApiModelProperty(example = "null", value = "The name of the source of the connection.")
    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public ConnectionStatusSnapshotDTO destinationId(String destinationId) {
        this.destinationId = destinationId;
        return this;
    }

    /**
     * The id of the destination of the connection.
     * @return destinationId
     **/
    @ApiModelProperty(example = "null", value = "The id of the destination of the connection.")
    public String getDestinationId() {
        return destinationId;
    }

    public void setDestinationId(String destinationId) {
        this.destinationId = destinationId;
    }

    public ConnectionStatusSnapshotDTO destinationName(String destinationName) {
        this.destinationName = destinationName;
        return this;
    }

    /**
     * The name of the destination of the connection.
     * @return destinationName
     **/
    @ApiModelProperty(example = "null", value = "The name of the destination of the connection.")
    public String getDestinationName() {
        return destinationName;
    }

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    public ConnectionStatusSnapshotDTO predictions(ConnectionStatusPredictionsSnapshotDTO predictions) {
        this.predictions = predictions;
        return this;
    }

    /**
     * Predictions, if available, for this connection (null if not available)
     * @return predictions
     **/
    @ApiModelProperty(example = "null", value = "Predictions, if available, for this connection (null if not available)")
    public ConnectionStatusPredictionsSnapshotDTO getPredictions() {
        return predictions;
    }

    public void setPredictions(ConnectionStatusPredictionsSnapshotDTO predictions) {
        this.predictions = predictions;
    }

    public ConnectionStatusSnapshotDTO flowFilesIn(Integer flowFilesIn) {
        this.flowFilesIn = flowFilesIn;
        return this;
    }

    /**
     * The number of FlowFiles that have come into the connection in the last 5 minutes.
     * @return flowFilesIn
     **/
    @ApiModelProperty(example = "null", value = "The number of FlowFiles that have come into the connection in the last 5 minutes.")
    public Integer getFlowFilesIn() {
        return flowFilesIn;
    }

    public void setFlowFilesIn(Integer flowFilesIn) {
        this.flowFilesIn = flowFilesIn;
    }

    public ConnectionStatusSnapshotDTO bytesIn(Long bytesIn) {
        this.bytesIn = bytesIn;
        return this;
    }

    /**
     * The size of the FlowFiles that have come into the connection in the last 5 minutes.
     * @return bytesIn
     **/
    @ApiModelProperty(example = "null", value = "The size of the FlowFiles that have come into the connection in the last 5 minutes.")
    public Long getBytesIn() {
        return bytesIn;
    }

    public void setBytesIn(Long bytesIn) {
        this.bytesIn = bytesIn;
    }

    public ConnectionStatusSnapshotDTO input(String input) {
        this.input = input;
        return this;
    }

    /**
     * The input count/size for the connection in the last 5 minutes, pretty printed.
     * @return input
     **/
    @ApiModelProperty(example = "null", value = "The input count/size for the connection in the last 5 minutes, pretty printed.")
    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public ConnectionStatusSnapshotDTO flowFilesOut(Integer flowFilesOut) {
        this.flowFilesOut = flowFilesOut;
        return this;
    }

    /**
     * The number of FlowFiles that have left the connection in the last 5 minutes.
     * @return flowFilesOut
     **/
    @ApiModelProperty(example = "null", value = "The number of FlowFiles that have left the connection in the last 5 minutes.")
    public Integer getFlowFilesOut() {
        return flowFilesOut;
    }

    public void setFlowFilesOut(Integer flowFilesOut) {
        this.flowFilesOut = flowFilesOut;
    }

    public ConnectionStatusSnapshotDTO bytesOut(Long bytesOut) {
        this.bytesOut = bytesOut;
        return this;
    }

    /**
     * The number of bytes that have left the connection in the last 5 minutes.
     * @return bytesOut
     **/
    @ApiModelProperty(example = "null", value = "The number of bytes that have left the connection in the last 5 minutes.")
    public Long getBytesOut() {
        return bytesOut;
    }

    public void setBytesOut(Long bytesOut) {
        this.bytesOut = bytesOut;
    }

    public ConnectionStatusSnapshotDTO output(String output) {
        this.output = output;
        return this;
    }

    /**
     * The output count/sie for the connection in the last 5 minutes, pretty printed.
     * @return output
     **/
    @ApiModelProperty(example = "null", value = "The output count/sie for the connection in the last 5 minutes, pretty printed.")
    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public ConnectionStatusSnapshotDTO flowFilesQueued(Integer flowFilesQueued) {
        this.flowFilesQueued = flowFilesQueued;
        return this;
    }

    /**
     * The number of FlowFiles that are currently queued in the connection.
     * @return flowFilesQueued
     **/
    @ApiModelProperty(example = "null", value = "The number of FlowFiles that are currently queued in the connection.")
    public Integer getFlowFilesQueued() {
        return flowFilesQueued;
    }

    public void setFlowFilesQueued(Integer flowFilesQueued) {
        this.flowFilesQueued = flowFilesQueued;
    }

    public ConnectionStatusSnapshotDTO bytesQueued(Long bytesQueued) {
        this.bytesQueued = bytesQueued;
        return this;
    }

    /**
     * The size of the FlowFiles that are currently queued in the connection.
     * @return bytesQueued
     **/
    @ApiModelProperty(example = "null", value = "The size of the FlowFiles that are currently queued in the connection.")
    public Long getBytesQueued() {
        return bytesQueued;
    }

    public void setBytesQueued(Long bytesQueued) {
        this.bytesQueued = bytesQueued;
    }

    public ConnectionStatusSnapshotDTO queued(String queued) {
        this.queued = queued;
        return this;
    }

    /**
     * The total count and size of queued flowfiles formatted.
     * @return queued
     **/
    @ApiModelProperty(example = "null", value = "The total count and size of queued flowfiles formatted.")
    public String getQueued() {
        return queued;
    }

    public void setQueued(String queued) {
        this.queued = queued;
    }

    public ConnectionStatusSnapshotDTO queuedSize(String queuedSize) {
        this.queuedSize = queuedSize;
        return this;
    }

    /**
     * The total size of flowfiles that are queued formatted.
     * @return queuedSize
     **/
    @ApiModelProperty(example = "null", value = "The total size of flowfiles that are queued formatted.")
    public String getQueuedSize() {
        return queuedSize;
    }

    public void setQueuedSize(String queuedSize) {
        this.queuedSize = queuedSize;
    }

    public ConnectionStatusSnapshotDTO queuedCount(String queuedCount) {
        this.queuedCount = queuedCount;
        return this;
    }

    /**
     * The number of flowfiles that are queued, pretty printed.
     * @return queuedCount
     **/
    @ApiModelProperty(example = "null", value = "The number of flowfiles that are queued, pretty printed.")
    public String getQueuedCount() {
        return queuedCount;
    }

    public void setQueuedCount(String queuedCount) {
        this.queuedCount = queuedCount;
    }

    public ConnectionStatusSnapshotDTO percentUseCount(Integer percentUseCount) {
        this.percentUseCount = percentUseCount;
        return this;
    }

    /**
     * Connection percent use regarding queued flow files count and backpressure threshold if configured.
     * @return percentUseCount
     **/
    @ApiModelProperty(example = "null", value = "Connection percent use regarding queued flow files count and backpressure threshold if configured.")
    public Integer getPercentUseCount() {
        return percentUseCount;
    }

    public void setPercentUseCount(Integer percentUseCount) {
        this.percentUseCount = percentUseCount;
    }

    public ConnectionStatusSnapshotDTO percentUseBytes(Integer percentUseBytes) {
        this.percentUseBytes = percentUseBytes;
        return this;
    }

    /**
     * Connection percent use regarding queued flow files size and backpressure threshold if configured.
     * @return percentUseBytes
     **/
    @ApiModelProperty(example = "null", value = "Connection percent use regarding queued flow files size and backpressure threshold if configured.")
    public Integer getPercentUseBytes() {
        return percentUseBytes;
    }

    public void setPercentUseBytes(Integer percentUseBytes) {
        this.percentUseBytes = percentUseBytes;
    }

    public ConnectionStatusSnapshotDTO flowFileAvailability(String flowFileAvailability) {
        this.flowFileAvailability = flowFileAvailability;
        return this;
    }

    /**
     * The availability of FlowFiles in this connection
     * @return flowFileAvailability
     **/
    @ApiModelProperty(example = "null", value = "The availability of FlowFiles in this connection")
    public String getFlowFileAvailability() {
        return flowFileAvailability;
    }

    public void setFlowFileAvailability(String flowFileAvailability) {
        this.flowFileAvailability = flowFileAvailability;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConnectionStatusSnapshotDTO connectionStatusSnapshotDTO = (ConnectionStatusSnapshotDTO) o;
        return Objects.equals(this.id, connectionStatusSnapshotDTO.id) &&
                Objects.equals(this.groupId, connectionStatusSnapshotDTO.groupId) &&
                Objects.equals(this.name, connectionStatusSnapshotDTO.name) &&
                Objects.equals(this.sourceId, connectionStatusSnapshotDTO.sourceId) &&
                Objects.equals(this.sourceName, connectionStatusSnapshotDTO.sourceName) &&
                Objects.equals(this.destinationId, connectionStatusSnapshotDTO.destinationId) &&
                Objects.equals(this.destinationName, connectionStatusSnapshotDTO.destinationName) &&
                Objects.equals(this.predictions, connectionStatusSnapshotDTO.predictions) &&
                Objects.equals(this.flowFilesIn, connectionStatusSnapshotDTO.flowFilesIn) &&
                Objects.equals(this.bytesIn, connectionStatusSnapshotDTO.bytesIn) &&
                Objects.equals(this.input, connectionStatusSnapshotDTO.input) &&
                Objects.equals(this.flowFilesOut, connectionStatusSnapshotDTO.flowFilesOut) &&
                Objects.equals(this.bytesOut, connectionStatusSnapshotDTO.bytesOut) &&
                Objects.equals(this.output, connectionStatusSnapshotDTO.output) &&
                Objects.equals(this.flowFilesQueued, connectionStatusSnapshotDTO.flowFilesQueued) &&
                Objects.equals(this.bytesQueued, connectionStatusSnapshotDTO.bytesQueued) &&
                Objects.equals(this.queued, connectionStatusSnapshotDTO.queued) &&
                Objects.equals(this.queuedSize, connectionStatusSnapshotDTO.queuedSize) &&
                Objects.equals(this.queuedCount, connectionStatusSnapshotDTO.queuedCount) &&
                Objects.equals(this.percentUseCount, connectionStatusSnapshotDTO.percentUseCount) &&
                Objects.equals(this.percentUseBytes, connectionStatusSnapshotDTO.percentUseBytes) &&
                Objects.equals(this.flowFileAvailability, connectionStatusSnapshotDTO.flowFileAvailability);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, groupId, name, sourceId, sourceName, destinationId, destinationName, predictions, flowFilesIn, bytesIn, input, flowFilesOut, bytesOut, output, flowFilesQueued, bytesQueued, queued, queuedSize, queuedCount, percentUseCount, percentUseBytes, flowFileAvailability);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConnectionStatusSnapshotDTO {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
        sb.append("    sourceName: ").append(toIndentedString(sourceName)).append("\n");
        sb.append("    destinationId: ").append(toIndentedString(destinationId)).append("\n");
        sb.append("    destinationName: ").append(toIndentedString(destinationName)).append("\n");
        sb.append("    predictions: ").append(toIndentedString(predictions)).append("\n");
        sb.append("    flowFilesIn: ").append(toIndentedString(flowFilesIn)).append("\n");
        sb.append("    bytesIn: ").append(toIndentedString(bytesIn)).append("\n");
        sb.append("    input: ").append(toIndentedString(input)).append("\n");
        sb.append("    flowFilesOut: ").append(toIndentedString(flowFilesOut)).append("\n");
        sb.append("    bytesOut: ").append(toIndentedString(bytesOut)).append("\n");
        sb.append("    output: ").append(toIndentedString(output)).append("\n");
        sb.append("    flowFilesQueued: ").append(toIndentedString(flowFilesQueued)).append("\n");
        sb.append("    bytesQueued: ").append(toIndentedString(bytesQueued)).append("\n");
        sb.append("    queued: ").append(toIndentedString(queued)).append("\n");
        sb.append("    queuedSize: ").append(toIndentedString(queuedSize)).append("\n");
        sb.append("    queuedCount: ").append(toIndentedString(queuedCount)).append("\n");
        sb.append("    percentUseCount: ").append(toIndentedString(percentUseCount)).append("\n");
        sb.append("    percentUseBytes: ").append(toIndentedString(percentUseBytes)).append("\n");
        sb.append("    flowFileAvailability: ").append(toIndentedString(flowFileAvailability)).append("\n");
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

