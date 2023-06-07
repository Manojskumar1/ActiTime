package com.actitime.testscript;

import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.TakeListPage;

import dev.failsafe.internal.util.Assert;

//import dev.failsafe.internal.util.Assert;

//import dev.failsafe.internal.util.Assert;
@Listeners(com.actitime.generic.ListenersImplementation.class)
public class CreateCustomer extends BaseClass{
	@Test
	public void testCreateCustomer() throws EncryptedDocumentException, IOException, InterruptedException {
		FileLib f=new FileLib();
		Reporter.log("Create Customer",true);
		String customername = f.getExceldata("manoj",1,1);
		String customerDescription=f.getExceldata("manoj", 1, 2);
		HomePage h1=new HomePage(driver);
		h1.setTaskbtn();
		TakeListPage t=new TakeListPage(driver);
		t.getAddnewbtn().click();;
		t.getNewcusbtn().click();;
		t.getCustomernametbx().sendKeys(customername);
		t.getDescriptiontbx().sendKeys(customerDescription);
		t.getSelectdropdown().click();
		t.getOurcompany().click();
		t.getCreatecustomerbtn().click();
		int b=10;
		int m=1/b;
		
		Thread.sleep(5000);
		
		String actualText = t.getActualcustomer().getText();
		org.testng.Assert.assertEquals(actualText, customername);
		Thread.sleep(3000);
	}
	
	

}
