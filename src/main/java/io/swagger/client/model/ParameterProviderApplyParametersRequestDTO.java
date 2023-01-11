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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * ParameterProviderApplyParametersRequestDTO
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-11T13:57:19.352+09:00")
public class ParameterProviderApplyParametersRequestDTO {
    @SerializedName("requestId")
    private String requestId = null;

    @SerializedName("uri")
    private String uri = null;

    @SerializedName("submissionTime")
    private DateTime submissionTime = null;

    @SerializedName("lastUpdated")
    private DateTime lastUpdated = null;

    @SerializedName("complete")
    private Boolean complete = null;

    @SerializedName("failureReason")
    private String failureReason = null;

    @SerializedName("percentCompleted")
    private Integer percentCompleted = null;

    @SerializedName("state")
    private String state = null;

    @SerializedName("updateSteps")
    private List<ParameterProviderApplyParametersUpdateStepDTO> updateSteps = new ArrayList<ParameterProviderApplyParametersUpdateStepDTO>();

    @SerializedName("parameterProvider")
    private ParameterProviderDTO parameterProvider = null;

    @SerializedName("parameterContextUpdates")
    private List<ParameterContextUpdateEntity> parameterContextUpdates = new ArrayList<ParameterContextUpdateEntity>();

    @SerializedName("referencingComponents")
    private List<AffectedComponentEntity> referencingComponents = new ArrayList<AffectedComponentEntity>();

    public ParameterProviderApplyParametersRequestDTO requestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * The ID of the request
     * @return requestId
     **/
    @ApiModelProperty(example = "null", value = "The ID of the request")
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ParameterProviderApplyParametersRequestDTO uri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * The URI for the request
     * @return uri
     **/
    @ApiModelProperty(example = "null", value = "The URI for the request")
    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public ParameterProviderApplyParametersRequestDTO submissionTime(DateTime submissionTime) {
        this.submissionTime = submissionTime;
        return this;
    }

    /**
     * The timestamp of when the request was submitted
     * @return submissionTime
     **/
    @ApiModelProperty(example = "null", value = "The timestamp of when the request was submitted")
    public DateTime getSubmissionTime() {
        return submissionTime;
    }

    public void setSubmissionTime(DateTime submissionTime) {
        this.submissionTime = submissionTime;
    }

    public ParameterProviderApplyParametersRequestDTO lastUpdated(DateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
        return this;
    }

