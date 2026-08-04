package com.elane.request;

import lombok.Data;

@Data
public class VesselCurrentPortCallRequest extends BaseObj {
    /**
     * 9-digit numeric code of MMSI.
     */
    private String mmsi;

    /**
     * 7-digit numeric code of IMO.
     */
    private Integer imo;

    /**
     * Vessel name.
     */
    private String ship_name;

    /**
     * Call Sign.
     */
    private String call_sign;

    /**
     * Time zone type: 1=Local time zone (UTC if unavailable); 2=UTC+8; 3=UTC. Default value: 2.
     */
    private Integer time_zone;
}
