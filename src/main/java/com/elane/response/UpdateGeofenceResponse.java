package com.elane.response;

import lombok.Data;

@Data
public class UpdateGeofenceResponse {
    private Integer status;
    private String msg;
    private UpdateGeofenceData data;
}
