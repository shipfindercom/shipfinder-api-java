package com.elane.request;

import lombok.Data;

@Data
public class PortInfoRequest extends BaseObj {
    /**
     * The input keyword for port query, can be the port name or the standard five-digit port code.
     */
    private String keywords;

    /**
     * Maximum number of results to return (max value: 100).
     */
    private Integer max = 10;
}
