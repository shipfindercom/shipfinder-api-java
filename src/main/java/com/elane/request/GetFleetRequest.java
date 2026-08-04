package com.elane.request;

import lombok.Data;

@Data
public class GetFleetRequest extends BaseObj {
    /**
     * Fleet unique identifier
     */
    private String fleet_id;
}
