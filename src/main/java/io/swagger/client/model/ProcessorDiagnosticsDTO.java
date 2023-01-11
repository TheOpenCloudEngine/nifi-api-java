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
 * ProcessorDiagnosticsDTO
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-11T13:57:19.352+09:00")
public class ProcessorDiagnosticsDTO {
    @SerializedName("processor")
    private ProcessorDTO processor = null;

    @SerializedName("processorStatus")
    private ProcessorStatusDTO processorStatus = null;

    @SerializedName("referencedControllerServices")
    private List<ControllerServiceDiagnosticsDTO> referencedControllerServices = new ArrayList<ControllerServiceDiagnosticsDTO>();

    @SerializedName("incomingConnections")
    private List<ConnectionDiagnosticsDTO> incomingConnections = new ArrayList<ConnectionDiagnosticsDTO>();

    @SerializedName("outgoingConnections")
    private List<ConnectionDiagnosticsDTO> outgoingConnections = new ArrayList<ConnectionDiagnosticsDTO>();

    @SerializedName("jvmDiagnostics")
    private JVMDiagnosticsDTO jvmDiagnostics = null;

    @SerializedName("threadDumps")
    private List<ThreadDumpDTO> threadDumps = new ArrayList<ThreadDumpDTO>();

    @SerializedName("classLoaderDiagnostics")
    private ClassLoaderDiagnosticsDTO classLoaderDiagnostics = null;

    public ProcessorDiagnosticsDTO processor(ProcessorDTO processor) {
        this.processor = processor;
        return this;
    }

    /**
     * Information about the Processor for which the Diagnostic Report is generated
     * @return processor
     **/
    @ApiModelProperty(example = "null", value = "Information about the Processor for which the Diagnostic Report is generated")
    public ProcessorDTO getProcessor() {
        return processor;
    }

    public void setProcessor(ProcessorDTO processor) {
        this.processor = processor;
    }

    public ProcessorDiagnosticsDTO processorStatus(ProcessorStatusDTO processorStatus) {
        this.processorStatus = processorStatus;
        return this;
    }

    /**
     * The Status for the Processor for which the Diagnostic Report is generated
     * @return processorStatus
     **/
    @ApiModelProperty(example = "null", value = "The Status for the Processor for which the Diagnostic Report is generated")
    public ProcessorStatusDTO getProcessorStatus() {
        return processorStatus;
    }

    public void setProcessorStatus(ProcessorStatusDTO processorStatus) {
        this.processorStatus = processorStatus;
    }

    public ProcessorDiagnosticsDTO referencedControllerServices(List<ControllerServiceDiagnosticsDTO> referencedControllerServices) {
        this.referencedControllerServices = referencedControllerServices;
        return this;
    }

    public ProcessorDiagnosticsDTO addReferencedControllerServicesItem(ControllerServiceDiagnosticsDTO referencedControllerServicesItem) {
        this.referencedControllerServices.add(referencedControllerServicesItem);
        return this;
    }

    /**
     * Diagnostic Information about all Controller Services that the Processor is referencing
     * @return referencedControllerServices
     **/
    @ApiModelProperty(example = "null", value = "Diagnostic Information about all Controller Services that the Processor is referencing")
    public List<ControllerServiceDiagnosticsDTO> getReferencedControllerServices() {
        return referencedControllerServices;
    }

    public void setReferencedControllerServices(List<ControllerServiceDiagnosticsDTO> referencedControllerServices) {
        this.referencedControllerServices = referencedControllerServices;
    }

    public ProcessorDiagnosticsDTO incomingConnections(List<ConnectionDiagnosticsDTO> incomingConnections) {
        this.incomingConnections = incomingConnections;
        return this;
    }

    public ProcessorDiagnosticsDTO addIncomingConnectionsItem(ConnectionDiagnosticsDTO incomingConnectionsItem) {
        this.incomingConnections.add(incomingConnectionsItem);
        return this;
    }

    /**
     * Diagnostic Information about all incoming Connections
     * @return incomingConnections
     **/
    @ApiModelProperty(example = "null", value = "Diagnostic Information about all incoming Connections")
    public List<ConnectionDiagnosticsDTO> getIncomingConnections() {
        return incomingConnections;
    }

    public void setIncomingConnections(List<ConnectionDiagnosticsDTO> incomingConnections) {
        this.incomingConnections = incomingConnections;
    }

    public ProcessorDiagnosticsDTO outgoingConnections(List<ConnectionDiagnosticsDTO> outgoingConnections) {
        this.outgoingConnections = outgoingConnections;
        return this;
    }

    public ProcessorDiagnosticsDTO addOutgoingConnectionsItem(ConnectionDiagnosticsDTO outgoingConnectionsItem) {
        this.outgoingConnections.add(outgoingConnectionsItem);
        return this;
    }

