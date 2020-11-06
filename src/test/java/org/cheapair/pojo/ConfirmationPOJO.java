package org.cheapair.pojo;

import org.cheapair.base.SupportClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmationPOJO extends SupportClass{
	public ConfirmationPOJO() {
		PageFactory.initElements(driver, this);
		} 
		@FindBy(xpath="//span[text()='No Thanks']")
		private WebElement btnThanks ;
		public WebElement getBtnThanks() {
			return btnThanks;
		}
}
