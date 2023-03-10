# NiFi Java API Client

본 프로젝트는  1.19.1 버전을 위해서 개발이 된것으로 타 버전도 동일한 절차에 따라서 진행하도록 합니다.

## Overview

* NiFi 소스코드를 다운로드하여 swagger.json 파일의 위치를 확인합니다.
* Swagger Codegen으로 swagger.json 파일을 로딩하여 Java로 변환합니다.
* 변환된 코드에서 NiFi 상위버전 부터 SSL 필수이므로 SSL 인증서 처리 및 OAuth 인증 처리 부분을 수정합니다.
  * OkHTTP를 사용하므로 SSL을 무시하도록 하고 Basic Auth, OAuth2를 추가하도록 합니다.

## Swagger Codegen

Swagger Codegen을 이용하여 Client API를 생성합니다.

```
# cd nifi-1.19.1
# mvn -Dmaven.test.skip=true install
# wget https://oss.sonatype.org/content/repositories/releases/io/swagger/swagger-codegen-cli/2.2.1/swagger-codegen-cli-2.2.1.jar
# java -jar swagger-codegen-cli-2.2.1.jar generate -i ../nifi-nar-bundles/nifi-framework-bundle/nifi-framework/nifi-web/nifi-web-api/target/swagger-ui/swagger.json -l java
```

## Requirements

* Apache Maven

## Installation

Maven Install을 통해서 JAR 파일을 다음과 같이 생성합니다.

```shell
mvn install
```

## API 호출

API 호출을 위해서 Basic Auth로 Access Token을 얻습니다.

```java
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.AccessApi;

import java.io.File;
import java.util.*;

public class AccessApiExample {

    public static void main(String[] args) {
        AccessApi accessApi = new AccessApi();
        ApiClient client = new ApiClient(true);
        client.setDebugging(true);
        client.addDefaultHeader("Authorization", getBasicAuthenticationHeader("admin", "adminadminadmin"));
        client.setBasePath("https://localhost:8443/nifi-api");

        accessApi.setApiClient(client);
        String accessToken = accessApi.createAccessToken("admin", "adminadminadmin");
    }
}

```

Access Token을 이용하여 API를 호출합니다.

```java
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.AccessApi;

import java.io.File;
import java.util.*;

public class ResourcesApiExample {

    public static void main(String[] args) {
        ResourcesApi api = new ResourcesApi();

        ApiClient client = new ApiClient(true);
        client.setDebugging(true);
        client.setBasePath("https://localhost:8443/nifi-api");
        client.addDefaultHeader("Authorization", String.format("Bearer %s", accessToken));
        api.setApiClient(client);

        ResourcesEntity response = api.getResources();
    }
}
```

## API Endpoints

