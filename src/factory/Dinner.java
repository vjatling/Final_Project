package factory;

import java.util.Date;

public class Dinner extends PersonalEvent{

	public Dinner() {
		setEventName("Dinner");
		setStartDate(new Date());
		setEndDate(new Date());
		setVenue("Marionette Hotel");
		setCity("New York");
		setDescription("Here is a description");
	}

}
