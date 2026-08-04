package com.elane.response;

import lombok.Data;

@Data
public class GetGeofenceResponse {
    private Integer status;
    private String msg;
    private GeofenceData data;
}
