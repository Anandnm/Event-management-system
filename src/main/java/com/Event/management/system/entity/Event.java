package com.Event.management.system.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Events")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="event_Name" , nullable = false)
    private String event_Name;
    @Column(name = "city_Name")
    private  String city_Name;
    @Column(name = "date", nullable = false)
    private int date;
    @Column(name = "time", nullable = false)
    private String time;
    @Column(name = "latitude", nullable = false)
    private double latitude;
    @Column(name = "longitude", nullable = false)
    private double longitude;

}
