package state;
import event.*;
import java.util.*;
public class AllEvents implements State {
	Menu menu;
	public AllEvents(Menu menu) {
		this.menu = menu;
	}


	@Override
	public void printMenu() {
		printAllMenus printAll = new printAllMenus();
		printAll.printLeisureMenu();
		System.out.print("\n\n");
		printAll.printPersonalMenu();;
		System.out.print("\n\n");
		printAll.printOrganisationalMenu();

		Scanner usrInpt = new Scanner(System.in);

		System.out.print("\n\n\nWhat would you like to do next?\n"+
		"1) Main Menu\n"+
		"2) Logout\n");

		int followUpCommand = usrInpt.nextInt();

		if (followUpCommand==1) {
			menu.setState(menu.getMainMenu());
		}
		else if (followUpCommand==1) {
			System.exit(0);
		}
	}

}
