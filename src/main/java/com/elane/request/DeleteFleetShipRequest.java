package com.elane.request;

import lombok.Data;

@Data
public class DeleteFleetShipRequest extends BaseObj {
    /**
     * Fleet unique identifier
     */
    private String fleet_id;

    /**
     * MMSI(s) of vessel(s) to remove, comma-separated for multiple; only removes vessels already in the fleet
     */
    private String mmsis;
}
