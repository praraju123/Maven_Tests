package com02.Expedia;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectFlightPage {
	public WebDriver driver;
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[10]/section[1]/div[1]/div[11]/ul[1]/li[1]/div[1]/div[1]/div[2]/div[1]/div[2]/button[1]")
	WebElement DepartSelectButton;
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[10]/section[1]/div[1]/div[11]/ul[1]/li[1]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]")
	WebElement SelectthisFareButton;
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[10]/section[1]/div[1]/div[11]/ul[1]/li[1]/div[1]/div[1]/div[2]/div[1]/div[2]/button[1]")
	WebElement ReturnSelectButton;
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[10]/section[1]/div[1]/div[11]/ul[1]/li[1]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]")
	WebElement SelectReturnFareButton;
	@FindBy(id="forcedChoiceNoThanks")
	WebElement NothanksButton;
	
	public SelectFlightPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnDeptSelect() {
		DepartSelectButton.click();
	}
	public void clickOnSelectFare() {
		SelectthisFareButton.click();
	}
	public void clickOnReturnSelect() {
		ReturnSelectButton.click();
	}
	public void clickOnRetnSelectFare() {
		SelectReturnFareButton.click();
	}
	public void clickOnNoThanks() {
		NothanksButton.click();
	}
}
