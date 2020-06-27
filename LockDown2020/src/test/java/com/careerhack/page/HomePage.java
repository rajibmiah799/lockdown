package com.careerhack.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	

	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(linkText = "REGISTER")
	WebElement linkRegister;

	public void clickRegister() {
		linkRegister.click();
		// WebElement registerLink = driver.findElement(By.linkText("REGISTER"));
		// registerLink.click();
	}
}