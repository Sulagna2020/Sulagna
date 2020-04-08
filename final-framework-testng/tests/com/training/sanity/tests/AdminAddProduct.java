package com.training.sanity.tests;

import java.util.Properties;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
//import com.training.generics.ScreenShot;
import com.training.pom.AdmindeletefilterPOM;

import common.Logger;


public class AdminAddProduct {

	private AdmindeletefilterPOM unfpom;
	private static Properties properties;
	private ScreenShot screenShot;
	private static Logger Log = Logger.getLogger(AdminAddProduct.class);

	@BeforeMethod
	public void setUp() throws Exception {
		unfpom = new AdmindeletefilterPOM(LoginTests.driver);  
	} 

	@Test
	//UNF_042 - To Verify whether application allows Admin to add product by entering valid credentials in mandatory fields only

	public void validAdminAddProduct() throws Exception  {
		unfpom.clickmenu();
		unfpom.clickCATbtn();
		unfpom.selectProducts();
		unfpom.addNewProduct();
		unfpom.sendproductShirt("Shirt");
		unfpom.addMetaTag("Shirt for Girls"); 
		unfpom.clickdataTab();
		unfpom.sendinputModel("SHG-010"); 
		unfpom.enterPrice("750"); 
		unfpom.enterQuantity("50"); 
		unfpom.clicklinkTab(); 
		unfpom.sendinputCategory("Shirt");
		unfpom.clicksaveProduct(); 
		Log.info("Add product by Admin successful");
		ScreenShot.captureScreenShot("AdminAddProduct");



	}

}




