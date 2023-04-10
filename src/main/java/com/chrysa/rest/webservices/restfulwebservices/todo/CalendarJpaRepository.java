package com.chrysa.rest.webservices.restfulwebservices.todo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CalendarJpaRepository extends JpaRepository<GuestsCalendar, Long> {
    List<GuestsCalendar> findByUsername(String username);
}
