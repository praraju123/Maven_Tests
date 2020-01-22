package com02.Expedia;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_Expedia {
	public WebDriver driver;
	@FindBy(id="primary-header-flight")
	WebElement FlightButton;
	@FindBy(id="flight-origin-flp")
	WebElement FlyToField;	
	@FindBy(id="flight-destination-flp")
	WebElement FlyFromField;
	@FindBy(xpath="//*[@class='text datepicker-trigger-input gcw-start-date gcw-update-date-range gcw-storeable gcw-required gcw-valid-date']")
	WebElement DepartureLink;
	@FindBy(xpath="(//*[@class='datepicker-cal-date'])[24]")
	WebElement DepartureDate;
	@FindBy(xpath="//*[@class='text datepicker-trigger-input gcw-end-date gcw-update-date-range gcw-storeable gcw-required gcw-valid-date']")
	WebElement ReturnLink;
	@FindBy(xpath="//*[@data-day='22']")
	WebElement ReturnDate;
	//@FindBy(xpath="//*[@class='trigger-utility menu-trigger btn-utility btn-secondary dropdown-toggle theme-standard pin-left menu-arrow gcw-component gcw-traveler-amount-select gcw-component-initialized']")
	//WebElement TravelerLink;
	@FindBy(xpath="//*[@class='btn-primary btn-action gcw-submit']")
	WebElement SearchButton;
	
	public HomePage_Expedia(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void FlightsLink() {
		FlightButton.click();
	}
	
	public void enterFlyTo(String FlyT) {
		FlyToField.sendKeys(FlyT);
	}
	public void enterFlyfrom(String FlyF) {
		FlyFromField.sendKeys(FlyF);
	}
	public void ClickDeparture() {
		DepartureLink.click();
	}
	public void chooseDeptDate() {
		DepartureDate.click();
	}
	public void ClickReturning() {
		ReturnLink.click();
	}
	public void chooseReturnDate() {
		ReturnDate.click();
	}
	/*public void clickTravelers() {
		TravelerLink.click();
	}*/
	public void clickSearch() {
		SearchButton.click();
	}
	
}
