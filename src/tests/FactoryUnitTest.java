package tests;

import event.PrintLeisureMenu;
import factory.Event;
import iterator.LeisureMenu;

public class FactoryUnitTest extends Event{
	public static void main(String [] args) {
		LeisureMenu leisureMenu = new LeisureMenu(); 
		PrintLeisureMenu menu= new PrintLeisureMenu(leisureMenu);
		menu.printMenu();
		
	}
}
