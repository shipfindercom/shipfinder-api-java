package com.elane.request;

import lombok.Data;

@Data
public class ETARequest extends BaseObj {
    /**
     * 9-digit MMSI code
     */
    private Integer mmsi;

    /**
     * Standard 5-character port code; defaults to the next destination port declared in the AIS message if not specified
     */
    private String port_code;

    /**
     * Sustained speed for the remaining voyage, in knots (kn); uses the average speed of the last month if not specified
     */
    private Double speed;
}
