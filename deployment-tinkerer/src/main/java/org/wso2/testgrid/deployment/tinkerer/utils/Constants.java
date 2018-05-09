/*
 * Copyright (c) 2018, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.testgrid.deployment.tinkerer.utils;

/**
 * This class holds the constants related to remote session web app.
 *
 * @since 1.0.0
 */
public final class Constants {

    public static final String HTTP_HEADERS = "HttpHeaders";
    public static final int OPERATION_TIMEOUT = 60000; //Operation timeout interval in milliseconds.
    public static final int HEARTBEAT_INTERVAL = 60000; //Heartbeat interval in milliseconds.

    private Constants() {
    }
}
