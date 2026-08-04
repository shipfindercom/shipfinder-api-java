package com.elane.response;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class GeofenceData {

    /**
     * Unique identifier of the geofence, used for subsequent query, update and deletion operations
     */
    @SerializedName("area_id")
    private String areaId;

    /**
     * Set of coordinate points in "longitude,latitude-longitude,latitude" format
     */
    @SerializedName("area_bounds")
    private String areaBounds;

    /**
     * Geofence name, used for querying and identification
     */
    @SerializedName("area_name")
    private String areaName;

    /**
     * Data push URL to call when the monitor condition is triggered
     */
    private String url;

    /**
     * Monitor type: 1=all vessels; 2=by vessel type/length; 3=fleet
     */
    @SerializedName("filter_type")
    private Integer filterType;

    /**
     * Vessel type(s), comma-separated for multiple values
     */
    @SerializedName("ship_type")
    private String shipType;

    /**
     * Vessel length range (level 1-6)
     */
    private String length;

    /**
     * Fleet ID being monitored
     */
    @SerializedName("fleet_id")
    private String fleetId;
}
