package com.elane.request;

import lombok.Data;

@Data
public class RoutePlanPointToPointRequest extends BaseObj {
    /**
     * Departure position, formatted as lng,lat (longitude first, latitude second)
     */
    private String start_point;

    /**
     * Destination position, formatted as lng,lat; mutually exclusive with end_port_code
     */
    private String end_point;

    /**
     * Standard 5-digit port code of the destination port; mutually exclusive with end_point
     */
    private String end_port_code;

    /**
     * Waypoint IDs to avoid, comma-separated, up to 10
     */
    private String avoid;

    /**
     * Required waypoints along the route, formatted as lng,lat-lng,lat, up to 30
     */
    private String through;
}
