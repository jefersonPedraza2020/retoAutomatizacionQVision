package com.utest.qvision.steps;

import com.utest.qvision.pages.PasswordPage;

public class PasswordStep {
	PasswordPage passwordPage = new PasswordPage();
	
	public boolean verifyPage() {
		return passwordPage.verifyPage();
	}
	
	public void setPassw(String pass) {
		passwordPage.setPassw(pass);
	}
}
