/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.pulsar.springboot;

import javax.annotation.Generated;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Camel Apache Pulsar Component
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.pulsar")
public class PulsarComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the pulsar component. This is
     * enabled by default.
     */
    private Boolean enabled;
    /**
     * The pulsar autoconfiguration
     */
    private AutoConfigurationNestedConfiguration autoConfiguration;
    /**
     * The pulsar client. The option is a
     * org.apache.pulsar.client.api.PulsarClient type.
     */
    private String pulsarClient;
    /**
     * Whether the component should resolve property placeholders on itself when
     * starting. Only properties which are of String type can use property
     * placeholders.
     */
    private Boolean resolvePropertyPlaceholders = true;

    public AutoConfigurationNestedConfiguration getAutoConfiguration() {
        return autoConfiguration;
    }

    public void setAutoConfiguration(
            AutoConfigurationNestedConfiguration autoConfiguration) {
        this.autoConfiguration = autoConfiguration;
    }

    public String getPulsarClient() {
        return pulsarClient;
    }

    public void setPulsarClient(String pulsarClient) {
        this.pulsarClient = pulsarClient;
    }

    public Boolean getResolvePropertyPlaceholders() {
        return resolvePropertyPlaceholders;
    }

    public void setResolvePropertyPlaceholders(
            Boolean resolvePropertyPlaceholders) {
        this.resolvePropertyPlaceholders = resolvePropertyPlaceholders;
    }

    public static class AutoConfigurationNestedConfiguration {
        public static final Class CAMEL_NESTED_CLASS = org.apache.camel.component.pulsar.utils.AutoConfiguration.class;
    }
}