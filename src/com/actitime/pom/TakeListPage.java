package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TakeListPage {
	@FindBy(xpath="//div[.='Add New']")
	private WebElement addnewbtn;
	@FindBy(xpath="//div[.='+ New Customer']")
	private WebElement newcusbtn;
	@FindBy(xpath="//input[@placeholder='Enter Customer Name' and @class]")
	private WebElement customernametbx;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement Descriptiontbx;
	@FindBy(xpath="//div[.='- Select Customer -' and @class='emptySelection']")
	private WebElement selectdropdown;
	@FindBy(xpath="//div[.='Big Bang Company' and @class='itemRow cpItemRow ']")
	private WebElement Bigbang;
	@FindBy(xpath="//div[.='Create Customer']")
	private WebElement createcustomerbtn;
	
	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[1]")
	private WebElement actualcustomer;
	
	public TakeListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddnewbtn() {
		return addnewbtn;
	}

	public WebElement getNewcusbtn() {
		return newcusbtn;
	}

	public WebElement getCustomernametbx() {
		return customernametbx;
	}

	public WebElement getDescriptiontbx() {
		return Descriptiontbx;
	}

	public WebElement getSelectdropdown() {
		return selectdropdown;
	}

	public WebElement getOurcompany() {
		return Bigbang;
	}

	public WebElement getCreatecustomerbtn() {
		return createcustomerbtn;
	}

	public WebElement getActualcustomer() {
		return actualcustomer;
	}
	
	

}
