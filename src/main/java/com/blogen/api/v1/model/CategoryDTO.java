package com.blogen.api.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Data Transfer Object containing {@link com.blogen.domain.Category} data to be exposed to clients.
 *
 * @author Cliff
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryDTO {

    @ApiModelProperty( value = "Category Name", required = true, example = "Business")
    private String name;

    @ApiModelProperty( value = "URL of this Category", readOnly = true, example = "/api/v1/categories/4")
    private String categoryUrl;
}
