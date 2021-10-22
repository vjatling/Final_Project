package state;
import java.util.*;
public class MainMenu implements State {
	Menu menu;
	public MainMenu(Menu menu) {
		this.menu = menu;
	}
	@Override
	public void printMenu() {
		Scanner input = new Scanner(System.in);

		System.out.println("\n\n==============Event ManageMent System================\n\n"+
		"Choose from the menu below.\n"+
		"1) View categories\n"+
		"2) View all Events\n"+
		"3) Log Out\n");


		int choice = input.nextInt();


		if(choice ==1) {

			menu.setState(menu.getCategoryMenu());
			menu.printMenu();
		}
		else if( choice == 2) {
			menu.setState(menu.getAllEvents());
			menu.printMenu();
		}
		else if( choice == 3 ) {
			System.exit(0);
		}

	}

}
