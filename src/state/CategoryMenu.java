package state;
import event.*;
import java.util.Scanner;
import iterator.*;
public class CategoryMenu implements State {
	Menu menu;
	public CategoryMenu(Menu menu) {
		this.menu = menu;
	}

	@Override
	public void printMenu() {
		Scanner input = new Scanner(System.in);

		System.out.println("\n\n==============Event Management================\n\n"+
		"Select a Category to view.\n"+
		"1) Personal Events\n"+
		"2) Leisure Events\n"+
		"3) Organisation Events\n"
		+ "4) Main menu\n"
		+ "5) Log Out\n");


		int choice = input.nextInt();


		if(choice ==1) {
			PersonalMenu personalMenu = new PersonalMenu();
			PrintPersonalMenu printPersonal = new PrintPersonalMenu(personalMenu);
			printPersonal.printMenu();

			menu.setState(menu.getSingleMenu());
			menu.printMenu();
		}
		else if(choice ==2) {
			LeisureMenu leisureMenu = new LeisureMenu();
			PrintLeisureMenu printLeisureMenu = new PrintLeisureMenu(leisureMenu);
			printLeisureMenu.printMenu();


			menu.setState(menu.getSingleMenu());
			menu.printMenu();
		}
		else if(choice ==3) {
			OrganisationalMenu organisationalMenu = new OrganisationalMenu();
			PrintOrganisationMenu printOrganisationalMenu = new PrintOrganisationMenu(organisationalMenu);
			printOrganisationalMenu.printMenu();

			System.out.println("Leisure");
			menu.setState(menu.getSingleMenu());
			menu.printMenu();
		}
		else if(choice == 5) {

			menu.setState(menu.getMainMenu());
			menu.printMenu();
		}
		else if(choice ==5) {

			System.exit(0);
		}
		menu.setState(menu.getFollowupState());
		menu.printMenu();
	}

}
