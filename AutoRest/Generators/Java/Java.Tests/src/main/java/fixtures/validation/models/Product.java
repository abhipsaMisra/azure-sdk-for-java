/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.14.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.validation.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The product documentation.
 */
public class Product {
    /**
     * Non required array of unique items from 0 to 6 elements.
     */
    @JsonProperty(value = "display_names")
    private List<String> displayNames;

    /**
     * Non required int betwen 0 and 100 exclusive.
     */
    private Integer capacity;

    /**
     * Image URL representing the product.
     */
    private String image;

    /**
     * Get the displayNames value.
     *
     * @return the displayNames value
     */
    public List<String> getDisplayNames() {
        return this.displayNames;
    }

    /**
     * Set the displayNames value.
     *
     * @param displayNames the displayNames value to set
     */
    public void setDisplayNames(List<String> displayNames) {
        this.displayNames = displayNames;
    }

    /**
     * Get the capacity value.
     *
     * @return the capacity value
     */
    public Integer getCapacity() {
        return this.capacity;
    }

    /**
     * Set the capacity value.
     *
     * @param capacity the capacity value to set
     */
    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    /**
     * Get the image value.
     *
     * @return the image value
     */
    public String getImage() {
        return this.image;
    }

    /**
     * Set the image value.
     *
     * @param image the image value to set
     */
    public void setImage(String image) {
        this.image = image;
    }

}
