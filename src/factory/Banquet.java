package factory;
import java.util.*;
public class Banquet extends PersonalEvent{

	public Banquet() {
		setEventName("Banquet");
		setStartDate(new Date());
		setEndDate(new Date());
		setVenue("Marionette Hotel");
		setCity("New York");
		setDescription("Here is a description");

	}

}
