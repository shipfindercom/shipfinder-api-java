package com.elane.request;

import lombok.Data;

@Data
public class VesselPositionMultiRequest extends BaseObj {
    /**
     * For Multi-Vessel Search, 9-digit MMSIs shall be separated by English commas, with a maximum of 100 vessels per search
     */
    private String mmsis;
}
