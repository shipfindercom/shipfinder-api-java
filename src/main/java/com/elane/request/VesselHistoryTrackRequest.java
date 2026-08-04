package com.elane.request;

import lombok.Data;

@Data
public class VesselHistoryTrackRequest extends BaseObj {
    /**
     * 9-digit numeric code of MMSI.
     */
    private Integer mmsi;

    /**
     * Query start time, represented as a Unix timestamp.
     */
    private Integer start_time;

    /**
     * Query end time, represented as a Unix timestamp.
     */
    private Integer end_time;

    /**
     * Output data format selection: 0=Binary data in Base64 encoding; 1=JSON format. Default value: 1.
     */
    private Integer output;
}
