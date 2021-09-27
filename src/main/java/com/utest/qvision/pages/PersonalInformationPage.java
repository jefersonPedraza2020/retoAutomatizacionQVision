package com.utest.qvision.pages;

import org.openqa.selenium.By;

import com.utest.qvision.actions.Action;

import net.serenitybdd.core.pages.PageObject;

public class PersonalInformationPage extends PageObject {
	By inputFirstName = By.xpath("//input[@id='firstName']");
	By inputLastName = By.xpath("//input[@id='lastName']");
	By inputEmail = By.xpath("//input[@id='email']");
	By selectMonth = By.xpath("//select[@id='birthMonth']");
	By selectDay = By.xpath("//select[@id='birthDay']");
	By selectYear = By.xpath("//select[@id='birthYear']");
	By botonNextLocation = By.xpath("//a[@class='btn btn-blue']");

	Action action = new Action();
	
	public boolean verificarPagina() {
		if (action.esperarObjetoDisponible(getDriver(), inputFirstName)) {
			return true;
		}else {
			return false;
		}
	}
	
	
	public void setTextFirstName(String name) {
		if (action.esperarObjetoDisponible(getDriver(), inputFirstName)) {
			getDriver().findElement(inputFirstName).sendKeys(name);
		}
	}

	public void setTextLastName(String lastName) {
		if (action.esperarObjetoDisponible(getDriver(), inputLastName)) {
			getDriver().findElement(inputLastName).sendKeys(lastName);
		}
	}

	public void setTextEmail(String email) {
		if (action.esperarObjetoDisponible(getDriver(), inputEmail)) {
			getDriver().findElement(inputEmail).sendKeys(email);
		}
	}

	public void selectMonthF() {
		if (action.esperarObjetoDisponible(getDriver(), selectMonth)) {
			getDriver().findElement(selectMonth).click();
			action.seleccionarObjetoCombo(getDriver(), "January");
		}
	}

	public void selectDayF() {
		if (action.esperarObjetoDisponible(getDriver(), selectDay)) {
			getDriver().findElement(selectDay).click();
			action.seleccionarObjetoCombo(getDriver(), "1");
		}
	}

	public void selectYearF() {
		if (action.esperarObjetoDisponible(getDriver(), selectYear)) {
			getDriver().findElement(selectYear).click();
			action.seleccionarObjetoCombo(getDriver(), "1997");
		}
	}


	public void clickNextLocation () {
		if (action.esperarObjetoDisponible(getDriver(), botonNextLocation)) {
			getDriver().findElement(botonNextLocation).click();
		}
	}
}
