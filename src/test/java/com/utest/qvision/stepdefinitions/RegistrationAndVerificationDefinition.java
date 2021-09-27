package com.utest.qvision.stepdefinitions;

import com.utest.qvision.actions.Action;
import com.utest.qvision.pages.DevicesPage;
import com.utest.qvision.pages.LocationPage;
import com.utest.qvision.pages.PersonalInformationPage;
import com.utest.qvision.steps.DevicesStep;
import com.utest.qvision.steps.HomeStep;
import com.utest.qvision.steps.LocationStep;
import com.utest.qvision.steps.PasswordStep;
import com.utest.qvision.steps.PersonalInformationStep;
import com.utest.qvision.utilities.Utility;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import net.thucydides.core.annotations.Steps;

public class RegistrationAndVerificationDefinition {
	@Steps
	HomeStep homeStep;
	@Steps
	PersonalInformationStep personalInformationStep;
	@Steps
	LocationStep locationPage;
	@Steps
	DevicesStep devicesPage;
	@Steps
	PasswordStep passwordStep;

	Utility utility = new Utility();
	String name,lastName,email,passw;

	@Given("^We enter the page utest$")
	public void we_enter_the_page_utest() {

		homeStep.openHomePage();
	}


	@Given("^We select the button JoinToday$")
	public void we_select_the_button_JoinToday() {
		homeStep.clickJoinToday();
	}

	@When("^we verify that we are on the personal information page$")
	public void we_verify_that_we_are_on_the_personal_information_page() {
		boolean bandera = personalInformationStep.verificarPagina();
		Assert.assertEquals(true, bandera);
	}

	@When("^Register the data of the personal information page$")
	public void register_the_data_of_the_personal_information_page(DataTable infoData) {
		name = infoData.raw().get(0).get(0).toString();
		lastName = infoData.raw().get(0).get(1).toString();
		email = name+"."+lastName+utility.generarNumeroRandom(3).toString()+"@gmail.com";
		personalInformationStep.setTextFirstName(name);
		personalInformationStep.setTextLastName(lastName);
		personalInformationStep.setTextEmail(email);
		personalInformationStep.selectMonthF();
		personalInformationStep.selectDayF();
		personalInformationStep.selectYearF();
		personalInformationStep.clickNextLocation();

	}

	@When("^we verify that we are on the Location  page$")
	public void we_verify_that_we_are_on_the_Location_page() {
		try {
			boolean bandera = locationPage.verifyPage();
			Assert.assertEquals(true, bandera);
		} catch (Exception e) {
			System.out.println("No se logra llegar a la pagina de localización");
		}

	}

	@When("^Register the data of the Location page$")
	public void register_the_data_of_the_Location_page(DataTable infoData) {
		locationPage.verifyValueCity(infoData.raw().get(0).get(0).toString());
	}

	@When("^we verify that we are on the devices  page$")
	public void we_verify_that_we_are_on_the_devices_page() {
		try {
			boolean bandera = devicesPage.verifyPage();
			Assert.assertEquals(true, bandera);
		} catch (Exception e) {
			System.out.println("No se logra llegar a la pagina de dispostivos");
		}

	}

	@When("^Register the data of the devices page$")
	public void register_the_data_of_the_devices_page() {
		devicesPage.verifyValueDevices();
	}

	@When("^we verify that we are on the Password page$")
	public void we_verify_that_we_are_on_the_Password_page() {
		try {
			boolean bandera = passwordStep.verifyPage();
			Assert.assertEquals(true, bandera);
		}catch (Exception e) {
			System.out.println("No se logra llegar a la pagina de claves");
		}
	}

	@When("^Register the data of the Password page$")
	public void register_the_data_of_the_Password_page() {
		passw = name+utility.generarNumeroRandom(3)+"@"+lastName+utility.generarNumeroRandom(3);

		passwordStep.setPassw(passw);
	}

	@When("^I verify that it is on the home page$")
	public void i_verify_that_it_is_on_the_home_page() {
		homeStep.validateUser(email, passw);
	}

}
