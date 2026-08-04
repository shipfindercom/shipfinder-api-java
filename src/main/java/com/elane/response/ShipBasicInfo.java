package com.elane.response;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class ShipBasicInfo {
    /**
     * 9-digit numeric code of MMSI.
     */
    private Integer mmsi;

    /**
     * 7-digit numeric code of IMO.
     */
    private Integer imo;

    /**
     * Call Sign.
     */
    @SerializedName("call_sign")
    private String callSign;

    /**
     * Vessel name.
     */
    @SerializedName("ship_name")
    private String shipName;

    /**
     * Numeric code of vessel type: see Appendix for details.
     */
    @SerializedName("ship_type")
    private Integer shipType;
}
