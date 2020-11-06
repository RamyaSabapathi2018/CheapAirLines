package org.cheapair.logic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.cheapair.base.OtherSupportClass;
import org.cheapair.base.SupportClass;
import org.cheapair.base.WebElementSupportClass;
import org.cheapair.pojo.ConfirmationPOJO;
import org.cheapair.pojo.FlightPaymentPOJO;
import org.cheapair.pojo.SearchFlightPOJO;
import org.cheapair.pojo.SearchResultPOJO;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CheapAir {
	WebDriver driver;
	SearchFlightPOJO searchPOJO;
	SearchResultPOJO searchResultPOJO;
	FlightPaymentPOJO paymentPOJO;
	ConfirmationPOJO confirmPOJO;
	OtherSupportClass otherSupport= new OtherSupportClass();
	WebElementSupportClass webSupport= new WebElementSupportClass();
	String checkinDateEntered;
	SupportClass sc= new SupportClass();

	@Given("User is in CheapAir Landing Page")
	public void user_is_in_CheapAir_Landing_Page() throws Exception {
		driver = sc.launchChromeBrowser();
		sc.launchURL("https://www.cheapair.com/");
		
	}

	@When("User enter the travel details {string}")
	public void user_select_enter_the_travel_details(String dest) {
		searchPOJO = new SearchFlightPOJO();
		webSupport.clickButton(searchPOJO.getBtnOneway());
		webSupport.insertValue(searchPOJO.getDest(), dest);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("dates"))));
		WebElement dateVal = sc.findLocators("dates", "id");
		//WebElement dateVal = driver.findElement(By.id("dates"));
		dateVal.click();
		checkinDateEntered = webSupport.fetchText(dateVal);
		
		webSupport.clickButton(searchPOJO.getCheckInDate());
		webSupport.clickButton(searchPOJO.getBtnSearch());
		
	
	}

	@Then("User is in Search Page")
	public void user_is_in_Search_Page() {
		searchResultPOJO = new SearchResultPOJO();
		String parentWindow = driver.getWindowHandle();
		Set<String> allWindow = driver.getWindowHandles();
		for(String childWindow:allWindow) {
			if (!(parentWindow.equals(childWindow))) {
				driver.switchTo().window(childWindow);
			}
		}
			
		webSupport.clickButton(searchResultPOJO.getPopUP());
		user_sort_the_price_in_ascending_order();
	WebDriverWait wait = new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.visibilityOf(searchResultPOJO.getPrice()));
		webSupport.clickButton(searchResultPOJO.getPrice());
		
		webSupport.clickButton(searchResultPOJO.getBtnContinue());
				
		
		
	}
	
	
	public void user_sort_the_price_in_ascending_order() {
		List<Double> allPrice = new ArrayList();
		List<WebElement> prices = sc.findAllLocators("//span[@class='fltrt-opt-fares-amount']", "xpath");
		for(int i=0;i<prices.size();i++) {
			allPrice.add(Double.parseDouble(webSupport.fetchAttribute(prices.get(i), "data-fare-amount")));
		//	allPrice.add(Double.parseDouble(prices.get(i).getAttribute("data-fare-amount")));
		}
		Collections.sort(allPrice,new Comparator<Double>() {

			public int compare(Double o1, Double o2) {
				return o1.compareTo(o2);
			}
			
		});
		System.out.println("Sorted Price"+allPrice);
	   
	}

	@Then("User enter the payment credit card details {string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_enter_the_payment_details(String firstname, String lastname, String gender, String dateMonth, String date, String dateyear, String creditcard, String cardExpiryMonth, String cardExpiryYear, String cvv, String holderName, String country, String address, String city, String state, String zip, String phone, String email, String pwd, String confirmpwd) {
		paymentPOJO = new FlightPaymentPOJO();
		webSupport.insertValue(paymentPOJO.getFirstName(), firstname);
		webSupport.insertValue(paymentPOJO.getLastName(), lastname);
		otherSupport.selectDropDown(paymentPOJO.getGender(), gender, 1);
		otherSupport.selectDropDown(paymentPOJO.getDobMonth(), dateMonth, 2);
		webSupport.insertValue(paymentPOJO.getDobDate(), date);
		webSupport.insertValue(paymentPOJO.getDobYear(), dateyear);
		webSupport.insertValue(paymentPOJO.getCreditCardNum(), creditcard);
		otherSupport.selectDropDown(paymentPOJO.getExpiryMonth(), cardExpiryMonth, 1);
		otherSupport.selectDropDown(paymentPOJO.getExpiryYear(), cardExpiryYear, 1);
		webSupport.insertValue(paymentPOJO.getCVV(), cvv);
		webSupport.insertValue(paymentPOJO.getHolderName(), holderName);
		otherSupport.selectDropDown(paymentPOJO.getCountry(), country, 1);
		webSupport.insertValue(paymentPOJO.getAddress(), address);
		webSupport.insertValue(paymentPOJO.getCity(), city);
		webSupport.insertValue(paymentPOJO.getPhone(), phone);
		webSupport.insertValue(paymentPOJO.getEmail(), email);
		webSupport.clickButton(paymentPOJO.getBtnClick());
		webSupport.clickButton(paymentPOJO.getBtnPopOk());
		}

	
	@Then("User take screenshot of booking")
	public void user_take_screenshot_of_booking()throws IOException, Exception {
		confirmPOJO = new ConfirmationPOJO();
		String fileName="ConfirmPage";
		System.out.println("Selected Date------->"+checkinDateEntered);
		webSupport.clickButton(confirmPOJO.getBtnThanks());
		Thread.sleep(3000);
		sc.toTakeScreenShot("chaepAir_Screenshot");
		
		
	}
		@Then("User close the browser")
	public void user_close_the_browser() {
	   driver.quit();
	}
}
