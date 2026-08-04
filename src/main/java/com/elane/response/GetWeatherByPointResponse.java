package com.elane.response;

import lombok.Data;

@Data
public class GetWeatherByPointResponse {
    private Integer status;
    private String msg;
    private WeatherData data;
}
