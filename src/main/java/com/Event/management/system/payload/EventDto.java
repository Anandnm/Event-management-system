package com.Event.management.system.payload;

import lombok.Data;
@Data
public class EventDto {
    private long id;
    private String event_Name;
    private  String city_Name;
    private int date;
    private String time;
    private double latitude;
    private double longitude;
}
