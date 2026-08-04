package com.elane.request;

import lombok.Data;

@Data
public class AddAreaRequest extends BaseObj {
    /**
     * Set of coordinate points in "longitude,latitude-longitude,latitude" format
     */
    private String area_bounds;

    /**
     * Geofence name, used for querying and identification
     */
    private String area_name;

    /**
     * Monitor type: 1=all vessels; 2=by vessel type/length; 3=fleet
     */
    private String filter_type;

    /**
     * Data push URL to call when the monitor condition is triggered
     */
    private String url;

    /**
     * Vessel type(s), comma-separated for multiple values
     */
    private String ship_type;

    /**
     * Vessel length range (level 1-6)
     */
    private String length;

    /**
     * Fleet ID to monitor
     */
    private String fleet_id;
}
