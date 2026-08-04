package com.elane.response;

import lombok.Data;

import java.util.List;

@Data
public class VesselCurrentPortCallResponse {
    /**
     * Response status code.
     */
    private Integer status;

    /**
     * Response message.
     */
    private String msg;

    /**
     * Total number of records.
     */
    private Integer total;

    /**
     * Array of vessel current port call objects.
     */
    private List<VesselCurrentPortCallResult> data;
}
