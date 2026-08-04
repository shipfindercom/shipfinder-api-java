package com.elane.response;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class CycloneListItem {

    /**
     * Obtained via the Global Tropical Cyclones List. Tropical cyclone names are often reused, but
     * each cyclone carries a unique typhoon_id. To query the latest cyclone data, first pull the
     * up-to-date typhoon_id from this list, then use it to retrieve full cyclone details.
     */
    @SerializedName("typhoon_id")
    private String typhoonId;

    /**
     * International serial number of the tropical cyclone
     */
    @SerializedName("typhoon_code")
    private Integer typhoonCode;

    /**
     * Chinese serial number of the tropical cyclone; the first two digits represent the year, and
     * the last two digits indicate sequential order by occurrence time
     */
    @SerializedName("typhoon_cncode")
    private String typhoonCncode;

    /**
     * Chinese name of the tropical cyclone
     */
    @SerializedName("typhoon_cnname")
    private String typhoonCnname;

    /**
     * Name of the tropical cyclone
     */
    @SerializedName("typhoon_name")
    private String typhoonName;

    /**
     * Year the tropical cyclone formed
     */
    @SerializedName("current_year")
    private Integer currentYear;

    /**
     * "ing" means in progress, blank means ended
     */
    @SerializedName("dataMark")
    private String dataMark;
}
