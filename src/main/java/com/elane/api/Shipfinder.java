package com.elane.api;


import cn.hutool.core.bean.BeanUtil;
import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpUtil;
import com.elane.request.*;
import com.elane.response.*;
import com.google.gson.Gson;

import java.util.Map;

/**
 * Author：White
 * https://docs.shipfinder.com
 */
public class Shipfinder {
    private static String apiUrl = "https://api.elaneglobal.com/v1";

    public static String getMethod(String methodName, Map<String, Object> paramMap) {
        String resultStr = HttpUtil.get(apiUrl + "/" + methodName, paramMap);
        System.out.println(resultStr);
        return resultStr;
    }

    public static String postMethod(String methodName, Map<String, Object> paramMap) {
        String resultStr = HttpUtil.post(apiUrl + "/" + methodName, paramMap);
        System.out.println(resultStr);
        return resultStr;
    }

    public static String deleteMethod(String methodName, Map<String, Object> paramMap) {
        String resultStr = HttpRequest.delete(apiUrl + "/" + methodName).form(paramMap).execute().body();
        System.out.println(resultStr);
        return resultStr;
    }

    // ==================== 1 AIS Dataset ====================

    /**
     * 1.1.1 Single Vessel Position
     * <p><a href="https://docs.shipfinder.com/428990613e0">Online Documentation</a></p>
     */
    public static VesselPositionSingleResponse VesselPositionSingle(VesselPositionSingleRequest params) {
        Map<String, Object> paramMap = BeanUtil.beanToMap(params);
        String resultStr = getMethod("AIS/VesselPositionSingle", paramMap);
        return new Gson().fromJson(resultStr, VesselPositionSingleResponse.class);
    }

    /**
     * 1.1.2 Multi-vessel Position
     * <p><a href="https://docs.shipfinder.com/430292321e0">Online Documentation</a></p>
     */
    public static VesselPositionMultiResponse VesselPositionMulti(VesselPositionMultiRequest params) {
        Map<String, Object> paramMap = BeanUtil.beanToMap(params);
        String resultStr = getMethod("AIS/VesselPositionMulti", paramMap);
        return new Gson().fromJson(resultStr, VesselPositionMultiResponse.class);
    }

    /**
     * 1.1.3 Fleet Position
     * <p><a href="https://docs.shipfinder.com/430293359e0">Online Documentation</a></p>
     */
    public static FleetPositionResponse FleetPosition(FleetPositionRequest params) {
        Map<String, Object> paramMap = BeanUtil.beanToMap(params);
        String resultStr = getMethod("AIS/FleetPosition", paramMap);
        return new Gson().fromJson(resultStr, FleetPositionResponse.class);
    }

    /**
     * 1.2 Vessel Search
     * <p><a href="https://docs.shipfinder.com/428749512e0">Online Documentation</a></p>
     */
    public static VesselSearchResponse VesselSearch(VesselSearchRequest params) {
        Map<String, Object> paramMap = BeanUtil.beanToMap(params);
        String resultStr = getMethod("AIS/VesselSearch", paramMap);
        return new Gson().fromJson(resultStr, VesselSearchResponse.class);
    }

    /**
     * 1.3 Vessels Nearby
     * <p><a href="https://docs.shipfinder.com/429003024e0">Online Documentation</a></p>
     */
    public static VesselsNearbyResponse VesselsNearby(VesselsNearbyRequest params) {
        Map<String, Object> paramMap = BeanUtil.beanToMap(params);
        String resultStr = getMethod("AIS/VesselsNearby", paramMap);
        return new Gson().fromJson(resultStr, VesselsNearbyResponse.class);
    }

    /**
     * 1.4 Vessels in Zone
     * <p><a href="https://docs.shipfinder.com/429583708e0">Online Documentation</a></p>
     */
    public static VesselsInZoneResponse VesselsInZone(VesselsInZoneRequest params) {
        Map<String, Object> paramMap = BeanUtil.beanToMap(params);
        String resultStr = getMethod("AIS/VesselsInZone", paramMap);
        return new Gson().fromJson(resultStr, VesselsInZoneResponse.class);
    }

