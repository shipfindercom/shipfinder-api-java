package com.elane;

import com.elane.api.Shipfinder;
import com.elane.request.*;
import com.elane.response.*;

public class Main {
    private static String key = com.elane.api.Key.key;
//    private static String key = "Please apply for a key from the API console";

    public static void main(String[] args) {
//        VesselSearchFn();

//        VesselPositionSingleFn();
//        VesselPositionMultiFn();
//        FleetPositionFn();
//        VesselsNearbyFn();
//        VesselsInZoneFn();
//        VesselFlagInfoFn();

//        PortInfoFn();
//        PortBerthedVesselsFn();
//        PortAnchoredVesselsFn();
//        PortExpectedArrivalsFn();

//        VesselHistoryTrackFn();
//        VesselStsEventsFn();
//        PortCallRecordsByVesselFn();
//        PortCallRecordsByVesselAtPortFn();
//        VesselCurrentPortCallFn();
//        PortCallRecordsByPortFn();

//        RoutePlanPointToPointFn();
//        RoutePlanPortToPortFn();
//        ETAFn();

//        GetAllTyphoonFn();
//        GetSingleTyphoonFn();
//        GetTidesFn();
//        TideStationInfoFn();
//        GetWeatherByPointFn();

//        GetNavWarningFn();

//        AddFleetFn();
//        UpdateFleetFn();
//        GetFleetFn();
//        DeleteFleetFn();
//        AddFleetShipFn();
//        UpdateFleetShipFn();
//        DeleteFleetShipFn();

//        AddAreaFn();
//        UpdateGeofenceFn();
//        GetGeofenceFn();
//        DeleteAreaFn();

        AddVesselSpeedAlertFn();
//        DeleteVesselSpeedAlertFn();
//        GetVesselSpeedAlertListFn();
    }

    // ==================== 1 AIS Dataset ====================

    public static void VesselSearchFn() {
        VesselSearchRequest params = new VesselSearchRequest();
        params.setKey(key);
        params.setKeywords("coco");
        params.setMax(2);
        VesselSearchResponse result = Shipfinder.VesselSearch(params);
        System.out.println(result);
        if (result.getData() != null) {
            System.out.println(result.getData().get(0).getMmsi());
        }
    }

    public static void VesselPositionSingleFn() {
        VesselPositionSingleRequest params = new VesselPositionSingleRequest();
        params.setKey(key);
        params.setMmsi("413961925");
        VesselPositionSingleResponse result = Shipfinder.VesselPositionSingle(params);
        System.out.println(result);
        if (result.getData() != null) {
            System.out.println(result.getData().getMmsi());
        }
    }

    public static void VesselPositionMultiFn() {
        VesselPositionMultiRequest params = new VesselPositionMultiRequest();
        params.setKey(key);
        params.setMmsis("413961925,477232800,477172700");
        VesselPositionMultiResponse result = Shipfinder.VesselPositionMulti(params);
        System.out.println(result);
        if (result.getData() != null && !result.getData().isEmpty()) {
            System.out.println(result.getData().get(0).getMmsi());
        }
    }

    public static void FleetPositionFn() {
        FleetPositionRequest params = new FleetPositionRequest();
        params.setKey(key);
        params.setFleet_id("5c66e57e-0fc2-440a-900f-25fe0aa82fd5");
        FleetPositionResponse result = Shipfinder.FleetPosition(params);
        System.out.println(result);
        if (result.getData() != null && !result.getData().isEmpty()) {
            System.out.println(result.getData().get(0).getMmsi());
        }
    }

    public static void VesselsNearbyFn() {
        VesselsNearbyRequest params = new VesselsNearbyRequest();
        params.setKey(key);
        params.setMmsi(413961925);
        VesselsNearbyResponse result = Shipfinder.VesselsNearby(params);
        System.out.println(result);
        if (result.getData() != null && !result.getData().isEmpty()) {
            System.out.println(result.getData().get(0).getMmsi());
        }
    }

