package com.elane.request;

import lombok.Data;

@Data
public class AddFleetShipRequest extends BaseObj {
    /**
     * Fleet unique identifier
     */
    private String fleet_id;

    /**
     * Vessel(s) to add to the fleet, comma-separated MMSI numbers; this is an incremental update and does not affect vessels already in the fleet
     */
    private String mmsis;
}
