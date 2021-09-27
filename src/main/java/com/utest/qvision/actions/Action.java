package com.utest.qvision.actions;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Action {


	public  boolean esperarObjetoDisponible(WebDriver driver,By objeto) {
		try {
			// Instanciamos la variable de tipo WebDriverWait para gestionar la espera explícita
			WebDriverWait wait = new WebDriverWait(driver,20);
			// Usamos la espera explícita bajo una condiciones esperada, en este caso esperamos hasta que el elemento sea clicable
			wait.until(ExpectedConditions.elementToBeClickable(objeto));
			return true;

		} catch (Exception e) {
			return false;
		}
	}




	public  boolean seleccionarObjetoCombo(WebDriver driver,String valor) {
		try {
			By element =  By.xpath("//option[contains(text(),'"+valor+"')]");
			if(esperarObjetoDisponible(driver, element)) {
				driver.findElement(element).click();
				return true;
			}

		} catch (Exception e) {
			return false;
		}
		return false;
	}
	
	
	public void seleccionarObjetoComboAbajo() {
		try {
			Robot robot = new Robot();
			Thread.sleep(3000);
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(1000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}


}
