package com.elane.response;

import lombok.Data;

@Data
public class RoutePoint {
    /**
     * Waypoint longitude, WGS84 coordinate system
     */
    private Double lng;

    /**
     * Waypoint latitude, WGS84 coordinate system
     */
    private Double lat;
}
