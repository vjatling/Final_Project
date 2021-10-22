package factory;

import java.util.Date;

public class Charity extends OrganisationalEvent{

	public Charity() {
		setEventName("Charity");
		setStartDate(new Date());
		setEndDate(new Date());
		setVenue("Marionette Hotel");
		setCity("New York");
		setDescription("Here is a description");
	}

}
