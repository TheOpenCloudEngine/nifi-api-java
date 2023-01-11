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
 * VersionedFlowSnapshotEntity
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-11T13:57:19.352+09:00")
public class VersionedFlowSnapshotEntity {
    @SerializedName("versionedFlowSnapshot")
    private RegisteredFlowSnapshot versionedFlowSnapshot = null;

    @SerializedName("processGroupRevision")
    private RevisionDTO processGroupRevision = null;

    @SerializedName("registryId")
    private String registryId = null;

    @SerializedName("updateDescendantVersionedFlows")
    private Boolean updateDescendantVersionedFlows = null;

    @SerializedName("disconnectedNodeAcknowledged")
    private Boolean disconnectedNodeAcknowledged = null;

    public VersionedFlowSnapshotEntity versionedFlowSnapshot(RegisteredFlowSnapshot versionedFlowSnapshot) {
        this.versionedFlowSnapshot = versionedFlowSnapshot;
        return this;
    }

    /**
     * The versioned flow snapshot
     * @return versionedFlowSnapshot
     **/
    @ApiModelProperty(example = "null", value = "The versioned flow snapshot")
    public RegisteredFlowSnapshot getVersionedFlowSnapshot() {
        return versionedFlowSnapshot;
    }

    public void setVersionedFlowSnapshot(RegisteredFlowSnapshot versionedFlowSnapshot) {
        this.versionedFlowSnapshot = versionedFlowSnapshot;
    }

    public VersionedFlowSnapshotEntity processGroupRevision(RevisionDTO processGroupRevision) {
        this.processGroupRevision = processGroupRevision;
        return this;
    }

    /**
     * The Revision of the Process Group under Version Control
     * @return processGroupRevision
     **/
    @ApiModelProperty(example = "null", value = "The Revision of the Process Group under Version Control")
    public RevisionDTO getProcessGroupRevision() {
        return processGroupRevision;
    }

    public void setProcessGroupRevision(RevisionDTO processGroupRevision) {
        this.processGroupRevision = processGroupRevision;
    }

    public VersionedFlowSnapshotEntity registryId(String registryId) {
        this.registryId = registryId;
        return this;
    }

    /**
     * The ID of the Registry that this flow belongs to
     * @return registryId
     **/
    @ApiModelProperty(example = "null", value = "The ID of the Registry that this flow belongs to")
    public String getRegistryId() {
        return registryId;
    }

    public void setRegistryId(String registryId) {
        this.registryId = registryId;
    }

    public VersionedFlowSnapshotEntity updateDescendantVersionedFlows(Boolean updateDescendantVersionedFlows) {
        this.updateDescendantVersionedFlows = updateDescendantVersionedFlows;
        return this;
    }

    /**
     * If the Process Group to be updated has a child or descendant Process Group that is also under Version Control, this specifies whether or not the contents of that child/descendant Process Group should be updated.
     * @return updateDescendantVersionedFlows
     **/
    @ApiModelProperty(example = "null", value = "If the Process Group to be updated has a child or descendant Process Group that is also under Version Control, this specifies whether or not the contents of that child/descendant Process Group should be updated.")
    public Boolean getUpdateDescendantVersionedFlows() {
        return updateDescendantVersionedFlows;
    }

    public void setUpdateDescendantVersionedFlows(Boolean updateDescendantVersionedFlows) {
        this.updateDescendantVersionedFlows = updateDescendantVersionedFlows;
    }

    public VersionedFlowSnapshotEntity disconnectedNodeAcknowledged(Boolean disconnectedNodeAcknowledged) {
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
        VersionedFlowSnapshotEntity versionedFlowSnapshotEntity = (VersionedFlowSnapshotEntity) o;
        return Objects.equals(this.versionedFlowSnapshot, versionedFlowSnapshotEntity.versionedFlowSnapshot) &&
                Objects.equals(this.processGroupRevision, versionedFlowSnapshotEntity.processGroupRevision) &&
                Objects.equals(this.registryId, versionedFlowSnapshotEntity.registryId) &&
                Objects.equals(this.updateDescendantVersionedFlows, versionedFlowSnapshotEntity.updateDescendantVersionedFlows) &&
                Objects.equals(this.disconnectedNodeAcknowledged, versionedFlowSnapshotEntity.disconnectedNodeAcknowledged);
    }

    @Override
    public int hashCode() {
        return Objects.hash(versionedFlowSnapshot, processGroupRevision, registryId, updateDescendantVersionedFlows, disconnectedNodeAcknowledged);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VersionedFlowSnapshotEntity {\n");

        sb.append("    versionedFlowSnapshot: ").append(toIndentedString(versionedFlowSnapshot)).append("\n");
        sb.append("    processGroupRevision: ").append(toIndentedString(processGroupRevision)).append("\n");
        sb.append("    registryId: ").append(toIndentedString(registryId)).append("\n");
        sb.append("    updateDescendantVersionedFlows: ").append(toIndentedString(updateDescendantVersionedFlows)).append("\n");
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

