package com.elane.response;

import lombok.Data;

import java.util.List;

@Data
public class PortExpectedArrivalsResponse {
    /**
     * API call status code, 0 means success.
     */
    private Integer status;

    /**
     * Exception prompt message.
     */
    private String msg;

    /**
     * Total number of vessels expected to arrive at the port within the specified time period.
     */
    private Integer total;

    /**
     * Array of vessel objects.
     */
    private List<PortExpectedArrivalsResult> data;
}
