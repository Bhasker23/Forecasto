package com.forecasto.service;

public interface ForecastoService {


    public String RapidApiGetForecastSummaryByLocationName(String location);

    public  String RapidApiGetHourlyForecastByLocationName(Double latitude, Double longitude);

}
