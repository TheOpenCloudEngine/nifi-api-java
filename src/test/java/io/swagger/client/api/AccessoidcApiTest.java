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
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AccessoidcApi
 */
public class AccessoidcApiTest {

    private final AccessoidcApi api = new AccessoidcApi();

    
    /**
     * Redirect/callback URI for processing the result of the OpenId Connect login sequence.
     *
     * Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void oidcCallbackTest() throws ApiException {
        // api.oidcCallback();

        // TODO: test validations
    }
    
    /**
     * Retrieves a JWT following a successful login sequence using the configured OpenId Connect provider.
     *
     * Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void oidcExchangeTest() throws ApiException {
        // String response = api.oidcExchange();

        // TODO: test validations
    }
    
    /**
     * Performs a logout in the OpenId Provider.
     *
     * Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void oidcLogoutTest() throws ApiException {
        // api.oidcLogout();

        // TODO: test validations
    }
    
    /**
     * Redirect/callback URI for processing the result of the OpenId Connect logout sequence.
     *
     * Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void oidcLogoutCallbackTest() throws ApiException {
        // api.oidcLogoutCallback();

        // TODO: test validations
    }
    
    /**
     * Initiates a request to authenticate through the configured OpenId Connect provider.
     *
     * Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void oidcRequestTest() throws ApiException {
        // api.oidcRequest();

        // TODO: test validations
    }
    
}
