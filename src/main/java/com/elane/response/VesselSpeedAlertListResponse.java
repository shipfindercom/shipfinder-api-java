package com.elane.response;

import lombok.Data;

import java.util.List;

@Data
public class VesselSpeedAlertListResponse {
    private Integer total;
    private List<VesselSpeedAlertItem> data;
}
