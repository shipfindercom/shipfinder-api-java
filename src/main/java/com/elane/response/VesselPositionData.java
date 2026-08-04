package com.elane.response;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class VesselPositionData {
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
     * Chinese name of the vessel
     */
    @SerializedName("ship_cnname")
    private String shipCnname;

    /**
     * 0=Terrestrial AIS stations or Shipborne AIS; 1=Satellite AIS
     */
    @SerializedName("data_source")
    private Integer dataSource;

    /**
     * Numeric code of vessel type
     */
    @SerializedName("ship_type")
    private Integer shipType;

    /**
     * Vessel length in meters, valid value range: 0-1022
     */
    private Double length;
    /**
     * Vessel breadth in meters (nautical standard term)
     */
    private Double width;
    /**
     * Port distance in meters
     */
    private Double left;
    /**
     * Stern Distance in meters
     */
    private Double trail;
    /**
     * Vessel draught depth in meters
     */
    private Double draught;
    /**
     * Standardized destination port names, e.g., SINGAPORE, SG
     */
    private String dest;
    /**
     * Port code of the destination, e.g., SGSGP
     */
    private String destcode;

    /**
     * Estimated Time of Arrival. Format: YYYY-MM-DD HH:MM:SS, UTC
     */
    private String eta;

    /**
     * Vessel navigation status; -1=invalid data
     */
    private Integer navistat;
    /**
     * Coordinate latitude, WGS84 coordinate system
     */
    private Double lat;
    /**
     * Coordinate longitude, WGS84 coordinate system
     */
    private Double lng;
    /**
     * Real-time vessel speed over ground in knots; -1=invalid data
     */
    private Double sog;
    /**
     * Course over ground in degrees; -1=invalid data
     */
    private Double cog;
    /**
     * Vessel heading in degrees; 511=invalid data
     */
    private Double hdg;
    /**
     * Rate of turn in degrees per minute
     */
    private Double rot;

    /**
     * AIS last update time in Unix timestamp
     */
    @SerializedName("last_time")
    private Long lastTime;
}
