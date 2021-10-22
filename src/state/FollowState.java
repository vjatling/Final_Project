package state;

import java.util.Scanner;

public class FollowState implements State {

	Menu menu;
	public FollowState(Menu menu) {
		this.menu = menu;
	}

	@Override
	public void printMenu() {
		Scanner input = new Scanner(System.in);

		System.out.println("\n\n==============Event Management================\n\n"+
		"What do you want to do next\n"+
		"1) Main Menu\n"+
		"2) Log out\n");


		int choice = input.nextInt();


		if(choice ==1) {
			System.out.println("Menu for personal");
			menu.setState(menu.getMainMenu());
			menu.printMenu();

		}
		else if(choice ==2) {

			System.out.println("System.logout");
			System.exit(0);
		}
	}

}
