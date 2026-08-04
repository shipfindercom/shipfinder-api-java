package com.elane.response;

import lombok.Data;

@Data
public class TideStationInfoResponse {
    private Integer status;
    private String msg;
    private TideStationInfoData data;
}
