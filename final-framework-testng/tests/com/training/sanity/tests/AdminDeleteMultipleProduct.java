package com.training.sanity.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.util.Properties;

import com.training.generics.ScreenShot;
import com.training.pom.AdmindeletefilterPOM;

import common.Logger;


public class AdminDeleteMultipleProduct {

	private AdmindeletefilterPOM unfpom;
	private static Properties properties;
	private ScreenShot screenShot;
	private static Logger Log = Logger.getLogger(AdminDeleteMultipleProduct.class);
	
	
	 @BeforeMethod
	   public void setUp() throws Exception {
	     unfpom = new AdmindeletefilterPOM(LoginTests.driver);  
	   }
	 
	@Test
	//UNF_044
	//To Verify whether application allows the admin to delete multiple products from product list
	public void validAdminDeleteMultipleProduct() throws InterruptedException {
	    
		unfpom.clickmenu();
		Thread.sleep(2000);
		unfpom.clickCATbtn();
		Thread.sleep(2000);
	    unfpom.selectProducts();
	    Thread.sleep(2000);
	    unfpom.deletemultipleProducts();
	    Thread.sleep(2000);
	    unfpom.delete();
	    Log.info("Delete mulitple products by Admin successful");
        ScreenShot.captureScreenShot("AdminDeleteMulitpleProducts");
	}
}
