package com.elane.response;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class FleetInfoData {

    /**
     * Unique identifier for the fleet, used for subsequent maintenance of fleet information
     */
    @SerializedName("fleet_id")
    private String fleetId;

    /**
     * Fleet name
     */
    @SerializedName("fleet_name")
    private String fleetName;

    /**
     * Vessel MMSIs managed under the fleet, comma-separated
     */
    private String mmsis;

    /**
     * Monitored content associated with the fleet; can be modified via the Update Fleet Information API or the Dashboard
     */
    private String monitor;
}
