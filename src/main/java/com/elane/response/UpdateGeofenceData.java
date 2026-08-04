package com.elane.response;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class UpdateGeofenceData {

    @SerializedName("area_id")
    private String areaId;
}
