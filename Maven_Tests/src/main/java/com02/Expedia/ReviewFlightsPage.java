package com02.Expedia;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReviewFlightsPage {
	public WebDriver driver;
	@FindBy(id="bookButton")
	WebElement continueBookingButton;
	
	public ReviewFlightsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnContinueBooking() {
		continueBookingButton.click();
	}
}
