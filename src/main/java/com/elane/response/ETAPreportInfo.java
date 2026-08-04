package com.elane.response;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class ETAPreportInfo {

    /**
     * Standard 5-digit port code
     */
    @SerializedName("port_code")
    private String portCode;

    /**
     * Chinese name of the port
     */
    @SerializedName("port_cnname")
    private String portCnname;

    /**
     * Name of the port
     */
    @SerializedName("port_name")
    private String portName;

    /**
     * Time zone of the port's location
     */
    @SerializedName("time_zone")
    private String timeZone;

    /**
     * Standard code of the country/region where the port is located
     */
    @SerializedName("port_country_code")
    private String portCountryCode;

    /**
     * Country/region name
     */
    @SerializedName("port_country_name")
    private String portCountryName;

    /**
     * Chinese country/region name
     */
    @SerializedName("port_country_cnname")
    private String portCountryCnname;

    /**
     * Actual time of arrival at the port; time zone varies based on the time_zone field
     */
    private Long ata;

    /**
     * Actual time of berthing at the terminal; time zone varies based on the time_zone field
     */
    private Long atb;

    /**
     * Actual time of departure from the port; time zone varies based on the time_zone field
     */
    private Long atd;
}
