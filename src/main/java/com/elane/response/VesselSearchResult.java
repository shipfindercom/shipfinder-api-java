package com.elane.response;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class VesselSearchResult {

    /**
     * Type of keyword matching results, matching types: 1=Ship name; 2=Call sign; 3=MMSI; 5=IMO
     */
    @SerializedName("match_type")
    private Integer matchType;

    /**
     * 9-digit numeric code of MMSI
     */
    private Integer mmsi;

    /**
     * 7-digit numeric code of IMO
     */
    private Integer imo;

    /**
     * Call Sign
     */
    @SerializedName("call_sign")
    private String callSign;

    /**
     * Vessel name
     */
    @SerializedName("ship_name")
    private String shipName;

    /**
     * 0=Terrestrial AIS stations or Shipborne AIS; 1=Satellite AIS
     */
    @SerializedName("data_source")
    private Integer dataSource;

    /**
     * AIS last update time in Unix timestamp
     */
    @SerializedName("last_time")
    private Long lastTime;
}