All URIs are relative to *http://localhost/nifi-api*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccessApi* | [**createAccessToken**](docs/AccessApi.md#createAccessToken) | **POST** /access/token | Creates a token for accessing the REST API via username/password
*AccessApi* | [**createAccessTokenFromTicket**](docs/AccessApi.md#createAccessTokenFromTicket) | **POST** /access/kerberos | Creates a token for accessing the REST API via Kerberos ticket exchange / SPNEGO negotiation
*AccessApi* | [**getAccessStatus**](docs/AccessApi.md#getAccessStatus) | **GET** /access | Gets the status the client&#39;s access
*AccessApi* | [**getAccessTokenExpiration**](docs/AccessApi.md#getAccessTokenExpiration) | **GET** /access/token/expiration | Get expiration for current Access Token
*AccessApi* | [**getLoginConfig**](docs/AccessApi.md#getLoginConfig) | **GET** /access/config | Retrieves the access configuration for this NiFi
*AccessApi* | [**knoxCallback**](docs/AccessApi.md#knoxCallback) | **GET** /access/knox/callback | Redirect/callback URI for processing the result of the Apache Knox login sequence.
*AccessApi* | [**knoxLogout**](docs/AccessApi.md#knoxLogout) | **GET** /access/knox/logout | Performs a logout in the Apache Knox.
*AccessApi* | [**knoxRequest**](docs/AccessApi.md#knoxRequest) | **GET** /access/knox/request | Initiates a request to authenticate through Apache Knox.
*AccessApi* | [**logOut**](docs/AccessApi.md#logOut) | **DELETE** /access/logout | Performs a logout for other providers that have been issued a JWT.
*AccessApi* | [**logOutComplete**](docs/AccessApi.md#logOutComplete) | **GET** /access/logout/complete | Completes the logout sequence by removing the cached Logout Request and Cookie if they existed and redirects to /nifi/login.
*AccessoidcApi* | [**oidcCallback**](docs/AccessoidcApi.md#oidcCallback) | **GET** /access/oidc/callback | Redirect/callback URI for processing the result of the OpenId Connect login sequence.
*AccessoidcApi* | [**oidcExchange**](docs/AccessoidcApi.md#oidcExchange) | **POST** /access/oidc/exchange | Retrieves a JWT following a successful login sequence using the configured OpenId Connect provider.
*AccessoidcApi* | [**oidcLogout**](docs/AccessoidcApi.md#oidcLogout) | **GET** /access/oidc/logout | Performs a logout in the OpenId Provider.
*AccessoidcApi* | [**oidcLogoutCallback**](docs/AccessoidcApi.md#oidcLogoutCallback) | **GET** /access/oidc/logoutCallback | Redirect/callback URI for processing the result of the OpenId Connect logout sequence.
*AccessoidcApi* | [**oidcRequest**](docs/AccessoidcApi.md#oidcRequest) | **GET** /access/oidc/request | Initiates a request to authenticate through the configured OpenId Connect provider.
*ConnectionsApi* | [**deleteConnection**](docs/ConnectionsApi.md#deleteConnection) | **DELETE** /connections/{id} | Deletes a connection
*ConnectionsApi* | [**getConnection**](docs/ConnectionsApi.md#getConnection) | **GET** /connections/{id} | Gets a connection
*ConnectionsApi* | [**updateConnection**](docs/ConnectionsApi.md#updateConnection) | **PUT** /connections/{id} | Updates a connection
*ControllerApi* | [**createBulletin**](docs/ControllerApi.md#createBulletin) | **POST** /controller/bulletin | Creates a new bulletin
*ControllerApi* | [**createControllerService**](docs/ControllerApi.md#createControllerService) | **POST** /controller/controller-services | Creates a new controller service
*ControllerApi* | [**createFlowRegistryClient**](docs/ControllerApi.md#createFlowRegistryClient) | **POST** /controller/registry-clients | Creates a new flow registry client
*ControllerApi* | [**createParameterProvider**](docs/ControllerApi.md#createParameterProvider) | **POST** /controller/parameter-providers | Creates a new parameter provider
*ControllerApi* | [**createReportingTask**](docs/ControllerApi.md#createReportingTask) | **POST** /controller/reporting-tasks | Creates a new reporting task
*ControllerApi* | [**deleteFlowRegistryClient**](docs/ControllerApi.md#deleteFlowRegistryClient) | **DELETE** /controller/registry-clients/{id} | Deletes a flow registry client
*ControllerApi* | [**deleteHistory**](docs/ControllerApi.md#deleteHistory) | **DELETE** /controller/history | Purges history
*ControllerApi* | [**deleteNode**](docs/ControllerApi.md#deleteNode) | **DELETE** /controller/cluster/nodes/{id} | Removes a node from the cluster
*ControllerApi* | [**getCluster**](docs/ControllerApi.md#getCluster) | **GET** /controller/cluster | Gets the contents of the cluster
*ControllerApi* | [**getControllerConfig**](docs/ControllerApi.md#getControllerConfig) | **GET** /controller/config | Retrieves the configuration for this NiFi Controller
*ControllerApi* | [**getFlowRegistryClient**](docs/ControllerApi.md#getFlowRegistryClient) | **GET** /controller/registry-clients/{id} | Gets a flow registry client
*ControllerApi* | [**getFlowRegistryClients**](docs/ControllerApi.md#getFlowRegistryClients) | **GET** /controller/registry-clients | Gets the listing of available flow registry clients
*ControllerApi* | [**getNode**](docs/ControllerApi.md#getNode) | **GET** /controller/cluster/nodes/{id} | Gets a node in the cluster
*ControllerApi* | [**getNodeStatusHistory**](docs/ControllerApi.md#getNodeStatusHistory) | **GET** /controller/status/history | Gets status history for the node
*ControllerApi* | [**getPropertyDescriptor**](docs/ControllerApi.md#getPropertyDescriptor) | **GET** /controller/registry-clients/{id}/descriptors | Gets a flow registry client property descriptor
*ControllerApi* | [**getRegistryClientTypes**](docs/ControllerApi.md#getRegistryClientTypes) | **GET** /controller/registry-types | Retrieves the types of flow  that this NiFi supports
*ControllerApi* | [**updateControllerConfig**](docs/ControllerApi.md#updateControllerConfig) | **PUT** /controller/config | Retrieves the configuration for this NiFi
*ControllerApi* | [**updateFlowRegistryClient**](docs/ControllerApi.md#updateFlowRegistryClient) | **PUT** /controller/registry-clients/{id} | Updates a flow registry client
*ControllerApi* | [**updateNode**](docs/ControllerApi.md#updateNode) | **PUT** /controller/cluster/nodes/{id} | Updates a node in the cluster
*ControllerservicesApi* | [**analyzeConfiguration**](docs/ControllerservicesApi.md#analyzeConfiguration) | **POST** /controller-services/{id}/config/analysis | Performs analysis of the component&#39;s configuration, providing information about which attributes are referenced.
*ControllerservicesApi* | [**clearState**](docs/ControllerservicesApi.md#clearState) | **POST** /controller-services/{id}/state/clear-requests | Clears the state for a controller service
*ControllerservicesApi* | [**deleteVerificationRequest**](docs/ControllerservicesApi.md#deleteVerificationRequest) | **DELETE** /controller-services/{id}/config/verification-requests/{requestId} | Deletes the Verification Request with the given ID
*ControllerservicesApi* | [**getControllerService**](docs/ControllerservicesApi.md#getControllerService) | **GET** /controller-services/{id} | Gets a controller service
*ControllerservicesApi* | [**getControllerServiceReferences**](docs/ControllerservicesApi.md#getControllerServiceReferences) | **GET** /controller-services/{id}/references | Gets a controller service
*ControllerservicesApi* | [**getPropertyDescriptor**](docs/ControllerservicesApi.md#getPropertyDescriptor) | **GET** /controller-services/{id}/descriptors | Gets a controller service property descriptor
*ControllerservicesApi* | [**getState**](docs/ControllerservicesApi.md#getState) | **GET** /controller-services/{id}/state | Gets the state for a controller service
*ControllerservicesApi* | [**getVerificationRequest**](docs/ControllerservicesApi.md#getVerificationRequest) | **GET** /controller-services/{id}/config/verification-requests/{requestId} | Returns the Verification Request with the given ID
*ControllerservicesApi* | [**removeControllerService**](docs/ControllerservicesApi.md#removeControllerService) | **DELETE** /controller-services/{id} | Deletes a controller service
*ControllerservicesApi* | [**submitConfigVerificationRequest**](docs/ControllerservicesApi.md#submitConfigVerificationRequest) | **POST** /controller-services/{id}/config/verification-requests | Performs verification of the Controller Service&#39;s configuration
*ControllerservicesApi* | [**updateControllerService**](docs/ControllerservicesApi.md#updateControllerService) | **PUT** /controller-services/{id} | Updates a controller service
*ControllerservicesApi* | [**updateControllerServiceReferences**](docs/ControllerservicesApi.md#updateControllerServiceReferences) | **PUT** /controller-services/{id}/references | Updates a controller services references
*ControllerservicesApi* | [**updateRunStatus**](docs/ControllerservicesApi.md#updateRunStatus) | **PUT** /controller-services/{id}/run-status | Updates run status of a controller service
*CountersApi* | [**getCounters**](docs/CountersApi.md#getCounters) | **GET** /counters | Gets the current counters for this NiFi
*CountersApi* | [**updateCounter**](docs/CountersApi.md#updateCounter) | **PUT** /counters/{id} | Updates the specified counter. This will reset the counter value to 0
*DatatransferApi* | [**commitInputPortTransaction**](docs/DatatransferApi.md#commitInputPortTransaction) | **DELETE** /data-transfer/input-ports/{portId}/transactions/{transactionId} | Commit or cancel the specified transaction
*DatatransferApi* | [**commitOutputPortTransaction**](docs/DatatransferApi.md#commitOutputPortTransaction) | **DELETE** /data-transfer/output-ports/{portId}/transactions/{transactionId} | Commit or cancel the specified transaction
*DatatransferApi* | [**createPortTransaction**](docs/DatatransferApi.md#createPortTransaction) | **POST** /data-transfer/{portType}/{portId}/transactions | Create a transaction to the specified output port or input port
*DatatransferApi* | [**extendInputPortTransactionTTL**](docs/DatatransferApi.md#extendInputPortTransactionTTL) | **PUT** /data-transfer/input-ports/{portId}/transactions/{transactionId} | Extend transaction TTL
*DatatransferApi* | [**extendOutputPortTransactionTTL**](docs/DatatransferApi.md#extendOutputPortTransactionTTL) | **PUT** /data-transfer/output-ports/{portId}/transactions/{transactionId} | Extend transaction TTL
*DatatransferApi* | [**receiveFlowFiles**](docs/DatatransferApi.md#receiveFlowFiles) | **POST** /data-transfer/input-ports/{portId}/transactions/{transactionId}/flow-files | Transfer flow files to the input port
*DatatransferApi* | [**transferFlowFiles**](docs/DatatransferApi.md#transferFlowFiles) | **GET** /data-transfer/output-ports/{portId}/transactions/{transactionId}/flow-files | Transfer flow files from the output port
*FlowApi* | [**activateControllerServices**](docs/FlowApi.md#activateControllerServices) | **PUT** /flow/process-groups/{id}/controller-services | Enable or disable Controller Services in the specified Process Group.
*FlowApi* | [**generateClientId**](docs/FlowApi.md#generateClientId) | **GET** /flow/client-id | Generates a client id.
*FlowApi* | [**getAboutInfo**](docs/FlowApi.md#getAboutInfo) | **GET** /flow/about | Retrieves details about this NiFi to put in the About dialog
*FlowApi* | [**getAction**](docs/FlowApi.md#getAction) | **GET** /flow/history/{id} | Gets an action
*FlowApi* | [**getBanners**](docs/FlowApi.md#getBanners) | **GET** /flow/banners | Retrieves the banners for this NiFi
*FlowApi* | [**getBuckets**](docs/FlowApi.md#getBuckets) | **GET** /flow/registries/{id}/buckets | Gets the buckets from the specified registry for the current user
*FlowApi* | [**getBulletinBoard**](docs/FlowApi.md#getBulletinBoard) | **GET** /flow/bulletin-board | Gets current bulletins
*FlowApi* | [**getBulletins**](docs/FlowApi.md#getBulletins) | **GET** /flow/controller/bulletins | Retrieves Controller level bulletins
*FlowApi* | [**getClusterSummary**](docs/FlowApi.md#getClusterSummary) | **GET** /flow/cluster/summary | The cluster summary for this NiFi
*FlowApi* | [**getComponentHistory**](docs/FlowApi.md#getComponentHistory) | **GET** /flow/history/components/{componentId} | Gets configuration history for a component
*FlowApi* | [**getConnectionStatistics**](docs/FlowApi.md#getConnectionStatistics) | **GET** /flow/connections/{id}/statistics | Gets statistics for a connection
*FlowApi* | [**getConnectionStatus**](docs/FlowApi.md#getConnectionStatus) | **GET** /flow/connections/{id}/status | Gets status for a connection
*FlowApi* | [**getConnectionStatusHistory**](docs/FlowApi.md#getConnectionStatusHistory) | **GET** /flow/connections/{id}/status/history | Gets the status history for a connection
*FlowApi* | [**getControllerServiceTypes**](docs/FlowApi.md#getControllerServiceTypes) | **GET** /flow/controller-service-types | Retrieves the types of controller services that this NiFi supports
*FlowApi* | [**getControllerServicesFromController**](docs/FlowApi.md#getControllerServicesFromController) | **GET** /flow/controller/controller-services | Gets controller services for reporting tasks
*FlowApi* | [**getControllerServicesFromGroup**](docs/FlowApi.md#getControllerServicesFromGroup) | **GET** /flow/process-groups/{id}/controller-services | Gets all controller services
*FlowApi* | [**getControllerStatus**](docs/FlowApi.md#getControllerStatus) | **GET** /flow/status | Gets the current status of this NiFi
*FlowApi* | [**getCurrentUser**](docs/FlowApi.md#getCurrentUser) | **GET** /flow/current-user | Retrieves the user identity of the user making the request
*FlowApi* | [**getDetails**](docs/FlowApi.md#getDetails) | **GET** /flow/registries/{registry-id}/buckets/{bucket-id}/flows/{flow-id}/details | Gets the details of a flow from the specified registry and bucket for the specified flow for the current user
*FlowApi* | [**getFlow**](docs/FlowApi.md#getFlow) | **GET** /flow/process-groups/{id} | Gets a process group
*FlowApi* | [**getFlowConfig**](docs/FlowApi.md#getFlowConfig) | **GET** /flow/config | Retrieves the configuration for this NiFi flow
*FlowApi* | [**getFlowMetrics**](docs/FlowApi.md#getFlowMetrics) | **GET** /flow/metrics/{producer} | Gets all metrics for the flow from a particular node
*FlowApi* | [**getFlows**](docs/FlowApi.md#getFlows) | **GET** /flow/registries/{registry-id}/buckets/{bucket-id}/flows | Gets the flows from the specified registry and bucket for the current user
*FlowApi* | [**getInputPortStatus**](docs/FlowApi.md#getInputPortStatus) | **GET** /flow/input-ports/{id}/status | Gets status for an input port
*FlowApi* | [**getOutputPortStatus**](docs/FlowApi.md#getOutputPortStatus) | **GET** /flow/output-ports/{id}/status | Gets status for an output port
*FlowApi* | [**getParameterContexts**](docs/FlowApi.md#getParameterContexts) | **GET** /flow/parameter-contexts | Gets all Parameter Contexts
*FlowApi* | [**getParameterProviderTypes**](docs/FlowApi.md#getParameterProviderTypes) | **GET** /flow/parameter-provider-types | Retrieves the types of parameter providers that this NiFi supports
*FlowApi* | [**getParameterProviders**](docs/FlowApi.md#getParameterProviders) | **GET** /flow/parameter-providers | Gets all parameter providers
*FlowApi* | [**getPrioritizers**](docs/FlowApi.md#getPrioritizers) | **GET** /flow/prioritizers | Retrieves the types of prioritizers that this NiFi supports
*FlowApi* | [**getProcessGroupStatus**](docs/FlowApi.md#getProcessGroupStatus) | **GET** /flow/process-groups/{id}/status | Gets the status for a process group
*FlowApi* | [**getProcessGroupStatusHistory**](docs/FlowApi.md#getProcessGroupStatusHistory) | **GET** /flow/process-groups/{id}/status/history | Gets status history for a remote process group
*FlowApi* | [**getProcessorStatus**](docs/FlowApi.md#getProcessorStatus) | **GET** /flow/processors/{id}/status | Gets status for a processor
*FlowApi* | [**getProcessorStatusHistory**](docs/FlowApi.md#getProcessorStatusHistory) | **GET** /flow/processors/{id}/status/history | Gets status history for a processor
*FlowApi* | [**getProcessorTypes**](docs/FlowApi.md#getProcessorTypes) | **GET** /flow/processor-types | Retrieves the types of processors that this NiFi supports
*FlowApi* | [**getRegistryClients**](docs/FlowApi.md#getRegistryClients) | **GET** /flow/registries | Gets the listing of available flow registry clients
*FlowApi* | [**getRemoteProcessGroupStatus**](docs/FlowApi.md#getRemoteProcessGroupStatus) | **GET** /flow/remote-process-groups/{id}/status | Gets status for a remote process group
*FlowApi* | [**getRemoteProcessGroupStatusHistory**](docs/FlowApi.md#getRemoteProcessGroupStatusHistory) | **GET** /flow/remote-process-groups/{id}/status/history | Gets the status history
*FlowApi* | [**getReportingTaskTypes**](docs/FlowApi.md#getReportingTaskTypes) | **GET** /flow/reporting-task-types | Retrieves the types of reporting tasks that this NiFi supports
*FlowApi* | [**getReportingTasks**](docs/FlowApi.md#getReportingTasks) | **GET** /flow/reporting-tasks | Gets all reporting tasks
*FlowApi* | [**getRuntimeManifest**](docs/FlowApi.md#getRuntimeManifest) | **GET** /flow/runtime-manifest | Retrieves the runtime manifest for this NiFi instance.
*FlowApi* | [**getTemplates**](docs/FlowApi.md#getTemplates) | **GET** /flow/templates | Gets all templates
*FlowApi* | [**getVersions**](docs/FlowApi.md#getVersions) | **GET** /flow/registries/{registry-id}/buckets/{bucket-id}/flows/{flow-id}/versions | Gets the flow versions from the specified registry and bucket for the specified flow for the current user
*FlowApi* | [**queryHistory**](docs/FlowApi.md#queryHistory) | **GET** /flow/history | Gets configuration history
*FlowApi* | [**scheduleComponents**](docs/FlowApi.md#scheduleComponents) | **PUT** /flow/process-groups/{id} | Schedule or unschedule components in the specified Process Group.
*FlowApi* | [**searchCluster**](docs/FlowApi.md#searchCluster) | **GET** /flow/cluster/search-results | Searches the cluster for a node with the specified address
*FlowApi* | [**searchFlow**](docs/FlowApi.md#searchFlow) | **GET** /flow/search-results | Performs a search against this NiFi using the specified search term
*FlowfilequeuesApi* | [**createDropRequest**](docs/FlowfilequeuesApi.md#createDropRequest) | **POST** /flowfile-queues/{id}/drop-requests | Creates a request to drop the contents of the queue in this connection.
*FlowfilequeuesApi* | [**createFlowFileListing**](docs/FlowfilequeuesApi.md#createFlowFileListing) | **POST** /flowfile-queues/{id}/listing-requests | Lists the contents of the queue in this connection.
*FlowfilequeuesApi* | [**deleteListingRequest**](docs/FlowfilequeuesApi.md#deleteListingRequest) | **DELETE** /flowfile-queues/{id}/listing-requests/{listing-request-id} | Cancels and/or removes a request to list the contents of this connection.
*FlowfilequeuesApi* | [**downloadFlowFileContent**](docs/FlowfilequeuesApi.md#downloadFlowFileContent) | **GET** /flowfile-queues/{id}/flowfiles/{flowfile-uuid}/content | Gets the content for a FlowFile in a Connection.
*FlowfilequeuesApi* | [**getDropRequest**](docs/FlowfilequeuesApi.md#getDropRequest) | **GET** /flowfile-queues/{id}/drop-requests/{drop-request-id} | Gets the current status of a drop request for the specified connection.
*FlowfilequeuesApi* | [**getFlowFile**](docs/FlowfilequeuesApi.md#getFlowFile) | **GET** /flowfile-queues/{id}/flowfiles/{flowfile-uuid} | Gets a FlowFile from a Connection.
*FlowfilequeuesApi* | [**getListingRequest**](docs/FlowfilequeuesApi.md#getListingRequest) | **GET** /flowfile-queues/{id}/listing-requests/{listing-request-id} | Gets the current status of a listing request for the specified connection.
*FlowfilequeuesApi* | [**removeDropRequest**](docs/FlowfilequeuesApi.md#removeDropRequest) | **DELETE** /flowfile-queues/{id}/drop-requests/{drop-request-id} | Cancels and/or removes a request to drop the contents of this connection.
*FunnelApi* | [**getFunnel**](docs/FunnelApi.md#getFunnel) | **GET** /funnels/{id} | Gets a funnel
*FunnelApi* | [**removeFunnel**](docs/FunnelApi.md#removeFunnel) | **DELETE** /funnels/{id} | Deletes a funnel
*FunnelApi* | [**updateFunnel**](docs/FunnelApi.md#updateFunnel) | **PUT** /funnels/{id} | Updates a funnel
*InputportsApi* | [**getInputPort**](docs/InputportsApi.md#getInputPort) | **GET** /input-ports/{id} | Gets an input port
*InputportsApi* | [**removeInputPort**](docs/InputportsApi.md#removeInputPort) | **DELETE** /input-ports/{id} | Deletes an input port
*InputportsApi* | [**updateInputPort**](docs/InputportsApi.md#updateInputPort) | **PUT** /input-ports/{id} | Updates an input port
*InputportsApi* | [**updateRunStatus**](docs/InputportsApi.md#updateRunStatus) | **PUT** /input-ports/{id}/run-status | Updates run status of an input-port
*LabelsApi* | [**getLabel**](docs/LabelsApi.md#getLabel) | **GET** /labels/{id} | Gets a label
*LabelsApi* | [**removeLabel**](docs/LabelsApi.md#removeLabel) | **DELETE** /labels/{id} | Deletes a label
*LabelsApi* | [**updateLabel**](docs/LabelsApi.md#updateLabel) | **PUT** /labels/{id} | Updates a label
*OutputportsApi* | [**getOutputPort**](docs/OutputportsApi.md#getOutputPort) | **GET** /output-ports/{id} | Gets an output port
*OutputportsApi* | [**removeOutputPort**](docs/OutputportsApi.md#removeOutputPort) | **DELETE** /output-ports/{id} | Deletes an output port
*OutputportsApi* | [**updateOutputPort**](docs/OutputportsApi.md#updateOutputPort) | **PUT** /output-ports/{id} | Updates an output port
*OutputportsApi* | [**updateRunStatus**](docs/OutputportsApi.md#updateRunStatus) | **PUT** /output-ports/{id}/run-status | Updates run status of an output-port
*ParametercontextsApi* | [**createParameterContext**](docs/ParametercontextsApi.md#createParameterContext) | **POST** /parameter-contexts | Create a Parameter Context
*ParametercontextsApi* | [**deleteParameterContext**](docs/ParametercontextsApi.md#deleteParameterContext) | **DELETE** /parameter-contexts/{id} | Deletes the Parameter Context with the given ID
*ParametercontextsApi* | [**deleteUpdateRequest**](docs/ParametercontextsApi.md#deleteUpdateRequest) | **DELETE** /parameter-contexts/{contextId}/update-requests/{requestId} | Deletes the Update Request with the given ID
*ParametercontextsApi* | [**deleteValidationRequest**](docs/ParametercontextsApi.md#deleteValidationRequest) | **DELETE** /parameter-contexts/{contextId}/validation-requests/{id} | Deletes the Validation Request with the given ID
*ParametercontextsApi* | [**getParameterContext**](docs/ParametercontextsApi.md#getParameterContext) | **GET** /parameter-contexts/{id} | Returns the Parameter Context with the given ID
*ParametercontextsApi* | [**getParameterContextUpdate**](docs/ParametercontextsApi.md#getParameterContextUpdate) | **GET** /parameter-contexts/{contextId}/update-requests/{requestId} | Returns the Update Request with the given ID
*ParametercontextsApi* | [**getValidationRequest**](docs/ParametercontextsApi.md#getValidationRequest) | **GET** /parameter-contexts/{contextId}/validation-requests/{id} | Returns the Validation Request with the given ID
*ParametercontextsApi* | [**submitParameterContextUpdate**](docs/ParametercontextsApi.md#submitParameterContextUpdate) | **POST** /parameter-contexts/{contextId}/update-requests | Initiate the Update Request of a Parameter Context
*ParametercontextsApi* | [**submitValidationRequest**](docs/ParametercontextsApi.md#submitValidationRequest) | **POST** /parameter-contexts/{contextId}/validation-requests | Initiate a Validation Request to determine how the validity of components will change if a Parameter Context were to be updated
*ParametercontextsApi* | [**updateParameterContext**](docs/ParametercontextsApi.md#updateParameterContext) | **PUT** /parameter-contexts/{id} | Modifies a Parameter Context
*ParameterprovidersApi* | [**analyzeConfiguration**](docs/ParameterprovidersApi.md#analyzeConfiguration) | **POST** /parameter-providers/{id}/config/analysis | Performs analysis of the component&#39;s configuration, providing information about which attributes are referenced.
*ParameterprovidersApi* | [**clearState**](docs/ParameterprovidersApi.md#clearState) | **POST** /parameter-providers/{id}/state/clear-requests | Clears the state for a parameter provider
*ParameterprovidersApi* | [**deleteApplyParametersRequest**](docs/ParameterprovidersApi.md#deleteApplyParametersRequest) | **DELETE** /parameter-providers/{providerId}/apply-parameters-requests/{requestId} | Deletes the Apply Parameters Request with the given ID
*ParameterprovidersApi* | [**deleteVerificationRequest**](docs/ParameterprovidersApi.md#deleteVerificationRequest) | **DELETE** /parameter-providers/{id}/config/verification-requests/{requestId} | Deletes the Verification Request with the given ID
*ParameterprovidersApi* | [**fetchParameters**](docs/ParameterprovidersApi.md#fetchParameters) | **POST** /parameter-providers/{id}/parameters/fetch-requests | Fetches and temporarily caches the parameters for a provider
*ParameterprovidersApi* | [**getParameterProvider**](docs/ParameterprovidersApi.md#getParameterProvider) | **GET** /parameter-providers/{id} | Gets a parameter provider
*ParameterprovidersApi* | [**getParameterProviderApplyParametersRequest**](docs/ParameterprovidersApi.md#getParameterProviderApplyParametersRequest) | **GET** /parameter-providers/{providerId}/apply-parameters-requests/{requestId} | Returns the Apply Parameters Request with the given ID
*ParameterprovidersApi* | [**getParameterProviderReferences**](docs/ParameterprovidersApi.md#getParameterProviderReferences) | **GET** /parameter-providers/{id}/references | Gets all references to a parameter provider
*ParameterprovidersApi* | [**getPropertyDescriptor**](docs/ParameterprovidersApi.md#getPropertyDescriptor) | **GET** /parameter-providers/{id}/descriptors | Gets a parameter provider property descriptor
*ParameterprovidersApi* | [**getState**](docs/ParameterprovidersApi.md#getState) | **GET** /parameter-providers/{id}/state | Gets the state for a parameter provider
*ParameterprovidersApi* | [**getVerificationRequest**](docs/ParameterprovidersApi.md#getVerificationRequest) | **GET** /parameter-providers/{id}/config/verification-requests/{requestId} | Returns the Verification Request with the given ID
*ParameterprovidersApi* | [**removeParameterProvider**](docs/ParameterprovidersApi.md#removeParameterProvider) | **DELETE** /parameter-providers/{id} | Deletes a parameter provider
*ParameterprovidersApi* | [**submitApplyParameters**](docs/ParameterprovidersApi.md#submitApplyParameters) | **POST** /parameter-providers/{providerId}/apply-parameters-requests | Initiate a request to apply the fetched parameters of a Parameter Provider
*ParameterprovidersApi* | [**submitConfigVerificationRequest**](docs/ParameterprovidersApi.md#submitConfigVerificationRequest) | **POST** /parameter-providers/{id}/config/verification-requests | Performs verification of the Parameter Provider&#39;s configuration
*ParameterprovidersApi* | [**updateParameterProvider**](docs/ParameterprovidersApi.md#updateParameterProvider) | **PUT** /parameter-providers/{id} | Updates a parameter provider
*PoliciesApi* | [**createAccessPolicy**](docs/PoliciesApi.md#createAccessPolicy) | **POST** /policies | Creates an access policy
*PoliciesApi* | [**getAccessPolicy**](docs/PoliciesApi.md#getAccessPolicy) | **GET** /policies/{id} | Gets an access policy
*PoliciesApi* | [**getAccessPolicyForResource**](docs/PoliciesApi.md#getAccessPolicyForResource) | **GET** /policies/{action}/{resource} | Gets an access policy for the specified action and resource
*PoliciesApi* | [**removeAccessPolicy**](docs/PoliciesApi.md#removeAccessPolicy) | **DELETE** /policies/{id} | Deletes an access policy
*PoliciesApi* | [**updateAccessPolicy**](docs/PoliciesApi.md#updateAccessPolicy) | **PUT** /policies/{id} | Updates a access policy
*ProcessgroupsApi* | [**copySnippet**](docs/ProcessgroupsApi.md#copySnippet) | **POST** /process-groups/{id}/snippet-instance | Copies a snippet and discards it.
*ProcessgroupsApi* | [**createConnection**](docs/ProcessgroupsApi.md#createConnection) | **POST** /process-groups/{id}/connections | Creates a connection
*ProcessgroupsApi* | [**createControllerService**](docs/ProcessgroupsApi.md#createControllerService) | **POST** /process-groups/{id}/controller-services | Creates a new controller service
*ProcessgroupsApi* | [**createEmptyAllConnectionsRequest**](docs/ProcessgroupsApi.md#createEmptyAllConnectionsRequest) | **POST** /process-groups/{id}/empty-all-connections-requests | Creates a request to drop all flowfiles of all connection queues in this process group.
*ProcessgroupsApi* | [**createFunnel**](docs/ProcessgroupsApi.md#createFunnel) | **POST** /process-groups/{id}/funnels | Creates a funnel
*ProcessgroupsApi* | [**createInputPort**](docs/ProcessgroupsApi.md#createInputPort) | **POST** /process-groups/{id}/input-ports | Creates an input port
*ProcessgroupsApi* | [**createLabel**](docs/ProcessgroupsApi.md#createLabel) | **POST** /process-groups/{id}/labels | Creates a label
*ProcessgroupsApi* | [**createOutputPort**](docs/ProcessgroupsApi.md#createOutputPort) | **POST** /process-groups/{id}/output-ports | Creates an output port
*ProcessgroupsApi* | [**createProcessGroup**](docs/ProcessgroupsApi.md#createProcessGroup) | **POST** /process-groups/{id}/process-groups | Creates a process group
*ProcessgroupsApi* | [**createProcessor**](docs/ProcessgroupsApi.md#createProcessor) | **POST** /process-groups/{id}/processors | Creates a new processor
*ProcessgroupsApi* | [**createRemoteProcessGroup**](docs/ProcessgroupsApi.md#createRemoteProcessGroup) | **POST** /process-groups/{id}/remote-process-groups | Creates a new process group
*ProcessgroupsApi* | [**createTemplate**](docs/ProcessgroupsApi.md#createTemplate) | **POST** /process-groups/{id}/templates | Creates a template and discards the specified snippet.
*ProcessgroupsApi* | [**deleteReplaceProcessGroupRequest**](docs/ProcessgroupsApi.md#deleteReplaceProcessGroupRequest) | **DELETE** /process-groups/replace-requests/{id} | Deletes the Replace Request with the given ID
*ProcessgroupsApi* | [**deleteVariableRegistryUpdateRequest**](docs/ProcessgroupsApi.md#deleteVariableRegistryUpdateRequest) | **DELETE** /process-groups/{groupId}/variable-registry/update-requests/{updateId} | Deletes an update request for a process group&#39;s variable registry. If the request is not yet complete, it will automatically be cancelled.
*ProcessgroupsApi* | [**exportProcessGroup**](docs/ProcessgroupsApi.md#exportProcessGroup) | **GET** /process-groups/{id}/download | Gets a process group for download
*ProcessgroupsApi* | [**getConnections**](docs/ProcessgroupsApi.md#getConnections) | **GET** /process-groups/{id}/connections | Gets all connections
*ProcessgroupsApi* | [**getDropAllFlowfilesRequest**](docs/ProcessgroupsApi.md#getDropAllFlowfilesRequest) | **GET** /process-groups/{id}/empty-all-connections-requests/{drop-request-id} | Gets the current status of a drop all flowfiles request.
*ProcessgroupsApi* | [**getFunnels**](docs/ProcessgroupsApi.md#getFunnels) | **GET** /process-groups/{id}/funnels | Gets all funnels
*ProcessgroupsApi* | [**getInputPorts**](docs/ProcessgroupsApi.md#getInputPorts) | **GET** /process-groups/{id}/input-ports | Gets all input ports
*ProcessgroupsApi* | [**getLabels**](docs/ProcessgroupsApi.md#getLabels) | **GET** /process-groups/{id}/labels | Gets all labels
*ProcessgroupsApi* | [**getLocalModifications**](docs/ProcessgroupsApi.md#getLocalModifications) | **GET** /process-groups/{id}/local-modifications | Gets a list of local modifications to the Process Group since it was last synchronized with the Flow Registry
*ProcessgroupsApi* | [**getOutputPorts**](docs/ProcessgroupsApi.md#getOutputPorts) | **GET** /process-groups/{id}/output-ports | Gets all output ports
*ProcessgroupsApi* | [**getProcessGroup**](docs/ProcessgroupsApi.md#getProcessGroup) | **GET** /process-groups/{id} | Gets a process group
*ProcessgroupsApi* | [**getProcessGroups**](docs/ProcessgroupsApi.md#getProcessGroups) | **GET** /process-groups/{id}/process-groups | Gets all process groups
*ProcessgroupsApi* | [**getProcessors**](docs/ProcessgroupsApi.md#getProcessors) | **GET** /process-groups/{id}/processors | Gets all processors
*ProcessgroupsApi* | [**getRemoteProcessGroups**](docs/ProcessgroupsApi.md#getRemoteProcessGroups) | **GET** /process-groups/{id}/remote-process-groups | Gets all remote process groups
*ProcessgroupsApi* | [**getReplaceProcessGroupRequest**](docs/ProcessgroupsApi.md#getReplaceProcessGroupRequest) | **GET** /process-groups/replace-requests/{id} | Returns the Replace Request with the given ID
*ProcessgroupsApi* | [**getVariableRegistry**](docs/ProcessgroupsApi.md#getVariableRegistry) | **GET** /process-groups/{id}/variable-registry | Gets a process group&#39;s variable registry
*ProcessgroupsApi* | [**getVariableRegistryUpdateRequest**](docs/ProcessgroupsApi.md#getVariableRegistryUpdateRequest) | **GET** /process-groups/{groupId}/variable-registry/update-requests/{updateId} | Gets a process group&#39;s variable registry
*ProcessgroupsApi* | [**importProcessGroup**](docs/ProcessgroupsApi.md#importProcessGroup) | **POST** /process-groups/{id}/process-groups/import | Imports a specified process group
*ProcessgroupsApi* | [**importTemplate**](docs/ProcessgroupsApi.md#importTemplate) | **POST** /process-groups/{id}/templates/import | Imports a template
*ProcessgroupsApi* | [**initiateReplaceProcessGroup**](docs/ProcessgroupsApi.md#initiateReplaceProcessGroup) | **POST** /process-groups/{id}/replace-requests | Initiate the Replace Request of a Process Group with the given ID
*ProcessgroupsApi* | [**instantiateTemplate**](docs/ProcessgroupsApi.md#instantiateTemplate) | **POST** /process-groups/{id}/template-instance | Instantiates a template
*ProcessgroupsApi* | [**removeDropRequest**](docs/ProcessgroupsApi.md#removeDropRequest) | **DELETE** /process-groups/{id}/empty-all-connections-requests/{drop-request-id} | Cancels and/or removes a request to drop all flowfiles.
*ProcessgroupsApi* | [**removeProcessGroup**](docs/ProcessgroupsApi.md#removeProcessGroup) | **DELETE** /process-groups/{id} | Deletes a process group
*ProcessgroupsApi* | [**replaceProcessGroup**](docs/ProcessgroupsApi.md#replaceProcessGroup) | **PUT** /process-groups/{id}/flow-contents | Replace Process Group contents with the given ID with the specified Process Group contents
*ProcessgroupsApi* | [**submitUpdateVariableRegistryRequest**](docs/ProcessgroupsApi.md#submitUpdateVariableRegistryRequest) | **POST** /process-groups/{id}/variable-registry/update-requests | Submits a request to update a process group&#39;s variable registry
*ProcessgroupsApi* | [**updateProcessGroup**](docs/ProcessgroupsApi.md#updateProcessGroup) | **PUT** /process-groups/{id} | Updates a process group
*ProcessgroupsApi* | [**updateVariableRegistry**](docs/ProcessgroupsApi.md#updateVariableRegistry) | **PUT** /process-groups/{id}/variable-registry | Updates the contents of a Process Group&#39;s variable Registry
*ProcessgroupsApi* | [**uploadProcessGroup**](docs/ProcessgroupsApi.md#uploadProcessGroup) | **POST** /process-groups/{id}/process-groups/upload | Uploads a versioned flow definition and creates a process group
*ProcessgroupsApi* | [**uploadTemplate**](docs/ProcessgroupsApi.md#uploadTemplate) | **POST** /process-groups/{id}/templates/upload | Uploads a template
*ProcessorsApi* | [**analyzeConfiguration**](docs/ProcessorsApi.md#analyzeConfiguration) | **POST** /processors/{id}/config/analysis | Performs analysis of the component&#39;s configuration, providing information about which attributes are referenced.
*ProcessorsApi* | [**clearState**](docs/ProcessorsApi.md#clearState) | **POST** /processors/{id}/state/clear-requests | Clears the state for a processor
*ProcessorsApi* | [**deleteProcessor**](docs/ProcessorsApi.md#deleteProcessor) | **DELETE** /processors/{id} | Deletes a processor
*ProcessorsApi* | [**deleteVerificationRequest**](docs/ProcessorsApi.md#deleteVerificationRequest) | **DELETE** /processors/{id}/config/verification-requests/{requestId} | Deletes the Verification Request with the given ID
*ProcessorsApi* | [**getProcessor**](docs/ProcessorsApi.md#getProcessor) | **GET** /processors/{id} | Gets a processor
*ProcessorsApi* | [**getProcessorDiagnostics**](docs/ProcessorsApi.md#getProcessorDiagnostics) | **GET** /processors/{id}/diagnostics | Gets diagnostics information about a processor
*ProcessorsApi* | [**getProcessorRunStatusDetails**](docs/ProcessorsApi.md#getProcessorRunStatusDetails) | **POST** /processors/run-status-details/queries | Submits a query to retrieve the run status details of all processors that are in the given list of Processor IDs
*ProcessorsApi* | [**getPropertyDescriptor**](docs/ProcessorsApi.md#getPropertyDescriptor) | **GET** /processors/{id}/descriptors | Gets the descriptor for a processor property
*ProcessorsApi* | [**getState**](docs/ProcessorsApi.md#getState) | **GET** /processors/{id}/state | Gets the state for a processor
*ProcessorsApi* | [**getVerificationRequest**](docs/ProcessorsApi.md#getVerificationRequest) | **GET** /processors/{id}/config/verification-requests/{requestId} | Returns the Verification Request with the given ID
*ProcessorsApi* | [**submitProcessorVerificationRequest**](docs/ProcessorsApi.md#submitProcessorVerificationRequest) | **POST** /processors/{id}/config/verification-requests | Performs verification of the Processor&#39;s configuration
*ProcessorsApi* | [**terminateProcessor**](docs/ProcessorsApi.md#terminateProcessor) | **DELETE** /processors/{id}/threads | Terminates a processor, essentially \&quot;deleting\&quot; its threads and any active tasks
*ProcessorsApi* | [**updateProcessor**](docs/ProcessorsApi.md#updateProcessor) | **PUT** /processors/{id} | Updates a processor
*ProcessorsApi* | [**updateRunStatus**](docs/ProcessorsApi.md#updateRunStatus) | **PUT** /processors/{id}/run-status | Updates run status of a processor
*ProvenanceApi* | [**deleteLineage**](docs/ProvenanceApi.md#deleteLineage) | **DELETE** /provenance/lineage/{id} | Deletes a lineage query
*ProvenanceApi* | [**deleteProvenance**](docs/ProvenanceApi.md#deleteProvenance) | **DELETE** /provenance/{id} | Deletes a provenance query
*ProvenanceApi* | [**getLineage**](docs/ProvenanceApi.md#getLineage) | **GET** /provenance/lineage/{id} | Gets a lineage query
*ProvenanceApi* | [**getProvenance**](docs/ProvenanceApi.md#getProvenance) | **GET** /provenance/{id} | Gets a provenance query
*ProvenanceApi* | [**getSearchOptions**](docs/ProvenanceApi.md#getSearchOptions) | **GET** /provenance/search-options | Gets the searchable attributes for provenance events
*ProvenanceApi* | [**submitLineageRequest**](docs/ProvenanceApi.md#submitLineageRequest) | **POST** /provenance/lineage | Submits a lineage query
*ProvenanceApi* | [**submitProvenanceRequest**](docs/ProvenanceApi.md#submitProvenanceRequest) | **POST** /provenance | Submits a provenance query
*ProvenanceeventsApi* | [**getInputContent**](docs/ProvenanceeventsApi.md#getInputContent) | **GET** /provenance-events/{id}/content/input | Gets the input content for a provenance event
*ProvenanceeventsApi* | [**getOutputContent**](docs/ProvenanceeventsApi.md#getOutputContent) | **GET** /provenance-events/{id}/content/output | Gets the output content for a provenance event
*ProvenanceeventsApi* | [**getProvenanceEvent**](docs/ProvenanceeventsApi.md#getProvenanceEvent) | **GET** /provenance-events/{id} | Gets a provenance event
*ProvenanceeventsApi* | [**submitReplay**](docs/ProvenanceeventsApi.md#submitReplay) | **POST** /provenance-events/replays | Replays content from a provenance event
*ProvenanceeventsApi* | [**submitReplayLatestEvent**](docs/ProvenanceeventsApi.md#submitReplayLatestEvent) | **POST** /provenance-events/latest/replays | Replays content from a provenance event
*RemoteprocessgroupsApi* | [**getRemoteProcessGroup**](docs/RemoteprocessgroupsApi.md#getRemoteProcessGroup) | **GET** /remote-process-groups/{id} | Gets a remote process group
*RemoteprocessgroupsApi* | [**getState**](docs/RemoteprocessgroupsApi.md#getState) | **GET** /remote-process-groups/{id}/state | Gets the state for a RemoteProcessGroup
*RemoteprocessgroupsApi* | [**removeRemoteProcessGroup**](docs/RemoteprocessgroupsApi.md#removeRemoteProcessGroup) | **DELETE** /remote-process-groups/{id} | Deletes a remote process group
*RemoteprocessgroupsApi* | [**updateRemoteProcessGroup**](docs/RemoteprocessgroupsApi.md#updateRemoteProcessGroup) | **PUT** /remote-process-groups/{id} | Updates a remote process group
*RemoteprocessgroupsApi* | [**updateRemoteProcessGroupInputPort**](docs/RemoteprocessgroupsApi.md#updateRemoteProcessGroupInputPort) | **PUT** /remote-process-groups/{id}/input-ports/{port-id} | Updates a remote port
*RemoteprocessgroupsApi* | [**updateRemoteProcessGroupInputPortRunStatus**](docs/RemoteprocessgroupsApi.md#updateRemoteProcessGroupInputPortRunStatus) | **PUT** /remote-process-groups/{id}/input-ports/{port-id}/run-status | Updates run status of a remote port
*RemoteprocessgroupsApi* | [**updateRemoteProcessGroupOutputPort**](docs/RemoteprocessgroupsApi.md#updateRemoteProcessGroupOutputPort) | **PUT** /remote-process-groups/{id}/output-ports/{port-id} | Updates a remote port
*RemoteprocessgroupsApi* | [**updateRemoteProcessGroupOutputPortRunStatus**](docs/RemoteprocessgroupsApi.md#updateRemoteProcessGroupOutputPortRunStatus) | **PUT** /remote-process-groups/{id}/output-ports/{port-id}/run-status | Updates run status of a remote port
*RemoteprocessgroupsApi* | [**updateRemoteProcessGroupRunStatus**](docs/RemoteprocessgroupsApi.md#updateRemoteProcessGroupRunStatus) | **PUT** /remote-process-groups/{id}/run-status | Updates run status of a remote process group
*RemoteprocessgroupsApi* | [**updateRemoteProcessGroupRunStatuses**](docs/RemoteprocessgroupsApi.md#updateRemoteProcessGroupRunStatuses) | **PUT** /remote-process-groups/process-group/{id}/run-status | Updates run status of all remote process groups in a process group (recursively)
*ReportingtasksApi* | [**analyzeConfiguration**](docs/ReportingtasksApi.md#analyzeConfiguration) | **POST** /reporting-tasks/{id}/config/analysis | Performs analysis of the component&#39;s configuration, providing information about which attributes are referenced.
*ReportingtasksApi* | [**clearState**](docs/ReportingtasksApi.md#clearState) | **POST** /reporting-tasks/{id}/state/clear-requests | Clears the state for a reporting task
*ReportingtasksApi* | [**deleteVerificationRequest**](docs/ReportingtasksApi.md#deleteVerificationRequest) | **DELETE** /reporting-tasks/{id}/config/verification-requests/{requestId} | Deletes the Verification Request with the given ID
*ReportingtasksApi* | [**getPropertyDescriptor**](docs/ReportingtasksApi.md#getPropertyDescriptor) | **GET** /reporting-tasks/{id}/descriptors | Gets a reporting task property descriptor
*ReportingtasksApi* | [**getReportingTask**](docs/ReportingtasksApi.md#getReportingTask) | **GET** /reporting-tasks/{id} | Gets a reporting task
*ReportingtasksApi* | [**getState**](docs/ReportingtasksApi.md#getState) | **GET** /reporting-tasks/{id}/state | Gets the state for a reporting task
*ReportingtasksApi* | [**getVerificationRequest**](docs/ReportingtasksApi.md#getVerificationRequest) | **GET** /reporting-tasks/{id}/config/verification-requests/{requestId} | Returns the Verification Request with the given ID
*ReportingtasksApi* | [**removeReportingTask**](docs/ReportingtasksApi.md#removeReportingTask) | **DELETE** /reporting-tasks/{id} | Deletes a reporting task
*ReportingtasksApi* | [**submitConfigVerificationRequest**](docs/ReportingtasksApi.md#submitConfigVerificationRequest) | **POST** /reporting-tasks/{id}/config/verification-requests | Performs verification of the Reporting Task&#39;s configuration
*ReportingtasksApi* | [**updateReportingTask**](docs/ReportingtasksApi.md#updateReportingTask) | **PUT** /reporting-tasks/{id} | Updates a reporting task
*ReportingtasksApi* | [**updateRunStatus**](docs/ReportingtasksApi.md#updateRunStatus) | **PUT** /reporting-tasks/{id}/run-status | Updates run status of a reporting task
*ResourcesApi* | [**getResources**](docs/ResourcesApi.md#getResources) | **GET** /resources | Gets the available resources that support access/authorization policies
*SitetositeApi* | [**getPeers**](docs/SitetositeApi.md#getPeers) | **GET** /site-to-site/peers | Returns the available Peers and its status of this NiFi
*SitetositeApi* | [**getSiteToSiteDetails**](docs/SitetositeApi.md#getSiteToSiteDetails) | **GET** /site-to-site | Returns the details about this NiFi necessary to communicate via site to site
*SnippetsApi* | [**createSnippet**](docs/SnippetsApi.md#createSnippet) | **POST** /snippets | Creates a snippet. The snippet will be automatically discarded if not used in a subsequent request after 1 minute.
*SnippetsApi* | [**deleteSnippet**](docs/SnippetsApi.md#deleteSnippet) | **DELETE** /snippets/{id} | Deletes the components in a snippet and discards the snippet
*SnippetsApi* | [**updateSnippet**](docs/SnippetsApi.md#updateSnippet) | **PUT** /snippets/{id} | Move&#39;s the components in this Snippet into a new Process Group and discards the snippet
*SystemdiagnosticsApi* | [**getSystemDiagnostics**](docs/SystemdiagnosticsApi.md#getSystemDiagnostics) | **GET** /system-diagnostics | Gets the diagnostics for the system NiFi is running on
*TemplatesApi* | [**exportTemplate**](docs/TemplatesApi.md#exportTemplate) | **GET** /templates/{id}/download | Exports a template
*TemplatesApi* | [**removeTemplate**](docs/TemplatesApi.md#removeTemplate) | **DELETE** /templates/{id} | Deletes a template
*TenantsApi* | [**createUser**](docs/TenantsApi.md#createUser) | **POST** /tenants/users | Creates a user
*TenantsApi* | [**createUserGroup**](docs/TenantsApi.md#createUserGroup) | **POST** /tenants/user-groups | Creates a user group
*TenantsApi* | [**getUser**](docs/TenantsApi.md#getUser) | **GET** /tenants/users/{id} | Gets a user
*TenantsApi* | [**getUserGroup**](docs/TenantsApi.md#getUserGroup) | **GET** /tenants/user-groups/{id} | Gets a user group
*TenantsApi* | [**getUserGroups**](docs/TenantsApi.md#getUserGroups) | **GET** /tenants/user-groups | Gets all user groups
*TenantsApi* | [**getUsers**](docs/TenantsApi.md#getUsers) | **GET** /tenants/users | Gets all users
*TenantsApi* | [**removeUser**](docs/TenantsApi.md#removeUser) | **DELETE** /tenants/users/{id} | Deletes a user
*TenantsApi* | [**removeUserGroup**](docs/TenantsApi.md#removeUserGroup) | **DELETE** /tenants/user-groups/{id} | Deletes a user group
*TenantsApi* | [**searchTenants**](docs/TenantsApi.md#searchTenants) | **GET** /tenants/search-results | Searches for a tenant with the specified identity
*TenantsApi* | [**updateUser**](docs/TenantsApi.md#updateUser) | **PUT** /tenants/users/{id} | Updates a user
*TenantsApi* | [**updateUserGroup**](docs/TenantsApi.md#updateUserGroup) | **PUT** /tenants/user-groups/{id} | Updates a user group
*VersionsApi* | [**createVersionControlRequest**](docs/VersionsApi.md#createVersionControlRequest) | **POST** /versions/active-requests | Create a version control request
*VersionsApi* | [**deleteRevertRequest**](docs/VersionsApi.md#deleteRevertRequest) | **DELETE** /versions/revert-requests/{id} | Deletes the Revert Request with the given ID
*VersionsApi* | [**deleteUpdateRequest**](docs/VersionsApi.md#deleteUpdateRequest) | **DELETE** /versions/update-requests/{id} | Deletes the Update Request with the given ID
*VersionsApi* | [**deleteVersionControlRequest**](docs/VersionsApi.md#deleteVersionControlRequest) | **DELETE** /versions/active-requests/{id} | Deletes the version control request with the given ID
*VersionsApi* | [**exportFlowVersion**](docs/VersionsApi.md#exportFlowVersion) | **GET** /versions/process-groups/{id}/download | Gets the latest version of a Process Group for download
*VersionsApi* | [**getRevertRequest**](docs/VersionsApi.md#getRevertRequest) | **GET** /versions/revert-requests/{id} | Returns the Revert Request with the given ID
*VersionsApi* | [**getUpdateRequest**](docs/VersionsApi.md#getUpdateRequest) | **GET** /versions/update-requests/{id} | Returns the Update Request with the given ID
*VersionsApi* | [**getVersionInformation**](docs/VersionsApi.md#getVersionInformation) | **GET** /versions/process-groups/{id} | Gets the Version Control information for a process group
*VersionsApi* | [**initiateRevertFlowVersion**](docs/VersionsApi.md#initiateRevertFlowVersion) | **POST** /versions/revert-requests/process-groups/{id} | Initiate the Revert Request of a Process Group with the given ID
*VersionsApi* | [**initiateVersionControlUpdate**](docs/VersionsApi.md#initiateVersionControlUpdate) | **POST** /versions/update-requests/process-groups/{id} | Initiate the Update Request of a Process Group with the given ID
*VersionsApi* | [**saveToFlowRegistry**](docs/VersionsApi.md#saveToFlowRegistry) | **POST** /versions/process-groups/{id} | Save the Process Group with the given ID
*VersionsApi* | [**stopVersionControl**](docs/VersionsApi.md#stopVersionControl) | **DELETE** /versions/process-groups/{id} | Stops version controlling the Process Group with the given ID
*VersionsApi* | [**updateFlowVersion**](docs/VersionsApi.md#updateFlowVersion) | **PUT** /versions/process-groups/{id} | Update the version of a Process Group with the given ID
*VersionsApi* | [**updateVersionControlRequest**](docs/VersionsApi.md#updateVersionControlRequest) | **PUT** /versions/active-requests/{id} | Updates the request with the given ID


## Documentation for Models

 - [AboutDTO](docs/AboutDTO.md)
 - [AboutEntity](docs/AboutEntity.md)
 - [AccessConfigurationDTO](docs/AccessConfigurationDTO.md)
 - [AccessConfigurationEntity](docs/AccessConfigurationEntity.md)
 - [AccessPolicyDTO](docs/AccessPolicyDTO.md)
 - [AccessPolicyEntity](docs/AccessPolicyEntity.md)
 - [AccessPolicySummaryDTO](docs/AccessPolicySummaryDTO.md)
 - [AccessPolicySummaryEntity](docs/AccessPolicySummaryEntity.md)
 - [AccessStatusDTO](docs/AccessStatusDTO.md)
 - [AccessStatusEntity](docs/AccessStatusEntity.md)
 - [AccessTokenExpirationDTO](docs/AccessTokenExpirationDTO.md)
 - [AccessTokenExpirationEntity](docs/AccessTokenExpirationEntity.md)
 - [ActionDTO](docs/ActionDTO.md)
 - [ActionDetailsDTO](docs/ActionDetailsDTO.md)
 - [ActionEntity](docs/ActionEntity.md)
 - [ActivateControllerServicesEntity](docs/ActivateControllerServicesEntity.md)
 - [AffectedComponentDTO](docs/AffectedComponentDTO.md)
 - [AffectedComponentEntity](docs/AffectedComponentEntity.md)
 - [AllowableValueDTO](docs/AllowableValueDTO.md)
 - [AllowableValueEntity](docs/AllowableValueEntity.md)
 - [AttributeDTO](docs/AttributeDTO.md)
 - [BannerDTO](docs/BannerDTO.md)
 - [BannerEntity](docs/BannerEntity.md)
 - [BatchSettingsDTO](docs/BatchSettingsDTO.md)
 - [BatchSize](docs/BatchSize.md)
 - [BuildInfo](docs/BuildInfo.md)
 - [BulletinBoardDTO](docs/BulletinBoardDTO.md)
 - [BulletinBoardEntity](docs/BulletinBoardEntity.md)
 - [BulletinDTO](docs/BulletinDTO.md)
 - [BulletinEntity](docs/BulletinEntity.md)
 - [Bundle](docs/Bundle.md)
 - [BundleDTO](docs/BundleDTO.md)
 - [ClassLoaderDiagnosticsDTO](docs/ClassLoaderDiagnosticsDTO.md)
 - [ClusteSummaryEntity](docs/ClusteSummaryEntity.md)
 - [ClusterDTO](docs/ClusterDTO.md)
 - [ClusterEntity](docs/ClusterEntity.md)
 - [ClusterSearchResultsEntity](docs/ClusterSearchResultsEntity.md)
 - [ClusterSummaryDTO](docs/ClusterSummaryDTO.md)
 - [ComponentDetailsDTO](docs/ComponentDetailsDTO.md)
 - [ComponentDifferenceDTO](docs/ComponentDifferenceDTO.md)
 - [ComponentHistoryDTO](docs/ComponentHistoryDTO.md)
 - [ComponentHistoryEntity](docs/ComponentHistoryEntity.md)
 - [ComponentLifecycle](docs/ComponentLifecycle.md)
 - [ComponentManifest](docs/ComponentManifest.md)
 - [ComponentReferenceDTO](docs/ComponentReferenceDTO.md)
 - [ComponentReferenceEntity](docs/ComponentReferenceEntity.md)
 - [ComponentRestrictionPermissionDTO](docs/ComponentRestrictionPermissionDTO.md)
 - [ComponentSearchResultDTO](docs/ComponentSearchResultDTO.md)
 - [ComponentStateDTO](docs/ComponentStateDTO.md)
 - [ComponentStateEntity](docs/ComponentStateEntity.md)
 - [ComponentValidationResultDTO](docs/ComponentValidationResultDTO.md)
 - [ComponentValidationResultEntity](docs/ComponentValidationResultEntity.md)
 - [ComponentValidationResultsEntity](docs/ComponentValidationResultsEntity.md)
 - [ConfigVerificationResultDTO](docs/ConfigVerificationResultDTO.md)
 - [ConfigurationAnalysisDTO](docs/ConfigurationAnalysisDTO.md)
 - [ConfigurationAnalysisEntity](docs/ConfigurationAnalysisEntity.md)
 - [ConnectableComponent](docs/ConnectableComponent.md)
 - [ConnectableDTO](docs/ConnectableDTO.md)
 - [ConnectionDTO](docs/ConnectionDTO.md)
 - [ConnectionDiagnosticsDTO](docs/ConnectionDiagnosticsDTO.md)
 - [ConnectionDiagnosticsSnapshotDTO](docs/ConnectionDiagnosticsSnapshotDTO.md)
 - [ConnectionEntity](docs/ConnectionEntity.md)
 - [ConnectionStatisticsDTO](docs/ConnectionStatisticsDTO.md)
 - [ConnectionStatisticsEntity](docs/ConnectionStatisticsEntity.md)
 - [ConnectionStatisticsSnapshotDTO](docs/ConnectionStatisticsSnapshotDTO.md)
 - [ConnectionStatusDTO](docs/ConnectionStatusDTO.md)
 - [ConnectionStatusEntity](docs/ConnectionStatusEntity.md)
 - [ConnectionStatusPredictionsSnapshotDTO](docs/ConnectionStatusPredictionsSnapshotDTO.md)
 - [ConnectionStatusSnapshotDTO](docs/ConnectionStatusSnapshotDTO.md)
 - [ConnectionStatusSnapshotEntity](docs/ConnectionStatusSnapshotEntity.md)
 - [ConnectionsEntity](docs/ConnectionsEntity.md)
 - [ControllerBulletinsEntity](docs/ControllerBulletinsEntity.md)
 - [ControllerConfigurationDTO](docs/ControllerConfigurationDTO.md)
 - [ControllerConfigurationEntity](docs/ControllerConfigurationEntity.md)
 - [ControllerDTO](docs/ControllerDTO.md)
 - [ControllerEntity](docs/ControllerEntity.md)
 - [ControllerServiceAPI](docs/ControllerServiceAPI.md)
 - [ControllerServiceApiDTO](docs/ControllerServiceApiDTO.md)
 - [ControllerServiceDTO](docs/ControllerServiceDTO.md)
 - [ControllerServiceDefinition](docs/ControllerServiceDefinition.md)
 - [ControllerServiceDiagnosticsDTO](docs/ControllerServiceDiagnosticsDTO.md)
 - [ControllerServiceEntity](docs/ControllerServiceEntity.md)
 - [ControllerServiceReferencingComponentDTO](docs/ControllerServiceReferencingComponentDTO.md)
 - [ControllerServiceReferencingComponentEntity](docs/ControllerServiceReferencingComponentEntity.md)
 - [ControllerServiceReferencingComponentsEntity](docs/ControllerServiceReferencingComponentsEntity.md)
 - [ControllerServiceRunStatusEntity](docs/ControllerServiceRunStatusEntity.md)
 - [ControllerServiceStatusDTO](docs/ControllerServiceStatusDTO.md)
 - [ControllerServiceTypesEntity](docs/ControllerServiceTypesEntity.md)
 - [ControllerServicesEntity](docs/ControllerServicesEntity.md)
 - [ControllerStatusDTO](docs/ControllerStatusDTO.md)
 - [ControllerStatusEntity](docs/ControllerStatusEntity.md)
 - [CopySnippetRequestEntity](docs/CopySnippetRequestEntity.md)
 - [CounterDTO](docs/CounterDTO.md)
 - [CounterEntity](docs/CounterEntity.md)
 - [CountersDTO](docs/CountersDTO.md)
 - [CountersEntity](docs/CountersEntity.md)
 - [CountersSnapshotDTO](docs/CountersSnapshotDTO.md)
 - [CreateActiveRequestEntity](docs/CreateActiveRequestEntity.md)
 - [CreateTemplateRequestEntity](docs/CreateTemplateRequestEntity.md)
 - [CurrentUserEntity](docs/CurrentUserEntity.md)
 - [DefinedType](docs/DefinedType.md)
 - [DifferenceDTO](docs/DifferenceDTO.md)
 - [DimensionsDTO](docs/DimensionsDTO.md)
 - [DocumentedTypeDTO](docs/DocumentedTypeDTO.md)
 - [DropRequestDTO](docs/DropRequestDTO.md)
 - [DropRequestEntity](docs/DropRequestEntity.md)
 - [DtoFactory](docs/DtoFactory.md)
 - [Entity](docs/Entity.md)
 - [ExplicitRestrictionDTO](docs/ExplicitRestrictionDTO.md)
 - [ExternalControllerServiceReference](docs/ExternalControllerServiceReference.md)
 - [FlowBreadcrumbDTO](docs/FlowBreadcrumbDTO.md)
 - [FlowBreadcrumbEntity](docs/FlowBreadcrumbEntity.md)
 - [FlowComparisonEntity](docs/FlowComparisonEntity.md)
 - [FlowConfigurationDTO](docs/FlowConfigurationDTO.md)
 - [FlowConfigurationEntity](docs/FlowConfigurationEntity.md)
 - [FlowDTO](docs/FlowDTO.md)
 - [FlowEntity](docs/FlowEntity.md)
 - [FlowFileDTO](docs/FlowFileDTO.md)
 - [FlowFileEntity](docs/FlowFileEntity.md)
 - [FlowFileSummaryDTO](docs/FlowFileSummaryDTO.md)
 - [FlowRegistryBucket](docs/FlowRegistryBucket.md)
 - [FlowRegistryBucketDTO](docs/FlowRegistryBucketDTO.md)
 - [FlowRegistryBucketEntity](docs/FlowRegistryBucketEntity.md)
 - [FlowRegistryBucketsEntity](docs/FlowRegistryBucketsEntity.md)
 - [FlowRegistryClientDTO](docs/FlowRegistryClientDTO.md)
 - [FlowRegistryClientEntity](docs/FlowRegistryClientEntity.md)
 - [FlowRegistryClientTypesEntity](docs/FlowRegistryClientTypesEntity.md)
 - [FlowRegistryClientsEntity](docs/FlowRegistryClientsEntity.md)
 - [FlowRegistryPermissions](docs/FlowRegistryPermissions.md)
 - [FlowSnippetDTO](docs/FlowSnippetDTO.md)
 - [FunnelDTO](docs/FunnelDTO.md)
 - [FunnelEntity](docs/FunnelEntity.md)
 - [FunnelsEntity](docs/FunnelsEntity.md)
 - [GCDiagnosticsSnapshotDTO](docs/GCDiagnosticsSnapshotDTO.md)
 - [GarbageCollectionDTO](docs/GarbageCollectionDTO.md)
 - [GarbageCollectionDiagnosticsDTO](docs/GarbageCollectionDiagnosticsDTO.md)
 - [HistoryDTO](docs/HistoryDTO.md)
 - [HistoryEntity](docs/HistoryEntity.md)
 - [InputPortsEntity](docs/InputPortsEntity.md)
 - [InputStream](docs/InputStream.md)
 - [InstantiateTemplateRequestEntity](docs/InstantiateTemplateRequestEntity.md)
 - [JVMControllerDiagnosticsSnapshotDTO](docs/JVMControllerDiagnosticsSnapshotDTO.md)
 - [JVMDiagnosticsDTO](docs/JVMDiagnosticsDTO.md)
 - [JVMDiagnosticsSnapshotDTO](docs/JVMDiagnosticsSnapshotDTO.md)
 - [JVMFlowDiagnosticsSnapshotDTO](docs/JVMFlowDiagnosticsSnapshotDTO.md)
 - [JVMSystemDiagnosticsSnapshotDTO](docs/JVMSystemDiagnosticsSnapshotDTO.md)
 - [LabelDTO](docs/LabelDTO.md)
 - [LabelEntity](docs/LabelEntity.md)
 - [LabelsEntity](docs/LabelsEntity.md)
 - [LineageDTO](docs/LineageDTO.md)
 - [LineageEntity](docs/LineageEntity.md)
 - [LineageRequestDTO](docs/LineageRequestDTO.md)
 - [LineageResultsDTO](docs/LineageResultsDTO.md)
 - [ListingRequestDTO](docs/ListingRequestDTO.md)
 - [ListingRequestEntity](docs/ListingRequestEntity.md)
 - [LocalQueuePartitionDTO](docs/LocalQueuePartitionDTO.md)
 - [NodeConnectionStatisticsSnapshotDTO](docs/NodeConnectionStatisticsSnapshotDTO.md)
 - [NodeConnectionStatusSnapshotDTO](docs/NodeConnectionStatusSnapshotDTO.md)
 - [NodeCountersSnapshotDTO](docs/NodeCountersSnapshotDTO.md)
 - [NodeDTO](docs/NodeDTO.md)
 - [NodeEntity](docs/NodeEntity.md)
 - [NodeEventDTO](docs/NodeEventDTO.md)
 - [NodeIdentifier](docs/NodeIdentifier.md)
 - [NodeJVMDiagnosticsSnapshotDTO](docs/NodeJVMDiagnosticsSnapshotDTO.md)
 - [NodePortStatusSnapshotDTO](docs/NodePortStatusSnapshotDTO.md)
 - [NodeProcessGroupStatusSnapshotDTO](docs/NodeProcessGroupStatusSnapshotDTO.md)
 - [NodeProcessorStatusSnapshotDTO](docs/NodeProcessorStatusSnapshotDTO.md)
 - [NodeRemoteProcessGroupStatusSnapshotDTO](docs/NodeRemoteProcessGroupStatusSnapshotDTO.md)
 - [NodeReplayLastEventSnapshotDTO](docs/NodeReplayLastEventSnapshotDTO.md)
 - [NodeResponse](docs/NodeResponse.md)
 - [NodeSearchResultDTO](docs/NodeSearchResultDTO.md)
 - [NodeStatusSnapshotsDTO](docs/NodeStatusSnapshotsDTO.md)
 - [NodeSystemDiagnosticsSnapshotDTO](docs/NodeSystemDiagnosticsSnapshotDTO.md)
 - [OutputPortsEntity](docs/OutputPortsEntity.md)
 - [ParameterContextDTO](docs/ParameterContextDTO.md)
 - [ParameterContextEntity](docs/ParameterContextEntity.md)
 - [ParameterContextReferenceDTO](docs/ParameterContextReferenceDTO.md)
 - [ParameterContextReferenceEntity](docs/ParameterContextReferenceEntity.md)
 - [ParameterContextUpdateEntity](docs/ParameterContextUpdateEntity.md)
 - [ParameterContextUpdateRequestDTO](docs/ParameterContextUpdateRequestDTO.md)
 - [ParameterContextUpdateRequestEntity](docs/ParameterContextUpdateRequestEntity.md)
 - [ParameterContextUpdateStepDTO](docs/ParameterContextUpdateStepDTO.md)
 - [ParameterContextValidationRequestDTO](docs/ParameterContextValidationRequestDTO.md)
 - [ParameterContextValidationRequestEntity](docs/ParameterContextValidationRequestEntity.md)
 - [ParameterContextValidationStepDTO](docs/ParameterContextValidationStepDTO.md)
 - [ParameterContextsEntity](docs/ParameterContextsEntity.md)
 - [ParameterDTO](docs/ParameterDTO.md)
 - [ParameterEntity](docs/ParameterEntity.md)
 - [ParameterGroupConfigurationEntity](docs/ParameterGroupConfigurationEntity.md)
 - [ParameterProviderApplyParametersRequestDTO](docs/ParameterProviderApplyParametersRequestDTO.md)
 - [ParameterProviderApplyParametersRequestEntity](docs/ParameterProviderApplyParametersRequestEntity.md)
 - [ParameterProviderApplyParametersUpdateStepDTO](docs/ParameterProviderApplyParametersUpdateStepDTO.md)
 - [ParameterProviderConfigurationDTO](docs/ParameterProviderConfigurationDTO.md)
 - [ParameterProviderConfigurationEntity](docs/ParameterProviderConfigurationEntity.md)
 - [ParameterProviderDTO](docs/ParameterProviderDTO.md)
 - [ParameterProviderEntity](docs/ParameterProviderEntity.md)
 - [ParameterProviderParameterApplicationEntity](docs/ParameterProviderParameterApplicationEntity.md)
 - [ParameterProviderParameterFetchEntity](docs/ParameterProviderParameterFetchEntity.md)
 - [ParameterProviderReference](docs/ParameterProviderReference.md)
 - [ParameterProviderReferencingComponentDTO](docs/ParameterProviderReferencingComponentDTO.md)
 - [ParameterProviderReferencingComponentEntity](docs/ParameterProviderReferencingComponentEntity.md)
 - [ParameterProviderReferencingComponentsEntity](docs/ParameterProviderReferencingComponentsEntity.md)
 - [ParameterProviderTypesEntity](docs/ParameterProviderTypesEntity.md)
 - [ParameterProvidersEntity](docs/ParameterProvidersEntity.md)
 - [ParameterStatusDTO](docs/ParameterStatusDTO.md)
 - [PeerDTO](docs/PeerDTO.md)
 - [PeersEntity](docs/PeersEntity.md)
 - [PermissionsDTO](docs/PermissionsDTO.md)
 - [PortDTO](docs/PortDTO.md)
 - [PortEntity](docs/PortEntity.md)
 - [PortRunStatusEntity](docs/PortRunStatusEntity.md)
 - [PortStatusDTO](docs/PortStatusDTO.md)
 - [PortStatusEntity](docs/PortStatusEntity.md)
 - [PortStatusSnapshotDTO](docs/PortStatusSnapshotDTO.md)
 - [PortStatusSnapshotEntity](docs/PortStatusSnapshotEntity.md)
 - [Position](docs/Position.md)
 - [PositionDTO](docs/PositionDTO.md)
 - [PreviousValueDTO](docs/PreviousValueDTO.md)
 - [PrioritizerTypesEntity](docs/PrioritizerTypesEntity.md)
 - [ProcessGroupDTO](docs/ProcessGroupDTO.md)
 - [ProcessGroupEntity](docs/ProcessGroupEntity.md)
 - [ProcessGroupFlowDTO](docs/ProcessGroupFlowDTO.md)
 - [ProcessGroupFlowEntity](docs/ProcessGroupFlowEntity.md)
 - [ProcessGroupImportEntity](docs/ProcessGroupImportEntity.md)
 - [ProcessGroupNameDTO](docs/ProcessGroupNameDTO.md)
 - [ProcessGroupReplaceRequestDTO](docs/ProcessGroupReplaceRequestDTO.md)
 - [ProcessGroupReplaceRequestEntity](docs/ProcessGroupReplaceRequestEntity.md)
 - [ProcessGroupStatusDTO](docs/ProcessGroupStatusDTO.md)
 - [ProcessGroupStatusEntity](docs/ProcessGroupStatusEntity.md)
 - [ProcessGroupStatusSnapshotDTO](docs/ProcessGroupStatusSnapshotDTO.md)
 - [ProcessGroupStatusSnapshotEntity](docs/ProcessGroupStatusSnapshotEntity.md)
 - [ProcessGroupsEntity](docs/ProcessGroupsEntity.md)
 - [ProcessorConfigDTO](docs/ProcessorConfigDTO.md)
 - [ProcessorDTO](docs/ProcessorDTO.md)
 - [ProcessorDefinition](docs/ProcessorDefinition.md)
 - [ProcessorDiagnosticsDTO](docs/ProcessorDiagnosticsDTO.md)
 - [ProcessorDiagnosticsEntity](docs/ProcessorDiagnosticsEntity.md)
 - [ProcessorEntity](docs/ProcessorEntity.md)
 - [ProcessorRunStatusDetailsDTO](docs/ProcessorRunStatusDetailsDTO.md)
 - [ProcessorRunStatusDetailsEntity](docs/ProcessorRunStatusDetailsEntity.md)
 - [ProcessorRunStatusEntity](docs/ProcessorRunStatusEntity.md)
 - [ProcessorStatusDTO](docs/ProcessorStatusDTO.md)
 - [ProcessorStatusEntity](docs/ProcessorStatusEntity.md)
 - [ProcessorStatusSnapshotDTO](docs/ProcessorStatusSnapshotDTO.md)
 - [ProcessorStatusSnapshotEntity](docs/ProcessorStatusSnapshotEntity.md)
 - [ProcessorTypesEntity](docs/ProcessorTypesEntity.md)
 - [ProcessorsEntity](docs/ProcessorsEntity.md)
 - [ProcessorsRunStatusDetailsEntity](docs/ProcessorsRunStatusDetailsEntity.md)
 - [PropertyAllowableValue](docs/PropertyAllowableValue.md)
 - [PropertyDependency](docs/PropertyDependency.md)
 - [PropertyDependencyDTO](docs/PropertyDependencyDTO.md)
 - [PropertyDescriptor](docs/PropertyDescriptor.md)
 - [PropertyDescriptorDTO](docs/PropertyDescriptorDTO.md)
 - [PropertyDescriptorEntity](docs/PropertyDescriptorEntity.md)
 - [PropertyHistoryDTO](docs/PropertyHistoryDTO.md)
 - [PropertyResourceDefinition](docs/PropertyResourceDefinition.md)
 - [ProvenanceDTO](docs/ProvenanceDTO.md)
 - [ProvenanceEntity](docs/ProvenanceEntity.md)
 - [ProvenanceEventDTO](docs/ProvenanceEventDTO.md)
 - [ProvenanceEventEntity](docs/ProvenanceEventEntity.md)
 - [ProvenanceLinkDTO](docs/ProvenanceLinkDTO.md)
 - [ProvenanceNodeDTO](docs/ProvenanceNodeDTO.md)
 - [ProvenanceOptionsDTO](docs/ProvenanceOptionsDTO.md)
 - [ProvenanceOptionsEntity](docs/ProvenanceOptionsEntity.md)
 - [ProvenanceRequestDTO](docs/ProvenanceRequestDTO.md)
 - [ProvenanceResultsDTO](docs/ProvenanceResultsDTO.md)
 - [ProvenanceSearchValueDTO](docs/ProvenanceSearchValueDTO.md)
 - [ProvenanceSearchableFieldDTO](docs/ProvenanceSearchableFieldDTO.md)
 - [QueueSizeDTO](docs/QueueSizeDTO.md)
 - [RegisteredFlow](docs/RegisteredFlow.md)
 - [RegisteredFlowSnapshot](docs/RegisteredFlowSnapshot.md)
 - [RegisteredFlowSnapshotMetadata](docs/RegisteredFlowSnapshotMetadata.md)
 - [RegisteredFlowVersionInfo](docs/RegisteredFlowVersionInfo.md)
 - [Relationship](docs/Relationship.md)
 - [RelationshipDTO](docs/RelationshipDTO.md)
 - [RemotePortRunStatusEntity](docs/RemotePortRunStatusEntity.md)
 - [RemoteProcessGroupContentsDTO](docs/RemoteProcessGroupContentsDTO.md)
 - [RemoteProcessGroupDTO](docs/RemoteProcessGroupDTO.md)
 - [RemoteProcessGroupEntity](docs/RemoteProcessGroupEntity.md)
 - [RemoteProcessGroupPortDTO](docs/RemoteProcessGroupPortDTO.md)
 - [RemoteProcessGroupPortEntity](docs/RemoteProcessGroupPortEntity.md)
 - [RemoteProcessGroupStatusDTO](docs/RemoteProcessGroupStatusDTO.md)
 - [RemoteProcessGroupStatusEntity](docs/RemoteProcessGroupStatusEntity.md)
 - [RemoteProcessGroupStatusSnapshotDTO](docs/RemoteProcessGroupStatusSnapshotDTO.md)
 - [RemoteProcessGroupStatusSnapshotEntity](docs/RemoteProcessGroupStatusSnapshotEntity.md)
 - [RemoteProcessGroupsEntity](docs/RemoteProcessGroupsEntity.md)
 - [RemoteQueuePartitionDTO](docs/RemoteQueuePartitionDTO.md)
 - [ReplayLastEventRequestEntity](docs/ReplayLastEventRequestEntity.md)
 - [ReplayLastEventResponseEntity](docs/ReplayLastEventResponseEntity.md)
 - [ReplayLastEventSnapshotDTO](docs/ReplayLastEventSnapshotDTO.md)
 - [ReportingTaskDTO](docs/ReportingTaskDTO.md)
 - [ReportingTaskDefinition](docs/ReportingTaskDefinition.md)
 - [ReportingTaskEntity](docs/ReportingTaskEntity.md)
 - [ReportingTaskRunStatusEntity](docs/ReportingTaskRunStatusEntity.md)
 - [ReportingTaskStatusDTO](docs/ReportingTaskStatusDTO.md)
 - [ReportingTaskTypesEntity](docs/ReportingTaskTypesEntity.md)
 - [ReportingTasksEntity](docs/ReportingTasksEntity.md)
 - [RepositoryUsageDTO](docs/RepositoryUsageDTO.md)
 - [RequiredPermissionDTO](docs/RequiredPermissionDTO.md)
 - [ResourceDTO](docs/ResourceDTO.md)
 - [ResourcesEntity](docs/ResourcesEntity.md)
 - [Response](docs/Response.md)
 - [Restriction](docs/Restriction.md)
 - [RevisionDTO](docs/RevisionDTO.md)
 - [RunStatusDetailsRequestEntity](docs/RunStatusDetailsRequestEntity.md)
 - [RuntimeManifest](docs/RuntimeManifest.md)
 - [RuntimeManifestEntity](docs/RuntimeManifestEntity.md)
 - [ScheduleComponentsEntity](docs/ScheduleComponentsEntity.md)
 - [SchedulingDefaults](docs/SchedulingDefaults.md)
 - [SearchResultGroupDTO](docs/SearchResultGroupDTO.md)
 - [SearchResultsDTO](docs/SearchResultsDTO.md)
 - [SearchResultsEntity](docs/SearchResultsEntity.md)
 - [SnippetDTO](docs/SnippetDTO.md)
 - [SnippetEntity](docs/SnippetEntity.md)
 - [StackTraceElement](docs/StackTraceElement.md)
 - [StartVersionControlRequestEntity](docs/StartVersionControlRequestEntity.md)
 - [StateEntryDTO](docs/StateEntryDTO.md)
 - [StateMapDTO](docs/StateMapDTO.md)
 - [Stateful](docs/Stateful.md)
 - [StatusDescriptorDTO](docs/StatusDescriptorDTO.md)
 - [StatusHistoryDTO](docs/StatusHistoryDTO.md)
 - [StatusHistoryEntity](docs/StatusHistoryEntity.md)
 - [StatusSnapshotDTO](docs/StatusSnapshotDTO.md)
 - [StorageUsageDTO](docs/StorageUsageDTO.md)
 - [StreamingOutput](docs/StreamingOutput.md)
 - [SubmitReplayRequestEntity](docs/SubmitReplayRequestEntity.md)
 - [SystemDiagnosticsDTO](docs/SystemDiagnosticsDTO.md)
 - [SystemDiagnosticsEntity](docs/SystemDiagnosticsEntity.md)
 - [SystemDiagnosticsSnapshotDTO](docs/SystemDiagnosticsSnapshotDTO.md)
 - [TemplateDTO](docs/TemplateDTO.md)
 - [TemplateEntity](docs/TemplateEntity.md)
 - [TemplatesEntity](docs/TemplatesEntity.md)
 - [TenantDTO](docs/TenantDTO.md)
 - [TenantEntity](docs/TenantEntity.md)
 - [TenantsEntity](docs/TenantsEntity.md)
 - [ThreadDumpDTO](docs/ThreadDumpDTO.md)
 - [Throwable](docs/Throwable.md)
 - [TransactionResultEntity](docs/TransactionResultEntity.md)
 - [UpdateControllerServiceReferenceRequestEntity](docs/UpdateControllerServiceReferenceRequestEntity.md)
 - [UserDTO](docs/UserDTO.md)
 - [UserEntity](docs/UserEntity.md)
 - [UserGroupDTO](docs/UserGroupDTO.md)
 - [UserGroupEntity](docs/UserGroupEntity.md)
 - [UserGroupsEntity](docs/UserGroupsEntity.md)
 - [UsersEntity](docs/UsersEntity.md)
 - [VariableDTO](docs/VariableDTO.md)
 - [VariableEntity](docs/VariableEntity.md)
 - [VariableRegistryDTO](docs/VariableRegistryDTO.md)
 - [VariableRegistryEntity](docs/VariableRegistryEntity.md)
 - [VariableRegistryUpdateRequestDTO](docs/VariableRegistryUpdateRequestDTO.md)
 - [VariableRegistryUpdateRequestEntity](docs/VariableRegistryUpdateRequestEntity.md)
 - [VariableRegistryUpdateStepDTO](docs/VariableRegistryUpdateStepDTO.md)
 - [VerifyConfigRequestDTO](docs/VerifyConfigRequestDTO.md)
 - [VerifyConfigRequestEntity](docs/VerifyConfigRequestEntity.md)
 - [VerifyConfigUpdateStepDTO](docs/VerifyConfigUpdateStepDTO.md)
 - [VersionControlComponentMappingEntity](docs/VersionControlComponentMappingEntity.md)
 - [VersionControlInformationDTO](docs/VersionControlInformationDTO.md)
 - [VersionControlInformationEntity](docs/VersionControlInformationEntity.md)
 - [VersionInfoDTO](docs/VersionInfoDTO.md)
 - [VersionedConnection](docs/VersionedConnection.md)
 - [VersionedControllerService](docs/VersionedControllerService.md)
 - [VersionedFlowCoordinates](docs/VersionedFlowCoordinates.md)
 - [VersionedFlowDTO](docs/VersionedFlowDTO.md)
 - [VersionedFlowEntity](docs/VersionedFlowEntity.md)
 - [VersionedFlowSnapshotEntity](docs/VersionedFlowSnapshotEntity.md)
 - [VersionedFlowSnapshotMetadataEntity](docs/VersionedFlowSnapshotMetadataEntity.md)
 - [VersionedFlowSnapshotMetadataSetEntity](docs/VersionedFlowSnapshotMetadataSetEntity.md)
 - [VersionedFlowUpdateRequestDTO](docs/VersionedFlowUpdateRequestDTO.md)
 - [VersionedFlowUpdateRequestEntity](docs/VersionedFlowUpdateRequestEntity.md)
 - [VersionedFlowsEntity](docs/VersionedFlowsEntity.md)
 - [VersionedFunnel](docs/VersionedFunnel.md)
 - [VersionedLabel](docs/VersionedLabel.md)
 - [VersionedParameter](docs/VersionedParameter.md)
 - [VersionedParameterContext](docs/VersionedParameterContext.md)
 - [VersionedPort](docs/VersionedPort.md)
 - [VersionedProcessGroup](docs/VersionedProcessGroup.md)
 - [VersionedProcessor](docs/VersionedProcessor.md)
 - [VersionedPropertyDescriptor](docs/VersionedPropertyDescriptor.md)
 - [VersionedRemoteGroupPort](docs/VersionedRemoteGroupPort.md)
 - [VersionedRemoteProcessGroup](docs/VersionedRemoteProcessGroup.md)
 - [VersionedResourceDefinition](docs/VersionedResourceDefinition.md)
