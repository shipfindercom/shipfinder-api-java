package com.elane.response;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class VesselCurrentPortCallResult {

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
     * 7-digit numeric code of IMO.
     */
    private Integer imo;

    /**
     * 9-digit numeric code of MMSI.
     */
    private Integer mmsi;

    /**
     * Type of vessels: see Appendix for details.
     */
    @SerializedName("ship_type")
    private Integer shipType;

    /**
     * The current sea area where the vessel is located.
     */
    @SerializedName("current_sea_area")
    private String currentSeaArea;

    /**
     * Code of current vessel sea area.
     */
    @SerializedName("sea_area_code")
    private String seaAreaCode;

    /**
     * Current city info (Chinese cities primarily).
     */
    @SerializedName("current_city")
    private String currentCity;

    /**
     * Current city code (Chinese cities primarily).
     */
    @SerializedName("current_city_code")
    private String currentCityCode;

    /**
     * Coordinate longitude, WGS84 coordinate system.
     */
    private Double lng;

    /**
     * Coordinate latitude, WGS84 coordinate system.
     */
    private Double lat;

    /**
     * Information about the vessel's previous port call.
     */
    private PortCallPortInfo previousport;

    /**
     * Information about the vessel's current port call.
     */
    private VesselCurrentPortCallCurrentPortInfo currentport;
}
