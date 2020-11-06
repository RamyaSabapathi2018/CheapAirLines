package org.cheapair.base;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

public class WebElementSupportClass {
	
	
	// Click the button
	public void clickButton(WebElement e) {
		e.click();
	}
	//To pass Value to field
	public void insertValue(WebElement e,String val) {
		e.sendKeys(val);
	}

	// Fetch the Text
	public String fetchText(WebElement e) {
		return e.getText();
	}

	// Fetch the Attribute Value
	public String fetchAttribute(WebElement e, String s) {
		return e.getAttribute(s);
	}

	// fetch CSS Value
	public String fetchCSSValue(WebElement e, String css) {
		return e.getCssValue(css);
	}

	// Get the Tag Name
	public String fetchTagName(WebElement e) {
		return e.getTagName();
	}

	// isDisplayed
	public boolean checkHidden(WebElement e) {
		return e.isDisplayed();
	}

	// isEnabled
	public boolean checkEnable(WebElement e) {
		return e.isEnabled();
	}

	// isSelected
	public boolean checkSelected(WebElement e) {
		return e.isSelected();
	}

	// Check the Size coordinates
	public Dimension fetchSize(WebElement e) {
		return e.getSize();
	}

	// Check the location coordinates
	public Point fetchLocation(WebElement e) {
		return e.getLocation();
	}
	// To find the locators using findelement
		public WebElement findLocators(String findLocator, String locator,WebElement element) {
			WebElement e = null;
			int type = 0;
			if (locator.equals("id")) {
				type = 1;
			} else if (locator.equals("name")) {
				type = 2;
			} else if (locator.equals("className")) {
				type = 3;
			} else if (locator.equals("tagName")) {
				type = 4;
			} else if (locator.equals("linkText")) {
				type = 5;
			} else if (locator.equals("partialLinkText")) {
				type = 6;
			} else if (locator.equals("xpath")) {
				type = 7;
			} else if (locator.equals("cssSelector")) {
				type = 8;
			} else {
				type = 0;
			}
			switch (type) {
			case 1:
				e = element.findElement(By.id(findLocator));
				return e;
			case 2:
				e = element.findElement(By.name(findLocator));
				return e;
			case 3:
				e = element.findElement(By.className(findLocator));
				return e;
			case 4:
				e = element.findElement(By.tagName(findLocator));
				return e;
			case 5:
				e = element.findElement(By.linkText(findLocator));
				return e;
			case 6:
				e = element.findElement(By.partialLinkText(findLocator));
				return e;
			case 7:
				e = element.findElement(By.xpath(findLocator));
				return e;
			case 8:
				e = element.findElement(By.cssSelector(findLocator));
				return e;
			default:
				break;

			}
			return e;

		}
		// To find the locators using findelements
			public java.util.List<WebElement> findAllLocators(String findLocator, String locator,WebElement element) {
				java.util.List<WebElement> eleList =null;
				int type = 0;
				if (locator.equals("id")) {
					type = 1;
				} else if (locator.equals("name")) {
					type = 2;
				} else if (locator.equals("className")) {
					type = 3;
				} else if (locator.equals("tagName")) {
					type = 4;
				} else if (locator.equals("linkText")) {
					type = 5;
				} else if (locator.equals("partialLinkText")) {
					type = 6;
				} else if (locator.equals("xpath")) {
					type = 7;
				} else if (locator.equals("cssSelector")) {
					type = 8;
				} else {
					type = 0;
				}
				switch (type) {
				case 1:
					  eleList = element.findElements(By.id(findLocator));
					 return eleList;
					
				case 2:
					return eleList = element.findElements(By.name(findLocator));
					
				case 3:
					return eleList = element.findElements(By.className(findLocator));
					
				case 4:
					return eleList = element.findElements(By.tagName(findLocator));
					
				case 5:
					return eleList = element.findElements(By.linkText(findLocator));
					
				case 6:
					return eleList = element.findElements(By.partialLinkText(findLocator));
					
				case 7:
					return eleList = element.findElements(By.xpath(findLocator));
					
				case 8:
					return eleList = element.findElements(By.cssSelector(findLocator));
					
				default:
					break;

				}
				return eleList;

			}


}