    /**
     * Diagnostic Information about all outgoing Connections
     * @return outgoingConnections
     **/
    @ApiModelProperty(example = "null", value = "Diagnostic Information about all outgoing Connections")
    public List<ConnectionDiagnosticsDTO> getOutgoingConnections() {
        return outgoingConnections;
    }

    public void setOutgoingConnections(List<ConnectionDiagnosticsDTO> outgoingConnections) {
        this.outgoingConnections = outgoingConnections;
    }

    public ProcessorDiagnosticsDTO jvmDiagnostics(JVMDiagnosticsDTO jvmDiagnostics) {
        this.jvmDiagnostics = jvmDiagnostics;
        return this;
    }

    /**
     * Diagnostic Information about the JVM and system-level diagnostics
     * @return jvmDiagnostics
     **/
    @ApiModelProperty(example = "null", value = "Diagnostic Information about the JVM and system-level diagnostics")
    public JVMDiagnosticsDTO getJvmDiagnostics() {
        return jvmDiagnostics;
    }

    public void setJvmDiagnostics(JVMDiagnosticsDTO jvmDiagnostics) {
        this.jvmDiagnostics = jvmDiagnostics;
    }

    public ProcessorDiagnosticsDTO threadDumps(List<ThreadDumpDTO> threadDumps) {
        this.threadDumps = threadDumps;
        return this;
    }

    public ProcessorDiagnosticsDTO addThreadDumpsItem(ThreadDumpDTO threadDumpsItem) {
        this.threadDumps.add(threadDumpsItem);
        return this;
    }

    /**
     * Thread Dumps that were taken of the threads that are active in the Processor
     * @return threadDumps
     **/
    @ApiModelProperty(example = "null", value = "Thread Dumps that were taken of the threads that are active in the Processor")
    public List<ThreadDumpDTO> getThreadDumps() {
        return threadDumps;
    }

    public void setThreadDumps(List<ThreadDumpDTO> threadDumps) {
        this.threadDumps = threadDumps;
    }

    public ProcessorDiagnosticsDTO classLoaderDiagnostics(ClassLoaderDiagnosticsDTO classLoaderDiagnostics) {
        this.classLoaderDiagnostics = classLoaderDiagnostics;
        return this;
    }

    /**
     * Information about the Controller Service's Class Loader
     * @return classLoaderDiagnostics
     **/
    @ApiModelProperty(example = "null", value = "Information about the Controller Service's Class Loader")
    public ClassLoaderDiagnosticsDTO getClassLoaderDiagnostics() {
        return classLoaderDiagnostics;
    }

    public void setClassLoaderDiagnostics(ClassLoaderDiagnosticsDTO classLoaderDiagnostics) {
        this.classLoaderDiagnostics = classLoaderDiagnostics;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProcessorDiagnosticsDTO processorDiagnosticsDTO = (ProcessorDiagnosticsDTO) o;
        return Objects.equals(this.processor, processorDiagnosticsDTO.processor) &&
                Objects.equals(this.processorStatus, processorDiagnosticsDTO.processorStatus) &&
                Objects.equals(this.referencedControllerServices, processorDiagnosticsDTO.referencedControllerServices) &&
                Objects.equals(this.incomingConnections, processorDiagnosticsDTO.incomingConnections) &&
                Objects.equals(this.outgoingConnections, processorDiagnosticsDTO.outgoingConnections) &&
                Objects.equals(this.jvmDiagnostics, processorDiagnosticsDTO.jvmDiagnostics) &&
                Objects.equals(this.threadDumps, processorDiagnosticsDTO.threadDumps) &&
                Objects.equals(this.classLoaderDiagnostics, processorDiagnosticsDTO.classLoaderDiagnostics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(processor, processorStatus, referencedControllerServices, incomingConnections, outgoingConnections, jvmDiagnostics, threadDumps, classLoaderDiagnostics);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProcessorDiagnosticsDTO {\n");

        sb.append("    processor: ").append(toIndentedString(processor)).append("\n");
        sb.append("    processorStatus: ").append(toIndentedString(processorStatus)).append("\n");
        sb.append("    referencedControllerServices: ").append(toIndentedString(referencedControllerServices)).append("\n");
        sb.append("    incomingConnections: ").append(toIndentedString(incomingConnections)).append("\n");
        sb.append("    outgoingConnections: ").append(toIndentedString(outgoingConnections)).append("\n");
        sb.append("    jvmDiagnostics: ").append(toIndentedString(jvmDiagnostics)).append("\n");
        sb.append("    threadDumps: ").append(toIndentedString(threadDumps)).append("\n");
        sb.append("    classLoaderDiagnostics: ").append(toIndentedString(classLoaderDiagnostics)).append("\n");
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

