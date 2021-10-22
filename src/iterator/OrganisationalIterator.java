package iterator;

import java.util.List;

import factory.*;

public class OrganisationalIterator implements Iterator{
	List<OrganisationalEvent> items;
	int position = 0;
	public OrganisationalIterator(List<OrganisationalEvent> items) {
		this.items = items;
	}

	public Event next() {
		Event event = items.get(position);
		position = position + 1;
		return event;

	}
	public boolean hasNext() {

		if(position >= items.size()) {
			return false;
		}
		else {
			return true;
		}
	}

}
