package com.training.sanity.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import com.training.generics.ScreenShot;
import com.training.pom.AdmindeletefilterPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

import common.Logger;


public class AdminDeleteOrder {

	private AdmindeletefilterPOM unfpom;
	private static Properties properties;
	private ScreenShot screenShot;
	private static Logger Log = Logger.getLogger(AdminDeleteOrder.class);
	
	 @BeforeMethod
	   public void setUp() throws Exception {
	     unfpom = new AdmindeletefilterPOM(LoginTests.driver);  
	   }
		
	@Test
	//UNF_016
	//To Verify whether application allows the admin to delete a order from order list
	public void validAdminDeleteOrder() throws InterruptedException {
		unfpom.clickmenu();
		unfpom.clickSale();
		unfpom.clicksaleOrders();
		unfpom.deleteOrder();
		Log.info("Delete order from order list by Admin successful");
        ScreenShot.captureScreenShot("AdminDeleteOrder");
	}
}
