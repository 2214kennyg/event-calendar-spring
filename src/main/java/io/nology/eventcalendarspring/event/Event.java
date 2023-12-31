package io.nology.eventcalendarspring.event;

import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "events")
public class Event {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Long id;
		
	@Column
	String eventName;
	
	@Column
    Date startDate;

    @Column
    Date endDate;

    @Column
    String location;

    @Column
    String label;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
    
    public Event() {
    	
    }
    
    public Event(String eventName, Date startDate, Date endDate, String location, String label) {
    	this.eventName = eventName;
    	this.startDate = startDate;
    	this.endDate = endDate;
    	this.location = location;
    	this.label = label;
    }
}
