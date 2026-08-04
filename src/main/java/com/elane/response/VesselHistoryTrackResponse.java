package com.elane.response;

import lombok.Data;

import java.util.List;

@Data
public class VesselHistoryTrackResponse {
    /**
     * Response status code.
     */
    private Integer status;

    /**
     * Response message.
     */
    private String msg;

    /**
     * Array of track point objects.
     */
    private List<VesselHistoryTrackPoint> data;
}
