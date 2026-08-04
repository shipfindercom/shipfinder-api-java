package com.elane.request;

import lombok.Data;

@Data
public class CycloneInfoRequest extends BaseObj {
    /**
     * Tropical cyclone serial number, obtained from the global tropical cyclone list
     */
    private String typhoon_id;
}
