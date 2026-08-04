package com.elane.response;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class TideOverviewItem {

    /**
     * Calendar date of the tidal record
     */
    @SerializedName("tide_date")
    private String tideDate;

    /**
     * Tidal time point 1, format HH:MM
     */
    @SerializedName("tide_time1")
    private String tideTime1;

    /**
     * Tidal time point 2, format HH:MM
     */
    @SerializedName("tide_time2")
    private String tideTime2;

    /**
     * Tidal time point 3, format HH:MM
     */
    @SerializedName("tide_time3")
    private String tideTime3;

    /**
     * Tidal time point 4, format HH:MM
     */
    @SerializedName("tide_time4")
    private String tideTime4;

    /**
     * Tidal height at time point 1, unit: meters
     */
    @SerializedName("tide_height1")
    private Double tideHeight1;

    /**
     * Tidal height at time point 2, unit: meters
     */
    @SerializedName("tide_height2")
    private Double tideHeight2;

    /**
     * Tidal height at time point 3, unit: meters
     */
    @SerializedName("tide_height3")
    private Double tideHeight3;

    /**
     * Tidal height at time point 4, unit: meters
     */
    @SerializedName("tide_height4")
    private Double tideHeight4;

    /**
     * Stage label for tidal point 1 (high tide/low tide)
     */
    @SerializedName("tide_lowhigh1")
    private String tideLowhigh1;

    /**
     * Stage label for tidal point 2 (high tide/low tide)
     */
    @SerializedName("tide_lowhigh2")
    private String tideLowhigh2;

    /**
     * Stage label for tidal point 3 (high tide/low tide)
     */
    @SerializedName("tide_lowhigh3")
    private String tideLowhigh3;

    /**
     * Stage label for tidal point 4 (high tide/low tide)
     */
    @SerializedName("tide_lowhigh4")
    private String tideLowhigh4;
}
