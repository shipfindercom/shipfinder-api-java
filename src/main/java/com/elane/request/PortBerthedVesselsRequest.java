package com.elane.request;

import lombok.Data;

@Data
public class PortBerthedVesselsRequest extends BaseObj {
    /**
     * Standard five-digit port code.
     */
    private String port_code;

    /**
     * Filter the type of vessels: see Appendix for details. All vessels will be returned if this
     * parameter is not specified.
     */
    private Integer ship_type;

    /**
     * Query filtering type: 1=Exclude vessels that have not reported AIS data for an extended
     * period; 0=Return all vessels.
     */
    private Integer search_type;
}
