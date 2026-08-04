package com.elane.response;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class PortCallRecordsByVesselResult {

    /**
     * Vessel name.
     */
    @SerializedName("ship_name")
    private String shipName;

    /**
     * Radio call sign.
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
     * Numeric code of vessel type: see Appendix for details.
     */
    @SerializedName("ship_type")
    private Integer shipType;

    /**
     * Chinese name of the port.
     */
    @SerializedName("port_cnname")
    private String portCnname;

    /**
     * Name of the port.
     */
    @SerializedName("port_name")
    private String portName;

    /**
     * Standard five-digit port code.
     */
    @SerializedName("port_code")
    private String portCode;

    /**
     * Name of the terminal where the vessel berthed.
     */
    @SerializedName("terminal_name")
    private String terminalName;

    /**
     * Name of the specific berth occupied by the vessel.
     */
    @SerializedName("berth_name")
    private String berthName;

    /**
     * Chinese name of the country/region where the port is located.
     */
    @SerializedName("port_country_cnname")
    private String portCountryCnname;

    /**
     * Name of the country/region where the port is located.
     */
    @SerializedName("port_country_name")
    private String portCountryName;

    /**
     * Standard code of the country/region where the port is located.
     */
    @SerializedName("port_country_code")
    private String portCountryCode;

    /**
     * Time zone of the port's location.
     */
    @SerializedName("port_time_zone")
    private String portTimeZone;

    /**
     * Actual time of arrival at the anchorage. (Field name is "arrval_anchorage" in the docs,
     * likely a spelling error on the official side.)
     */
    @SerializedName("arrval_anchorage")
    private String arrvalAnchorage;

    /**
     * Actual time of arrival at the port.
     */
    private Long ata;

    /**
     * Actual time of berthing at the terminal.
     */
    private Long atb;

    /**
     * Actual time of departure from the port.
     */
    private Long atd;

    /**
     * Vessel draft upon arrival at the port, in meters.
     */
    @SerializedName("arrival_draught")
    private Double arrivalDraught;

    /**
     * Vessel draft upon departure from the port, in meters.
     */
    @SerializedName("departure_draught")
    private Double departureDraught;

    /**
     * Total time the vessel stayed at the port, in hours.
     */
    @SerializedName("stay_time")
    private Double stayTime;

    /**
     * Total time the vessel stayed at the terminal, in hours.
     */
    @SerializedName("stay_interminal_time")
    private Double stayInterminalTime;
}
