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
 * ParameterProviderConfigurationDTO
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-11T13:57:19.352+09:00")
public class ParameterProviderConfigurationDTO {
    @SerializedName("parameterProviderId")
    private String parameterProviderId = null;

    @SerializedName("parameterProviderName")
    private String parameterProviderName = null;

    @SerializedName("parameterGroupName")
    private String parameterGroupName = null;

    @SerializedName("synchronized")
    private Boolean _synchronized = null;

    public ParameterProviderConfigurationDTO parameterProviderId(String parameterProviderId) {
        this.parameterProviderId = parameterProviderId;
        return this;
    }

    /**
     * The ID of the Parameter Provider
     * @return parameterProviderId
     **/
    @ApiModelProperty(example = "null", value = "The ID of the Parameter Provider")
    public String getParameterProviderId() {
        return parameterProviderId;
    }

    public void setParameterProviderId(String parameterProviderId) {
        this.parameterProviderId = parameterProviderId;
    }

    public ParameterProviderConfigurationDTO parameterProviderName(String parameterProviderName) {
        this.parameterProviderName = parameterProviderName;
        return this;
    }

    /**
     * The name of the Parameter Provider
     * @return parameterProviderName
     **/
    @ApiModelProperty(example = "null", value = "The name of the Parameter Provider")
    public String getParameterProviderName() {
        return parameterProviderName;
    }

    public void setParameterProviderName(String parameterProviderName) {
        this.parameterProviderName = parameterProviderName;
    }

    public ParameterProviderConfigurationDTO parameterGroupName(String parameterGroupName) {
        this.parameterGroupName = parameterGroupName;
        return this;
    }

    /**
     * The Parameter Group name that maps to the Parameter Context
     * @return parameterGroupName
     **/
    @ApiModelProperty(example = "null", value = "The Parameter Group name that maps to the Parameter Context")
    public String getParameterGroupName() {
        return parameterGroupName;
    }

    public void setParameterGroupName(String parameterGroupName) {
        this.parameterGroupName = parameterGroupName;
    }

    public ParameterProviderConfigurationDTO _synchronized(Boolean _synchronized) {
        this._synchronized = _synchronized;
        return this;
    }

    /**
     * True if the Parameter Context should receive the parameters from the mapped Parameter Group
     * @return _synchronized
     **/
    @ApiModelProperty(example = "null", value = "True if the Parameter Context should receive the parameters from the mapped Parameter Group")
    public Boolean getSynchronized() {
        return _synchronized;
    }

    public void setSynchronized(Boolean _synchronized) {
        this._synchronized = _synchronized;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ParameterProviderConfigurationDTO parameterProviderConfigurationDTO = (ParameterProviderConfigurationDTO) o;
        return Objects.equals(this.parameterProviderId, parameterProviderConfigurationDTO.parameterProviderId) &&
                Objects.equals(this.parameterProviderName, parameterProviderConfigurationDTO.parameterProviderName) &&
                Objects.equals(this.parameterGroupName, parameterProviderConfigurationDTO.parameterGroupName) &&
                Objects.equals(this._synchronized, parameterProviderConfigurationDTO._synchronized);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parameterProviderId, parameterProviderName, parameterGroupName, _synchronized);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ParameterProviderConfigurationDTO {\n");

        sb.append("    parameterProviderId: ").append(toIndentedString(parameterProviderId)).append("\n");
        sb.append("    parameterProviderName: ").append(toIndentedString(parameterProviderName)).append("\n");
        sb.append("    parameterGroupName: ").append(toIndentedString(parameterGroupName)).append("\n");
        sb.append("    _synchronized: ").append(toIndentedString(_synchronized)).append("\n");
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

