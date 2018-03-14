/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.web.implementation;

import org.joda.time.DateTime;
import com.microsoft.azure.management.web.LocalizableString;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Usage of the quota resource.
 */
public class CsmUsageQuotaInner {
    /**
     * Units of measurement for the quota resourse.
     */
    @JsonProperty(value = "unit")
    private String unit;

    /**
     * Next reset time for the resource counter.
     */
    @JsonProperty(value = "nextResetTime")
    private DateTime nextResetTime;

    /**
     * The current value of the resource counter.
     */
    @JsonProperty(value = "currentValue")
    private Long currentValue;

    /**
     * The resource limit.
     */
    @JsonProperty(value = "limit")
    private Long limit;

    /**
     * Quota name.
     */
    @JsonProperty(value = "name")
    private LocalizableString name;

    /**
     * Get the unit value.
     *
     * @return the unit value
     */
    public String unit() {
        return this.unit;
    }

    /**
     * Set the unit value.
     *
     * @param unit the unit value to set
     * @return the CsmUsageQuotaInner object itself.
     */
    public CsmUsageQuotaInner withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * Get the nextResetTime value.
     *
     * @return the nextResetTime value
     */
    public DateTime nextResetTime() {
        return this.nextResetTime;
    }

    /**
     * Set the nextResetTime value.
     *
     * @param nextResetTime the nextResetTime value to set
     * @return the CsmUsageQuotaInner object itself.
     */
    public CsmUsageQuotaInner withNextResetTime(DateTime nextResetTime) {
        this.nextResetTime = nextResetTime;
        return this;
    }

    /**
     * Get the currentValue value.
     *
     * @return the currentValue value
     */
    public Long currentValue() {
        return this.currentValue;
    }

    /**
     * Set the currentValue value.
     *
     * @param currentValue the currentValue value to set
     * @return the CsmUsageQuotaInner object itself.
     */
    public CsmUsageQuotaInner withCurrentValue(Long currentValue) {
        this.currentValue = currentValue;
        return this;
    }

    /**
     * Get the limit value.
     *
     * @return the limit value
     */
    public Long limit() {
        return this.limit;
    }

    /**
     * Set the limit value.
     *
     * @param limit the limit value to set
     * @return the CsmUsageQuotaInner object itself.
     */
    public CsmUsageQuotaInner withLimit(Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public LocalizableString name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the CsmUsageQuotaInner object itself.
     */
    public CsmUsageQuotaInner withName(LocalizableString name) {
        this.name = name;
        return this;
    }

}