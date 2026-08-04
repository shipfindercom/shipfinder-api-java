package com.elane.response;

import lombok.Data;

import java.util.List;

@Data
public class VesselsNearbyResponse {
    /**
     * API call status code, 0 means success
     */
    private Integer status;
    /**
     * Exception prompt message
     */
    private String msg;
    /**
     * Total number of proximity vessels
     */
    private Integer total;
    /**
     * List of detailed proximity vessel data
     */
    private List<VesselsNearbyResult> data;
}
