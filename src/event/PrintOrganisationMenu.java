package event;

import factory.*;
import iterator.*;

public class PrintOrganisationMenu {
	OrganisationalMenu organisationalMenu;


	public PrintOrganisationMenu(OrganisationalMenu organisationalMenu) {
		this.organisationalMenu = organisationalMenu;
	}

	public void printMenu() {
		Iterator iterMenu = organisationalMenu.createIterator();
		printMenu(iterMenu);
	}

	private void printMenu(Iterator iterator) {
		System.out.println("\n\n==========Organisational Event Listing=============\n\n");


		while(iterator.hasNext()){
			  OrganisationalEvent organisational = (OrganisationalEvent) iterator.next();

			  System.out.print(organisational.getEventName() + "\t");
			  System.out.print(organisational.getDescription() +"\t");
			  System.out.print(organisational.getVenue() +"\t");
			  System.out.print(organisational.getCity()+"\t");
			  System.out.print(organisational.getStartDate()+"\t");
			  System.out.print(organisational.getEndDate() +"\t");


		}

	}
}
