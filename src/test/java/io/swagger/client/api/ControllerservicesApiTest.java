/**
 * NiFi Rest API
 * The Rest API provides programmatic access to command and control a NiFi instance in real time. Start and                                             stop processors, monitor queues, query provenance data, and more. Each endpoint below includes a description,                                             definitions of the expected input and output, potential response codes, and the authorizations required                                             to invoke each service.
 *
 * OpenAPI spec version: 1.19.1
 * Contact: dev@nifi.apache.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.ConfigurationAnalysisEntity;
import io.swagger.client.model.ComponentStateEntity;
import io.swagger.client.model.VerifyConfigRequestEntity;
import io.swagger.client.model.ControllerServiceEntity;
import io.swagger.client.model.ControllerServiceReferencingComponentsEntity;
import io.swagger.client.model.PropertyDescriptorEntity;
import io.swagger.client.model.UpdateControllerServiceReferenceRequestEntity;
import io.swagger.client.model.ControllerServiceRunStatusEntity;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ControllerservicesApi
 */
public class ControllerservicesApiTest {

    private final ControllerservicesApi api = new ControllerservicesApi();

    
    /**
     * Performs analysis of the component&#39;s configuration, providing information about which attributes are referenced.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void analyzeConfigurationTest() throws ApiException {
        String id = null;
        ConfigurationAnalysisEntity body = null;
        // ConfigurationAnalysisEntity response = api.analyzeConfiguration(id, body);

        // TODO: test validations
    }
    
    /**
     * Clears the state for a controller service
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void clearStateTest() throws ApiException {
        String id = null;
        // ComponentStateEntity response = api.clearState(id);

        // TODO: test validations
    }
    
    /**
     * Deletes the Verification Request with the given ID
     *
     * Deletes the Verification Request with the given ID. After a request is created, it is expected that the client will properly clean up the request by DELETE&#39;ing it, once the Verification process has completed. If the request is deleted before the request completes, then the Verification request will finish the step that it is currently performing and then will cancel any subsequent steps.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteVerificationRequestTest() throws ApiException {
        String id = null;
        String requestId = null;
        // VerifyConfigRequestEntity response = api.deleteVerificationRequest(id, requestId);

        // TODO: test validations
    }
    
    /**
     * Gets a controller service
     *
     * If the uiOnly query parameter is provided with a value of true, the returned entity may only contain fields that are necessary for rendering the NiFi User Interface. As such, the selected fields may change at any time, even during incremental releases, without warning. As a result, this parameter should not be provided by any client other than the UI.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getControllerServiceTest() throws ApiException {
        String id = null;
        Boolean uiOnly = null;
        // ControllerServiceEntity response = api.getControllerService(id, uiOnly);

        // TODO: test validations
    }
    
    /**
     * Gets a controller service
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getControllerServiceReferencesTest() throws ApiException {
        String id = null;
        // ControllerServiceReferencingComponentsEntity response = api.getControllerServiceReferences(id);

        // TODO: test validations
    }
    
    /**
     * Gets a controller service property descriptor
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPropertyDescriptorTest() throws ApiException {
        String id = null;
        String propertyName = null;
        Boolean sensitive = null;
        // PropertyDescriptorEntity response = api.getPropertyDescriptor(id, propertyName, sensitive);

        // TODO: test validations
    }
    
    /**
     * Gets the state for a controller service
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStateTest() throws ApiException {
        String id = null;
        // ComponentStateEntity response = api.getState(id);

        // TODO: test validations
    }
    
    /**
     * Returns the Verification Request with the given ID
     *
     * Returns the Verification Request with the given ID. Once an Verification Request has been created, that request can subsequently be retrieved via this endpoint, and the request that is fetched will contain the updated state, such as percent complete, the current state of the request, and any failures. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getVerificationRequestTest() throws ApiException {
        String id = null;
        String requestId = null;
        // VerifyConfigRequestEntity response = api.getVerificationRequest(id, requestId);

        // TODO: test validations
    }
    
    /**
     * Deletes a controller service
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeControllerServiceTest() throws ApiException {
        String id = null;
        String version = null;
        String clientId = null;
        Boolean disconnectedNodeAcknowledged = null;
        // ControllerServiceEntity response = api.removeControllerService(id, version, clientId, disconnectedNodeAcknowledged);

        // TODO: test validations
    }
    
    /**
     * Performs verification of the Controller Service&#39;s configuration
     *
     * This will initiate the process of verifying a given Controller Service configuration. This may be a long-running task. As a result, this endpoint will immediately return a ControllerServiceConfigVerificationRequestEntity, and the process of performing the verification will occur asynchronously in the background. The client may then periodically poll the status of the request by issuing a GET request to /controller-services/{serviceId}/verification-requests/{requestId}. Once the request is completed, the client is expected to issue a DELETE request to /controller-services/{serviceId}/verification-requests/{requestId}.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void submitConfigVerificationRequestTest() throws ApiException {
        String id = null;
        VerifyConfigRequestEntity body = null;
        // VerifyConfigRequestEntity response = api.submitConfigVerificationRequest(id, body);

        // TODO: test validations
    }
    
    /**
     * Updates a controller service
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateControllerServiceTest() throws ApiException {
        String id = null;
        ControllerServiceEntity body = null;
        // ControllerServiceEntity response = api.updateControllerService(id, body);

        // TODO: test validations
    }
    
    /**
     * Updates a controller services references
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateControllerServiceReferencesTest() throws ApiException {
        String id = null;
        UpdateControllerServiceReferenceRequestEntity body = null;
        // ControllerServiceReferencingComponentsEntity response = api.updateControllerServiceReferences(id, body);

        // TODO: test validations
    }
    
    /**
     * Updates run status of a controller service
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateRunStatusTest() throws ApiException {
        String id = null;
        ControllerServiceRunStatusEntity body = null;
        // ControllerServiceEntity response = api.updateRunStatus(id, body);

        // TODO: test validations
    }
    
}