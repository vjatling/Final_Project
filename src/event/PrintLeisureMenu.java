package event;


import iterator.*;
import factory.*;
public class PrintLeisureMenu {
	LeisureMenu leisureMenu;


	public PrintLeisureMenu(LeisureMenu leisureMenu) {
		this.leisureMenu = leisureMenu;
	}

	public void printMenu() {
		Iterator iterMenu = leisureMenu.createIterator();
		printMenu(iterMenu);
	}

	private void printMenu(Iterator iterator) {
		System.out.println("\n\n==========Leisure Event Listing=============\n\n");


		while(iterator.hasNext()){
			  LeisureEvent personal = (LeisureEvent) iterator.next();

			  System.out.print(personal.getEventName() + "\t");
			  System.out.print(personal.getDescription() +"\t");
			  System.out.print(personal.getVenue() +"\t");
			  System.out.print(personal.getCity()+"\t");
			  System.out.print(personal.getStartDate()+"\t");
			  System.out.print(personal.getEndDate() +"\t");


		}

	}
}
