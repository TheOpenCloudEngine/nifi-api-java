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
 * ProcessGroupImportEntity
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-11T13:57:19.352+09:00")
public class ProcessGroupImportEntity {
    @SerializedName("processGroupRevision")
    private RevisionDTO processGroupRevision = null;

    @SerializedName("disconnectedNodeAcknowledged")
    private Boolean disconnectedNodeAcknowledged = null;

    @SerializedName("versionedFlowSnapshot")
    private RegisteredFlowSnapshot versionedFlowSnapshot = null;

    public ProcessGroupImportEntity processGroupRevision(RevisionDTO processGroupRevision) {
        this.processGroupRevision = processGroupRevision;
        return this;
    }

    /**
     * The Revision for the Process Group
     * @return processGroupRevision
     **/
    @ApiModelProperty(example = "null", value = "The Revision for the Process Group")
    public RevisionDTO getProcessGroupRevision() {
        return processGroupRevision;
    }

    public void setProcessGroupRevision(RevisionDTO processGroupRevision) {
        this.processGroupRevision = processGroupRevision;
    }

    public ProcessGroupImportEntity disconnectedNodeAcknowledged(Boolean disconnectedNodeAcknowledged) {
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

    public ProcessGroupImportEntity versionedFlowSnapshot(RegisteredFlowSnapshot versionedFlowSnapshot) {
        this.versionedFlowSnapshot = versionedFlowSnapshot;
        return this;
    }

    /**
     * The Versioned Flow Snapshot to import
     * @return versionedFlowSnapshot
     **/
    @ApiModelProperty(example = "null", value = "The Versioned Flow Snapshot to import")
    public RegisteredFlowSnapshot getVersionedFlowSnapshot() {
        return versionedFlowSnapshot;
    }

    public void setVersionedFlowSnapshot(RegisteredFlowSnapshot versionedFlowSnapshot) {
        this.versionedFlowSnapshot = versionedFlowSnapshot;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProcessGroupImportEntity processGroupImportEntity = (ProcessGroupImportEntity) o;
        return Objects.equals(this.processGroupRevision, processGroupImportEntity.processGroupRevision) &&
                Objects.equals(this.disconnectedNodeAcknowledged, processGroupImportEntity.disconnectedNodeAcknowledged) &&
                Objects.equals(this.versionedFlowSnapshot, processGroupImportEntity.versionedFlowSnapshot);
    }

    @Override
    public int hashCode() {
        return Objects.hash(processGroupRevision, disconnectedNodeAcknowledged, versionedFlowSnapshot);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProcessGroupImportEntity {\n");

        sb.append("    processGroupRevision: ").append(toIndentedString(processGroupRevision)).append("\n");
        sb.append("    disconnectedNodeAcknowledged: ").append(toIndentedString(disconnectedNodeAcknowledged)).append("\n");
        sb.append("    versionedFlowSnapshot: ").append(toIndentedString(versionedFlowSnapshot)).append("\n");
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

