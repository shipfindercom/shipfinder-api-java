package com.elane.request;

import lombok.Data;

@Data
public class VesselsInZoneRequest extends BaseObj {
    /**
     * Geographic area defined by coordinates. Longitude and latitude are separated by a comma;
     * multiple coordinate points are separated by a hyphen, e.g. lng,lat-lng,lat-lng,lat.
     * A minimum of 3 points is required, given in clockwise or counterclockwise order.
     */
    private String region;

    /**
     * Data output format selector: 0=Binary data encoded in Base64; 1=JSON format. Default value: 1
     */
    private Integer output;

    /**
     * Session token for area-based vessel query, used to retrieve remaining vessel data when the
     * full dataset cannot be returned in a single request due to an oversized search area.
     */
    private Integer scode;
}
