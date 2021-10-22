package event;
import iterator.*;
import factory.*;
public class PrintPersonalMenu {
	PersonalMenu personalMenu;


	public PrintPersonalMenu(PersonalMenu personalMenu) {
		this.personalMenu = personalMenu;
	}

	public void printMenu() {
		Iterator iterMenu = personalMenu.createIterator();
		printMenu(iterMenu);
	}

	private void printMenu(Iterator iterator) {
		System.out.println("\n\n==========Personal Event Listing=============\n\n");


		while(iterator.hasNext()){
			  PersonalEvent personal = (PersonalEvent) iterator.next();

			  System.out.print(personal.getEventName() + "\t");
			  System.out.print(personal.getDescription() +"\t");
			  System.out.print(personal.getVenue() +"\t");
			  System.out.print(personal.getCity()+"\t");
			  System.out.print(personal.getStartDate()+"\t");
			  System.out.print(personal.getEndDate() +"\t");


		}

	}
}