    /**
     * 1.5 Vessel Flag Information
     * <p><a href="https://docs.shipfinder.com/429919472e0">Online Documentation</a></p>
     */
    public static VesselFlagInfoResponse VesselFlagInfo(VesselFlagInfoRequest params) {
        Map<String, Object> paramMap = BeanUtil.beanToMap(params);
        String resultStr = getMethod("AIS/VesselFlagInfo", paramMap);
        return new Gson().fromJson(resultStr, VesselFlagInfoResponse.class);
    }

    // ==================== 2 Voyage Dataset ====================

    /**
     * 2.1 Port Information
     * <p><a href="https://docs.shipfinder.com/429932201e0">Online Documentation</a></p>
     */
    public static PortInfoResponse PortInfo(PortInfoRequest params) {
        Map<String, Object> paramMap = BeanUtil.beanToMap(params);
        String resultStr = getMethod("Voyage/PortInfo", paramMap);
        return new Gson().fromJson(resultStr, PortInfoResponse.class);
    }

    /**
     * 2.2 Currently Berthed Vessels
     * <p><a href="https://docs.shipfinder.com/430197412e0">Online Documentation</a></p>
     */
    public static PortBerthedVesselsResponse PortBerthedVessels(PortBerthedVesselsRequest params) {
        Map<String, Object> paramMap = BeanUtil.beanToMap(params);
        String resultStr = getMethod("Voyage/PortBerthedVessels", paramMap);
        return new Gson().fromJson(resultStr, PortBerthedVesselsResponse.class);
    }

    /**
     * 2.3 Currently Anchored Vessels
     * <p><a href="https://docs.shipfinder.com/430236145e0">Online Documentation</a></p>
     */
    public static PortAnchoredVesselsResponse PortAnchoredVessels(PortAnchoredVesselsRequest params) {
        Map<String, Object> paramMap = BeanUtil.beanToMap(params);
        String resultStr = getMethod("Voyage/PortAnchoredVessels", paramMap);
        return new Gson().fromJson(resultStr, PortAnchoredVesselsResponse.class);
    }

    /**
     * 2.4 Inbound / Expected Arrivals
     * <p><a href="https://docs.shipfinder.com/430249182e0">Online Documentation</a></p>
     */
    public static PortExpectedArrivalsResponse PortExpectedArrivals(PortExpectedArrivalsRequest params) {
        Map<String, Object> paramMap = BeanUtil.beanToMap(params);
        String resultStr = getMethod("Voyage/PortExpectedArrivals", paramMap);
        return new Gson().fromJson(resultStr, PortExpectedArrivalsResponse.class);
    }

    // ==================== 3 History Dataset ====================

    /**
     * 3.1 Vessel History Track
     * <p><a href="https://docs.shipfinder.com/430346103e0">Online Documentation</a></p>
     */
    public static VesselHistoryTrackResponse VesselHistoryTrack(VesselHistoryTrackRequest params) {
        Map<String, Object> paramMap = BeanUtil.beanToMap(params);
        String resultStr = getMethod("History/VesselHistoryTrack", paramMap);
        return new Gson().fromJson(resultStr, VesselHistoryTrackResponse.class);
    }

    /**
     * 3.2 Ship-to-Ship (STS) Events
     * <p><a href="https://docs.shipfinder.com/430352093e0">Online Documentation</a></p>
     */
    public static VesselStsEventsResponse VesselStsEvents(VesselStsEventsRequest params) {
        Map<String, Object> paramMap = BeanUtil.beanToMap(params);
        String resultStr = getMethod("History/VesselStsEvents", paramMap);
        return new Gson().fromJson(resultStr, VesselStsEventsResponse.class);
    }

    /**
     * 3.3 Vessel Port Call History
     * <p><a href="https://docs.shipfinder.com/430426234e0">Online Documentation</a></p>
     */
    public static PortCallRecordsByVesselResponse PortCallRecordsByVessel(PortCallRecordsByVesselRequest params) {
        Map<String, Object> paramMap = BeanUtil.beanToMap(params);
        String resultStr = getMethod("History/PortCallRecordsByVessel", paramMap);
        return new Gson().fromJson(resultStr, PortCallRecordsByVesselResponse.class);
    }

    /**
     * 3.4 Vessel Port Call Records at Specific Port
     * <p><a href="https://docs.shipfinder.com/430484162e0">Online Documentation</a></p>
     */
    public static PortCallRecordsByVesselAtPortResponse PortCallRecordsByVesselAtPort(PortCallRecordsByVesselAtPortRequest params) {
        Map<String, Object> paramMap = BeanUtil.beanToMap(params);
        String resultStr = getMethod("History/PortCallRecordsByVesselAtPort", paramMap);
        return new Gson().fromJson(resultStr, PortCallRecordsByVesselAtPortResponse.class);
    }

