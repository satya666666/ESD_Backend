package com.satyamgupta.esd_assignment.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public record ProductResponse(
        @JsonProperty("p_name")
        String productName
) {

}
