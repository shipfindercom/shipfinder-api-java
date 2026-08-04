package com.elane.response;

import lombok.Data;

@Data
public class ETAData {
    private ETAShipInfo ship;
    private ETALocationInfo location;
    private ETAPreportInfo preport;
    private ETANextPortInfo nextport;
}
