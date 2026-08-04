package com.elane.request;

import lombok.Data;

@Data
public class VesselSearchRequest extends BaseObj {
    /**
     * The input keywords for vessel query, which can be vessel name, call sign, MMSI, IMO, etc.
     */
    private String keywords;
    /**
     * The maximum number of results to return, with a maximum value of 100.
     */
    private Integer max = 10;
}
