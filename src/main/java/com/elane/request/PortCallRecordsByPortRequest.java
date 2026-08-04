package com.elane.request;

import lombok.Data;

@Data
public class PortCallRecordsByPortRequest extends BaseObj {
    /**
     * Standard 5-digit port code
     */
    private String port_code;

    /**
     * Unix timestamp, lower bound of the query range; a single query covers at most 1 year
     */
    private Integer start_time;

    /**
     * Unix timestamp, upper bound of the query range
     */
    private Integer end_time;

    /**
     * Query type: 1=by arrival time, 2=by departure time; default 1
     */
    private Integer type;

    /**
     * Time zone type: 1=local time zone, 2=UTC+8, 3=UTC; default 2
     */
    private Integer time_zone;
}