    /**
     * 3.5 Vessel Current Port Call
     * <p><a href="https://docs.shipfinder.com/430498718e0">Online Documentation</a></p>
     */
    public static VesselCurrentPortCallResponse VesselCurrentPortCall(VesselCurrentPortCallRequest params) {
        Map<String, Object> paramMap = BeanUtil.beanToMap(params);
        String resultStr = getMethod("History/VesselCurrentPortCall", paramMap);
        return new Gson().fromJson(resultStr, VesselCurrentPortCallResponse.class);
    }

    /**
     * 3.6 Port Calls Records for Port
     * <p><a href="https://docs.shipfinder.com/430531632e0">Online Documentation</a></p>
     */
    public static PortCallRecordsByPortResponse PortCallRecordsByPort(PortCallRecordsByPortRequest params) {
        Map<String, Object> paramMap = BeanUtil.beanToMap(params);
        String resultStr = getMethod("History/PortCallRecordsByPort", paramMap);
        return new Gson().fromJson(resultStr, PortCallRecordsByPortResponse.class);
    }

    // ==================== 4 Prediction Dataset ====================

    /**
     * 4.1 Point-to-Point Route Planning
     * <p><a href="https://docs.shipfinder.com/431124483e0">Online Documentation</a></p>
     */
    public static RoutePlanPointToPointResponse RoutePlanPointToPoint(RoutePlanPointToPointRequest params) {
        Map<String, Object> paramMap = BeanUtil.beanToMap(params);
        String resultStr = getMethod("Prediction/RoutePlanPointToPoint", paramMap);
        return new Gson().fromJson(resultStr, RoutePlanPointToPointResponse.class);
    }

    /**
     * 4.2 Port-to-Port Route Planning
     * <p><a href="https://docs.shipfinder.com/431244012e0">Online Documentation</a></p>
     */
    public static RoutePlanPointToPointResponse RoutePlanPortToPort(RoutePlanPortToPortRequest params) {
        Map<String, Object> paramMap = BeanUtil.beanToMap(params);
        String resultStr = getMethod("Prediction/RoutePlanPortToPort", paramMap);
        return new Gson().fromJson(resultStr, RoutePlanPointToPointResponse.class);
    }

    /**
     * 4.3 ETA Query
     * <p><a href="https://docs.shipfinder.com/431244206e0">Online Documentation</a></p>
     */
    public static ETAResponse ETA(ETARequest params) {
        Map<String, Object> paramMap = BeanUtil.beanToMap(params);
        String resultStr = getMethod("Prediction/ETA", paramMap);
        return new Gson().fromJson(resultStr, ETAResponse.class);
    }

    // ==================== 5 Meteorology Dataset ====================

    /**
     * 5.1.1 Global Tropical Cyclones List
     * <p><a href="https://docs.shipfinder.com/431698053e0">Online Documentation</a></p>
     */
    public static GetAllTyphoonResponse GetAllTyphoon(BaseObj params) {
        Map<String, Object> paramMap = BeanUtil.beanToMap(params);
        String resultStr = getMethod("Meteorology/CyclonesList", paramMap);
        return new Gson().fromJson(resultStr, GetAllTyphoonResponse.class);
    }

    /**
     * 5.1.2 Tropical Cyclone Details by Point
     * <p><a href="https://docs.shipfinder.com/431698143e0">Online Documentation</a></p>
     */
    public static GetSingleTyphoonResponse GetSingleTyphoon(CycloneInfoRequest params) {
        Map<String, Object> paramMap = BeanUtil.beanToMap(params);
        String resultStr = getMethod("Meteorology/CycloneInfo", paramMap);
        return new Gson().fromJson(resultStr, GetSingleTyphoonResponse.class);
    }

    /**
     * 5.2.1 Global Tide Gauge Stations List
     * <p><a href="https://docs.shipfinder.com/431857907e0">Online Documentation</a></p>
     */
    public static GetTidesResponse GetTides(BaseObj params) {
        Map<String, Object> paramMap = BeanUtil.beanToMap(params);
        String resultStr = getMethod("Meteorology/TideStationList", paramMap);
        return new Gson().fromJson(resultStr, GetTidesResponse.class);
    }

