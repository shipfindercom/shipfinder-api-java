package com.elane.response;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class ApproachEventInfo {

    /**
     * Start time of the STS approach event, represented as a Unix timestamp.
     */
    @SerializedName("approach_time")
    private String approachTime;

    /**
     * End time of the STS event, represented as a Unix timestamp.
     */
    @SerializedName("separation_time")
    private String separationTime;

    /**
     * Total duration of the STS operation between two vessels, measured in minutes.
     */
    private Double duration;

    /**
     * STS operation area: 1=STS in port area; 2=STS at anchorage; 3=STS in other areas.
     */
    @SerializedName("approach_zone")
    private Integer approachZone;

    /**
     * Latitude of the STS event position, under the WGS84 coordinate system.
     */
    private Double lat;

    /**
     * Longitude of the STS event position, under the WGS84 coordinate system.
     */
    private Double lng;

    /**
     * 5-digit code of the corresponding port. Returned only when the STS event takes place in the
     * port or anchorage area.
     */
    @SerializedName("port_code")
    private String portCode;

    /**
     * Speed over ground.
     */
    private Double sog;
}
