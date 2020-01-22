package com02.Expedia_Testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com02.Expedia.HomePage_Expedia;
import com02.Expedia.PassengerInfoPage;
import com02.Expedia.ReviewFlightsPage;
import com02.Expedia.SelectFlightPage;


public class HomepageTest {
public WebDriver driver;
@BeforeMethod
public void beforeMethod() { 
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\15717\\eclipse-workspace\\SeleniumConcept\\Drivers\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.navigate().to("https://www.expedia.com/");
}

/*@Test(priority=1)
public void flights() {
	HomePage_Expedia ui=new HomePage_Expedia(driver);
	ui.FlightsLink();
	ui.enterFlyTo("Washington");
	ui.enterFlyfrom("London");
	ui.ClickDeparture();
	ui.chooseDeptDate();
	ui.ClickReturning();
	ui.chooseReturnDate();
	//ui.clickTravelers();
	ui.clickSearch();
	
}*/

@Test(priority=2)
public void selectFlights() {
	HomePage_Expedia ui=new HomePage_Expedia(driver);
	ui.FlightsLink();
	ui.enterFlyTo("Washington");
	ui.enterFlyfrom("London");
	ui.ClickDeparture();
	ui.chooseDeptDate();
	ui.ClickReturning();
	ui.chooseReturnDate();
	//ui.clickTravelers();
	ui.clickSearch();
	
	SelectFlightPage uu=new SelectFlightPage(driver);
	uu.clickOnDeptSelect();
	uu.clickOnSelectFare();
	uu.clickOnReturnSelect();
	uu.clickOnRetnSelectFare();
	uu.clickOnNoThanks();
	
	ReviewFlightsPage ur=new ReviewFlightsPage(driver);
	ur.clickOnContinueBooking();

	PassengerInfoPage up=new PassengerInfoPage(driver);
	up.EnterfirstName("Raju");
	up.EnterlastName("Prajapati");
	up.clickOnChooseseats();
}
@AfterMethod
public void afterMethod() {
	//driver.close();
}
}