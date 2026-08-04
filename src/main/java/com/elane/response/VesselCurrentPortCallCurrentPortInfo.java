package com.elane.response;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

/**
 * Structure of data[].currentport, which uses different field names from data[].previousport
 * (PortCallPortInfo): the country fields are country_en / country_code, the anchorage field is
 * arriveanchorage (no underscore), and there is no atd field.
 */
@Data
public class VesselCurrentPortCallCurrentPortInfo {

    /**
     * Standard five-digit port code.
     */
    @SerializedName("port_code")
    private String portCode;

    /**
     * Name of the port.
     */
    @SerializedName("port_name")
    private String portName;

    /**
     * Chinese name of the port.
     */
    @SerializedName("port_cnname")
    private String portCnname;

    /**
     * Time zone of the port's location.
     */
    @SerializedName("port_time_zone")
    private String portTimeZone;

    /**
     * Name of the country/region where the port is located.
     */
    @SerializedName("country_en")
    private String countryEn;

    /**
     * Chinese name of the country/region where the port is located.
     */
    @SerializedName("port_country_cnname")
    private String portCountryCnname;

    /**
     * Standard code of the country/region where the port is located.
     */
    @SerializedName("country_code")
    private String countryCode;

    /**
     * Actual time of arrival at the anchorage.
     */
    private Long arriveanchorage;

    /**
     * Actual time of arrival at the port.
     */
    private Long ata;

    /**
     * Actual time of berthing at the terminal.
     */
    private Long atb;
}
