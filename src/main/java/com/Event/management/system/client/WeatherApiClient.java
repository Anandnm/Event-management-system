package com.Event.management.system.client;

import org.springframework.stereotype.Component;
import java.time.LocalDate;

@Component
public class WeatherApiClient {

    public String getWeather(String city, LocalDate date) {
        // Logic to call external Weather API and retrieve weather information
        return "Sunny";
    }
}
