package io.nology.eventcalendarspring.event;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
	List<Event> findByLabel(String label);
	List<Event> findByLocation(String location);
}
