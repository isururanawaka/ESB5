/*
 * Copyright (c) 2016, WSO2 Inc. (http://wso2.com) All Rights Reserved.
 * <p>
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.esb5.mediation.cheetah.flow.mediators.headerrouter;

import org.wso2.carbon.esb5.mediation.cheetah.flow.mediators.Mediator;

/**
 * A class that responsible for represent router config
 */
public class HeaderBasedRouterConfig {

    private String headerName;
    private String value;
    private Mediator mediator;

    public HeaderBasedRouterConfig(String headerName, String value, Mediator mediator) {
        this.headerName = headerName;
        this.value = value;
        this.mediator = mediator;
    }

    public String getHeaderName() {
        return headerName;
    }

    public String getValue() {
        return value;
    }


    public Mediator getMediator() {
        return mediator;
    }

    @Override
    public String toString() {
        return headerName + ":" + value;
    }
}