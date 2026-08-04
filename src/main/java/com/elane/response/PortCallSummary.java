package com.elane.response;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

/**
 * Structure of data[].previousport / data[].nextport (fewer fields than data[].currentport;
 * excludes terminal_name, berth_name, draught, stay_time, etc.)
 */
@Data
public class PortCallSummary {

    /**
     * Standard 5-digit port code.
     */
    @SerializedName("port_code")
    private String portCode;

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
     * Time zone of the port's location.
     */
    @SerializedName("port_time_zone")
    private String portTimeZone;

    /**
     * Actual time of arrival at the anchorage.
     */
    @SerializedName("arrival_anchorage")
    private Long arrivalAnchorage;

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
}
