package action;

import services.LoginService;
import services.LoginServiceImpl;

public class LoginAction extends Action {
	@Override
	public String execute(String uname, String upass) {
		// TODO Auto-generated method stub
		LoginService ls = LoginServiceImpl.getLoginServiceImplObject();
		String result = ls.login(uname, upass);
		return result;
	}
}
