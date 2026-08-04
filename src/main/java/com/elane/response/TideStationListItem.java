package com.elane.response;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class TideStationListItem {

    /**
     * Tide station ID
     */
    @SerializedName("port_code")
    private Integer portCode;

    /**
     * Chinese name of the port
     */
    @SerializedName("port_cnname")
    private String portCnname;

    /**
     * Name of the port in English
     */
    @SerializedName("port_name")
    private String portName;

    /**
     * Chinese name of country/region
     */
    @SerializedName("port_country_cnname")
    private String portCountryCnname;

    /**
     * Country/region name in English
     */
    @SerializedName("port_country_name")
    private String portCountryName;

    /**
     * Latitude coordinate (WGS84 coordinate system)
     */
    private Double lat;

    /**
     * Longitude coordinate (WGS84 coordinate system)
     */
    private Double lng;

    /**
     * Time zone of port location
     */
    @SerializedName("port_time_zone")
    private String portTimeZone;

    /**
     * Vertical offset of the tidal datum (unit: cm)
     */
    private Double datumn;
}
