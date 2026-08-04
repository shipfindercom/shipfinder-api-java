package com.elane.response;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

@Data
public class VesselsInZoneData {
    /**
     * Number of vessel records returned in the current request only
     */
    private Integer total;

    /**
     * Session token for paginated data retrieval
     */
    private Integer scode;

    /**
     * Flag indicating whether all vessel data in the area has been fully returned: 0=All data returned, 1=Partial data remaining
     */
    @SerializedName("continue")
    private Integer continueFlag;

    /**
     * Vessel List
     */
    @SerializedName("ship_list")
    private List<VesselsInZoneShip> shipList;
}
