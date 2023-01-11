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
 * Throwable
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-11T13:57:19.352+09:00")
public class Throwable {
    @SerializedName("cause")
    private Throwable cause = null;

    @SerializedName("stackTrace")
    private List<StackTraceElement> stackTrace = new ArrayList<StackTraceElement>();

    @SerializedName("message")
    private String message = null;

    @SerializedName("suppressed")
    private List<Throwable> suppressed = new ArrayList<Throwable>();

    @SerializedName("localizedMessage")
    private String localizedMessage = null;

    public Throwable cause(Throwable cause) {
        this.cause = cause;
        return this;
    }

    /**
     * Get cause
     * @return cause
     **/
    @ApiModelProperty(example = "null", value = "")
    public Throwable getCause() {
        return cause;
    }

    public void setCause(Throwable cause) {
        this.cause = cause;
    }

    public Throwable stackTrace(List<StackTraceElement> stackTrace) {
        this.stackTrace = stackTrace;
        return this;
    }

    public Throwable addStackTraceItem(StackTraceElement stackTraceItem) {
        this.stackTrace.add(stackTraceItem);
        return this;
    }

    /**
     * Get stackTrace
     * @return stackTrace
     **/
    @ApiModelProperty(example = "null", value = "")
    public List<StackTraceElement> getStackTrace() {
        return stackTrace;
    }

    public void setStackTrace(List<StackTraceElement> stackTrace) {
        this.stackTrace = stackTrace;
    }

    public Throwable message(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get message
     * @return message
     **/
    @ApiModelProperty(example = "null", value = "")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Throwable suppressed(List<Throwable> suppressed) {
        this.suppressed = suppressed;
        return this;
    }

    public Throwable addSuppressedItem(Throwable suppressedItem) {
        this.suppressed.add(suppressedItem);
        return this;
    }

    /**
     * Get suppressed
     * @return suppressed
     **/
    @ApiModelProperty(example = "null", value = "")
    public List<Throwable> getSuppressed() {
        return suppressed;
    }

    public void setSuppressed(List<Throwable> suppressed) {
        this.suppressed = suppressed;
    }

    public Throwable localizedMessage(String localizedMessage) {
        this.localizedMessage = localizedMessage;
        return this;
    }

    /**
     * Get localizedMessage
     * @return localizedMessage
     **/
    @ApiModelProperty(example = "null", value = "")
    public String getLocalizedMessage() {
        return localizedMessage;
    }

    public void setLocalizedMessage(String localizedMessage) {
        this.localizedMessage = localizedMessage;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Throwable throwable = (Throwable) o;
        return Objects.equals(this.cause, throwable.cause) &&
                Objects.equals(this.stackTrace, throwable.stackTrace) &&
                Objects.equals(this.message, throwable.message) &&
                Objects.equals(this.suppressed, throwable.suppressed) &&
                Objects.equals(this.localizedMessage, throwable.localizedMessage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cause, stackTrace, message, suppressed, localizedMessage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Throwable {\n");

        sb.append("    cause: ").append(toIndentedString(cause)).append("\n");
        sb.append("    stackTrace: ").append(toIndentedString(stackTrace)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    suppressed: ").append(toIndentedString(suppressed)).append("\n");
        sb.append("    localizedMessage: ").append(toIndentedString(localizedMessage)).append("\n");
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

