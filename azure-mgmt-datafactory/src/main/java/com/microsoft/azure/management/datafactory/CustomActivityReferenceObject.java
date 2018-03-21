/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Reference objects for custom activity.
 */
public class CustomActivityReferenceObject {
    /**
     * Linked service references.
     */
    @JsonProperty(value = "linkedServices")
    private List<LinkedServiceReference> linkedServices;

    /**
     * Dataset references.
     */
    @JsonProperty(value = "datasets")
    private List<DatasetReference> datasets;

    /**
     * Get the linkedServices value.
     *
     * @return the linkedServices value
     */
    public List<LinkedServiceReference> linkedServices() {
        return this.linkedServices;
    }

    /**
     * Set the linkedServices value.
     *
     * @param linkedServices the linkedServices value to set
     * @return the CustomActivityReferenceObject object itself.
     */
    public CustomActivityReferenceObject withLinkedServices(List<LinkedServiceReference> linkedServices) {
        this.linkedServices = linkedServices;
        return this;
    }

    /**
     * Get the datasets value.
     *
     * @return the datasets value
     */
    public List<DatasetReference> datasets() {
        return this.datasets;
    }

    /**
     * Set the datasets value.
     *
     * @param datasets the datasets value to set
     * @return the CustomActivityReferenceObject object itself.
     */
    public CustomActivityReferenceObject withDatasets(List<DatasetReference> datasets) {
        this.datasets = datasets;
        return this;
    }

}