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
 * BuildInfo
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-11T13:57:19.352+09:00")
public class BuildInfo {
    @SerializedName("version")
    private String version = null;

    @SerializedName("revision")
    private String revision = null;

    @SerializedName("timestamp")
    private Long timestamp = null;

    @SerializedName("targetArch")
    private String targetArch = null;

    @SerializedName("compiler")
    private String compiler = null;

    @SerializedName("compilerFlags")
    private String compilerFlags = null;

    public BuildInfo version(String version) {
        this.version = version;
        return this;
    }

    /**
     * The version number of the built component.
     * @return version
     **/
    @ApiModelProperty(example = "null", value = "The version number of the built component.")
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public BuildInfo revision(String revision) {
        this.revision = revision;
        return this;
    }

    /**
     * The SCM revision id of the source code used for this build.
     * @return revision
     **/
    @ApiModelProperty(example = "null", value = "The SCM revision id of the source code used for this build.")
    public String getRevision() {
        return revision;
    }

    public void setRevision(String revision) {
        this.revision = revision;
    }

    public BuildInfo timestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * The timestamp (milliseconds since Epoch) of the build.
     * @return timestamp
     **/
    @ApiModelProperty(example = "null", value = "The timestamp (milliseconds since Epoch) of the build.")
    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public BuildInfo targetArch(String targetArch) {
        this.targetArch = targetArch;
        return this;
    }

    /**
     * The target architecture of the built component.
     * @return targetArch
     **/
    @ApiModelProperty(example = "null", value = "The target architecture of the built component.")
    public String getTargetArch() {
        return targetArch;
    }

    public void setTargetArch(String targetArch) {
        this.targetArch = targetArch;
    }

    public BuildInfo compiler(String compiler) {
        this.compiler = compiler;
        return this;
    }

    /**
     * The compiler used for the build
     * @return compiler
     **/
    @ApiModelProperty(example = "null", value = "The compiler used for the build")
    public String getCompiler() {
        return compiler;
    }

    public void setCompiler(String compiler) {
        this.compiler = compiler;
    }

    public BuildInfo compilerFlags(String compilerFlags) {
        this.compilerFlags = compilerFlags;
        return this;
    }

    /**
     * The compiler flags used for the build.
     * @return compilerFlags
     **/
    @ApiModelProperty(example = "null", value = "The compiler flags used for the build.")
    public String getCompilerFlags() {
        return compilerFlags;
    }

    public void setCompilerFlags(String compilerFlags) {
        this.compilerFlags = compilerFlags;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BuildInfo buildInfo = (BuildInfo) o;
        return Objects.equals(this.version, buildInfo.version) &&
                Objects.equals(this.revision, buildInfo.revision) &&
                Objects.equals(this.timestamp, buildInfo.timestamp) &&
                Objects.equals(this.targetArch, buildInfo.targetArch) &&
                Objects.equals(this.compiler, buildInfo.compiler) &&
                Objects.equals(this.compilerFlags, buildInfo.compilerFlags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version, revision, timestamp, targetArch, compiler, compilerFlags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BuildInfo {\n");

        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    targetArch: ").append(toIndentedString(targetArch)).append("\n");
        sb.append("    compiler: ").append(toIndentedString(compiler)).append("\n");
        sb.append("    compilerFlags: ").append(toIndentedString(compilerFlags)).append("\n");
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

