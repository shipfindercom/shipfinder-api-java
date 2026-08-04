package com.elane.response;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class PortCallRecordsByPortResult {
    /**
     * 7-digit numeric code of IMO.
     */
    private Integer imo;

    /**
     * 9-digit numeric code of MMSI.
     */
    private Integer mmsi;

    /**
     * Type of vessels.
     */
    @SerializedName("ship_type")
    private Integer shipType;

    /**
     * Vessel name.
     */
    @SerializedName("ship_name")
    private String shipName;

    /**
     * Call Sign.
     */
    @SerializedName("call_sign")
    private String callSign;

    /**
     * Information about the port call this record pertains to.
     */
    private PortCallRecordsByPortCurrentPort currentport;

    /**
     * Information about the vessel's previous port call.
     */
    private PortCallSummary previousport;

    /**
     * Information about the vessel's next port call.
     */
    private PortCallSummary nextport;
}
