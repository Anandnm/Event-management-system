package com.Event.management.system.weather.impl;

import com.Event.management.system.client.WeatherApiClient;
import com.Event.management.system.weather.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDate;

@Service
public class WeatherServiceImpl implements WeatherService {

    @Autowired
    private WeatherApiClient weatherApiClient;

    @Override
    public String getWeather(String city, LocalDate date) {
        return weatherApiClient.getWeather(city, date);
    }
}

