package com.elane.request;

import lombok.Data;

@Data
public class PortCallRecordsByVesselAtPortRequest extends BaseObj {
    /**
     * 9-digit numeric code of MMSI.
     */
    private Integer mmsi;

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
     * Standard five-digit port code.
     */
    private String port_code;

    /**
     * Start time of historical berthing records, represented as a Unix timestamp.
     */
    private String start_time;

    /**
     * End time of historical berthing records, represented as a Unix timestamp.
     */
    private String end_time;

    /**
     * Time zone type: 1=Local; 2=UTC+8; 3=UTC. Default value: 2.
     */
    private Integer time_zone;
}
