/*
 *   Copyright (c) 2018, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *   WSO2 Inc. licenses this file to you under the Apache License,
 *   Version 2.0 (the "License"); you may not use this file except
 *   in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing,
 *   software distributed under the License is distributed on an
 *   "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *   KIND, either express or implied.  See the License for the
 *   specific language governing permissions and limitations
 *   under the License.
 *
 */
package org.wso2.broker.amqp.codec.auth;

import io.netty.channel.ChannelHandlerContext;
import org.wso2.broker.amqp.codec.frames.ConnectionTune;
import org.wso2.broker.amqp.codec.handlers.AmqpConnectionHandler;
import org.wso2.broker.common.data.types.LongString;
import org.wso2.broker.common.data.types.ShortString;
import org.wso2.broker.core.BrokerException;

/**
 * Class implements @AuthenticationStrategy to provide authentication strategy disabling authentication for client
 * connections
 */
public class NoAuthenticationStrategy implements AuthenticationStrategy {
    @Override
    public void handle(int channel, ChannelHandlerContext ctx, AmqpConnectionHandler connectionHandler,
                       ShortString mechanism, LongString response) throws BrokerException {
        ctx.writeAndFlush(new ConnectionTune(256, 65535, 0));
    }
}
