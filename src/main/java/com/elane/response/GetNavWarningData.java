package com.elane.response;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class GetNavWarningData {

    /**
     * Warning classification code
     */
    @SerializedName("warning_type")
    private Integer warningType;

    /**
     * Data source (China Maritime Safety Administration)
     */
    private String source;

    /**
     * Navigation warning title
     */
    private String title;

    /**
     * Coordinate range type: 1=point; 2=polygon; 3=circle; 4=no coordinates
     */
    @SerializedName("range_type")
    private Integer rangeType;

    /**
     * Coordinates in WGS84, with longitude and latitude separated by commas
     */
    @SerializedName("range_points")
    private String rangePoints;

    /**
     * Expiration time, format: YYYY-MM-DD HH:MM (UTC+8)
     */
    @SerializedName("expire_time")
    private String expireTime;

    /**
     * Publish time, format: YYYY-MM-DD HH:MM (UTC+8)
     */
    @SerializedName("pub_time")
    private String pubTime;

    /**
     * Warning content (HTML format)
     */
    private String content;
}
