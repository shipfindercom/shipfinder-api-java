package com.elane.response;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class VesselSpeedAlertItem {
    private Integer mmsi;

    /**
     * Speed limit range, format "3-18" (min speed-max speed, in knots)
     */
    @SerializedName("speed_limit")
    private String speedLimit;

    /**
     * Speed duration in minutes, default 5 minutes
     */
    @SerializedName("speed_duration")
    private Double speedDuration;
}
