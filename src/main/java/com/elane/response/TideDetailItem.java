package com.elane.response;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class TideDetailItem {

    /**
     * Tide date
     */
    @SerializedName("tide_date")
    private String tideDate;

    /** Hourly tidal height at 00:00 UTC, unit: meters */
    private Double h0;
    /** Hourly tidal height at 01:00 UTC, unit: meters */
    private Double h1;
    /** Hourly tidal height at 02:00 UTC, unit: meters */
    private Double h2;
    /** Hourly tidal height at 03:00 UTC, unit: meters */
    private Double h3;
    /** Hourly tidal height at 04:00 UTC, unit: meters */
    private Double h4;
    /** Hourly tidal height at 05:00 UTC, unit: meters */
    private Double h5;
    /** Hourly tidal height at 06:00 UTC, unit: meters */
    private Double h6;
    /** Hourly tidal height at 07:00 UTC, unit: meters */
    private Double h7;
    /** Hourly tidal height at 08:00 UTC, unit: meters */
    private Double h8;
    /** Hourly tidal height at 09:00 UTC, unit: meters */
    private Double h9;
    /** Hourly tidal height at 10:00 UTC, unit: meters */
    private Double h10;
    /** Hourly tidal height at 11:00 UTC, unit: meters */
    private Double h11;
    /** Hourly tidal height at 12:00 UTC, unit: meters */
    private Double h12;
    /** Hourly tidal height at 13:00 UTC, unit: meters */
    private Double h13;
    /** Hourly tidal height at 14:00 UTC, unit: meters */
    private Double h14;
    /** Hourly tidal height at 15:00 UTC, unit: meters */
    private Double h15;
    /** Hourly tidal height at 16:00 UTC, unit: meters */
    private Double h16;
    /** Hourly tidal height at 17:00 UTC, unit: meters */
    private Double h17;
    /** Hourly tidal height at 18:00 UTC, unit: meters */
    private Double h18;
    /** Hourly tidal height at 19:00 UTC, unit: meters */
    private Double h19;
    /** Hourly tidal height at 20:00 UTC, unit: meters */
    private Double h20;
    /** Hourly tidal height at 21:00 UTC, unit: meters */
    private Double h21;
    /** Hourly tidal height at 22:00 UTC, unit: meters */
    private Double h22;
    /** Hourly tidal height at 23:00 UTC, unit: meters */
    private Double h23;
}
