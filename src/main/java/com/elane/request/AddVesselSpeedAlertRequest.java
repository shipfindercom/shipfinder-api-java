package com.elane.request;

import lombok.Data;

@Data
public class AddVesselSpeedAlertRequest extends BaseObj {
    /**
     * Multiple MMSI numbers, comma-separated
     */
    private String mmsi;

    /**
     * Speed threshold range, format "min speed-max speed", in knots, range 0-50 knots
     */
    private String speed_limit;

    /**
     * Duration to trigger the speed alert (minutes), default 5 minutes
     */
    private String speed_duration;
}