    public static void VesselsInZoneFn() {
        VesselsInZoneRequest params = new VesselsInZoneRequest();
        params.setKey(key);
        params.setRegion("121.289063,35.424868-122.783203,35.281501-122.167969,33.979809");
        VesselsInZoneResponse result = Shipfinder.VesselsInZone(params);
        System.out.println(result);
        if (result.getData() != null) {
            System.out.println(result.getData().getTotal());
        }
    }

    public static void VesselFlagInfoFn() {
        VesselFlagInfoRequest params = new VesselFlagInfoRequest();
        params.setKey(key);
        params.setMmsi(477172700);
        VesselFlagInfoResponse result = Shipfinder.VesselFlagInfo(params);
        System.out.println(result);
        if (result.getData() != null) {
            System.out.println(result.getData().getRegistry());
        }
    }

    // ==================== 2 Voyage Dataset ====================

    public static void PortInfoFn() {
        PortInfoRequest params = new PortInfoRequest();
        params.setKey(key);
        params.setKeywords("CNS");
        PortInfoResponse result = Shipfinder.PortInfo(params);
        System.out.println(result);
        if (result.getData() != null && !result.getData().isEmpty()) {
            System.out.println(result.getData().get(0).getPortCode());
        }
    }

    public static void PortBerthedVesselsFn() {
        PortBerthedVesselsRequest params = new PortBerthedVesselsRequest();
        params.setKey(key);
        params.setPort_code("CNSHG");
        PortBerthedVesselsResponse result = Shipfinder.PortBerthedVessels(params);
        System.out.println(result);
        if (result.getTotal() != null && result.getTotal() > 0) {
            System.out.println(result.getData().get(0).getMmsi());
        }
    }

    public static void PortAnchoredVesselsFn() {
        PortAnchoredVesselsRequest params = new PortAnchoredVesselsRequest();
        params.setKey(key);
        params.setPort_code("CNSHG");
        PortAnchoredVesselsResponse result = Shipfinder.PortAnchoredVessels(params);
        System.out.println(result);
    }

    public static void PortExpectedArrivalsFn() {
        PortExpectedArrivalsRequest params = new PortExpectedArrivalsRequest();
        params.setKey(key);
        params.setPort_code("CNSHG");
        params.setStart_time(1746612218);
        params.setEnd_time(1747044218);
        PortExpectedArrivalsResponse result = Shipfinder.PortExpectedArrivals(params);
        System.out.println(result);
    }

    // ==================== 3 History Dataset ====================

    public static void VesselHistoryTrackFn() {
        VesselHistoryTrackRequest params = new VesselHistoryTrackRequest();
        params.setKey(key);
        params.setMmsi(477172700);
        params.setStart_time(1746612218);
        params.setEnd_time(1747044218);
        VesselHistoryTrackResponse result = Shipfinder.VesselHistoryTrack(params);
        System.out.println(result);
        if (result.getData() != null && !result.getData().isEmpty()) {
            System.out.println(result.getData().get(0).getUtc());
        }
    }

    public static void VesselStsEventsFn() {
        VesselStsEventsRequest params = new VesselStsEventsRequest();
        params.setKey(key);
        params.setMmsi(477172700);
        params.setStart_time(1746612218);
        params.setEnd_time(1747044218);
        VesselStsEventsResponse result = Shipfinder.VesselStsEvents(params);
        System.out.println(result);
        if (result.getData() != null && result.getData().getApproachData() != null && !result.getData().getApproachData().isEmpty()) {
            System.out.println(result.getData().getApproachData().get(0).getApproachShip().getShipName());
        }
    }

    public static void PortCallRecordsByVesselFn() {
        PortCallRecordsByVesselRequest params = new PortCallRecordsByVesselRequest();
        params.setKey(key);
        params.setMmsi(477172700);
        params.setStart_time(1772007589);
        params.setEnd_time(1772440378);
        PortCallRecordsByVesselResponse result = Shipfinder.PortCallRecordsByVessel(params);
        System.out.println(result);
        if (result.getData() != null && !result.getData().isEmpty()) {
            System.out.println(result.getData().get(0).getShipName());
        }
    }

