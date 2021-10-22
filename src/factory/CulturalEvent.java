package factory;

import java.util.Date;

public class CulturalEvent extends Event{

	public CulturalEvent() {
		setEventName("Cultural Event");
		setStartDate(new Date());
		setEndDate(new Date());
		setVenue("Marionette Hotel");
		setCity("New York");
		setDescription("Here is a description");
	}
	public String toString() {
		return " Cultural event";
	}

}
