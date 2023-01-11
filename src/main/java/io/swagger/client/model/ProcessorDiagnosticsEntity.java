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
 * ProcessorDiagnosticsEntity
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-11T13:57:19.352+09:00")
public class ProcessorDiagnosticsEntity {
    @SerializedName("revision")
    private RevisionDTO revision = null;

    @SerializedName("id")
    private String id = null;

    @SerializedName("uri")
    private String uri = null;

    @SerializedName("position")
    private PositionDTO position = null;

    @SerializedName("permissions")
    private PermissionsDTO permissions = null;

    @SerializedName("bulletins")
    private List<BulletinEntity> bulletins = new ArrayList<BulletinEntity>();

    @SerializedName("disconnectedNodeAcknowledged")
    private Boolean disconnectedNodeAcknowledged = null;

    @SerializedName("component")
    private ProcessorDiagnosticsDTO component = null;

    public ProcessorDiagnosticsEntity revision(RevisionDTO revision) {
        this.revision = revision;
        return this;
    }

    /**
     * The revision for this request/response. The revision is required for any mutable flow requests and is included in all responses.
     * @return revision
     **/
    @ApiModelProperty(example = "null", value = "The revision for this request/response. The revision is required for any mutable flow requests and is included in all responses.")
    public RevisionDTO getRevision() {
        return revision;
    }

    public void setRevision(RevisionDTO revision) {
        this.revision = revision;
    }

    public ProcessorDiagnosticsEntity id(String id) {
        this.id = id;
        return this;
    }

    /**
     * The id of the component.
     * @return id
     **/
    @ApiModelProperty(example = "null", value = "The id of the component.")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ProcessorDiagnosticsEntity uri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * The URI for futures requests to the component.
     * @return uri
     **/
    @ApiModelProperty(example = "null", value = "The URI for futures requests to the component.")
    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public ProcessorDiagnosticsEntity position(PositionDTO position) {
        this.position = position;
        return this;
    }

    /**
     * The position of this component in the UI if applicable.
     * @return position
     **/
    @ApiModelProperty(example = "null", value = "The position of this component in the UI if applicable.")
    public PositionDTO getPosition() {
        return position;
    }

    public void setPosition(PositionDTO position) {
        this.position = position;
    }

    public ProcessorDiagnosticsEntity permissions(PermissionsDTO permissions) {
        this.permissions = permissions;
        return this;
    }

    /**
     * The permissions for this component.
     * @return permissions
     **/
    @ApiModelProperty(example = "null", value = "The permissions for this component.")
    public PermissionsDTO getPermissions() {
        return permissions;
    }

    public void setPermissions(PermissionsDTO permissions) {
        this.permissions = permissions;
    }

    public ProcessorDiagnosticsEntity bulletins(List<BulletinEntity> bulletins) {
        this.bulletins = bulletins;
        return this;
    }

    public ProcessorDiagnosticsEntity addBulletinsItem(BulletinEntity bulletinsItem) {
        this.bulletins.add(bulletinsItem);
        return this;
    }

    /**
     * The bulletins for this component.
     * @return bulletins
     **/
    @ApiModelProperty(example = "null", value = "The bulletins for this component.")
    public List<BulletinEntity> getBulletins() {
        return bulletins;
    }

    public void setBulletins(List<BulletinEntity> bulletins) {
        this.bulletins = bulletins;
    }

    public ProcessorDiagnosticsEntity disconnectedNodeAcknowledged(Boolean disconnectedNodeAcknowledged) {
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

    public ProcessorDiagnosticsEntity component(ProcessorDiagnosticsDTO component) {
        this.component = component;
        return this;
    }

    /**
     * The Processor Diagnostics
     * @return component
     **/
    @ApiModelProperty(example = "null", value = "The Processor Diagnostics")
    public ProcessorDiagnosticsDTO getComponent() {
        return component;
    }

    public void setComponent(ProcessorDiagnosticsDTO component) {
        this.component = component;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProcessorDiagnosticsEntity processorDiagnosticsEntity = (ProcessorDiagnosticsEntity) o;
        return Objects.equals(this.revision, processorDiagnosticsEntity.revision) &&
                Objects.equals(this.id, processorDiagnosticsEntity.id) &&
                Objects.equals(this.uri, processorDiagnosticsEntity.uri) &&
                Objects.equals(this.position, processorDiagnosticsEntity.position) &&
                Objects.equals(this.permissions, processorDiagnosticsEntity.permissions) &&
                Objects.equals(this.bulletins, processorDiagnosticsEntity.bulletins) &&
                Objects.equals(this.disconnectedNodeAcknowledged, processorDiagnosticsEntity.disconnectedNodeAcknowledged) &&
                Objects.equals(this.component, processorDiagnosticsEntity.component);
    }

    @Override
    public int hashCode() {
        return Objects.hash(revision, id, uri, position, permissions, bulletins, disconnectedNodeAcknowledged, component);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProcessorDiagnosticsEntity {\n");

        sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
        sb.append("    position: ").append(toIndentedString(position)).append("\n");
        sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
        sb.append("    bulletins: ").append(toIndentedString(bulletins)).append("\n");
        sb.append("    disconnectedNodeAcknowledged: ").append(toIndentedString(disconnectedNodeAcknowledged)).append("\n");
        sb.append("    component: ").append(toIndentedString(component)).append("\n");
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

