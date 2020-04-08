package com.training.sanity.tests;

import java.util.Properties;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
//import com.training.generics.ScreenShot;
import com.training.pom.AdmindeletefilterPOM;

import common.Logger;


public class AddedProductVisibleonHomeScreen {


	private AdmindeletefilterPOM unfpom;
	private static Properties properties;
	private ScreenShot screenShot;
	private static Logger Log = Logger.getLogger(AdminAddProduct.class);

	@BeforeMethod
	public void setUp() throws Exception {
		unfpom = new AdmindeletefilterPOM(LoginTests.driver);  
	} 

	@Test
	//UNF_065 - To Verify whether added product details get displayed in home screen
	
	public void validAddedProductVisibleonHomeScreen() throws Exception  {
		unfpom.clickmenu();
		unfpom.clickCATbtn();
		unfpom.selectProducts();
		unfpom.addNewProduct();
		unfpom.sendproductShirt("Blazer Girls(7-8)");
		unfpom.addMetaTag("Blazer for Girls"); 
		Thread.sleep(2000);
		unfpom.clickdataTab();
		unfpom.sendinputModel("BLG-112"); 
		unfpom.enterPrice("3000"); 
		unfpom.enterQuantity("100"); 
		unfpom.clicklinkTab(); 
		unfpom.sendinputCategory("School Uniforms");
		unfpom.clicksaveProduct(); 
		Log.info("Add product by Admin successful");
		ScreenShot.captureScreenShot("AdminAddProduct");
		
	
		
		
	}
}