    public static void PortCallRecordsByVesselAtPortFn() {
        PortCallRecordsByVesselAtPortRequest params = new PortCallRecordsByVesselAtPortRequest();
        params.setKey(key);
        params.setMmsi(477172700);
        params.setPort_code("CNSHG");
        params.setStart_time("1772007589");
        params.setEnd_time("1774245163");
        PortCallRecordsByVesselAtPortResponse result = Shipfinder.PortCallRecordsByVesselAtPort(params);
        System.out.println(result);
        System.out.println(result.getData());
    }

    public static void VesselCurrentPortCallFn() {
        VesselCurrentPortCallRequest params = new VesselCurrentPortCallRequest();
        params.setKey(key);
        params.setMmsi("477172700");
        VesselCurrentPortCallResponse result = Shipfinder.VesselCurrentPortCall(params);
        System.out.println(result);
        if (result.getData() != null && !result.getData().isEmpty()) {
            System.out.println(result.getData().get(0).getMmsi());
        }
    }

    public static void PortCallRecordsByPortFn() {
        PortCallRecordsByPortRequest params = new PortCallRecordsByPortRequest();
        params.setKey(key);
        params.setPort_code("CNSHG");
        params.setStart_time(1772440300);
        params.setEnd_time(1772440378);
        PortCallRecordsByPortResponse result = Shipfinder.PortCallRecordsByPort(params);
        System.out.println(result);
        System.out.println(result.getData());
    }

    // ==================== 4 Prediction Dataset ====================

    public static void RoutePlanPointToPointFn() {
        RoutePlanPointToPointRequest params = new RoutePlanPointToPointRequest();
        params.setKey(key);
        params.setStart_point("113.571144,22.844316");
        params.setEnd_point("121.58414,31.37979");
        RoutePlanPointToPointResponse result = Shipfinder.RoutePlanPointToPoint(params);
        System.out.println(result);
        if (result.getData() != null) {
            System.out.println(result.getData().getDistance());
        }
    }

    public static void RoutePlanPortToPortFn() {
        RoutePlanPortToPortRequest params = new RoutePlanPortToPortRequest();
        params.setKey(key);
        params.setStart_port_code("CNGZG");
        params.setEnd_port_code("CNSHG");
        RoutePlanPointToPointResponse result = Shipfinder.RoutePlanPortToPort(params);
        System.out.println(result);
        if (result.getData() != null) {
            System.out.println(result.getData().getDistance());
        }
    }

    public static void ETAFn() {
        ETARequest params = new ETARequest();
        params.setKey(key);
        params.setMmsi(477172700);
        params.setPort_code("CNSHG");
        ETAResponse result = Shipfinder.ETA(params);
        System.out.println(result);
        if (result.getData() != null && result.getData().getNextport() != null) {
            System.out.println(result.getData().getNextport().getEta());
        }
    }

    // ==================== 5 Meteorology Dataset ====================

    public static void GetAllTyphoonFn() {
        BaseObj params = new BaseObj();
        params.setKey(key);
        GetAllTyphoonResponse result = Shipfinder.GetAllTyphoon(params);
        System.out.println(result);
        if (result.getData() != null && !result.getData().isEmpty()) {
            System.out.println(result.getData().get(0).getTyphoonCnname());
        }
    }

    public static void GetSingleTyphoonFn() {
        CycloneInfoRequest params = new CycloneInfoRequest();
        params.setKey(key);
        params.setTyphoon_id("2477927");
        GetSingleTyphoonResponse result = Shipfinder.GetSingleTyphoon(params);
        System.out.println(result);
        if (result.getData() != null && !result.getData().isEmpty()) {
            System.out.println(result.getData().get(0).getTyphoonTime());
        }
    }

