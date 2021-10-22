package factory;

import java.util.Date;

public class Marriage extends PersonalEvent {

	public Marriage() {
		setEventName("Marriage");
		setStartDate(new Date());
		setEndDate(new Date());
		setVenue("Marionette Hotel");
		setCity("New York");
		setDescription("Here is a description");
	}

}
