package services;

import component.UserComponent;
import component.UserComponentImpl;

public class LoginServiceImpl implements LoginService {
	private static LoginServiceImpl userser;

	public static LoginServiceImpl getLoginServiceImplObject() {
		if (userser == null) {
			userser = new LoginServiceImpl();
			return userser;
		} else {
			return userser.createClone();
		}
	}

	private LoginServiceImpl createClone() {
		if (userser != null) {
			try {
				return (LoginServiceImpl) super.clone();
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
		} else {
			return null;
		}
	}

	private LoginServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String login(String uname, String upass) {
		UserComponent usercom = UserComponentImpl.getUserComponentImplObject();

		if (usercom.checkUser(uname, upass)) {
			if (usercom.checkFlag(uname)) {
				usercom.updateFlag(uname, 1);
				return "welcome";
			} else {
				return "alreadylogedin";
			}
		} else {
			return "signup";
		}
	}
}