/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.datafactory.implementation.LinkedServiceInner;

/**
 * Azure Data Lake Store linked service.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AzureDataLakeStore")
@JsonFlatten
public class AzureDataLakeStoreLinkedService extends LinkedServiceInner {
    /**
     * Data Lake Store service URI. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "typeProperties.dataLakeStoreUri", required = true)
    private Object dataLakeStoreUri;

    /**
     * The ID of the application used to authenticate against the Azure Data
     * Lake Store account. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.servicePrincipalId")
    private Object servicePrincipalId;

    /**
     * The Key of the application used to authenticate against the Azure Data
     * Lake Store account.
     */
    @JsonProperty(value = "typeProperties.servicePrincipalKey")
    private SecretBase servicePrincipalKey;

    /**
     * The name or ID of the tenant to which the service principal belongs.
     * Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.tenant")
    private Object tenant;

    /**
     * Data Lake Store account name. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.accountName")
    private Object accountName;

    /**
     * Data Lake Store account subscription ID (if different from Data Factory
     * account). Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.subscriptionId")
    private Object subscriptionId;

    /**
     * Data Lake Store account resource group name (if different from Data
     * Factory account). Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.resourceGroupName")
    private Object resourceGroupName;

    /**
     * The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /**
     * Get the dataLakeStoreUri value.
     *
     * @return the dataLakeStoreUri value
     */
    public Object dataLakeStoreUri() {
        return this.dataLakeStoreUri;
    }

    /**
     * Set the dataLakeStoreUri value.
     *
     * @param dataLakeStoreUri the dataLakeStoreUri value to set
     * @return the AzureDataLakeStoreLinkedService object itself.
     */
    public AzureDataLakeStoreLinkedService withDataLakeStoreUri(Object dataLakeStoreUri) {
        this.dataLakeStoreUri = dataLakeStoreUri;
        return this;
    }

    /**
     * Get the servicePrincipalId value.
     *
     * @return the servicePrincipalId value
     */
    public Object servicePrincipalId() {
        return this.servicePrincipalId;
    }

    /**
     * Set the servicePrincipalId value.
     *
     * @param servicePrincipalId the servicePrincipalId value to set
     * @return the AzureDataLakeStoreLinkedService object itself.
     */
    public AzureDataLakeStoreLinkedService withServicePrincipalId(Object servicePrincipalId) {
        this.servicePrincipalId = servicePrincipalId;
        return this;
    }

    /**
     * Get the servicePrincipalKey value.
     *
     * @return the servicePrincipalKey value
     */
    public SecretBase servicePrincipalKey() {
        return this.servicePrincipalKey;
    }

    /**
     * Set the servicePrincipalKey value.
     *
     * @param servicePrincipalKey the servicePrincipalKey value to set
     * @return the AzureDataLakeStoreLinkedService object itself.
     */
    public AzureDataLakeStoreLinkedService withServicePrincipalKey(SecretBase servicePrincipalKey) {
        this.servicePrincipalKey = servicePrincipalKey;
        return this;
    }

    /**
     * Get the tenant value.
     *
     * @return the tenant value
     */
    public Object tenant() {
        return this.tenant;
    }

    /**
     * Set the tenant value.
     *
     * @param tenant the tenant value to set
     * @return the AzureDataLakeStoreLinkedService object itself.
     */
    public AzureDataLakeStoreLinkedService withTenant(Object tenant) {
        this.tenant = tenant;
        return this;
    }

    /**
     * Get the accountName value.
     *
     * @return the accountName value
     */
    public Object accountName() {
        return this.accountName;
    }

    /**
     * Set the accountName value.
     *
     * @param accountName the accountName value to set
     * @return the AzureDataLakeStoreLinkedService object itself.
     */
    public AzureDataLakeStoreLinkedService withAccountName(Object accountName) {
        this.accountName = accountName;
        return this;
    }

    /**
     * Get the subscriptionId value.
     *
     * @return the subscriptionId value
     */
    public Object subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Set the subscriptionId value.
     *
     * @param subscriptionId the subscriptionId value to set
     * @return the AzureDataLakeStoreLinkedService object itself.
     */
    public AzureDataLakeStoreLinkedService withSubscriptionId(Object subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /**
     * Get the resourceGroupName value.
     *
     * @return the resourceGroupName value
     */
    public Object resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Set the resourceGroupName value.
     *
     * @param resourceGroupName the resourceGroupName value to set
     * @return the AzureDataLakeStoreLinkedService object itself.
     */
    public AzureDataLakeStoreLinkedService withResourceGroupName(Object resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    /**
     * Get the encryptedCredential value.
     *
     * @return the encryptedCredential value
     */
    public Object encryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encryptedCredential value.
     *
     * @param encryptedCredential the encryptedCredential value to set
     * @return the AzureDataLakeStoreLinkedService object itself.
     */
    public AzureDataLakeStoreLinkedService withEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

}