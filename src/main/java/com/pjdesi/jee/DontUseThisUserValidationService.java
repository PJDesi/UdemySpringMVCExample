package com.pjdesi.jee;

public class DontUseThisUserValidationService {

	public boolean isUserValid(String user, String password) {
		if (user.equals("PJ") && password.equals("somePassword")) {
			return true;
		}
		return false;
	}
	
}
