package factory;

import java.util.Date;

public class BrandRelease extends OrganisationalEvent {

	public BrandRelease() {
		setEventName("Organisational");
		setStartDate(new Date());
		setEndDate(new Date());
		setVenue("Marionette Hotel");
		setCity("New York");
		setDescription("Here is a description");
	}

}
