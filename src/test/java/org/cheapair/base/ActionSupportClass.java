package org.cheapair.base;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionSupportClass extends SupportClass {

	WebDriver driver1 = SupportClass.driver;
	public Actions acc;
	
	// Create Reference for Action Class
	public Actions createActionreference() {
		acc = new Actions(driver1);
		return acc;
	}

	// To Move an Element
	public void moveElement(WebElement e) {
		acc.moveToElement(e).perform();
		
	}

	// To perform Drag and Drop
	public void dragElement(WebElement src, WebElement desc) {
		acc.dragAndDrop(src, desc).perform();
		
	}

	// To perform double Click
	public void doubleClick(WebElement e) {
		acc.doubleClick(e).perform();
	}

	// To Select an text/right click
	public void contextClick(WebElement e) {
		acc.contextClick(e).perform();
	}

	// To Send value
	public void insertText(WebElement e, String text) {
		acc.sendKeys(e, text).perform();
	}
	/*
	 * //To perform key Actions public void keyPress(WebElement e,String key) {
	 * acc.keyDown(e, Keys.key); }
	 */

}
