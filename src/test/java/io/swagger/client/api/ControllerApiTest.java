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


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.*;
import org.junit.Test;

/**
 * API tests for ControllerApi
 */
public class ControllerApiTest {

    private final ControllerApi api = new ControllerApi();


    /**
     * Creates a new bulletin
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createBulletinTest() throws ApiException {
        BulletinEntity body = null;
        // BulletinEntity response = api.createBulletin(body);

        // TODO: test validations
    }

    /**
     * Creates a new controller service
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createControllerServiceTest() throws ApiException {
        ControllerServiceEntity body = null;
        // ControllerServiceEntity response = api.createControllerService(body);

        // TODO: test validations
    }

    /**
     * Creates a new flow registry client
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createFlowRegistryClientTest() throws ApiException {
        FlowRegistryClientEntity body = null;
        // FlowRegistryClientEntity response = api.createFlowRegistryClient(body);

        // TODO: test validations
    }

    /**
     * Creates a new parameter provider
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createParameterProviderTest() throws ApiException {
        ParameterProviderEntity body = null;
        // ParameterProviderEntity response = api.createParameterProvider(body);

        // TODO: test validations
    }

    /**
     * Creates a new reporting task
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createReportingTaskTest() throws ApiException {
        ReportingTaskEntity body = null;
        // ReportingTaskEntity response = api.createReportingTask(body);

        // TODO: test validations
    }

    /**
     * Deletes a flow registry client
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteFlowRegistryClientTest() throws ApiException {
        String id = null;
        String version = null;
        String clientId = null;
        Boolean disconnectedNodeAcknowledged = null;
        // FlowRegistryClientEntity response = api.deleteFlowRegistryClient(id, version, clientId, disconnectedNodeAcknowledged);

        // TODO: test validations
    }

    /**
     * Purges history
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteHistoryTest() throws ApiException {
        String endDate = null;
        // HistoryEntity response = api.deleteHistory(endDate);

        // TODO: test validations
    }

    /**
     * Removes a node from the cluster
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNodeTest() throws ApiException {
        String id = null;
        // NodeEntity response = api.deleteNode(id);

        // TODO: test validations
    }

    /**
     * Gets the contents of the cluster
     *
     * Returns the contents of the cluster including all nodes and their status.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getClusterTest() throws ApiException {
        // ClusterEntity response = api.getCluster();

        // TODO: test validations
    }

    /**
     * Retrieves the configuration for this NiFi Controller
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getControllerConfigTest() throws ApiException {
        // ControllerConfigurationEntity response = api.getControllerConfig();

        // TODO: test validations
    }

    /**
     * Gets a flow registry client
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFlowRegistryClientTest() throws ApiException {
        String id = null;
        // FlowRegistryClientEntity response = api.getFlowRegistryClient(id);

        // TODO: test validations
    }

    /**
     * Gets the listing of available flow registry clients
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFlowRegistryClientsTest() throws ApiException {
        // FlowRegistryClientsEntity response = api.getFlowRegistryClients();

        // TODO: test validations
    }

    /**
     * Gets a node in the cluster
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNodeTest() throws ApiException {
        String id = null;
        // NodeEntity response = api.getNode(id);

        // TODO: test validations
    }

    /**
     * Gets status history for the node
     *
     * Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNodeStatusHistoryTest() throws ApiException {
        // ComponentHistoryEntity response = api.getNodeStatusHistory();

        // TODO: test validations
    }

    /**
     * Gets a flow registry client property descriptor
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
     * Retrieves the types of flow  that this NiFi supports
     *
     * Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRegistryClientTypesTest() throws ApiException {
        // FlowRegistryClientTypesEntity response = api.getRegistryClientTypes();

        // TODO: test validations
    }

    /**
     * Retrieves the configuration for this NiFi
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateControllerConfigTest() throws ApiException {
        ControllerConfigurationEntity body = null;
        // ControllerConfigurationEntity response = api.updateControllerConfig(body);

        // TODO: test validations
    }

    /**
     * Updates a flow registry client
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateFlowRegistryClientTest() throws ApiException {
        String id = null;
        FlowRegistryClientEntity body = null;
        // FlowRegistryClientEntity response = api.updateFlowRegistryClient(id, body);

        // TODO: test validations
    }

    /**
     * Updates a node in the cluster
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateNodeTest() throws ApiException {
        String id = null;
        NodeEntity body = null;
        // NodeEntity response = api.updateNode(id, body);

        // TODO: test validations
    }

}
