package com.elane.response;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class PortInfoResult {

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
    @SerializedName("port_country_name")
    private String portCountryName;

    /**
     * Chinese name of the country/region where the port is located.
     */
    @SerializedName("port_country_cnname")
    private String portCountryCnname;

    /**
     * Standard code of the country/region where the port is located.
     */
    @SerializedName("port_country_code")
    private String portCountryCode;
}
