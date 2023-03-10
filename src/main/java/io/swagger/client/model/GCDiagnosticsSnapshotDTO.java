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
import org.joda.time.DateTime;

import java.util.Objects;


/**
 * GCDiagnosticsSnapshotDTO
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-11T13:57:19.352+09:00")
public class GCDiagnosticsSnapshotDTO {
    @SerializedName("timestamp")
    private DateTime timestamp = null;

    @SerializedName("collectionCount")
    private Long collectionCount = null;

    @SerializedName("collectionMillis")
    private Long collectionMillis = null;

    public GCDiagnosticsSnapshotDTO timestamp(DateTime timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * The timestamp of when the Snapshot was taken
     * @return timestamp
     **/
    @ApiModelProperty(example = "null", value = "The timestamp of when the Snapshot was taken")
    public DateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(DateTime timestamp) {
        this.timestamp = timestamp;
    }

    public GCDiagnosticsSnapshotDTO collectionCount(Long collectionCount) {
        this.collectionCount = collectionCount;
        return this;
    }

    /**
     * The number of times that Garbage Collection has occurred
     * @return collectionCount
     **/
    @ApiModelProperty(example = "null", value = "The number of times that Garbage Collection has occurred")
    public Long getCollectionCount() {
        return collectionCount;
    }

    public void setCollectionCount(Long collectionCount) {
        this.collectionCount = collectionCount;
    }

    public GCDiagnosticsSnapshotDTO collectionMillis(Long collectionMillis) {
        this.collectionMillis = collectionMillis;
        return this;
    }

    /**
     * The number of milliseconds that the Garbage Collector spent performing Garbage Collection duties
     * @return collectionMillis
     **/
    @ApiModelProperty(example = "null", value = "The number of milliseconds that the Garbage Collector spent performing Garbage Collection duties")
    public Long getCollectionMillis() {
        return collectionMillis;
    }

    public void setCollectionMillis(Long collectionMillis) {
        this.collectionMillis = collectionMillis;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GCDiagnosticsSnapshotDTO gCDiagnosticsSnapshotDTO = (GCDiagnosticsSnapshotDTO) o;
        return Objects.equals(this.timestamp, gCDiagnosticsSnapshotDTO.timestamp) &&
                Objects.equals(this.collectionCount, gCDiagnosticsSnapshotDTO.collectionCount) &&
                Objects.equals(this.collectionMillis, gCDiagnosticsSnapshotDTO.collectionMillis);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timestamp, collectionCount, collectionMillis);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GCDiagnosticsSnapshotDTO {\n");

        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    collectionCount: ").append(toIndentedString(collectionCount)).append("\n");
        sb.append("    collectionMillis: ").append(toIndentedString(collectionMillis)).append("\n");
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

