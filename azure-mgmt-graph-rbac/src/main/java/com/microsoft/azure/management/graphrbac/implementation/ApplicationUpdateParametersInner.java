/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.graphrbac.implementation;

import java.util.Map;
import java.util.List;
import com.microsoft.azure.management.graphrbac.RequiredResourceAccess;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Request parameters for updating an existing application.
 */
public class ApplicationUpdateParametersInner {
    /**
     * Unmatched properties from the message are deserialized this collection.
     */
    @JsonProperty(value = "")
    private Map<String, Object> additionalProperties;

    /**
     * Whether the application is available to other tenants.
     */
    @JsonProperty(value = "availableToOtherTenants")
    private Boolean availableToOtherTenants;

    /**
     * The display name of the application.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /**
     * The home page of the application.
     */
    @JsonProperty(value = "homepage")
    private String homepage;

    /**
     * A collection of URIs for the application.
     */
    @JsonProperty(value = "identifierUris")
    private List<String> identifierUris;

    /**
     * A collection of reply URLs for the application.
     */
    @JsonProperty(value = "replyUrls")
    private List<String> replyUrls;

    /**
     * The list of KeyCredential objects.
     */
    @JsonProperty(value = "keyCredentials")
    private List<KeyCredentialInner> keyCredentials;

    /**
     * The list of PasswordCredential objects.
     */
    @JsonProperty(value = "passwordCredentials")
    private List<PasswordCredentialInner> passwordCredentials;

    /**
     * Whether to allow implicit grant flow for OAuth2.
     */
    @JsonProperty(value = "oauth2AllowImplicitFlow")
    private Boolean oauth2AllowImplicitFlow;

    /**
     * Specifies resources that this application requires access to and the set
     * of OAuth permission scopes and application roles that it needs under
     * each of those resources. This pre-configuration of required resource
     * access drives the consent experience.
     */
    @JsonProperty(value = "requiredResourceAccess")
    private List<RequiredResourceAccess> requiredResourceAccess;

    /**
     * Get the additionalProperties value.
     *
     * @return the additionalProperties value
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties value.
     *
     * @param additionalProperties the additionalProperties value to set
     * @return the ApplicationUpdateParametersInner object itself.
     */
    public ApplicationUpdateParametersInner withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * Get the availableToOtherTenants value.
     *
     * @return the availableToOtherTenants value
     */
    public Boolean availableToOtherTenants() {
        return this.availableToOtherTenants;
    }

    /**
     * Set the availableToOtherTenants value.
     *
     * @param availableToOtherTenants the availableToOtherTenants value to set
     * @return the ApplicationUpdateParametersInner object itself.
     */
    public ApplicationUpdateParametersInner withAvailableToOtherTenants(Boolean availableToOtherTenants) {
        this.availableToOtherTenants = availableToOtherTenants;
        return this;
    }

    /**
     * Get the displayName value.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName value.
     *
     * @param displayName the displayName value to set
     * @return the ApplicationUpdateParametersInner object itself.
     */
    public ApplicationUpdateParametersInner withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the homepage value.
     *
     * @return the homepage value
     */
    public String homepage() {
        return this.homepage;
    }

    /**
     * Set the homepage value.
     *
     * @param homepage the homepage value to set
     * @return the ApplicationUpdateParametersInner object itself.
     */
    public ApplicationUpdateParametersInner withHomepage(String homepage) {
        this.homepage = homepage;
        return this;
    }

    /**
     * Get the identifierUris value.
     *
     * @return the identifierUris value
     */
    public List<String> identifierUris() {
        return this.identifierUris;
    }

    /**
     * Set the identifierUris value.
     *
     * @param identifierUris the identifierUris value to set
     * @return the ApplicationUpdateParametersInner object itself.
     */
    public ApplicationUpdateParametersInner withIdentifierUris(List<String> identifierUris) {
        this.identifierUris = identifierUris;
        return this;
    }

    /**
     * Get the replyUrls value.
     *
     * @return the replyUrls value
     */
    public List<String> replyUrls() {
        return this.replyUrls;
    }

    /**
     * Set the replyUrls value.
     *
     * @param replyUrls the replyUrls value to set
     * @return the ApplicationUpdateParametersInner object itself.
     */
    public ApplicationUpdateParametersInner withReplyUrls(List<String> replyUrls) {
        this.replyUrls = replyUrls;
        return this;
    }

    /**
     * Get the keyCredentials value.
     *
     * @return the keyCredentials value
     */
    public List<KeyCredentialInner> keyCredentials() {
        return this.keyCredentials;
    }

    /**
     * Set the keyCredentials value.
     *
     * @param keyCredentials the keyCredentials value to set
     * @return the ApplicationUpdateParametersInner object itself.
     */
    public ApplicationUpdateParametersInner withKeyCredentials(List<KeyCredentialInner> keyCredentials) {
        this.keyCredentials = keyCredentials;
        return this;
    }

    /**
     * Get the passwordCredentials value.
     *
     * @return the passwordCredentials value
     */
    public List<PasswordCredentialInner> passwordCredentials() {
        return this.passwordCredentials;
    }

    /**
     * Set the passwordCredentials value.
     *
     * @param passwordCredentials the passwordCredentials value to set
     * @return the ApplicationUpdateParametersInner object itself.
     */
    public ApplicationUpdateParametersInner withPasswordCredentials(List<PasswordCredentialInner> passwordCredentials) {
        this.passwordCredentials = passwordCredentials;
        return this;
    }

    /**
     * Get the oauth2AllowImplicitFlow value.
     *
     * @return the oauth2AllowImplicitFlow value
     */
    public Boolean oauth2AllowImplicitFlow() {
        return this.oauth2AllowImplicitFlow;
    }

    /**
     * Set the oauth2AllowImplicitFlow value.
     *
     * @param oauth2AllowImplicitFlow the oauth2AllowImplicitFlow value to set
     * @return the ApplicationUpdateParametersInner object itself.
     */
    public ApplicationUpdateParametersInner withOauth2AllowImplicitFlow(Boolean oauth2AllowImplicitFlow) {
        this.oauth2AllowImplicitFlow = oauth2AllowImplicitFlow;
        return this;
    }

    /**
     * Get the requiredResourceAccess value.
     *
     * @return the requiredResourceAccess value
     */
    public List<RequiredResourceAccess> requiredResourceAccess() {
        return this.requiredResourceAccess;
    }

    /**
     * Set the requiredResourceAccess value.
     *
     * @param requiredResourceAccess the requiredResourceAccess value to set
     * @return the ApplicationUpdateParametersInner object itself.
     */
    public ApplicationUpdateParametersInner withRequiredResourceAccess(List<RequiredResourceAccess> requiredResourceAccess) {
        this.requiredResourceAccess = requiredResourceAccess;
        return this;
    }

}
