package com.elane.response;

import lombok.Data;

import java.util.List;

@Data
public class PortBerthedVesselsResponse {
    /**
     * API call status code, 0 means success.
     */
    private Integer status;

    /**
     * Exception prompt message.
     */
    private String msg;

    /**
     * Total number of vessels currently berthed at the port.
     */
    private Integer total;

    /**
     * Array of vessel objects.
     */
    private List<PortBerthedVesselsResult> data;
}
