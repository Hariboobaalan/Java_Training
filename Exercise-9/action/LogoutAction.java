package action;

import services.LogoutserviceImpl2;

public class LogoutAction {
	public String execute(String uname) {
		LogoutserviceImpl2 ls = LogoutserviceImpl2.getLoginServiceImplObject();
		String result = ls.logout(uname);
		return result;
	}
}
