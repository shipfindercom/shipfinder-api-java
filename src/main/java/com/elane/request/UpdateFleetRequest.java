package com.elane.request;

import lombok.Data;

@Data
public class UpdateFleetRequest extends BaseObj {
    /**
     * Fleet unique identifier
     */
    private String fleet_id;

    /**
     * Batch update of fleet vessels, comma-separated MMSI numbers; full overwrite
     */
    private String mmsis;

    /**
     * Monitoring content (combination of values 1-7, comma-separated)
     */
    private String monitor;

    /**
     * New name to assign to the fleet
     */
    private String fleet_name;
}
