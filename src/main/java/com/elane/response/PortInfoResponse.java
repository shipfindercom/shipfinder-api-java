package com.elane.response;

import lombok.Data;

import java.util.List;

@Data
public class PortInfoResponse {
    /**
     * API call status code, 0 means success.
     */
    private Integer status;

    /**
     * Exception prompt message.
     */
    private String msg;

    /**
     * Total count of results.
     */
    private Integer total;

    /**
     * Array of port objects.
     */
    private List<PortInfoResult> data;
}
