package com02.Expedia;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PassengerInfoPage {
	public WebDriver driver;
	@FindBy(id="firstname[0]")
	WebElement firstNameField;
	@FindBy(id="lastname[0]")
	WebElement lastNameField;
	@FindBy(id="seat-map-button")
	WebElement chooseSeatButton;
	
	public PassengerInfoPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void EnterfirstName(String fst) {
		firstNameField.sendKeys(fst);
	}
	public void EnterlastName(String lst) {
		lastNameField.sendKeys(lst);
	}
	public void clickOnChooseseats() {
		chooseSeatButton.click();
	}
}
