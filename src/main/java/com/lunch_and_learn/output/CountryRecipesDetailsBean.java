package com.lunch_and_learn.output;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data

public class CountryRecipesDetailsBean {
    @JsonProperty("common")
    private String common;
}
