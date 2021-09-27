package com.utest.qvision.steps;

import com.utest.qvision.pages.PersonalInformationPage;

import net.thucydides.core.annotations.Step;

public class PersonalInformationStep {
	PersonalInformationPage personalInformationPage  = new PersonalInformationPage();

	@Step
	public boolean verificarPagina() {
		return personalInformationPage.verificarPagina();
	}

	@Step
	public void setTextFirstName(String name) {
		personalInformationPage.setTextFirstName(name);
	}
	
	@Step
	public void setTextLastName(String lastName) {
		personalInformationPage.setTextLastName(lastName);
	}

	@Step
	public void setTextEmail(String email) {
		personalInformationPage.setTextEmail(email);
	}
	
	@Step
	public void selectMonthF() {
		personalInformationPage.selectMonthF();
	}

	@Step
	public void selectDayF() {
		personalInformationPage.selectDayF();
	}
	
	@Step
	public void selectYearF() {
		personalInformationPage.selectYearF();
	}
	
	@Step
	public void clickNextLocation () {
		personalInformationPage.clickNextLocation();
	}
	
	
}
