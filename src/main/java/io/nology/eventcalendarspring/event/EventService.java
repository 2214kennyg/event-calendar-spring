package io.nology.eventcalendarspring.event;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class EventService {
	
	@Autowired
	private EventRepository eventRepository;
	
	@Autowired
	private	ModelMapper modelMapper;
	
	
	public Event create(CreateEventDTO data) {
		Event newEvent = modelMapper.map(data, Event.class);
		return this.eventRepository.save(newEvent);
	}


	public List<Event> findAll() {
		return this.eventRepository.findAll();
	}


	public Optional<Event> findById(Long id) {
		return this.eventRepository.findById(id);
	}

	public boolean deleteById(Long id) {
		if (this.findById(id).isPresent()) {
			this.eventRepository.delete(this.findById(id).get());
            return true;
		}
		return false;
	}
	
	public Optional<Event> updateById(Long id, UpdateEventDTO data) {
		Optional<Event> maybeEvent = this.findById(id);
		if (maybeEvent.isPresent()) {
			Event existingEvent = maybeEvent.get();
			modelMapper.map(data, existingEvent);
			return Optional.of(this.eventRepository.save(existingEvent));
		}
		return maybeEvent;
	}
}
