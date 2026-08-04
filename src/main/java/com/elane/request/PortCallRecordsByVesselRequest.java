package com.elane.request;

import lombok.Data;

@Data
public class PortCallRecordsByVesselRequest extends BaseObj {
    /**
     * 9-digit numeric code of MMSI.
     */
    private Integer mmsi;

    /**
     * 7-digit numeric code of IMO.
     */
    private Integer imo;

    /**
     * Vessel name; returns records for all vessels with matching name if duplicates exist.
     */
    private String ship_name;

    /**
     * Radio call sign with flexible spacing; case-insensitive matching.
     */
    private String call_sign;

    /**
     * Start time of historical berthing records, represented as a Unix timestamp.
     */
    private Integer start_time;

    /**
     * End time of historical berthing records, represented as a Unix timestamp.
     */
    private Integer end_time;

    /**
     * Time zone type: 1=Local/UTC; 2=UTC+8; 3=UTC. Default value: 2.
     */
    private Integer time_zone;
}
