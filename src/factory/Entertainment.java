package factory;

import java.util.Date;

public class Entertainment extends LeisureEvent {

	public Entertainment() {
		setEventName("Banquet");
		setStartDate(new Date());
		setEndDate(new Date());
		setVenue("Marionette Hotel");
		setCity("New York");
		setDescription("Here is a description");
	}

}
