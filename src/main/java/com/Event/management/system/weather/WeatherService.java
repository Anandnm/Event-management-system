package com.Event.management.system.weather;

import java.time.LocalDate;

public interface WeatherService {
    String getWeather(String city, LocalDate date);
}

