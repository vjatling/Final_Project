package factory;

import java.util.Date;

public class Marketting extends OrganisationalEvent{

	public Marketting() {
		setEventName("Marketting");
		setStartDate(new Date());
		setEndDate(new Date());
		setVenue("Marionette Hotel");
		setCity("New York");
		setDescription("Here is a description");
	}

}
