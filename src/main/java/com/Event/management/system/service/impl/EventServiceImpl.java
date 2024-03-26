package com.Event.management.system.service.impl;

import com.Event.management.system.entity.Event;
import com.Event.management.system.payload.EventDto;
import com.Event.management.system.repository.EventRepository;
import com.Event.management.system.service.EventService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EventServiceImpl implements EventService {
    private EventRepository eventRepository;
    public EventServiceImpl (EventRepository eventRepository){
        this.eventRepository =eventRepository;
    }

    @Override
    public EventDto addEvent(EventDto eventDto) {

        Event event = new Event();
        event.setEvent_Name(eventDto.getEvent_Name());
    event.setCity_Name(eventDto.getCity_Name());
    event.setDate(eventDto.getDate());
    event.setTime(eventDto.getTime());
    event.setLatitude(eventDto.getLatitude());
    event.setLongitude(eventDto.getLongitude());
        Event save = eventRepository.save(event);
        EventDto dto = new EventDto();
        dto.setId(save.getId());
        dto.setEvent_Name(save.getEvent_Name());
        dto.setCity_Name(save.getCity_Name());
        dto.setDate(save.getDate());
        dto.setTime(save.getEvent_Name());
        dto.setLatitude(save.getLatitude());
        dto.setLongitude(save.getLongitude());
        return dto;
    }

    @Override
    public List<EventDto> findEventsWithinDateRange(LocalDate startDate, LocalDate endDate) {
        List<Event> events = eventRepository.findByDateAfterAndDateBeforeOrderByDateAsc(startDate, endDate);
        return events.stream().map(this::convertToDto).collect(Collectors.toList());
    }

    private EventDto convertToDto(Event event) {
        EventDto eventDto = new EventDto();
        eventDto.setEvent_Name(event.getEvent_Name());
        eventDto.setCity_Name(event.getCity_Name());
        eventDto.setDate(event.getDate());
        eventDto.setTime(event.getTime());
        eventDto.setLatitude(event.getLatitude());
        eventDto.setLongitude(event.getLongitude());
        return eventDto;
    }
}