    /**
     * The timestamp of when the request was last updated
     * @return lastUpdated
     **/
    @ApiModelProperty(example = "null", value = "The timestamp of when the request was last updated")
    public DateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(DateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public ParameterProviderApplyParametersRequestDTO complete(Boolean complete) {
        this.complete = complete;
        return this;
    }

    /**
     * Whether or not the request is completed
     * @return complete
     **/
    @ApiModelProperty(example = "null", value = "Whether or not the request is completed")
    public Boolean getComplete() {
        return complete;
    }

    public void setComplete(Boolean complete) {
        this.complete = complete;
    }

    public ParameterProviderApplyParametersRequestDTO failureReason(String failureReason) {
        this.failureReason = failureReason;
        return this;
    }

    /**
     * The reason for the request failing, or null if the request has not failed
     * @return failureReason
     **/
    @ApiModelProperty(example = "null", value = "The reason for the request failing, or null if the request has not failed")
    public String getFailureReason() {
        return failureReason;
    }

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    public ParameterProviderApplyParametersRequestDTO percentCompleted(Integer percentCompleted) {
        this.percentCompleted = percentCompleted;
        return this;
    }

    /**
     * A value between 0 and 100 (inclusive) indicating how close the request is to completion
     * @return percentCompleted
     **/
    @ApiModelProperty(example = "null", value = "A value between 0 and 100 (inclusive) indicating how close the request is to completion")
    public Integer getPercentCompleted() {
        return percentCompleted;
    }

    public void setPercentCompleted(Integer percentCompleted) {
        this.percentCompleted = percentCompleted;
    }

    public ParameterProviderApplyParametersRequestDTO state(String state) {
        this.state = state;
        return this;
    }

    /**
     * A description of the current state of the request
     * @return state
     **/
    @ApiModelProperty(example = "null", value = "A description of the current state of the request")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public ParameterProviderApplyParametersRequestDTO updateSteps(List<ParameterProviderApplyParametersUpdateStepDTO> updateSteps) {
        this.updateSteps = updateSteps;
        return this;
    }

    public ParameterProviderApplyParametersRequestDTO addUpdateStepsItem(ParameterProviderApplyParametersUpdateStepDTO updateStepsItem) {
        this.updateSteps.add(updateStepsItem);
        return this;
    }

    /**
     * The steps that are required in order to complete the request, along with the status of each
     * @return updateSteps
     **/
    @ApiModelProperty(example = "null", value = "The steps that are required in order to complete the request, along with the status of each")
    public List<ParameterProviderApplyParametersUpdateStepDTO> getUpdateSteps() {
        return updateSteps;
    }

    public void setUpdateSteps(List<ParameterProviderApplyParametersUpdateStepDTO> updateSteps) {
        this.updateSteps = updateSteps;
    }

    public ParameterProviderApplyParametersRequestDTO parameterProvider(ParameterProviderDTO parameterProvider) {
        this.parameterProvider = parameterProvider;
        return this;
    }

    /**
     * The Parameter Provider that is being operated on. This may not be populated until the request has successfully completed.
     * @return parameterProvider
     **/
    @ApiModelProperty(example = "null", value = "The Parameter Provider that is being operated on. This may not be populated until the request has successfully completed.")
    public ParameterProviderDTO getParameterProvider() {
        return parameterProvider;
    }

    public void setParameterProvider(ParameterProviderDTO parameterProvider) {
        this.parameterProvider = parameterProvider;
    }

    public ParameterProviderApplyParametersRequestDTO parameterContextUpdates(List<ParameterContextUpdateEntity> parameterContextUpdates) {
        this.parameterContextUpdates = parameterContextUpdates;
        return this;
    }

    public ParameterProviderApplyParametersRequestDTO addParameterContextUpdatesItem(ParameterContextUpdateEntity parameterContextUpdatesItem) {
        this.parameterContextUpdates.add(parameterContextUpdatesItem);
        return this;
    }

    /**
     * The Parameter Contexts updated by this Parameter Provider. This may not be populated until the request has successfully completed.
     * @return parameterContextUpdates
     **/
    @ApiModelProperty(example = "null", value = "The Parameter Contexts updated by this Parameter Provider. This may not be populated until the request has successfully completed.")
    public List<ParameterContextUpdateEntity> getParameterContextUpdates() {
        return parameterContextUpdates;
    }

    public void setParameterContextUpdates(List<ParameterContextUpdateEntity> parameterContextUpdates) {
        this.parameterContextUpdates = parameterContextUpdates;
    }

    public ParameterProviderApplyParametersRequestDTO referencingComponents(List<AffectedComponentEntity> referencingComponents) {
        this.referencingComponents = referencingComponents;
        return this;
    }

    public ParameterProviderApplyParametersRequestDTO addReferencingComponentsItem(AffectedComponentEntity referencingComponentsItem) {
        this.referencingComponents.add(referencingComponentsItem);
        return this;
    }

    /**
     * The components that are referenced by the update.
     * @return referencingComponents
     **/
    @ApiModelProperty(example = "null", value = "The components that are referenced by the update.")
    public List<AffectedComponentEntity> getReferencingComponents() {
        return referencingComponents;
    }

    public void setReferencingComponents(List<AffectedComponentEntity> referencingComponents) {
        this.referencingComponents = referencingComponents;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ParameterProviderApplyParametersRequestDTO parameterProviderApplyParametersRequestDTO = (ParameterProviderApplyParametersRequestDTO) o;
        return Objects.equals(this.requestId, parameterProviderApplyParametersRequestDTO.requestId) &&
                Objects.equals(this.uri, parameterProviderApplyParametersRequestDTO.uri) &&
                Objects.equals(this.submissionTime, parameterProviderApplyParametersRequestDTO.submissionTime) &&
                Objects.equals(this.lastUpdated, parameterProviderApplyParametersRequestDTO.lastUpdated) &&
                Objects.equals(this.complete, parameterProviderApplyParametersRequestDTO.complete) &&
                Objects.equals(this.failureReason, parameterProviderApplyParametersRequestDTO.failureReason) &&
                Objects.equals(this.percentCompleted, parameterProviderApplyParametersRequestDTO.percentCompleted) &&
                Objects.equals(this.state, parameterProviderApplyParametersRequestDTO.state) &&
                Objects.equals(this.updateSteps, parameterProviderApplyParametersRequestDTO.updateSteps) &&
                Objects.equals(this.parameterProvider, parameterProviderApplyParametersRequestDTO.parameterProvider) &&
                Objects.equals(this.parameterContextUpdates, parameterProviderApplyParametersRequestDTO.parameterContextUpdates) &&
                Objects.equals(this.referencingComponents, parameterProviderApplyParametersRequestDTO.referencingComponents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, uri, submissionTime, lastUpdated, complete, failureReason, percentCompleted, state, updateSteps, parameterProvider, parameterContextUpdates, referencingComponents);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ParameterProviderApplyParametersRequestDTO {\n");

        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
        sb.append("    submissionTime: ").append(toIndentedString(submissionTime)).append("\n");
        sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
        sb.append("    complete: ").append(toIndentedString(complete)).append("\n");
        sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
        sb.append("    percentCompleted: ").append(toIndentedString(percentCompleted)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    updateSteps: ").append(toIndentedString(updateSteps)).append("\n");
        sb.append("    parameterProvider: ").append(toIndentedString(parameterProvider)).append("\n");
        sb.append("    parameterContextUpdates: ").append(toIndentedString(parameterContextUpdates)).append("\n");
        sb.append("    referencingComponents: ").append(toIndentedString(referencingComponents)).append("\n");
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

