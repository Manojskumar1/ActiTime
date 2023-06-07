package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(id="logoutLink")
	private WebElement lgutbtn;
	
	@FindBy(xpath="//div[.='Tasks']")
	private WebElement taskbtn;
	
public HomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	
}



public void setLgutbtn() {
	lgutbtn.click();
}

public void setTaskbtn() {
	 taskbtn.click();
}


}
