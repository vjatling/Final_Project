package iterator;

import java.util.ArrayList;
import java.util.List;

import factory.*;

public class OrganisationalMenu implements Menu{

	List<OrganisationalEvent> eventsMenu;
	public OrganisationalMenu() {
		eventsMenu = new ArrayList<OrganisationalEvent>();
		eventsMenu.add(new Marketting());
		eventsMenu.add(new BrandRelease());
		eventsMenu.add(new Charity());

	}
	public Iterator createIterator() {
		return new OrganisationalIterator(eventsMenu);
	}
}
