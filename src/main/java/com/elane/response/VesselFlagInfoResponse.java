package com.elane.response;

import lombok.Data;

@Data
public class VesselFlagInfoResponse {
    /**
     * API call status code, 0 means success
     */
    private Integer status;
    /**
     * Exception prompt message
     */
    private String msg;
    /**
     * Container for vessel flag information
     */
    private VesselFlagInfoData data;
}
