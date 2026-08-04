package com.elane.request;

import lombok.Data;

@Data
public class UpdateFleetShipRequest extends BaseObj {
    /**
     * Fleet unique identifier
     */
    private String fleet_id;

    /**
     * Fleet vessel list, comma-separated MMSI numbers; full overwrite update
     */
    private String mmsis;
}
