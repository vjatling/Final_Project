package state;

public class Menu {

	State mainMenu;
	State categoryMenu;
	State singleMenu;
	State followupState;
	State allEvents;
	State state;
	public Menu() {
		mainMenu = new MainMenu(this);
		categoryMenu = new CategoryMenu(this);
		singleMenu = new SingleMenu(this);
		followupState = new FollowState(this);
		allEvents = new AllEvents(this);
		state = mainMenu;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	public State getMainMenu() {
		return mainMenu;
	}
	public State getCategoryMenu() {
		return categoryMenu;
	}
	public State getSingleMenu() {
		return singleMenu;
	}
	public State getFollowupState() {
		return followupState;
	}
	public State getAllEvents() {
		return allEvents;
	}
	public void printMenu() {
		state.printMenu();
	}

}
