package com.elane.request;

import lombok.Data;

@Data
public class RoutePlanPortToPortRequest extends BaseObj {
    /**
     * Standard 5-character port code of the departure port
     */
    private String start_port_code;

    /**
     * Standard 5-character port code of the arrival port
     */
    private String end_port_code;

    /**
     * Waypoint IDs to avoid, comma-separated, up to 10
     */
    private String avoid;

    /**
     * Waypoints the route must pass through, format lng,lat-lng,lat, up to 30
     */
    private String through;
}
