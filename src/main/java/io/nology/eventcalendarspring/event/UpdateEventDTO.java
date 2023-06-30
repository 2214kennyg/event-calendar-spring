package io.nology.eventcalendarspring.event;

import java.util.Date;

import jakarta.validation.constraints.*;

public class UpdateEventDTO {
	@NotBlank
    @Size(min = 1)
    @Pattern(regexp = "^(?=\\S).*$", message = "Event name must not be empty")
    String eventName;
	
	@NotNull
    Date startDate;

    @NotNull
    Date endDate;

    @NotBlank
    @Size(min = 1)
    @Pattern(regexp = "^(?=\\S).*$", message = "Event location must not be empty")
    String location;

    @NotBlank
    @Size(min = 1)
    @Pattern(regexp = "^(?=\\S).*$", message = "Event label must not be empty")
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
}
