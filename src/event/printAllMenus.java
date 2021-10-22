package event;
import iterator.*;
public class printAllMenus {


		public void printPersonalMenu() {
			PersonalMenu personalMenu = new PersonalMenu();
			PrintPersonalMenu printPersonalMenu = new PrintPersonalMenu(personalMenu);
			printPersonalMenu.printMenu();
		}

		public void printLeisureMenu() {
			LeisureMenu leisureMenu = new LeisureMenu();
			PrintLeisureMenu printLeisureMenu = new PrintLeisureMenu(leisureMenu);
			printLeisureMenu.printMenu();
		}
		public void printOrganisationalMenu() {
			OrganisationalMenu organisationalMenu = new OrganisationalMenu();
			PrintOrganisationMenu printOrganisationalMenu = new PrintOrganisationMenu(organisationalMenu);
			printOrganisationalMenu.printMenu();
		}


}
