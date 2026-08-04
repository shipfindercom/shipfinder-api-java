package com.elane.response;

import lombok.Data;

import java.util.List;

@Data
public class RoutePlanData {
    /**
     * Total distance of the planned route, unit: nautical miles (NM)
     */
    private Double distance;

    /**
     * Route waypoint details
     */
    private List<RoutePoint> route;
}
