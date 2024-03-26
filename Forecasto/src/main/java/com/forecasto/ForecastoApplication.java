package com.forecasto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ForecastoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ForecastoApplication.class, args);
	}

}

//https://api.openweathermap.org/data/2.5/forecast?lat=44.34&lon=10.99&appid=1204d1db8a4c17b9fc0a1f4902ede7a6
//https://pro.openweathermap.org/data/2.5/forecast/hourly?lat=44.34&lon=10.99&appid=1204d1db8a4c17b9fc0a1f4902ede7a6