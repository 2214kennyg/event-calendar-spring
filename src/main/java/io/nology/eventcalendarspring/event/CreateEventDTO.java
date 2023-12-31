package io.nology.eventcalendarspring.event;

import java.util.Date;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class CreateEventDTO {
	
	@NotBlank
	String eventName;
	
	@NotNull
	Date startDate;
	
	@NotNull
	Date endDate;
	
	@NotBlank
	String location;
	
	@NotBlank
	String label;
	
	public String getEventName() {
		return eventName;
	}
	
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	
	public Date getStartDate() {
		return startDate;
	}
	
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	
	public Date getEndDate() {
		return endDate;
	} 
	
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	public String getLocation() {
		return location;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public String getLabel() {
		return label;
	}
	
	public void setLabel(String label) {
		this.label = label;
	}

	public CreateEventDTO(String eventName, Date startDate, Date endDate, String location, String label) {
		super();
		this.eventName = eventName;
		this.startDate = startDate;
		this.endDate = endDate;
		this.location = location;
		this.label = label;
	}
}
