package com.utest.qvision.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.utest.qvision.actions.Action;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.utest.com/")
public class HomePage extends PageObject{
	WebDriver driver;
	By botonJoinToday = By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']");
	By botonLogIn	 = By.xpath("(//a[contains(text(),'Log In')])[position()=1]");
	By inputEmail = By.xpath("//input[@id='username']");
	By inputPass = By.xpath("//input[@id='password']");
	By botonSingIn = By.xpath("//button[@id='kc-login']");
	
	Action action = new Action();
	
	public void maximiseScreen() {
	    getDriver().manage().window().maximize();
	}
	
	public void clickJoinToday() {

		if(action.esperarObjetoDisponible(getDriver(), botonJoinToday)) {
			getDriver().findElement(botonJoinToday).click();
		}
	}
	
	public void validateUser(String email, String passw) {
		if(action.esperarObjetoDisponible(getDriver(), botonLogIn)) {
			getDriver().findElement(botonLogIn).click();
			
			if(action.esperarObjetoDisponible(getDriver(), inputEmail)) {
				getDriver().findElement(inputEmail).sendKeys(email);
				getDriver().findElement(inputPass).sendKeys(passw);
				getDriver().findElement(botonSingIn).click();
				
				
			}
		}
	}

}
