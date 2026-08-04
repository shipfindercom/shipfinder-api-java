package com.elane.request;

import lombok.Data;

@Data
public class AddFleetRequest extends BaseObj {
    /**
     * Unique fleet name, used for subsequent maintenance
     */
    private String fleet_name;

    /**
     * Vessel(s) to add to the fleet, comma-separated MMSI numbers
     */
    private String mmsis;

    /**
     * Monitor type: 1-fleet query, 2-real-time position push, 3-port entry/exit events, 4-dynamic ETA, 5-abnormal events, 6-geofence, 7-berthing events; combinable, comma-separated
     */
    private String monitor;
}
