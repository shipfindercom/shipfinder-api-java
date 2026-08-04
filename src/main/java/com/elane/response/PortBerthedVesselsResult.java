package com.elane.response;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class PortBerthedVesselsResult {
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
    private Double shipType;

    /**
     * Ship length, meters, range (0 - 1022).
     */
    private Double length;

    /**
     * Vessel breadth in meters, valid value range: 0-1022.
     */
    private Double width;

    /**
     * Vessel breadth in meters (nautical standard term).
     */
    private Double left;

    /**
     * Port distance in meters.
     */
    private Double trail;

    /**
     * Stern Distance in meters.
     */
    private Double draught;

    /**
     * Vessel arrival time, UTC.
     */
    @SerializedName("arrival_time")
    private Long arrivalTime;

    /**
     * Continuous dwell time of the vessel at the current port, measured in minutes.
     */
    @SerializedName("stay_time")
    private Double stayTime;
}
