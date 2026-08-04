package com.elane.response;

import lombok.Data;

import java.util.List;

@Data
public class PortCallRecordsByVesselAtPortResponse {
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
     * Array of port call records.
     */
    private List<PortCallRecordsByVesselAtPortResult> data;
}
