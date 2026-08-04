package com.elane.request;

import lombok.Data;

@Data
public class TideStationInfoRequest extends BaseObj {
    /**
     * Tide station code
     */
    private Integer port_code;

    /**
     * Start date for the tidal data query, format YYYY-MM-DD; historical data is supported from 2020 onward
     */
    private String start_date;

    /**
     * End date for the tidal data query, format YYYY-MM-DD; max 90-day range, forecast limited to 30 days ahead, updated daily
     */
    private String end_date;
}