    public static void GetTidesFn() {
        BaseObj params = new BaseObj();
        params.setKey(key);
        GetTidesResponse result = Shipfinder.GetTides(params);
        System.out.println(result);
        if (result.getData() != null && !result.getData().isEmpty()) {
            System.out.println(result.getData().get(0).getPortCnname());
        }
    }

    public static void TideStationInfoFn() {
        TideStationInfoRequest params = new TideStationInfoRequest();
        params.setKey(key);
        params.setPort_code(8000005);
        params.setStart_date("2025-03-01");
        params.setEnd_date("2025-03-05");
        TideStationInfoResponse result = Shipfinder.TideStationInfo(params);
        System.out.println(result);
        if (result.getData() != null) {
            System.out.println(result.getData().getOverview().get(0).getTideHeight2());
            System.out.println(result.getData().getDetail().get(0).getH4());
        }
    }

    public static void GetWeatherByPointFn() {
        MarineWeatherRequest params = new MarineWeatherRequest();
        params.setKey(key);
        params.setLng(123.58414);
        params.setLat(27.37979);
        GetWeatherByPointResponse result = Shipfinder.GetWeatherByPoint(params);
        System.out.println(result);
        if (result.getData() != null) {
            System.out.println(result.getData().getPublishTime());
        }
    }

    // ==================== 6 China Region Coastline Warning Dataset ====================

    public static void GetNavWarningFn() {
        GetNavWarningRequest params = new GetNavWarningRequest();
        params.setKey(key);
        params.setStart_time("2024-07-21 20:00");
        params.setEnd_time("2024-09-21 20:00");
        params.setWarning_type("1");
        GetNavWarningResponse result = Shipfinder.GetNavWarning(params);
        System.out.println(result);
        if (result.getData() != null && !result.getData().isEmpty()) {
            System.out.println(result.getData().get(0).getTitle());
        }
    }

    // ==================== 7 Event Dataset ====================

    public static void AddFleetFn() {
        AddFleetRequest params = new AddFleetRequest();
        params.setKey(key);
        params.setFleet_name("TestFleet11");
        params.setMmsis("477985700,412751690");
        params.setMonitor("6");
        FleetInfoResponse result = Shipfinder.AddFleet(params);
        System.out.println(result);
    }

    public static void UpdateFleetFn() {
        UpdateFleetRequest params = new UpdateFleetRequest();
        params.setKey(key);
        params.setFleet_id("5c66e57e-0fc2-440a-900f-25fe0aa82fd5");
        params.setFleet_name("TestFleet");
        params.setMmsis("477985709");
        params.setMonitor("6");
        FleetInfoResponse result = Shipfinder.UpdateFleet(params);
        System.out.println(result);
    }

    public static void GetFleetFn() {
        GetFleetRequest params = new GetFleetRequest();
        params.setKey(key);
        params.setFleet_id("5c66e57e-0fc2-440a-900f-25fe0aa82fd5");
        FleetInfoResponse result = Shipfinder.GetFleet(params);
        System.out.println(result);
    }

    public static void DeleteFleetFn() {
        DeleteFleetRequest params = new DeleteFleetRequest();
        params.setKey(key);
        params.setFleet_id("f777007b-fb88-4c4c-b4eb-db33e84e99ee");
        FleetInfoResponse result = Shipfinder.DeleteFleet(params);
        System.out.println(result);
    }

    public static void AddFleetShipFn() {
        AddFleetShipRequest params = new AddFleetShipRequest();
        params.setKey(key);
        params.setFleet_id("5c66e57e-0fc2-440a-900f-25fe0aa82fd5");
        params.setMmsis("477985700,412751690");
        FleetInfoResponse result = Shipfinder.AddFleetShip(params);
        System.out.println(result);
    }