    /**
     * 5.2.2 Query Single Tide Gauge Station Details
     * <p><a href="https://docs.shipfinder.com/431865286e0">Online Documentation</a></p>
     */
    public static TideStationInfoResponse TideStationInfo(TideStationInfoRequest params) {
        Map<String, Object> paramMap = BeanUtil.beanToMap(params);
        String resultStr = getMethod("Meteorology/TideStationInfo", paramMap);
        return new Gson().fromJson(resultStr, TideStationInfoResponse.class);
    }

    /**
     * 5.3 Global Marine Weather
     * <p><a href="https://docs.shipfinder.com/431272522e0">Online Documentation</a></p>
     */
    public static GetWeatherByPointResponse GetWeatherByPoint(MarineWeatherRequest params) {
        Map<String, Object> paramMap = BeanUtil.beanToMap(params);
        String resultStr = getMethod("Meteorology/MarineWeather", paramMap);
        return new Gson().fromJson(resultStr, GetWeatherByPointResponse.class);
    }

    // ==================== 6 China Region Coastline Warning Dataset ====================

    /**
     * 6.1 China Region Navigational Warnings
     * <p><a href="https://docs.shipfinder.com/431872073e0">Online Documentation</a></p>
     */
    public static GetNavWarningResponse GetNavWarning(GetNavWarningRequest params) {
        Map<String, Object> paramMap = BeanUtil.beanToMap(params);
        String resultStr = getMethod("Warning/NavigationalWarnings", paramMap);
        return new Gson().fromJson(resultStr, GetNavWarningResponse.class);
    }

    // ==================== 7 Event Dataset ====================

    /**
     * 7.1.1 Create Fleet
     * <p><a href="https://docs.shipfinder.com/432035260e0">Online Documentation</a></p>
     */
    public static FleetInfoResponse AddFleet(AddFleetRequest params) {
        Map<String, Object> paramMap = BeanUtil.beanToMap(params);
        String resultStr = postMethod("Event/AddFleet", paramMap);
        return new Gson().fromJson(resultStr, FleetInfoResponse.class);
    }

    /**
     * 7.1.2 Update Fleet Information
     * <p><a href="https://docs.shipfinder.com/432048484e0">Online Documentation</a></p>
     */
    public static FleetInfoResponse UpdateFleet(UpdateFleetRequest params) {
        Map<String, Object> paramMap = BeanUtil.beanToMap(params);
        String resultStr = postMethod("Event/UpdateFleetInfo", paramMap);
        return new Gson().fromJson(resultStr, FleetInfoResponse.class);
    }

    /**
     * 7.1.3 Query Fleet
     * <p><a href="https://docs.shipfinder.com/432057101e0">Online Documentation</a></p>
     */
    public static FleetInfoResponse GetFleet(GetFleetRequest params) {
        Map<String, Object> paramMap = BeanUtil.beanToMap(params);
        String resultStr = getMethod("Event/GetFleet", paramMap);
        return new Gson().fromJson(resultStr, FleetInfoResponse.class);
    }

    /**
     * 7.1.4 Delete Fleet
     * <p><a href="https://docs.shipfinder.com/432076110e0">Online Documentation</a></p>
     */
    public static FleetInfoResponse DeleteFleet(DeleteFleetRequest params) {
        Map<String, Object> paramMap = BeanUtil.beanToMap(params);
        String resultStr = postMethod("Event/DeleteFleet", paramMap);
        return new Gson().fromJson(resultStr, FleetInfoResponse.class);
    }

    /**
     * 7.1.5 Add Vessels to Fleet
     * <p><a href="https://docs.shipfinder.com/432100231e0">Online Documentation</a></p>
     */
    public static FleetInfoResponse AddFleetShip(AddFleetShipRequest params) {
        Map<String, Object> paramMap = BeanUtil.beanToMap(params);
        String resultStr = postMethod("Event/AddVesselToFleet", paramMap);
        return new Gson().fromJson(resultStr, FleetInfoResponse.class);
    }

