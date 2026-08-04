package com.elane.response;

import lombok.Data;

@Data
public class RoutePlanPointToPointResponse {
    private Integer status;
    private String msg;
    private RoutePlanData data;
}
