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
 * Linked service for Amazon Redshift.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AmazonRedshift")
@JsonFlatten
public class AmazonRedshiftLinkedService extends LinkedServiceInner {
    /**
     * The name of the Amazon Redshift server. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.server", required = true)
    private Object server;

    /**
     * The username of the Amazon Redshift source. Type: string (or Expression
     * with resultType string).
     */
    @JsonProperty(value = "typeProperties.username")
    private Object username;

    /**
     * The password of the Amazon Redshift source.
     */
    @JsonProperty(value = "typeProperties.password")
    private SecretBase password;

    /**
     * The database name of the Amazon Redshift source. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.database", required = true)
    private Object database;

    /**
     * The TCP port number that the Amazon Redshift server uses to listen for
     * client connections. The default value is 5439. Type: integer (or
     * Expression with resultType integer).
     */
    @JsonProperty(value = "typeProperties.port")
    private Object port;

    /**
     * The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /**
     * Get the server value.
     *
     * @return the server value
     */
    public Object server() {
        return this.server;
    }

    /**
     * Set the server value.
     *
     * @param server the server value to set
     * @return the AmazonRedshiftLinkedService object itself.
     */
    public AmazonRedshiftLinkedService withServer(Object server) {
        this.server = server;
        return this;
    }

    /**
     * Get the username value.
     *
     * @return the username value
     */
    public Object username() {
        return this.username;
    }

    /**
     * Set the username value.
     *
     * @param username the username value to set
     * @return the AmazonRedshiftLinkedService object itself.
     */
    public AmazonRedshiftLinkedService withUsername(Object username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password value.
     *
     * @return the password value
     */
    public SecretBase password() {
        return this.password;
    }

    /**
     * Set the password value.
     *
     * @param password the password value to set
     * @return the AmazonRedshiftLinkedService object itself.
     */
    public AmazonRedshiftLinkedService withPassword(SecretBase password) {
        this.password = password;
        return this;
    }

    /**
     * Get the database value.
     *
     * @return the database value
     */
    public Object database() {
        return this.database;
    }

    /**
     * Set the database value.
     *
     * @param database the database value to set
     * @return the AmazonRedshiftLinkedService object itself.
     */
    public AmazonRedshiftLinkedService withDatabase(Object database) {
        this.database = database;
        return this;
    }

    /**
     * Get the port value.
     *
     * @return the port value
     */
    public Object port() {
        return this.port;
    }

    /**
     * Set the port value.
     *
     * @param port the port value to set
     * @return the AmazonRedshiftLinkedService object itself.
     */
    public AmazonRedshiftLinkedService withPort(Object port) {
        this.port = port;
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
     * @return the AmazonRedshiftLinkedService object itself.
     */
    public AmazonRedshiftLinkedService withEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

}