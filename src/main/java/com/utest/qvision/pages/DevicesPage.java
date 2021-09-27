package com.utest.qvision.pages;

import org.openqa.selenium.By;

import com.utest.qvision.actions.Action;

import net.thucydides.core.pages.PageObject;

public class DevicesPage extends PageObject{

	By DivComputer		 = By.xpath("(//div[@class='ui-select-box'])[position()=1]");
	By DivVersion		 = By.xpath("(//div[@class='ui-select-box'])[position()=2]");
	By DivLenguage		 = By.xpath("(//div[@class='ui-select-box'])[position()=3]");
	By SelectMobile		 = By.xpath("(//div[@class='ui-select-box'])[position()=4]");
	By InputMobile		 = By.xpath("(//input[@type='search'])[position()=4]");
	By SelectModel	     = By.xpath("(//div[@class='ui-select-box'])[position()=5]");
	By InputModel		 = By.xpath("(//input[@type='search'])[position()=5]");
	By SelectSystemMobile = By.xpath("(//div[@class='ui-select-box'])[position()=6]");
	By InputSystemMobile	= By.xpath("(//input[@type='search'])[position()=6]");
	By BotonNextStep     = By.xpath("//a[@class='btn btn-blue pull-right']");

	Action action = new Action();


	public boolean verifyPage() {
		if (action.esperarObjetoDisponible(getDriver(), DivComputer)) {
			return true;
		}else {
			return false;
		}
	}

	public void verifyValueDevices() {
		
		getDriver().findElement(SelectMobile).click();
		if (action.esperarObjetoDisponible(getDriver(), InputMobile)) {
			getDriver().findElement(InputMobile).sendKeys("Apple");
		}
		action.seleccionarObjetoComboAbajo();
		getDriver().findElement(SelectModel).click();
		if (action.esperarObjetoDisponible(getDriver(), InputModel)) {
			getDriver().findElement(InputModel).sendKeys("iPhone 7");
		}
		action.seleccionarObjetoComboAbajo();
		getDriver().findElement(SelectSystemMobile).click();
		if (action.esperarObjetoDisponible(getDriver(), InputSystemMobile)) {
			getDriver().findElement(InputSystemMobile).sendKeys("iOS 15");
		}
		action.seleccionarObjetoComboAbajo();
		getDriver().findElement(BotonNextStep).click();
		
	}

}
