package com.elane.response;

import lombok.Data;

import java.util.List;

@Data
public class PortCallRecordsByVesselResponse {
    /**
     * Response status code.
     */
    private Integer status;

    /**
     * Message accompanying the response.
     */
    private String msg;

    /**
     * Array of port call records.
     */
    private List<PortCallRecordsByVesselResult> data;
}
