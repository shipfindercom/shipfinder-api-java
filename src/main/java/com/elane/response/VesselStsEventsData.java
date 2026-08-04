package com.elane.response;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

@Data
public class VesselStsEventsData {

    /**
     * Basic information of the queried vessel.
     */
    @SerializedName("ship_data")
    private ShipBasicInfo shipData;

    /**
     * List of STS approach events involving the queried vessel.
     */
    @SerializedName("approach_data")
    private List<ApproachDataItem> approachData;
}
