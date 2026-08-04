package com.elane.response;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class PortExpectedArrivalsResult {
    /**
     * 9-digit numeric code of MMSI.
     */
    private Integer mmsi;

    /**
     * Vessel name.
     */
    @SerializedName("ship_name")
    private String shipName;

    /**
     * 7-digit numeric code of IMO.
     */
    private Integer imo;

    /**
     * Vessel deadweight tonnage.
     */
    private Double dwt;

    /**
     * Numeric code of vessel type: see Appendix for details.
     */
    @SerializedName("ship_type")
    private Integer shipType;

    /**
     * Vessel length in meters, valid value range: 0-1022.
     */
    private Double length;

    /**
     * Vessel breadth in meters (nautical standard term).
     */
    private Double width;

    /**
     * Vessel draught depth in meters.
     */
    private Double draught;

    /**
     * Standardized destination port names, e.g., SINGAPORE, SG.
     */
    private String dest;

    /**
     * Name of the vessel's flag state.
     */
    @SerializedName("ship_flag")
    private String shipFlag;

    /**
     * Chinese name of the port of departure.
     */
    @SerializedName("preport_name")
    private String preportName;

    /**
     * AIS last update time in Unix timestamp.
     */
    @SerializedName("last_time")
    private Long lastTime;

    /**
     * Estimated Time of Arrival in Unix timestamp.
     */
    private Long eta;
}
