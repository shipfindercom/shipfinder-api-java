package com.elane.response;

import lombok.Data;

@Data
public class ETAResponse {
    private Integer status;
    private String msg;
    private ETAData data;
}
