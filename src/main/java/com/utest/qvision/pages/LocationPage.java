package com.utest.qvision.pages;

import org.openqa.selenium.By;

import com.utest.qvision.actions.Action;

import net.thucydides.core.pages.PageObject;

public class LocationPage extends PageObject{

	By InputCity	 = By.xpath("//input[@id='city']");
	By verifyLabel = By.xpath("//input[@name='city']//following::span[2]");
	By InputPostalCode	 = By.xpath("//input[@id='zip']");
	By InputCountry	 	= By.xpath("//div[@name='countryId']");
	By InputCountryText	 	= By.xpath("(//input[@type='search'])[position()=2]");
	
	By BotonNextDevices	 = By.xpath("//a[@class='btn btn-blue pull-right']");

	Action action = new Action();


	public boolean verifyPage() {
		if (action.esperarObjetoDisponible(getDriver(), InputCity)) {
			return true;
		}else {
			return false;
		}
	}

	public void verifyValueCity(String name) {
		if(action.esperarObjetoDisponible(getDriver(), verifyLabel)){
			getDriver().findElement(BotonNextDevices).click();
		}else {
			getDriver().findElement(InputCity).sendKeys(name);
			action.seleccionarObjetoComboAbajo();
			getDriver().findElement(InputPostalCode).sendKeys("110101");
			getDriver().findElement(InputCountry).click();
			if (action.esperarObjetoDisponible(getDriver(), InputCountryText)) {
				getDriver().findElement(InputCountryText).sendKeys("Colombi");	
			}
			action.seleccionarObjetoComboAbajo();
			getDriver().findElement(BotonNextDevices).click();
		}
	}
	
	

}
