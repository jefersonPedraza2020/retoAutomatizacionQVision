package com.utest.qvision.pages;

import org.openqa.selenium.By;

import com.utest.qvision.actions.Action;

import net.thucydides.core.pages.PageObject;

public class PasswordPage  extends PageObject{

	By InputPassword				 = By.xpath("//input[@name='password']");
	By InputConfirmPassword			 = By.xpath("//input[@name='confirmPassword']");
	By spanAccept1					= By.xpath("(//span[@class='checkmark signup-consent__checkbox error'])[position()=1]");
	By spanAccept2					= By.xpath("(//span[@class='checkmark signup-consent__checkbox error'])[position()=2]");
	By botonCompleteSetup			 = By.xpath("//a[@class='btn btn-blue']");

	
	Action action = new Action();


	public boolean verifyPage() {
		if (action.esperarObjetoDisponible(getDriver(), InputPassword)) {
			return true;
		}else {
			return false;
		}
	}

	public void setPassw(String pass) {
		if (action.esperarObjetoDisponible(getDriver(), InputPassword)) {
			getDriver().findElement(InputPassword).sendKeys(pass);
		}
		if (action.esperarObjetoDisponible(getDriver(), InputConfirmPassword)) {
			getDriver().findElement(InputConfirmPassword).sendKeys(pass);
		}
		
		if (action.esperarObjetoDisponible(getDriver(), spanAccept1)) {
			getDriver().findElement(spanAccept1).click();
		}
		if (action.esperarObjetoDisponible(getDriver(), spanAccept1)) {
			getDriver().findElement(spanAccept1).click();
		}
		getDriver().findElement(botonCompleteSetup).click();
		
		System.out.println("paso");
	}
}
