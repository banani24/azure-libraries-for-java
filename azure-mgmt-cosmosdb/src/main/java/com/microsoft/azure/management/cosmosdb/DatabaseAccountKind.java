/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for DatabaseAccountKind.
 */
public final class DatabaseAccountKind {
    /** Static value GlobalDocumentDB for DatabaseAccountKind. */
    public static final DatabaseAccountKind GLOBAL_DOCUMENT_DB = new DatabaseAccountKind("GlobalDocumentDB");

    /** Static value MongoDB for DatabaseAccountKind. */
    public static final DatabaseAccountKind MONGO_DB = new DatabaseAccountKind("MongoDB");

    /** Static value Parse for DatabaseAccountKind. */
    public static final DatabaseAccountKind PARSE = new DatabaseAccountKind("Parse");

    private String value;

    /**
     * Creates a custom value for DatabaseAccountKind.
     * @param value the custom value
     */
    public DatabaseAccountKind(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return value;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof DatabaseAccountKind)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        DatabaseAccountKind rhs = (DatabaseAccountKind) obj;
        if (value == null) {
            return rhs.value == null;
        } else {
            return value.equals(rhs.value);
        }
    }
}
