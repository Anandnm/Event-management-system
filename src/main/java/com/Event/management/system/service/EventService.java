package com.Event.management.system.service;

import com.Event.management.system.payload.EventDto;

import java.time.LocalDate;
import java.util.List;

public interface EventService {
    EventDto addEvent(EventDto eventDto);

    List<EventDto> findEventsWithinDateRange(LocalDate startDate, LocalDate endDate);
}
