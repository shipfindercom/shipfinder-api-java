package com.elane.request;

import lombok.Data;

@Data
public class DeleteVesselSpeedAlertRequest extends BaseObj {
    /**
     * MMSI numbers of the monitored vessel(s)
     */
    private String mmsi;
}
