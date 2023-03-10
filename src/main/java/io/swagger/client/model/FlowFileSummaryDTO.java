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
 * FlowFileSummaryDTO
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-11T13:57:19.352+09:00")
public class FlowFileSummaryDTO {
    @SerializedName("uri")
    private String uri = null;

    @SerializedName("uuid")
    private String uuid = null;

    @SerializedName("filename")
    private String filename = null;

    @SerializedName("position")
    private Integer position = null;

    @SerializedName("size")
    private Long size = null;

    @SerializedName("queuedDuration")
    private Long queuedDuration = null;

    @SerializedName("lineageDuration")
    private Long lineageDuration = null;

    @SerializedName("penaltyExpiresIn")
    private Long penaltyExpiresIn = null;

    @SerializedName("clusterNodeId")
    private String clusterNodeId = null;

    @SerializedName("clusterNodeAddress")
    private String clusterNodeAddress = null;

    @SerializedName("penalized")
    private Boolean penalized = null;

    public FlowFileSummaryDTO uri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * The URI that can be used to access this FlowFile.
     * @return uri
     **/
    @ApiModelProperty(example = "null", value = "The URI that can be used to access this FlowFile.")
    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public FlowFileSummaryDTO uuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * The FlowFile UUID.
     * @return uuid
     **/
    @ApiModelProperty(example = "null", value = "The FlowFile UUID.")
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public FlowFileSummaryDTO filename(String filename) {
        this.filename = filename;
        return this;
    }

    /**
     * The FlowFile filename.
     * @return filename
     **/
    @ApiModelProperty(example = "null", value = "The FlowFile filename.")
    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public FlowFileSummaryDTO position(Integer position) {
        this.position = position;
        return this;
    }

    /**
     * The FlowFile's position in the queue.
     * @return position
     **/
    @ApiModelProperty(example = "null", value = "The FlowFile's position in the queue.")
    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public FlowFileSummaryDTO size(Long size) {
        this.size = size;
        return this;
    }

    /**
     * The FlowFile file size.
     * @return size
     **/
    @ApiModelProperty(example = "null", value = "The FlowFile file size.")
    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public FlowFileSummaryDTO queuedDuration(Long queuedDuration) {
        this.queuedDuration = queuedDuration;
        return this;
    }

    /**
     * How long this FlowFile has been enqueued.
     * @return queuedDuration
     **/
    @ApiModelProperty(example = "null", value = "How long this FlowFile has been enqueued.")
    public Long getQueuedDuration() {
        return queuedDuration;
    }

    public void setQueuedDuration(Long queuedDuration) {
        this.queuedDuration = queuedDuration;
    }

    public FlowFileSummaryDTO lineageDuration(Long lineageDuration) {
        this.lineageDuration = lineageDuration;
        return this;
    }

    /**
     * Duration since the FlowFile's greatest ancestor entered the flow.
     * @return lineageDuration
     **/
    @ApiModelProperty(example = "null", value = "Duration since the FlowFile's greatest ancestor entered the flow.")
    public Long getLineageDuration() {
        return lineageDuration;
    }

    public void setLineageDuration(Long lineageDuration) {
        this.lineageDuration = lineageDuration;
    }

    public FlowFileSummaryDTO penaltyExpiresIn(Long penaltyExpiresIn) {
        this.penaltyExpiresIn = penaltyExpiresIn;
        return this;
    }

    /**
     * How long in milliseconds until the FlowFile penalty expires.
     * @return penaltyExpiresIn
     **/
    @ApiModelProperty(example = "null", value = "How long in milliseconds until the FlowFile penalty expires.")
    public Long getPenaltyExpiresIn() {
        return penaltyExpiresIn;
    }

    public void setPenaltyExpiresIn(Long penaltyExpiresIn) {
        this.penaltyExpiresIn = penaltyExpiresIn;
    }

    public FlowFileSummaryDTO clusterNodeId(String clusterNodeId) {
        this.clusterNodeId = clusterNodeId;
        return this;
    }

    /**
     * The id of the node where this FlowFile resides.
     * @return clusterNodeId
     **/
    @ApiModelProperty(example = "null", value = "The id of the node where this FlowFile resides.")
    public String getClusterNodeId() {
        return clusterNodeId;
    }

    public void setClusterNodeId(String clusterNodeId) {
        this.clusterNodeId = clusterNodeId;
    }

    public FlowFileSummaryDTO clusterNodeAddress(String clusterNodeAddress) {
        this.clusterNodeAddress = clusterNodeAddress;
        return this;
    }

    /**
     * The label for the node where this FlowFile resides.
     * @return clusterNodeAddress
     **/
    @ApiModelProperty(example = "null", value = "The label for the node where this FlowFile resides.")
    public String getClusterNodeAddress() {
        return clusterNodeAddress;
    }

    public void setClusterNodeAddress(String clusterNodeAddress) {
        this.clusterNodeAddress = clusterNodeAddress;
    }

    public FlowFileSummaryDTO penalized(Boolean penalized) {
        this.penalized = penalized;
        return this;
    }

    /**
     * If the FlowFile is penalized.
     * @return penalized
     **/
    @ApiModelProperty(example = "null", value = "If the FlowFile is penalized.")
    public Boolean getPenalized() {
        return penalized;
    }

    public void setPenalized(Boolean penalized) {
        this.penalized = penalized;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FlowFileSummaryDTO flowFileSummaryDTO = (FlowFileSummaryDTO) o;
        return Objects.equals(this.uri, flowFileSummaryDTO.uri) &&
                Objects.equals(this.uuid, flowFileSummaryDTO.uuid) &&
                Objects.equals(this.filename, flowFileSummaryDTO.filename) &&
                Objects.equals(this.position, flowFileSummaryDTO.position) &&
                Objects.equals(this.size, flowFileSummaryDTO.size) &&
                Objects.equals(this.queuedDuration, flowFileSummaryDTO.queuedDuration) &&
                Objects.equals(this.lineageDuration, flowFileSummaryDTO.lineageDuration) &&
                Objects.equals(this.penaltyExpiresIn, flowFileSummaryDTO.penaltyExpiresIn) &&
                Objects.equals(this.clusterNodeId, flowFileSummaryDTO.clusterNodeId) &&
                Objects.equals(this.clusterNodeAddress, flowFileSummaryDTO.clusterNodeAddress) &&
                Objects.equals(this.penalized, flowFileSummaryDTO.penalized);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uri, uuid, filename, position, size, queuedDuration, lineageDuration, penaltyExpiresIn, clusterNodeId, clusterNodeAddress, penalized);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FlowFileSummaryDTO {\n");

        sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
        sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
        sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
        sb.append("    position: ").append(toIndentedString(position)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    queuedDuration: ").append(toIndentedString(queuedDuration)).append("\n");
        sb.append("    lineageDuration: ").append(toIndentedString(lineageDuration)).append("\n");
        sb.append("    penaltyExpiresIn: ").append(toIndentedString(penaltyExpiresIn)).append("\n");
        sb.append("    clusterNodeId: ").append(toIndentedString(clusterNodeId)).append("\n");
        sb.append("    clusterNodeAddress: ").append(toIndentedString(clusterNodeAddress)).append("\n");
        sb.append("    penalized: ").append(toIndentedString(penalized)).append("\n");
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

