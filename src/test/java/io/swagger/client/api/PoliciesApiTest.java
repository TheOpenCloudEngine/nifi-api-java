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
import io.swagger.client.model.AccessPolicyEntity;
import org.junit.Test;

/**
 * API tests for PoliciesApi
 */
public class PoliciesApiTest {

    private final PoliciesApi api = new PoliciesApi();


    /**
     * Creates an access policy
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAccessPolicyTest() throws ApiException {
        AccessPolicyEntity body = null;
        // AccessPolicyEntity response = api.createAccessPolicy(body);

        // TODO: test validations
    }

    /**
     * Gets an access policy
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAccessPolicyTest() throws ApiException {
        String id = null;
        // AccessPolicyEntity response = api.getAccessPolicy(id);

        // TODO: test validations
    }

    /**
     * Gets an access policy for the specified action and resource
     *
     * Will return the effective policy if no component specific policy exists for the specified action and resource. Must have Read permissions to the policy with the desired action and resource. Permissions for the policy that is returned will be indicated in the response. This means the client could be authorized to get the policy for a given component but the effective policy may be inherited from an ancestor Process Group. If the client does not have permissions to that policy, the response will not include the policy and the permissions in the response will be marked accordingly. If the client does not have permissions to the policy of the desired action and resource a 403 response will be returned.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAccessPolicyForResourceTest() throws ApiException {
        String action = null;
        String resource = null;
        // AccessPolicyEntity response = api.getAccessPolicyForResource(action, resource);

        // TODO: test validations
    }

    /**
     * Deletes an access policy
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeAccessPolicyTest() throws ApiException {
        String id = null;
        String version = null;
        String clientId = null;
        Boolean disconnectedNodeAcknowledged = null;
        // AccessPolicyEntity response = api.removeAccessPolicy(id, version, clientId, disconnectedNodeAcknowledged);

        // TODO: test validations
    }

    /**
     * Updates a access policy
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateAccessPolicyTest() throws ApiException {
        String id = null;
        AccessPolicyEntity body = null;
        // AccessPolicyEntity response = api.updateAccessPolicy(id, body);

        // TODO: test validations
    }

}
