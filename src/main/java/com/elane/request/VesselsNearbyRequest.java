package com.elane.request;

import lombok.Data;

@Data
public class VesselsNearbyRequest extends BaseObj {
    /**
     * 9-digit numeric code of MMSI
     */
    private Integer mmsi;
}
