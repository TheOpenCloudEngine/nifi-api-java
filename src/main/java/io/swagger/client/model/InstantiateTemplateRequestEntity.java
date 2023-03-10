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
 * InstantiateTemplateRequestEntity
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-11T13:57:19.352+09:00")
public class InstantiateTemplateRequestEntity {
    @SerializedName("originX")
    private Double originX = null;

    @SerializedName("originY")
    private Double originY = null;

    @SerializedName("templateId")
    private String templateId = null;

    @SerializedName("encodingVersion")
    private String encodingVersion = null;

    @SerializedName("snippet")
    private FlowSnippetDTO snippet = null;

    @SerializedName("disconnectedNodeAcknowledged")
    private Boolean disconnectedNodeAcknowledged = null;

    public InstantiateTemplateRequestEntity originX(Double originX) {
        this.originX = originX;
        return this;
    }

    /**
     * The x coordinate of the origin of the bounding box where the new components will be placed.
     * @return originX
     **/
    @ApiModelProperty(example = "null", value = "The x coordinate of the origin of the bounding box where the new components will be placed.")
    public Double getOriginX() {
        return originX;
    }

    public void setOriginX(Double originX) {
        this.originX = originX;
    }

    public InstantiateTemplateRequestEntity originY(Double originY) {
        this.originY = originY;
        return this;
    }

    /**
     * The y coordinate of the origin of the bounding box where the new components will be placed.
     * @return originY
     **/
    @ApiModelProperty(example = "null", value = "The y coordinate of the origin of the bounding box where the new components will be placed.")
    public Double getOriginY() {
        return originY;
    }

    public void setOriginY(Double originY) {
        this.originY = originY;
    }

    public InstantiateTemplateRequestEntity templateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * The identifier of the template.
     * @return templateId
     **/
    @ApiModelProperty(example = "null", value = "The identifier of the template.")
    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public InstantiateTemplateRequestEntity encodingVersion(String encodingVersion) {
        this.encodingVersion = encodingVersion;
        return this;
    }

    /**
     * The encoding version of the flow snippet. If not specified, this is automatically populated by the node receiving the user request. If the snippet is specified, the version will be the latest. If the snippet is not specified, the version will come from the underlying template. These details need to be replicated throughout the cluster to ensure consistency.
     * @return encodingVersion
     **/
    @ApiModelProperty(example = "null", value = "The encoding version of the flow snippet. If not specified, this is automatically populated by the node receiving the user request. If the snippet is specified, the version will be the latest. If the snippet is not specified, the version will come from the underlying template. These details need to be replicated throughout the cluster to ensure consistency.")
    public String getEncodingVersion() {
        return encodingVersion;
    }

    public void setEncodingVersion(String encodingVersion) {
        this.encodingVersion = encodingVersion;
    }

    public InstantiateTemplateRequestEntity snippet(FlowSnippetDTO snippet) {
        this.snippet = snippet;
        return this;
    }

    /**
     * A flow snippet of the template contents. If not specified, this is automatically populated by the node receiving the user request. These details need to be replicated throughout the cluster to ensure consistency.
     * @return snippet
     **/
    @ApiModelProperty(example = "null", value = "A flow snippet of the template contents. If not specified, this is automatically populated by the node receiving the user request. These details need to be replicated throughout the cluster to ensure consistency.")
    public FlowSnippetDTO getSnippet() {
        return snippet;
    }

    public void setSnippet(FlowSnippetDTO snippet) {
        this.snippet = snippet;
    }

    public InstantiateTemplateRequestEntity disconnectedNodeAcknowledged(Boolean disconnectedNodeAcknowledged) {
        this.disconnectedNodeAcknowledged = disconnectedNodeAcknowledged;
        return this;
    }

    /**
     * Acknowledges that this node is disconnected to allow for mutable requests to proceed.
     * @return disconnectedNodeAcknowledged
     **/
    @ApiModelProperty(example = "null", value = "Acknowledges that this node is disconnected to allow for mutable requests to proceed.")
    public Boolean getDisconnectedNodeAcknowledged() {
        return disconnectedNodeAcknowledged;
    }

    public void setDisconnectedNodeAcknowledged(Boolean disconnectedNodeAcknowledged) {
        this.disconnectedNodeAcknowledged = disconnectedNodeAcknowledged;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InstantiateTemplateRequestEntity instantiateTemplateRequestEntity = (InstantiateTemplateRequestEntity) o;
        return Objects.equals(this.originX, instantiateTemplateRequestEntity.originX) &&
                Objects.equals(this.originY, instantiateTemplateRequestEntity.originY) &&
                Objects.equals(this.templateId, instantiateTemplateRequestEntity.templateId) &&
                Objects.equals(this.encodingVersion, instantiateTemplateRequestEntity.encodingVersion) &&
                Objects.equals(this.snippet, instantiateTemplateRequestEntity.snippet) &&
                Objects.equals(this.disconnectedNodeAcknowledged, instantiateTemplateRequestEntity.disconnectedNodeAcknowledged);
    }

    @Override
    public int hashCode() {
        return Objects.hash(originX, originY, templateId, encodingVersion, snippet, disconnectedNodeAcknowledged);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstantiateTemplateRequestEntity {\n");

        sb.append("    originX: ").append(toIndentedString(originX)).append("\n");
        sb.append("    originY: ").append(toIndentedString(originY)).append("\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
        sb.append("    encodingVersion: ").append(toIndentedString(encodingVersion)).append("\n");
        sb.append("    snippet: ").append(toIndentedString(snippet)).append("\n");
        sb.append("    disconnectedNodeAcknowledged: ").append(toIndentedString(disconnectedNodeAcknowledged)).append("\n");
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

