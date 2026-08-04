package com.elane.response;

import lombok.Data;

@Data
public class VesselFlagInfoData {
    /**
     * 9-digit numeric code of MMSI
     */
    private Integer mmsi;

    /**
     * Name of the vessel's flag state (country/region)
     */
    private String registry;
}
