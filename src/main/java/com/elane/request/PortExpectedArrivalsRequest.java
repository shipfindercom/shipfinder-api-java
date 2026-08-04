package com.elane.request;

import lombok.Data;

@Data
public class PortExpectedArrivalsRequest extends BaseObj {
    /**
     * Standard five-digit port code.
     */
    private String port_code;

    /**
     * Start time represented as a UTC timestamp. The start time must be later than the current time.
     */
    private Integer start_time;

    /**
     * End time represented as a UTC timestamp. The interval between the start time and end time
     * shall not exceed 1 week for a single request.
     */
    private Integer end_time;

    /**
     * Filter the type of vessels: see Appendix for details. All vessels will be returned if this
     * parameter is not specified.
     */
    private Integer ship_type;
}
