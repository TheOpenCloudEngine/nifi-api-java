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
 * PreviousValueDTO
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-11T13:57:19.352+09:00")
public class PreviousValueDTO {
    @SerializedName("previousValue")
    private String previousValue = null;

    @SerializedName("timestamp")
    private String timestamp = null;

    @SerializedName("userIdentity")
    private String userIdentity = null;

    public PreviousValueDTO previousValue(String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     * The previous value.
     * @return previousValue
     **/
    @ApiModelProperty(example = "null", value = "The previous value.")
    public String getPreviousValue() {
        return previousValue;
    }

    public void setPreviousValue(String previousValue) {
        this.previousValue = previousValue;
    }

    public PreviousValueDTO timestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * The timestamp when the value was modified.
     * @return timestamp
     **/
    @ApiModelProperty(example = "null", value = "The timestamp when the value was modified.")
    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public PreviousValueDTO userIdentity(String userIdentity) {
        this.userIdentity = userIdentity;
        return this;
    }

    /**
     * The user who changed the previous value.
     * @return userIdentity
     **/
    @ApiModelProperty(example = "null", value = "The user who changed the previous value.")
    public String getUserIdentity() {
        return userIdentity;
    }

    public void setUserIdentity(String userIdentity) {
        this.userIdentity = userIdentity;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PreviousValueDTO previousValueDTO = (PreviousValueDTO) o;
        return Objects.equals(this.previousValue, previousValueDTO.previousValue) &&
                Objects.equals(this.timestamp, previousValueDTO.timestamp) &&
                Objects.equals(this.userIdentity, previousValueDTO.userIdentity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(previousValue, timestamp, userIdentity);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PreviousValueDTO {\n");

        sb.append("    previousValue: ").append(toIndentedString(previousValue)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    userIdentity: ").append(toIndentedString(userIdentity)).append("\n");
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

