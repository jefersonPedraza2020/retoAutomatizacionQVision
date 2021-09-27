package com.utest.qvision.steps;

import com.utest.qvision.pages.HomePage;

import net.thucydides.core.annotations.Step;

public class HomeStep {
	
	HomePage homePage = new HomePage();
	
	@Step
	public void openHomePage() { 
		homePage.open();
		homePage.maximiseScreen();
	}
	
	@Step
	public void clickJoinToday() { 
		homePage.clickJoinToday();
	}
	@Step
	public void validateUser(String email, String passw) {
		homePage.validateUser(email, passw);
	}
	
	
}
