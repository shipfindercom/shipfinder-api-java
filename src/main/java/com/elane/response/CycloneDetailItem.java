package com.elane.response;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class CycloneDetailItem {

    /**
     * Typhoon serial number
     */
    @SerializedName("typhoon_id")
    private String typhoonId;

    /**
     * Formation time in UTC+0 (add 8 hours for China Standard Time)
     */
    @SerializedName("typhoon_time")
    private String typhoonTime;

    /**
     * Forecast data flag; empty means an observed point, non-empty means a forecast point
     */
    private String forecast;

    /**
     * Forecast lead time, hours from the publish time
     */
    private String fhour;

    /**
     * Latitude in WGS84 coordinate system
     */
    private Double lat;

    /**
     * Longitude in WGS84 coordinate system
     */
    private Double lng;

    /**
     * Wind force grade (5-18)
     */
    private Integer grade;

    /**
     * Maximum sustained wind speed (m/s)
     */
    private Double mspeed;

    /**
     * Central pressure (hPa)
     */
    private Double pressure;

    /**
     * Moving speed (km/h)
     */
    private Double kspeed;

    /**
     * Moving direction (E/W/S/N)
     */
    private String direction;

    /**
     * Radius of the level-7 wind circle (km)
     */
    private Double radius7;

    /**
     * Radius of the level-10 wind circle (km)
     */
    private Double radius10;

    /**
     * Four-quadrant radii of the level-7 wind circle, format NE,SE,SW,NW (km)
     */
    private String radius7_s;

    /**
     * Four-quadrant radii of the level-10 wind circle, format NE,SE,SW,NW (km)
     */
    private String radius10_s;

    /**
     * Four-quadrant radii of the level-12 wind circle, format NE,SE,SW,NW (km)
     */
    private String radius12_s;
}
