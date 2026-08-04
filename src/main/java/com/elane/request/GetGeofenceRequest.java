package com.elane.request;

import lombok.Data;

@Data
public class GetGeofenceRequest extends BaseObj {
    /**
     * Unique identifier of the geofence, used for subsequent query, update and deletion operations
     */
    private String area_id;
}
