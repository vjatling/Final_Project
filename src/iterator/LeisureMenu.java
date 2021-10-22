package iterator;
import java.util.*;
import factory.*;
public class LeisureMenu implements Menu{
	List<LeisureEvent> eventsMenu;
	public LeisureMenu() {
		eventsMenu = new ArrayList<LeisureEvent>();
		eventsMenu.add(new SportingContest());
		eventsMenu.add(new Festivals());
		eventsMenu.add(new Entertainment());

	}
	public Iterator createIterator() {
		return new LeisureIterator(eventsMenu);
	}

}
