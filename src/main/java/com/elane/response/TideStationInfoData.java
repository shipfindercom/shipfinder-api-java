package com.elane.response;

import lombok.Data;

import java.util.List;

@Data
public class TideStationInfoData {
    /**
     * Tidal overview data, one entry per day (high/low tide times and heights)
     */
    private List<TideOverviewItem> overview;

    /**
     * Hourly tidal height details, one entry per day
     */
    private List<TideDetailItem> detail;
}
