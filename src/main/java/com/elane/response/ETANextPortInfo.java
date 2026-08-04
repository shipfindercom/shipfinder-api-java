package com.elane.response;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class ETANextPortInfo {

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
    private Integer timeZone;

    /**
     * Country/region standard code
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
     * Distance already covered on the voyage, unit: nautical miles (NM)
     */
    @SerializedName("sailed_distance")
    private Double sailedDistance;

    /**
     * Elapsed sailing time for the voyage, unit: hours
     */
    @SerializedName("sailed_time")
    private Double sailedTime;

    /**
     * Average speed derived from AIS data, unit: knots (kn)
     */
    @SerializedName("ais_speed")
    private Double aisSpeed;

    /**
     * Average speed used for ETA computation; uses the speed request parameter if provided, otherwise the historical AIS average speed
     */
    private Double speed;

    /**
     * Estimated Time of Arrival, Unix timestamp
     */
    private Long eta;

    /**
     * Estimated remaining voyage distance, unit: nautical miles (NM)
     */
    @SerializedName("remaining_distance")
    private Double remainingDistance;
}
