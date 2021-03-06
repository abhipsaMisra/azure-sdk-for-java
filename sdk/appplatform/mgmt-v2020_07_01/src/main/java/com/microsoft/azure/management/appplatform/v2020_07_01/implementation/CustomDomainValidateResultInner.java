/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appplatform.v2020_07_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Validation result for custom domain.
 */
public class CustomDomainValidateResultInner {
    /**
     * Indicates if domain name is valid.
     */
    @JsonProperty(value = "isValid")
    private Boolean isValid;

    /**
     * Message of why domain name is invalid.
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * Get indicates if domain name is valid.
     *
     * @return the isValid value
     */
    public Boolean isValid() {
        return this.isValid;
    }

    /**
     * Set indicates if domain name is valid.
     *
     * @param isValid the isValid value to set
     * @return the CustomDomainValidateResultInner object itself.
     */
    public CustomDomainValidateResultInner withIsValid(Boolean isValid) {
        this.isValid = isValid;
        return this;
    }

    /**
     * Get message of why domain name is invalid.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Set message of why domain name is invalid.
     *
     * @param message the message value to set
     * @return the CustomDomainValidateResultInner object itself.
     */
    public CustomDomainValidateResultInner withMessage(String message) {
        this.message = message;
        return this;
    }

}
