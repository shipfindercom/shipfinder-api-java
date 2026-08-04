package com.elane.response;

import lombok.Data;

@Data
public class VesselsInZoneResponse {
    /**
     * API call status code, 0 means success
     */
    private Integer status;
    /**
     * Exception prompt message
     */
    private String msg;
    /**
     * Container for response data
     */
    private VesselsInZoneData data;
}
