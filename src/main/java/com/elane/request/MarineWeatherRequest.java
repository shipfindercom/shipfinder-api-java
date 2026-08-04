package com.elane.request;

import lombok.Data;

@Data
public class MarineWeatherRequest extends BaseObj {
    /**
     * Longitude, WGS84 coordinate system
     */
    private Double lng;

    /**
     * Latitude, WGS84 coordinate system
     */
    private Double lat;

    /**
     * UTC time in Unix timestamp format; returns the latest data if not specified. Forecast data is
     * available only for fixed UTC hours (02:00, 08:00, 14:00, 20:00) within the next 7 days.
     */
    private String weather_time;
}
