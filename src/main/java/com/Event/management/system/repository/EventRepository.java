package com.Event.management.system.repository;

import com.Event.management.system.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface EventRepository extends JpaRepository<Event , Long> {
    List<Event> findByDateAfterAndDateBeforeOrderByDateAsc(LocalDate startDate, LocalDate endDate);
}
