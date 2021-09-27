package com.utest.qvision.steps;

import com.utest.qvision.pages.LocationPage;

import net.thucydides.core.annotations.Step;

public class LocationStep {

	LocationPage locationPage = new LocationPage();
	@Step
	public boolean verifyPage() { 
		return locationPage.verifyPage();
	}
	
	@Step
	public void verifyValueCity(String name) {
		locationPage.verifyValueCity(name);
	}
}
