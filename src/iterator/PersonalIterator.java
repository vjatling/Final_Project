package iterator;

import java.util.List;

import factory.*;

public class PersonalIterator implements Iterator {

	List<PersonalEvent> items;
	int position = 0;
	public PersonalIterator(List<PersonalEvent> items) {
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
