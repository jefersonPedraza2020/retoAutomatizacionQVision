package com.utest.qvision.steps;

import com.utest.qvision.pages.DevicesPage;
import com.utest.qvision.pages.HomePage;

import net.thucydides.core.annotations.Step;

public class DevicesStep {
	DevicesPage devicePage = new DevicesPage();

	public boolean verifyPage() {
		return devicePage.verifyPage();
	}
	
	public void verifyValueDevices() {
		devicePage.verifyValueDevices();
	}
	
}
