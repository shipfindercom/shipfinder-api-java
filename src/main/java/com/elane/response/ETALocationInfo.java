package com.elane.response;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class ETALocationInfo {
    /**
     * Longitude of the vessel's current position, WGS84 coordinate system
     */
    private Double lng;

    /**
     * Latitude of the vessel's current position, WGS84 coordinate system
     */
    private Double lat;

    /**
     * Real-time vessel speed over ground, in knots; -1=invalid data
     */
    private Double sog;

    /**
     * Name of the sea area
     */
    @SerializedName("sea_area")
    private String seaArea;

    /**
     * Code of the sea area
     */
    @SerializedName("sea_area_code")
    private Integer seaAreaCode;
}
