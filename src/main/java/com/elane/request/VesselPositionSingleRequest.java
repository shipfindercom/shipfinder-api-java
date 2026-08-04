package com.elane.request;

import lombok.Data;

@Data
public class VesselPositionSingleRequest extends BaseObj {
    /**
     * 9-digit numeric code of MMSI
     */
    private String mmsi;
}
