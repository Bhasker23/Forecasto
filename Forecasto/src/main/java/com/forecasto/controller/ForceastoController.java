package com.forecasto.controller;

import com.forecasto.service.ForecastoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ForceastoController {

    @Autowired
    private ForecastoService forecastoService;

    @GetMapping("/weather/forecastSummary")
    public String getForecastSummary(@RequestParam String location) {
        return forecastoService.RapidApiGetForecastSummaryByLocationName(location);
    }


    @GetMapping("/weather/hourlySummary")
    public String getHourlyForecast(@RequestParam Double latitude, @RequestParam Double longitude){
        return forecastoService.RapidApiGetHourlyForecastByLocationName(latitude,longitude);
    }
}
