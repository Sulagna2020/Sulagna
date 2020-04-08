package com.training.sanity.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.util.Properties;

import com.training.generics.ScreenShot;
import com.training.pom.AdmindeletefilterPOM;

import common.Logger;


public class AdminDeleteProduct {

	private AdmindeletefilterPOM unfpom;
	private static Properties properties;
	private ScreenShot screenShot;
	private static Logger Log = Logger.getLogger(AdminDeleteProduct.class);
	
	
	 @BeforeMethod
	   public void setUp() throws Exception {
	     unfpom = new AdmindeletefilterPOM(LoginTests.driver);  
	   }
	 
	@Test
	//UNF_014
	//To Verify whether application allows the admin to delete a product from product list
	public void validAdminDeleteProduct() throws InterruptedException {
	    
		unfpom.clickmenu();
		unfpom.clickCATbtn();
		unfpom.selectProducts();
		unfpom.checkBox();
		unfpom.delete();
	    Log.info("Delete product by Admin successful");
	    ScreenShot.captureScreenShot("AdminDeleteProduct");
	}
}
