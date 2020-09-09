package com.azure.digitaltwins.core.util;

import java.util.List;

public final class ListModelOptions {

    /*
     * The maximum number of items to retrieve per request. The server may
     * choose to return less than the requested max.
     */
    private Integer maxItemCount;

    /**
     * Get the maxItemCount property.
     *
     * @return the maxItemCount value.
     */
    public Integer getMaxItemCount() {
        return this.maxItemCount;
    }

    /**
     * Set the maxItemCount property.
     *
     * @param maxItemCount the maxItemCount value to set.
     */
    public void setMaxItemCount(Integer maxItemCount) {
        this.maxItemCount = maxItemCount;
    }

    /*
     * Whether to include the model definition in the result. If false, only the model metadata will be returned.
     * Disabled by default.
     */
    private Boolean includeModelDefinition = false;

    /**
     * Get the includeModelDefinition property.
     *
     * @return the includeModelDefinition value.
     */
    public Boolean getIncludeModelDefinition() { return this.includeModelDefinition; }

    /**
     * Set the includeModelDefinition property.
     *
     * @param includeModelDefinition the includeModelDefinition value to set.
     */
    public void setIncludeModelDefinition(Boolean includeModelDefinition) {
        this.includeModelDefinition = includeModelDefinition;
    }

    /*
    * The model Ids to have dependencies retrieved.
    */
    private List<String> dependenciesFor;

    /**
     * Get the dependenciesFor property.
     *
     * @return the dependenciesFor value.
     */
    public List<String> getDependenciesFor() { return this.dependenciesFor; }

    /**
     * Set the dependenciesFor property.
     *
     * @param dependenciesFor the dependenciesFor value to set.
     */
    public void setDependenciesFor(List<String> dependenciesFor) {
        this.dependenciesFor = dependenciesFor;
    }
}
