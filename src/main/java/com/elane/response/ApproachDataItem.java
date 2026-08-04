package com.elane.response;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class ApproachDataItem {

    /**
     * Basic information of the other vessel involved in the STS event.
     */
    @SerializedName("approach_ship")
    private ShipBasicInfo approachShip;

    /**
     * Details of the STS approach event.
     */
    @SerializedName("approach_event")
    private ApproachEventInfo approachEvent;
}
