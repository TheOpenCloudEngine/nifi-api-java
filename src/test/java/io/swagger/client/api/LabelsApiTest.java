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
import io.swagger.client.model.LabelEntity;
import org.junit.Test;

/**
 * API tests for LabelsApi
 */
public class LabelsApiTest {

    private final LabelsApi api = new LabelsApi();


    /**
     * Gets a label
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLabelTest() throws ApiException {
        String id = null;
        // LabelEntity response = api.getLabel(id);

        // TODO: test validations
    }

    /**
     * Deletes a label
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeLabelTest() throws ApiException {
        String id = null;
        String version = null;
        String clientId = null;
        Boolean disconnectedNodeAcknowledged = null;
        // LabelEntity response = api.removeLabel(id, version, clientId, disconnectedNodeAcknowledged);

        // TODO: test validations
    }

    /**
     * Updates a label
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateLabelTest() throws ApiException {
        String id = null;
        LabelEntity body = null;
        // LabelEntity response = api.updateLabel(id, body);

        // TODO: test validations
    }

}
