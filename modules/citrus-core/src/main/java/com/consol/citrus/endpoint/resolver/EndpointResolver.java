/*
 * Copyright 2006-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.consol.citrus.endpoint.resolver;

import com.consol.citrus.endpoint.Endpoint;
import org.springframework.context.ApplicationContextAware;

/**
 * Endpoint resolver tries to get endpoint instance by parsing an endpoint uri. Uri can have parameters
 * that get passed to the endpoint configuration.
 *
 * If Spring application context is given searches for matching endpoint component bean and delegates to component for
 * endpoint creation.
 *
 * @author Christoph Deppisch
 */
public interface EndpointResolver extends ApplicationContextAware {

    /**
     * Finds endpoint by parsing the given endpoint uri.
     * @param endpointUri
     * @return
     */
    Endpoint resolve(String endpointUri);
}