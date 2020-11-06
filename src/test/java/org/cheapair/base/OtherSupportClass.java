package org.cheapair.base;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class OtherSupportClass extends SupportClass{
	
public Alert alert;
	// To create Alert Ref
	public Alert toCreateAlertRef() {
		SupportClass sc = new SupportClass();
		return alert= sc.toSwitchAlert();
	}

	// To accept an Alert
	public void toAccept() {
		alert.accept();
	}

	// To Dismiss an Alert
	public void toDismiss() {
		alert.dismiss();
	}

	// To pass Value to Alert
	public void tosendText(String text) {
		alert.sendKeys(text);
	}

	// To fetch the Text from Alert
	public String fetchText() {
		return alert.getText();
	}

	// To create Select Class reference
	public Select createSelectClass(WebElement e) {
		Select select = new Select(e);
		return select;
	}

	//To Select the value
	
	public void selectDropDown(WebElement element, String valueToPass, int typeToSelect) {
		Select s = new Select(element);
		if (typeToSelect == 1) {
			s.selectByVisibleText(valueToPass);
		} else if (typeToSelect == 2) {
			s.selectByValue(valueToPass);
		} else if (typeToSelect == 3) {
			int temp = Integer.valueOf(valueToPass);
			s.selectByIndex(temp);
		} else {
			// s.o.pn("We cannot select the dropdown")
		}

	}
	

	//To Select the value
	
	public void deSelectDropDown(WebElement element, String valueTodeselect, int typeToSelect) {
		Select s = new Select(element);
		if (typeToSelect == 1) {
			s.deselectByVisibleText(valueTodeselect);
		} else if (typeToSelect == 2) {
			s.deselectByValue(valueTodeselect);
		} else if (typeToSelect == 3) {
			int temp = Integer.valueOf(valueTodeselect);
			s.deselectByIndex(temp);
		} else {
			// s.o.pn("We cannot select the dropdown")
		}

	}

	
		// To check multiple or not
	public boolean isMultiple(Select select) {
		return select.isMultiple();
	}

	// To getAllOptions
	public List<WebElement> getAllOptions(Select select) {
		return select.getOptions();
	}

	// To getAllSelectedOptions
	public List<WebElement> getSelectedOptions(Select select) {
		return select.getAllSelectedOptions();
	}

	// To getFirst Selected options
	public WebElement getFirstSelectedOption(Select select) {
		return select.getFirstSelectedOption();
	}

}