    /**
     * 7.1.6 Batch Update Vessels in Fleet
     * <p><a href="https://docs.shipfinder.com/432080706e0">Online Documentation</a></p>
     */
    public static FleetInfoResponse UpdateFleetShip(UpdateFleetShipRequest params) {
        Map<String, Object> paramMap = BeanUtil.beanToMap(params);
        String resultStr = postMethod("Event/UpdateFleetVessel", paramMap);
        return new Gson().fromJson(resultStr, FleetInfoResponse.class);
    }

    /**
     * 7.1.7 Remove Vessels from Fleet
     * <p><a href="https://docs.shipfinder.com/432106004e0">Online Documentation</a></p>
     */
    public static FleetInfoResponse DeleteFleetShip(DeleteFleetShipRequest params) {
        Map<String, Object> paramMap = BeanUtil.beanToMap(params);
        String resultStr = postMethod("Event/DeleteFleetVessel", paramMap);
        return new Gson().fromJson(resultStr, FleetInfoResponse.class);
    }

    /**
     * 7.2.1 Geofence Creation
     * <p><a href="https://docs.shipfinder.com/433382008e0">Online Documentation</a></p>
     */
    public static UpdateGeofenceResponse AddArea(AddAreaRequest params) {
        Map<String, Object> paramMap = BeanUtil.beanToMap(params);
        String resultStr = postMethod("Event/AddGeofence", paramMap);
        return new Gson().fromJson(resultStr, UpdateGeofenceResponse.class);
    }

    /**
     * 7.2.2 Geofence Update
     * <p><a href="https://docs.shipfinder.com/433396710e0">Online Documentation</a></p>
     */
    public static UpdateGeofenceResponse UpdateGeofence(UpdateGeofenceRequest params) {
        Map<String, Object> paramMap = BeanUtil.beanToMap(params);
        String resultStr = postMethod("Event/UpdateGeofence", paramMap);
        return new Gson().fromJson(resultStr, UpdateGeofenceResponse.class);
    }

    /**
     * 7.2.3 Geofence Query
     * <p><a href="https://docs.shipfinder.com/433414777e0">Online Documentation</a></p>
     */
    public static GetGeofenceResponse GetGeofence(GetGeofenceRequest params) {
        Map<String, Object> paramMap = BeanUtil.beanToMap(params);
        String resultStr = getMethod("Event/GetGeofence", paramMap);
        return new Gson().fromJson(resultStr, GetGeofenceResponse.class);
    }

    /**
     * 7.2.4 Geofence Deletion
     * <p><a href="https://docs.shipfinder.com/433422419e0">Online Documentation</a></p>
     */
    public static BaseResponse DeleteArea(DeleteAreaRequest params) {
        Map<String, Object> paramMap = BeanUtil.beanToMap(params);
        String resultStr = postMethod("Event/DeleteGeofence", paramMap);
        return new Gson().fromJson(resultStr, BaseResponse.class);
    }

    /**
     * 7.3.1 Add Vessel Speed Alert Subscription
     * <p><a href="https://docs.shipfinder.com/433460139e0">Online Documentation</a></p>
     */
    public static BaseResponse AddVesselSpeedAlert(AddVesselSpeedAlertRequest params) {
        Map<String, Object> paramMap = BeanUtil.beanToMap(params);
        String resultStr = postMethod("Event/AddVesselSpeedAlert", paramMap);
        return new Gson().fromJson(resultStr, BaseResponse.class);
    }

    /**
     * 7.3.2 Delete Vessel Speed Alert Subscription
     * <p><a href="https://docs.shipfinder.com/433471968e0">Online Documentation</a></p>
     */
    public static BaseResponse DeleteVesselSpeedAlert(DeleteVesselSpeedAlertRequest params) {
        Map<String, Object> paramMap = BeanUtil.beanToMap(params);
        String resultStr = postMethod("Event/DeleteVesselSpeedAlert", paramMap);
        return new Gson().fromJson(resultStr, BaseResponse.class);
    }

    /**
     * 7.3.3 Query Vessel Speed Alert Subscription List
     * <p><a href="https://docs.shipfinder.com/433473614e0">Online Documentation</a></p>
     */
    public static VesselSpeedAlertListResponse GetVesselSpeedAlertList(BaseObj params) {
        Map<String, Object> paramMap = BeanUtil.beanToMap(params);
        String resultStr = getMethod("Event/VesselSpeedAlertList", paramMap);
        return new Gson().fromJson(resultStr, VesselSpeedAlertListResponse.class);
    }
}
