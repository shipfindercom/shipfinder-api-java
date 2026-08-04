package com.elane.request;

import lombok.Data;

@Data
public class VesselStsEventsRequest extends BaseObj {
    /**
     * 9-digit numeric code of MMSI.
     */
    private Integer mmsi;

    /**
     * Start time represented as a UTC timestamp.
     */
    private Integer start_time;

    /**
     * End time represented as a UTC timestamp. The interval between the start time and end time
     * shall not exceed 1 week.
     */
    private Integer end_time;

    /**
     * STS operation area: 1=STS in port area; 2=STS at anchorage; 3=STS in other areas.
     */
    private Integer approach_zone;
}
