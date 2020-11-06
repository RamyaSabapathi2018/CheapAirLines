package org.cheapair.pojo;

import org.cheapair.base.SupportClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightPaymentPOJO  extends SupportClass{

		
		public FlightPaymentPOJO() {
		PageFactory.initElements(driver, this);
		} 
		@FindBy(id="firstName1")
		private WebElement firstName ;
		@FindBy(id="lastName1")
		private WebElement lastName ;
		@FindBy(id="gender1")
		private WebElement gender;
		@FindBy(id="dobMonth1")
		private WebElement dobMonth;
		@FindBy(id="dobDay1")
		private WebElement dobDate;
		@FindBy(id="dobYear1")
		private WebElement dobYear;
		@FindBy(id="ccNum1")
		private WebElement creditCardNum;
		@FindBy(id="expMonth1")
		private WebElement expiryMonth ;
		@FindBy(id="expYear1")
		private WebElement expiryYear;
		@FindBy(id="cvv1")
		private WebElement CVV;
		@FindBy(id="paymentName1")
		private WebElement holderName;
		@FindBy(id="paymentCountry1")
		private WebElement country;
		@FindBy(id="paymentAddress1")
		private WebElement address ;
		@FindBy(id="paymanetCity1")
		private WebElement city;
		@FindBy(id="paymentPhone1")
		private WebElement phone;
		@FindBy(id="email")
		private WebElement email;
		@FindBy(xpath="//button[@class='btn block large']")
		private WebElement btnClick;
		@FindBy(xpath="//button[text()='Okay']")
		private WebElement btnPopOk;
		/**
		 * @return the firstName
		 */
		public WebElement getFirstName() {
			return firstName;
		}
		/**
		 * @return the lastName
		 */
		public WebElement getLastName() {
			return lastName;
		}
		/**
		 * @return the gender
		 */
		public WebElement getGender() {
			return gender;
		}
		/**
		 * @return the dobMonth
		 */
		public WebElement getDobMonth() {
			return dobMonth;
		}
		/**
		 * @return the dobDate
		 */
		public WebElement getDobDate() {
			return dobDate;
		}
		/**
		 * @return the dobYear
		 */
		public WebElement getDobYear() {
			return dobYear;
		}
		/**
		 * @return the creditCardNum
		 */
		public WebElement getCreditCardNum() {
			return creditCardNum;
		}
		/**
		 * @return the expiryMonth
		 */
		public WebElement getExpiryMonth() {
			return expiryMonth;
		}
		/**
		 * @return the expiryYear
		 */
		public WebElement getExpiryYear() {
			return expiryYear;
		}
		/**
		 * @return the cVV
		 */
		public WebElement getCVV() {
			return CVV;
		}
		/**
		 * @return the holderName
		 */
		public WebElement getHolderName() {
			return holderName;
		}
		/**
		 * @return the country
		 */
		public WebElement getCountry() {
			return country;
		}
		/**
		 * @return the address
		 */
		public WebElement getAddress() {
			return address;
		}
		/**
		 * @return the city
		 */
		public WebElement getCity() {
			return city;
		}
		/**
		 * @return the phone
		 */
		public WebElement getPhone() {
			return phone;
		}
		/**
		 * @return the email
		 */
		public WebElement getEmail() {
			return email;
		}
		/**
		 * @return the btnClick
		 */
		public WebElement getBtnClick() {
			return btnClick;
		}
		/**
		 * @return the btnPopOk
		 */
		public WebElement getBtnPopOk() {
			return btnPopOk;
		}
		
	}
	