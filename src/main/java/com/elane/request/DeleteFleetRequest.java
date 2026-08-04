package com.elane.request;

import lombok.Data;

@Data
public class DeleteFleetRequest extends BaseObj {
    /**
     * Fleet unique identifier
     */
    private String fleet_id;
}
