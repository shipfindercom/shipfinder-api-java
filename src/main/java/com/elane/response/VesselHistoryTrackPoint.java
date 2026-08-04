package com.elane.response;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class VesselHistoryTrackPoint {

    /**
     * 0=Terrestrial AIS stations or Shipborne AIS; 1=Satellite AIS.
     */
    @SerializedName("data_source")
    private Integer dataSource;

    /**
     * Timestamp when the track point was updated and uploaded, represented as a Unix timestamp.
     */
    private Long utc;

    /**
     * Coordinate longitude, WGS84 coordinate system.
     */
    private Double lng;

    /**
     * Coordinate latitude, WGS84 coordinate system.
     */
    private Double lat;

    /**
     * Real-time vessel speed over ground in knots; -1=invalid data.
     */
    private Double sog;

    /**
     * Course over ground in degrees; -1=invalid data.
     */
    private Double cog;
}
