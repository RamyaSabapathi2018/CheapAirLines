package org.cheapair.pojo;

import org.cheapair.base.SupportClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchFlightPOJO extends SupportClass {
	public SearchFlightPOJO() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//span[@class='tgl-btn'])[2]")
	private WebElement btnOneway;
	@FindBy(id = "to1")
	private WebElement dest;
	@FindBy(xpath = "(//*[contains(text(),'15')])[2]")
	private WebElement checkInDate;
	@FindBy(xpath = "//button[@class='btn large block']")
	private WebElement btnSearch;

	/**
	 * @return the dest
	 */
	public WebElement getDest() {
		return dest;
	}


	public WebElement getBtnOneway() {
		return btnOneway;
	}

	
	public WebElement getCheckInDate() {
		return checkInDate;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}
}
