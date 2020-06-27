package com.careerhack.stepdef;

import org.testng.Assert;

import com.careerhack.common.FlightBase;
import com.careerhack.page.HomePage;
import com.careerhack.page.RegisterPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserRegistration extends FlightBase {

	HomePage Hp;
	RegisterPage rp;

	@Given("^I am on user registration homepage$")
	public void i_am_on_user_registration_homepage() {
		getDriver();
		driver.get("http://newtours.demoaut.com");
	}

	@When("^I click on user register link$")
	public void i_click_on_user_register_link() {
		Hp = new HomePage(driver);
		Hp.clickRegister();
	}

	@When("^I enter \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_enter(String firstname, String lastname, String phone, String email, String username, String password,
			String confirmpassword) {

		rp = new RegisterPage(driver);
		rp.enterFirstName(firstname);
		rp.enterLastName(lastname);
		rp.enterPhone(phone);
		rp.entereEmail(email);
		rp.enterUsername(username);
		rp.enterPassword(password);
		rp.enterConfirmpassword(confirmpassword);

	}

	@When("^I click on submit buttom$")
	public void i_click_on_submit_buttom() {
		rp.clicksubmit();
	}

	@Then("^I find registration successfull page$")
	public void i_find_registration_successfull_page() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "Register: Mercury Tours");
		driver.close();

	}
}
