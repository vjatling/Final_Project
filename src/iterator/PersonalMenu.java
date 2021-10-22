package iterator;

import java.util.ArrayList;
import java.util.List;

import factory.*;

public class PersonalMenu implements Menu {


	List<PersonalEvent> eventsMenu;
	public PersonalMenu() {
		eventsMenu = new ArrayList<PersonalEvent>();
		eventsMenu.add(new Banquet());
		eventsMenu.add(new Dinner());
		eventsMenu.add(new Marriage());

	}
	public Iterator createIterator() {
		return new PersonalIterator(eventsMenu);
	}
}
