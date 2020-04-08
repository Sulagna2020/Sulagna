package com.training.sanity.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.util.Properties;

import com.training.generics.ScreenShot;
import com.training.pom.AdmindeletefilterPOM;

import common.Logger;


public class AdminFilterOrderDetails {

	private AdmindeletefilterPOM unfpom;
	private static Properties properties;
	private ScreenShot screenShot;
	private static Logger Log = Logger.getLogger(AdminFilterOrderDetails.class);
    

	 @BeforeMethod
	   public void setUp() throws Exception {
	     unfpom = new AdmindeletefilterPOM(LoginTests.driver);  
	   }
	
	@Test
	//UNF_015
	//To Verify whether application allows the admin to filter the order details
	public void validAdminFilterOrderDetails() throws InterruptedException { 
		unfpom.clickmenu();
		unfpom.clickReport();
		unfpom.salesReport();
		unfpom.orders();
		unfpom.clickstartCalendar();
		unfpom.selectMonth();
		unfpom.selectstartDate1();
		unfpom.clickendCalendar();
		unfpom.selectendDate1();
		unfpom.clickorderFilter();
		unfpom.selectgroupSelect();
		unfpom.selectorderStatus();
		unfpom.clickorderFilter();
		Log.info("Filter order details by Admin successful");
		ScreenShot.captureScreenShot("AdminFilterOrder");
	}
	}

