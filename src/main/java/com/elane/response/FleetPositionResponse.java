package com.elane.response;

import lombok.Data;

import java.util.List;

@Data
public class FleetPositionResponse {
    /**
     * API call status code, 0 means success
     */
    private Integer status;
    /**
     * Exception prompt message
     */
    private String msg;
    /**
     * Total number of vessels in the fleet
     */
    private Integer total;
    /**
     * List of vessel position records
     */
    private List<FleetPositionResult> data;
}
