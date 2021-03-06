/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.machinelearning;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines an edge within the web service's graph.
 */
public class GraphEdge {
    /**
     * The source graph node's identifier.
     */
    @JsonProperty(value = "sourceNodeId")
    private String sourceNodeId;

    /**
     * The identifier of the source node's port that the edge connects from.
     */
    @JsonProperty(value = "sourcePortId")
    private String sourcePortId;

    /**
     * The destination graph node's identifier.
     */
    @JsonProperty(value = "targetNodeId")
    private String targetNodeId;

    /**
     * The identifier of the destination node's port that the edge connects
     * into.
     */
    @JsonProperty(value = "targetPortId")
    private String targetPortId;

    /**
     * Get the sourceNodeId value.
     *
     * @return the sourceNodeId value
     */
    public String sourceNodeId() {
        return this.sourceNodeId;
    }

    /**
     * Set the sourceNodeId value.
     *
     * @param sourceNodeId the sourceNodeId value to set
     * @return the GraphEdge object itself.
     */
    public GraphEdge withSourceNodeId(String sourceNodeId) {
        this.sourceNodeId = sourceNodeId;
        return this;
    }

    /**
     * Get the sourcePortId value.
     *
     * @return the sourcePortId value
     */
    public String sourcePortId() {
        return this.sourcePortId;
    }

    /**
     * Set the sourcePortId value.
     *
     * @param sourcePortId the sourcePortId value to set
     * @return the GraphEdge object itself.
     */
    public GraphEdge withSourcePortId(String sourcePortId) {
        this.sourcePortId = sourcePortId;
        return this;
    }

    /**
     * Get the targetNodeId value.
     *
     * @return the targetNodeId value
     */
    public String targetNodeId() {
        return this.targetNodeId;
    }

    /**
     * Set the targetNodeId value.
     *
     * @param targetNodeId the targetNodeId value to set
     * @return the GraphEdge object itself.
     */
    public GraphEdge withTargetNodeId(String targetNodeId) {
        this.targetNodeId = targetNodeId;
        return this;
    }

    /**
     * Get the targetPortId value.
     *
     * @return the targetPortId value
     */
    public String targetPortId() {
        return this.targetPortId;
    }

    /**
     * Set the targetPortId value.
     *
     * @param targetPortId the targetPortId value to set
     * @return the GraphEdge object itself.
     */
    public GraphEdge withTargetPortId(String targetPortId) {
        this.targetPortId = targetPortId;
        return this;
    }

}
