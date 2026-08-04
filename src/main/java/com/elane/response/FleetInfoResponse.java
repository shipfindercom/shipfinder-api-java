package com.elane.response;

import lombok.Data;

@Data
public class FleetInfoResponse {
    /**
     * Response status code
     */
    private Integer status;
    /**
     * Response message
     */
    private String msg;
    /**
     * Fleet information payload
     */
    private FleetInfoData data;
}
