package factory;

import java.util.Date;

public class SportingContest extends LeisureEvent{

	public SportingContest() {
		setEventName("Sporting Contest");
		setStartDate(new Date());
		setEndDate(new Date());
		setVenue("Marionette Hotel");
		setCity("New York");
		setDescription("Here is a description");
	}

}
