package services;

import component.UserComponent;
import component.UserComponentImpl;

public class LogoutserviceImpl2 implements LogoutService {
	private static LogoutserviceImpl2 userser;

	public static LogoutserviceImpl2 getLoginServiceImplObject() {
		if (userser == null) {
			userser = new LogoutserviceImpl2();
			return userser;
		} else {
			return userser.createClone();
		}
	}

	private LogoutserviceImpl2 createClone() {
		if (userser != null) {
			try {
				return (LogoutserviceImpl2) super.clone();
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
		} else {
			return null;
		}
	}

	private LogoutserviceImpl2() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String logout(String uname) {
		UserComponent usercom = UserComponentImpl.getUserComponentImplObject();

		int n = usercom.updateFlag(uname, 0);
		return "logoutsuccess";
	}
}