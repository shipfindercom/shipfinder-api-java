package com.elane.response;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

/**
 * Structure of data[].currentport. Has more fields than previousport/nextport (PortCallSummary),
 * including terminal_name, berth_name, draught, stay_time, etc.
 */
@Data
public class PortCallRecordsByPortCurrentPort {

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
    @SerializedName("stay_terminal_time")
    private Double stayTerminalTime;
}
