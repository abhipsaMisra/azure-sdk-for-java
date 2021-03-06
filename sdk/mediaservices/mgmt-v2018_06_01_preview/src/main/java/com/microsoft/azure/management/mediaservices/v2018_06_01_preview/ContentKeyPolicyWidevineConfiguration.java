/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_06_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Specifies a configuration for Widevine licenses.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata\\.type", defaultImpl = ContentKeyPolicyWidevineConfiguration.class)
@JsonTypeName("#Microsoft.Media.ContentKeyPolicyWidevineConfiguration")
public class ContentKeyPolicyWidevineConfiguration extends ContentKeyPolicyConfiguration {
    /**
     * The Widevine template.
     */
    @JsonProperty(value = "widevineTemplate", required = true)
    private String widevineTemplate;

    /**
     * Get the Widevine template.
     *
     * @return the widevineTemplate value
     */
    public String widevineTemplate() {
        return this.widevineTemplate;
    }

    /**
     * Set the Widevine template.
     *
     * @param widevineTemplate the widevineTemplate value to set
     * @return the ContentKeyPolicyWidevineConfiguration object itself.
     */
    public ContentKeyPolicyWidevineConfiguration withWidevineTemplate(String widevineTemplate) {
        this.widevineTemplate = widevineTemplate;
        return this;
    }

}
