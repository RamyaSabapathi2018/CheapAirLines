package org.cheapair.pojo;

import org.cheapair.base.SupportClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPOJO  extends SupportClass{

	
		
		public SearchResultPOJO() {
			PageFactory.initElements(driver, this);
		} 
		@FindBy(xpath="//span[text()='No Thanks']")
		private WebElement popUP;
		@FindBy(xpath="(//div[starts-with(@class,'btnfare btn withsub')])[1]")
		private WebElement price;
		@FindBy(xpath="//span[text()='Continue']")
		private WebElement btnContinue;
		/**
		 * @return the popUP
		 */
		public WebElement getPopUP() {
			return popUP;
		}
		/**
		 * @return the price
		 */
		public WebElement getPrice() {
			return price;
		}
		/**
		 * @return the btnContinue
		 */
		public WebElement getBtnContinue() {
			return btnContinue;
		}
			}

