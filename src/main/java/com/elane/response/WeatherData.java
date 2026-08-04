package com.elane.response;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class WeatherData {

    /**
     * Sea level pressure (hPa)
     */
    private Double pressure;

    /**
     * Surface wind direction (degrees)
     */
    private Double winddir;

    /**
     * Surface wind speed (m/s)
     */
    private Double windspeed;

    /**
     * Significant swell height (m)
     */
    private Double swellheight;

    /**
     * Horizontal atmospheric visibility (m)
     */
    private Double visibility;

    /**
     * Sea surface temperature SST (°C)
     */
    private Double temperature;

    /**
     * Relative humidity (%)
     */
    private Double humidity;

    /**
     * Ocean current direction (degrees)
     */
    private Double oceandir;

    /**
     * Ocean current speed (m/s)
     */
    private Double oceanspeed;

    /**
     * Swell propagation direction (degrees)
     */
    private Double swelldir;

    /**
     * Swell period (s)
     */
    private Double swellperiod;

    /**
     * Significant total wave height (m)
     */
    private Double waveheight;

    /**
     * 500mb geopotential height (gpm); -32767 indicates no data
     */
    private Double bm500;

    @SerializedName("publish_time")
    private Long publishTime;

    private Double lng;
    private Double lat;
}
