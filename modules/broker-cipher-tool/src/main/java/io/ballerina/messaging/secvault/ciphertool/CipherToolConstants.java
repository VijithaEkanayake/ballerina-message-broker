/*
 * Copyright (c) 2018, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 */

package io.ballerina.messaging.secvault.ciphertool;

/**
 * Cipher Tool Constants.
 */
public class CipherToolConstants {

    public static final String CONFIG_PATH_COMMAND = "-configPath";
    public static final String ENCRYPT_TEXT_COMMAND = "-encryptText";
    public static final String DECRYPT_TEXT_COMMAND = "-decryptText";
    public static final String CUSTOM_LIB_PATH_COMMAND = "-customLibPath";

    public static final String INIT_METHOD = "init";
    public static final String ENCRYPT_SECRETS_METHOD = "encryptSecrets";
    public static final String ENCRYPT_TEXT_METHOD = "encryptText";
    public static final String DECRYPT_TEXT_METHOD = "decryptText";


    public static final String CIPHER_TOOL_CLASS = "io.ballerina.messaging.secvault.ciphertool.CipherTool";

    public static final String SYSTEM_PARAM_BROKER_CONFIG_FILE = "broker.config";
    public static final String BROKER_FILE_NAME = "broker.yaml";

    /**
     * Remove default constructor and make it not available to initialize.
     */
    private CipherToolConstants() {
        throw new AssertionError("Trying to a instantiate a constant class");
    }
}
