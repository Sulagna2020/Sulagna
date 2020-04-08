package com.training.sanity.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.util.Properties;

import com.training.generics.ScreenShot;
import com.training.pom.AdmindeletefilterPOM;

import common.Logger;


public class AdminFilterProductDetails {

	private AdmindeletefilterPOM unfpom;
	private static Properties properties;
	private ScreenShot screenShot;
	private static Logger Log = Logger.getLogger(AdminFilterProductDetails.class);
	
	
    @BeforeMethod
   public void setUp() throws Exception {
     unfpom = new AdmindeletefilterPOM(LoginTests.driver);  
   }
				
	@Test
	//UNF_013
	//To Verify whether application allows the admin to filter the product details
   
	public void validAdminFilterProductDetails() throws InterruptedException {
		unfpom.clickmenu();
		unfpom.clickCATbtn();
		unfpom.selectProducts();
		unfpom.sendproductName("Blazer-Boys");
		unfpom.clickfilter();
        Log.info("Filter product details by Admin successful");
        ScreenShot.captureScreenShot("AdminFilterProduct");
	   
	}
}
