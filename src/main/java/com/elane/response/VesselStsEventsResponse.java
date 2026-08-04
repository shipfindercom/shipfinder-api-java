package com.elane.response;

import lombok.Data;

@Data
public class VesselStsEventsResponse {
    /**
     * API call status code, 0 means success.
     */
    private Integer status;

    /**
     * Exception prompt message.
     */
    private String msg;

    /**
     * STS event data, including the queried vessel's basic info and the approach event list.
     */
    private VesselStsEventsData data;
}
