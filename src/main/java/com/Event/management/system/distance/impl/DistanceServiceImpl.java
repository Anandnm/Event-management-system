package com.Event.management.system.distance.impl;

import com.Event.management.system.client.DistanceApiClient;
import com.Event.management.system.distance.DistanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DistanceServiceImpl implements DistanceService {

    @Autowired
    private DistanceApiClient distanceApiClient;

    @Override
    public double calculateDistance(double lat1, double lon1, double lat2, double lon2) {
        return distanceApiClient.calculateDistance(lat1, lon1, lat2, lon2);
    }
}
