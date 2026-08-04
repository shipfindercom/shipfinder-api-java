package com.elane.request;

import lombok.Data;

@Data
public class GetNavWarningRequest extends BaseObj {
    /**
     * Start time used to filter the publish time of navigation warnings, format: YYYY-MM-DD HH:MM
     */
    private String start_time;

    /**
     * End time used to filter the publish time of navigation warnings, format: YYYY-MM-DD HH:MM
     */
    private String end_time;

    /**
     * Warning type filter: 0=All; 1=Military operations; 2=Vessel drills; 3=Live-fire exercises;
     * 4=Vessel operations; 5=AtoN dynamics; 6=Grounding; 7=Sea trials; 8=Sinking; 9=Casualties;
     * 10=Construction; 11=Cancellation; 12=Others
     */
    private String warning_type;
}
