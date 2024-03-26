package com.Event.management.system.controller;

import com.Event.management.system.distance.DistanceService;
import com.Event.management.system.payload.EventDto;
import com.Event.management.system.service.EventService;
import com.Event.management.system.weather.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/events")
public class EventController {
    private EventService eventService;
    public EventController (EventService eventService){
        this.eventService = eventService;
    }


    @Autowired
    private WeatherService weatherService;

    @Autowired
    private DistanceService distanceService;
@PostMapping
    public ResponseEntity<EventDto> addEvent(@RequestBody EventDto eventDto){
     EventDto dto =   eventService.addEvent(eventDto);
        return new ResponseEntity<>(dto, HttpStatus.CREATED);
    }
    @GetMapping ("/find")
    public ResponseEntity<List<EventDto>> findEventsWithinDateRange(
            @RequestParam("startDate") @DateTimeFormat (iso = DateTimeFormat.ISO.DATE) LocalDate startDate,
            @RequestParam("endDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate endDate) {
        List<EventDto> events = eventService.findEventsWithinDateRange(startDate, endDate);
        return new ResponseEntity<>(events, HttpStatus.OK);
    }
}