    public static void UpdateFleetShipFn() {
        UpdateFleetShipRequest params = new UpdateFleetShipRequest();
        params.setKey(key);
        params.setFleet_id("5c66e57e-0fc2-440a-900f-25fe0aa82fd5");
        params.setMmsis("477985706,412751696");
        FleetInfoResponse result = Shipfinder.UpdateFleetShip(params);
        System.out.println(result);
    }

    public static void DeleteFleetShipFn() {
        DeleteFleetShipRequest params = new DeleteFleetShipRequest();
        params.setKey(key);
        params.setFleet_id("5c66e57e-0fc2-440a-900f-25fe0aa82fd5");
        params.setMmsis("477985706");
        FleetInfoResponse result = Shipfinder.DeleteFleetShip(params);
        System.out.println(result);
    }

    public static void AddAreaFn() {
        AddAreaRequest params = new AddAreaRequest();
        params.setKey(key);
        params.setArea_bounds("119.846180,32.345143-119.814280,32.311867-119.4661,32.291067-119.375887,32.213847");
        params.setArea_name("ZhejiangCoastalArea1");
        params.setUrl("http://192.168.1.1:8000/shipfinder/testdemo");
        params.setFilter_type("3");
        params.setFleet_id("5c66e57e-0fc2-440a-900f-25fe0aa82fd5");
        UpdateGeofenceResponse result = Shipfinder.AddArea(params);
        System.out.println(result);
    }

    public static void UpdateGeofenceFn() {
        UpdateGeofenceRequest params = new UpdateGeofenceRequest();
        params.setKey(key);
        params.setArea_id("6ff20533-587c-44c7-a9f4-5e9214c1a211");
        params.setArea_bounds("119.846180,32.345143-119.814280,32.311867-119.4661,32.291067-119.375887,32.213847");
        params.setArea_name("ZhejiangCoastalArea11");
        params.setUrl("http://192.168.1.1:8000/shipfinder/testdemo");
        params.setFilter_type("3");
        params.setFleet_id("6db8d8ec-858d-4417-86c0-666d61e340bf");
        UpdateGeofenceResponse result = Shipfinder.UpdateGeofence(params);
        System.out.println(result);
    }

    public static void GetGeofenceFn() {
        GetGeofenceRequest params = new GetGeofenceRequest();
        params.setKey(key);
        params.setArea_id("6ff20533-587c-44c7-a9f4-5e9214c1a211");
        GetGeofenceResponse result = Shipfinder.GetGeofence(params);
        System.out.println(result);
        if (result.getData() != null) {
            System.out.println(result.getData().getAreaName());
        }
    }

    public static void DeleteAreaFn() {
        DeleteAreaRequest params = new DeleteAreaRequest();
        params.setKey(key);
        params.setArea_id("c18525d5-ac35-42eb-bee7-c791261d908d");
        BaseResponse result = Shipfinder.DeleteArea(params);
        System.out.println(result);
    }

    public static void AddVesselSpeedAlertFn() {
        AddVesselSpeedAlertRequest params = new AddVesselSpeedAlertRequest();
        params.setKey(key);
        params.setMmsi("477172700");
        params.setSpeed_limit("3-18");
        params.setSpeed_duration("5");
        BaseResponse result = Shipfinder.AddVesselSpeedAlert(params);
        System.out.println(result);
    }

    public static void DeleteVesselSpeedAlertFn() {
        DeleteVesselSpeedAlertRequest params = new DeleteVesselSpeedAlertRequest();
        params.setKey(key);
        params.setMmsi("477172700");
        BaseResponse result = Shipfinder.DeleteVesselSpeedAlert(params);
        System.out.println(result);
    }

    public static void GetVesselSpeedAlertListFn() {
        BaseObj params = new BaseObj();
        params.setKey(key);
        VesselSpeedAlertListResponse result = Shipfinder.GetVesselSpeedAlertList(params);
        System.out.println(result);
        if (result.getData() != null && !result.getData().isEmpty()) {
            System.out.println(result.getData().get(0).getSpeedLimit());
        }
    }
}
