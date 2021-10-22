package factory;

import java.util.Date;

public class PersonalEvent extends Event{
	public PersonalEvent() {
		setEventName("Personal Event");
//		setStartDate(new Date());
//		setEndDate(new Date());
//		setVenue("Marionette Hotel");
//		setCity("New York");
//		setDescription("Here is a description");
	}
	public String toString() {
		return eventName;
	}
}
