package com.elane.response;

import lombok.Data;

import java.util.List;

@Data
public class VesselSearchResponse {
    /**
     * API call status code, 0 means success
     */
    private Integer status;
    /**
     * Exception prompt message
     */
    private String msg;
    /**
     * Number of query results
     */
    private Integer total;
    /**
     * Collection of vessel search results
     */
    private List<VesselSearchResult> data;
}
