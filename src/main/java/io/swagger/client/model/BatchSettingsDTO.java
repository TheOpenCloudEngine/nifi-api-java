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
 * BatchSettingsDTO
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-11T13:57:19.352+09:00")
public class BatchSettingsDTO {
    @SerializedName("count")
    private Integer count = null;

    @SerializedName("size")
    private String size = null;

    @SerializedName("duration")
    private String duration = null;

    public BatchSettingsDTO count(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * Preferred number of flow files to include in a transaction.
     * @return count
     **/
    @ApiModelProperty(example = "null", value = "Preferred number of flow files to include in a transaction.")
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public BatchSettingsDTO size(String size) {
        this.size = size;
        return this;
    }

    /**
     * Preferred number of bytes to include in a transaction.
     * @return size
     **/
    @ApiModelProperty(example = "null", value = "Preferred number of bytes to include in a transaction.")
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public BatchSettingsDTO duration(String duration) {
        this.duration = duration;
        return this;
    }

    /**
     * Preferred amount of time that a transaction should span.
     * @return duration
     **/
    @ApiModelProperty(example = "null", value = "Preferred amount of time that a transaction should span.")
    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchSettingsDTO batchSettingsDTO = (BatchSettingsDTO) o;
        return Objects.equals(this.count, batchSettingsDTO.count) &&
                Objects.equals(this.size, batchSettingsDTO.size) &&
                Objects.equals(this.duration, batchSettingsDTO.duration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, size, duration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchSettingsDTO {\n");

        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
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

