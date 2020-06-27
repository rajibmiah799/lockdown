package com.careerhack.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {
	
	

	public RegisterPage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(name="firstName")
	WebElement editFirstName;
	
	public void enterFirstName(String firstname) {
		editFirstName.sendKeys(firstname);
	}
	@FindBy(xpath ="//input[@name='lastName']")
	WebElement editLastName;
	
	public void enterLastName(String lastname) {
		editLastName.sendKeys(lastname);
	}
	@FindBy(css="input[name='phone']")
	WebElement editPhone;
	
	public void enterPhone(String phone) {
		editPhone.sendKeys(phone);
	}
	@FindBy(xpath="//input[@id='userName']")
	WebElement editEmail;
	
	public void entereEmail(String email) {
		editEmail.sendKeys(email);		
	}
	@FindBy(css="input[id='email']")
	WebElement editUsername;
	
	public void enterUsername(String username) {
		editUsername.sendKeys(username);		
	}
	@FindBy(xpath="//input[@name='password']")
	WebElement editPassword;
	
	public void enterPassword(String password) {
		editPassword.sendKeys(password);		
	}
	@FindBy(xpath="//input[@name='confirmPassword']")
	WebElement editConfirmpassword;
	
	public void enterConfirmpassword(String confirmpassword) {
		editConfirmpassword.sendKeys(confirmpassword);
	}
	@FindBy(xpath= "//input[@name='register']")
	WebElement Submitlink;
	
	public void clicksubmit() {
		Submitlink.click();
	}
	
	
}
