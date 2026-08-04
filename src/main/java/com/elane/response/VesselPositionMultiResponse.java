package com.elane.response;

import lombok.Data;

import java.util.List;

@Data
public class VesselPositionMultiResponse {
    /**
     * API call status code, 0 means success
     */
    private Integer status;
    /**
     * Exception prompt message
     */
    private String msg;
    /**
     * List of vessel position records
     */
    private List<VesselPositionData> data;
}
