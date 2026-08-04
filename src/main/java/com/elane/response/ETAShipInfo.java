package com.elane.response;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class ETAShipInfo {
    /**
     * 9-digit numeric code of MMSI
     */
    private Integer mmsi;

    /**
     * 7-digit numeric code of IMO
     */
    private Integer imo;

    /**
     * Vessel name
     */
    @SerializedName("ship_name")
    private String shipName;

    /**
     * Call sign of the vessel
     */
    @SerializedName("call_sign")
    private String callSign;

    /**
     * Type of vessel; see Appendix for details
     */
    @SerializedName("ship_type")
    private Integer shipType;
}
