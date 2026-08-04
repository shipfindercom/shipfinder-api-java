package com.elane.request;

import lombok.Data;

@Data
public class FleetPositionRequest extends BaseObj {
    /**
     * All vessel positions under the fleet can be retrieved by the fleet ID maintained in the Dashboard
     */
    private String fleet_id;
}
