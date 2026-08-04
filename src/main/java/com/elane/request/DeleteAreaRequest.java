package com.elane.request;

import lombok.Data;

@Data
public class DeleteAreaRequest extends BaseObj {
    /**
     * Unique identifier of the geofence
     */
    private String area_id;
}
