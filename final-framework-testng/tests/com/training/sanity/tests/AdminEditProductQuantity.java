package com.training.sanity.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.util.Properties;

import com.training.generics.ScreenShot;
import com.training.pom.AdmindeletefilterPOM;

import common.Logger;


public class AdminEditProductQuantity {

	private AdmindeletefilterPOM unfpom;
	private static Properties properties;
	private ScreenShot screenShot;
	private static Logger Log = Logger.getLogger(AdminEditProductQuantity.class);
	
	
	 @BeforeMethod
	   public void setUp() throws Exception {
	     unfpom = new AdmindeletefilterPOM(LoginTests.driver);  
	   }
	 
	@Test
	//UNF_043
	//To verify whether application allows admin to edit Quantity details of a product
	public void validAdminEditProductQuantity() throws InterruptedException {
	    
		unfpom.clickmenu();
		Thread.sleep(2000);
		unfpom.clickCATbtn();
		unfpom.selectProducts();
		unfpom.editProduct();
		unfpom.clickdataTab();
		unfpom.enterQuantity("100");
		unfpom.clicksaveProduct();
		Log.info("Edit quantity of Product by Admin successful");
        ScreenShot.captureScreenShot("AdminEditProductQuantity");
	}
		
	
	}
