package factory;

import java.util.Date;

public class Festivals extends LeisureEvent {

	public Festivals() {
		setEventName("Festival");
		setStartDate(new Date());
		setEndDate(new Date());
		setVenue("Marionette Hotel");
		setCity("New York");
		setDescription("Here is a description");
	}
}
