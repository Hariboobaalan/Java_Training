package app;

import action.Action;
import action.LoginAction;
import action.LogoutAction;

public class Application {
	public static void main(String[] args) {
		Action action = (Action) new LoginAction();

		String result = action.execute("hari", "mypass");

		System.out.println(result);

		LogoutAction action2 = new LogoutAction();

		result = action2.execute("hari");
		System.out.println();

	}
}
