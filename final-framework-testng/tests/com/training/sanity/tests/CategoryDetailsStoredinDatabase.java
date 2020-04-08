package com.training.sanity.tests;

import java.util.Properties;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.AdmindeletefilterPOM;

import common.Logger;


public class CategoryDetailsStoredinDatabase {

	private AdmindeletefilterPOM unfpom;
	private static Properties properties;
	private ScreenShot screenShot;
	private static Logger Log = Logger.getLogger(AdminAddProduct.class);

	@BeforeMethod
	public void setUp() throws Exception {
		unfpom = new AdmindeletefilterPOM(LoginTests.driver);  
	} 


	@Test
	//UNF_066 - To verify whether application stores category details in database
	
	public void validCategoryDetailsStoredinDatabase()  {
		unfpom.clickmenu();
		unfpom.clickCATbtn();
		unfpom.selectCategories();
		unfpom.addNewCategories();
		unfpom.categoryName("Sports");
		unfpom.categoryDescription("Sports shoes");
		unfpom.catMetatagTitle("Sports");
        unfpom.catMetatagDesc("Sports Shoes");
        unfpom.saveCategory();
        //Query database ??
        
    	Log.info("Add new category by Admin successful");
        ScreenShot.captureScreenShot("Category added Successfully");
		
		
	}
}
