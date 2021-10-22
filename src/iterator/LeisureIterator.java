package iterator;

import factory.*;
import java.util.*;


public class LeisureIterator implements Iterator {
	List<LeisureEvent> leisureItems;
	int position = 0;
	public LeisureIterator(List<LeisureEvent> leisureItems) {
		this.leisureItems = leisureItems;
	}

	public Event next() {
		Event event = leisureItems.get(position);
		position = position + 1;
		return event;

	}
	public boolean hasNext() {

		if(position >= leisureItems.size()) {
			return false;
		}
		else {
			return true;
		}
	}

}
