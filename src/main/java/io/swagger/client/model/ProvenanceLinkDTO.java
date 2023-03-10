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
 * ProvenanceLinkDTO
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-11T13:57:19.352+09:00")
public class ProvenanceLinkDTO {
    @SerializedName("sourceId")
    private String sourceId = null;

    @SerializedName("targetId")
    private String targetId = null;

    @SerializedName("flowFileUuid")
    private String flowFileUuid = null;

    @SerializedName("timestamp")
    private String timestamp = null;

    @SerializedName("millis")
    private Long millis = null;

    public ProvenanceLinkDTO sourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    /**
     * The source node id of the link.
     * @return sourceId
     **/
    @ApiModelProperty(example = "null", value = "The source node id of the link.")
    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public ProvenanceLinkDTO targetId(String targetId) {
        this.targetId = targetId;
        return this;
    }

    /**
     * The target node id of the link.
     * @return targetId
     **/
    @ApiModelProperty(example = "null", value = "The target node id of the link.")
    public String getTargetId() {
        return targetId;
    }

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    public ProvenanceLinkDTO flowFileUuid(String flowFileUuid) {
        this.flowFileUuid = flowFileUuid;
        return this;
    }

    /**
     * The flowfile uuid that traversed the link.
     * @return flowFileUuid
     **/
    @ApiModelProperty(example = "null", value = "The flowfile uuid that traversed the link.")
    public String getFlowFileUuid() {
        return flowFileUuid;
    }

    public void setFlowFileUuid(String flowFileUuid) {
        this.flowFileUuid = flowFileUuid;
    }

    public ProvenanceLinkDTO timestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * The timestamp of the link (based on the destination).
     * @return timestamp
     **/
    @ApiModelProperty(example = "null", value = "The timestamp of the link (based on the destination).")
    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public ProvenanceLinkDTO millis(Long millis) {
        this.millis = millis;
        return this;
    }

    /**
     * The timestamp of this link in milliseconds.
     * @return millis
     **/
    @ApiModelProperty(example = "null", value = "The timestamp of this link in milliseconds.")
    public Long getMillis() {
        return millis;
    }

    public void setMillis(Long millis) {
        this.millis = millis;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProvenanceLinkDTO provenanceLinkDTO = (ProvenanceLinkDTO) o;
        return Objects.equals(this.sourceId, provenanceLinkDTO.sourceId) &&
                Objects.equals(this.targetId, provenanceLinkDTO.targetId) &&
                Objects.equals(this.flowFileUuid, provenanceLinkDTO.flowFileUuid) &&
                Objects.equals(this.timestamp, provenanceLinkDTO.timestamp) &&
                Objects.equals(this.millis, provenanceLinkDTO.millis);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceId, targetId, flowFileUuid, timestamp, millis);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProvenanceLinkDTO {\n");

        sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
        sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
        sb.append("    flowFileUuid: ").append(toIndentedString(flowFileUuid)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    millis: ").append(toIndentedString(millis)).append("\n");
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

