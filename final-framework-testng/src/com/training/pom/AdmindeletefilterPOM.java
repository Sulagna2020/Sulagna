package com.training.pom;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.trianing.waits.WaitTypes;


public class AdmindeletefilterPOM {

	private WebDriver driver;

	public AdmindeletefilterPOM(WebDriver driver) throws Exception {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}

	Robot robot = new Robot();


	@FindBy(name="username")
	private WebElement userName;


	@FindBy(name="password")
	private WebElement password;

	@FindBy(xpath="//*[@class=\"btn btn-primary\"]")
	private WebElement loginBtn; 

	@FindBy(id="button-menu")
	private WebElement menu;

	@FindBy(id= "catalog")
	private WebElement CATbtn;

	//Categories option

	@FindBy(xpath= "//ul[@id ='menu']/li[@id='catalog']/ul/li/a[text()='Categories']")
	private WebElement categories;

	//Add new category

	@FindBy(xpath="//div[@class ='container-fluid']/div/a/i[@class='fa fa-plus']")
	private WebElement addNewCategories;

	//Add category name 
	@FindBy(xpath="//div/input[@id=\"input-name1\"]")
	private WebElement categoryName;

	//Add category description 
	@FindBy(xpath="//div[@class='note-editable panel-body']/p")
	private WebElement categoryDescription;

	//Add category metatag Title
	@FindBy(xpath="//div/input[@id=\"input-meta-title1\"]")
	private WebElement catMetatagTitle;

	//Add category metatag Description
	@FindBy(xpath="//div/textarea[@id='input-meta-description1']")
	private WebElement catMetatagDesc;

    //Save added category
	@FindBy(xpath="//div[@id=\"content\"]/div/div/div/button/i[@class='fa fa-save']")
	private WebElement saveCategory;


	@FindBy(xpath="//ul[@id ='menu']/li[@id='catalog']/ul/li/a[text()='Products']")
	private WebElement products;

	@FindBy(id= "input-name")
	private WebElement productName;

	@FindBy(id= "button-filter")
	private WebElement filter;

	@FindBy(id= "reports")
	private WebElement reports;

	@FindBy(xpath ="//ul[@id ='menu']/li[@id ='sale']")
	private WebElement sale;

	@FindBy(xpath= "//li[@id ='sale']/ul/li/a[text() ='Orders']")
	private WebElement saleOrders;

	@FindBy(css= "#form-product > div > table > tbody > tr:nth-child(1) > td:nth-child(1) > input[type=checkbox]")
	private WebElement checkBox;

	@FindBy(css= "#content > div.page-header > div > div > button.btn.btn-danger")
	private WebElement delete;

	@FindBy(xpath= "//li[@id ='reports']/ul/li/a[text() ='Sales']")
	private WebElement salesReport;

	@FindBy(xpath= "//li[@id ='reports']/ul/li/ul/li/a[text() = 'Orders']")
	private WebElement orders; 

	@FindBy(xpath= "//form[@id='form-order']/div/table/tbody/tr[5]")
	private WebElement selectOrder;

	@FindBy(xpath="//form/div/table/tbody/tr/td[8]/button[contains(@id,'button-delete')]")
	private WebElement deleteOrder;

	//Select start date

	@FindBy(xpath="//*[@id='input-date-start']")
	private WebElement startDate; 

	//Select end date

	@FindBy(xpath="//*[@id='input-date-end']")
	private WebElement endDate; 

	//Select start Month
	@FindBy(xpath="//div[@class='datepicker-days']/table/thead/tr/th[2]")
	private WebElement selectMonth;

	//Select March 
	@FindBy(xpath="//div[@class='datepicker-months']/table/tbody/tr/td/span[text()='Mar']")
	private WebElement selectMarch;


	//Select start-date calendar
	@FindBy(xpath="//div[@class='input-group date' and input[@id='input-date-start']]/span/button/i")
	private WebElement startCalendar;

	//Select start-date from calendar
	@FindBy(xpath="//html/body/div[2]/div/div/table/tbody/tr[2]/td[1]")
	private WebElement startDate1;

	//Select end-date calendar
	@FindBy(xpath="//div[@class='input-group date' and input[@id='input-date-end']]/span/button/i")
	private WebElement endCalendar;

	//Select end-date from calendar
	@FindBy(xpath="//html/body/div[3]/div/div/table/tbody/tr[3]/td[7]")
	private WebElement endDate1;

	//CLick on filter button
	@FindBy(xpath="//div[@class='col-sm-6']/button[@id='button-filter']")
	private WebElement orderFilter;

	//Group-by-Months
	@FindBy(xpath="//div[@class='form-group']/select[@id='input-group']/option[text()='Months']")
	private WebElement groupSelect;

	//Group-by-orderStatus
	@FindBy(xpath="//div[@class='form-group']/select[@id='input-status']/option[text()='Pending']")
	private WebElement orderStatus;

	//Add new products
	@FindBy(xpath="//div[@class='container-fluid']/div/a")
	private WebElement addNewProduct;

	//Add shirts
	@FindBy(xpath="//div/input[@placeholder='Product Name']")
	private WebElement productShirt;

	//Find MetaTagTitle
	@FindBy(xpath="//div[@class='form-group required']/div/input[@placeholder='Meta Tag Title']")
	private WebElement metaTag;

	//CLick on DATA tab
	@FindBy(xpath="//*[@id=\"form-product\"]/ul/li[2]/a")
	private WebElement dataTab;

	//Enter Model in DATA tab
	@FindBy(xpath="//div[@id='tab-data']/div/div/input[@id='input-model']")
	private WebElement inputModel;

	//Enter Price
	@FindBy(xpath="//div[@class='form-group']/div/input[@id='input-price']")
	private WebElement inputPrice;

	//Enter quantity
	@FindBy(xpath="//div[@class='form-group']/div/input[@id='input-quantity']")
	private WebElement enterQuantity;

	//CLick on LINK tab
	@FindBy(xpath="//form[@id='form-product']/ul/li/a[contains(@href,'#tab-links')]")
	private WebElement linkTab;

	//Add Category
	@FindBy(xpath="//div[@class='form-group']/div/input[@id='input-category']")
	private WebElement inputCategory;

	//Save added Product
	@FindBy(xpath="//div[@id='content']/div/div/div/button/i[@class='fa fa-save']")
	private WebElement saveProduct;

	//Select multiple product-
	@FindBy(xpath="//form[@id='form-product']/div/table/tbody/tr/td/input[@name=\"selected[]\"]")
	private WebElement selectPrd1;

	@FindBy(xpath="//form[@id='form-product']/div/table/tbody/tr/td/input[@name=\"selected[]\"]")
	private WebElement selectPrd2;

	//Edit product
	@FindBy(xpath="//form[@id=\"form-product\"]/div/table/tbody/tr/td/a[contains(@href,'74')]")
	private WebElement editProduct;

	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);

	}

	public void sendPassword(String password) { 
		this.password.clear();
		this.password.sendKeys(password);

	}

	public void clickLoginBtn() { 
		WaitTypes.elementToBeClickable(loginBtn, 10).click();
	}

	public void clickmenu() {
		WaitTypes.elementToBeClickable(menu, 20).click();

	}

	public void clickCATbtn() {
		WaitTypes.elementToBeClickable(CATbtn, 10).click();
	}

	public void selectProducts() {
		this.products.click();
	}

	public void sendproductName(String productName) {
		this.productName.clear();
		this.productName.sendKeys(productName);

	}
	public void clickfilter() {
		WaitTypes.elementToBeClickable(filter, 30).click();

	}
	public void checkBox() {
		this.checkBox.click();
	}
	public void delete() {
		WaitTypes.elementToBeClickable(delete, 20).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		//alert.dismiss();
	}
	public void clickReport() {
		WaitTypes.elementToBeClickable(reports, 20).click();
	}
	public void salesReport() {
		WaitTypes.elementToBeClickable(salesReport, 20).click();

	}
	public void orders() {
		WaitTypes.elementToBeClickable(orders, 20);

	}
	public void selectStartDate() {
		WaitTypes.elementToBeClickable(startDate, 20).clear();
		WaitTypes.elementToBeClickable(startDate, 20).click();

	}
	public void selectEndDate() {
		WaitTypes.elementToBeClickable(endDate, 20).clear();
		WaitTypes.elementToBeClickable(endDate, 20).click();

	}
	public void clickSale() {
		WaitTypes.elementToBeClickable(sale, 20).click();

	}
	public void clicksaleOrders() {
		this.saleOrders.click();

	}
	public void selectOrder() {
		WaitTypes.elementToBeClickable(selectOrder, 20).click();

	}

	public void deleteOrder()  {
		WaitTypes.elementToBeClickable(deleteOrder, 30).click();

		Alert alert = driver.switchTo().alert();
		alert.accept();
		//altert.dismiss();

	}

	public void clickstartCalendar() {
		this.startCalendar.click();

	}

	public void selectMonth() {
		WaitTypes.elementToBeClickable(selectMonth, 20).click();
		WaitTypes.elementToBeClickable(selectMarch, 20).click();


	}
	public void selectstartDate1() {
		WaitTypes.elementToBeClickable(startDate1, 30).click();

	}
	public void clickendCalendar() {
		this.endCalendar.click();


	}
	public void selectendDate1() {
		WaitTypes.elementToBeClickable(endDate1, 30).click();

	}

	public void clickorderFilter() {
		WaitTypes.elementToBeClickable(orderFilter, 30).click();

	}

	public void selectgroupSelect() {
		WaitTypes.elementToBeClickable(groupSelect, 20).click();


	}
	public void selectorderStatus() {
		WaitTypes.elementToBeClickable(orderStatus, 20).click();

	}

	public void LoginTests() {
		this.LoginTests();
	}
	public void addNewProduct() {
		WaitTypes.elementToBeClickable(addNewProduct, 20).click();

	}
	public void sendproductShirt(String productShirt) {
		//	WaitTypes.presenceElementLocated(productShirt, 20).clear();
		//	WaitTypes.presenceElementLocated(productShirt, 20).sendKeys(productShirt);
		this.productShirt.clear();
		this.productShirt.sendKeys(productShirt);
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);	
	}

	public void addMetaTag(String metaTag) throws Exception {
		this.metaTag.clear();
		this.metaTag.sendKeys(metaTag);

	}

	public void clickdataTab() throws InterruptedException {
		robot.keyPress(KeyEvent.VK_PAGE_UP);
		robot.keyRelease(KeyEvent.VK_PAGE_UP);
		WaitTypes.elementToBeClickable(dataTab, 40).click();

		//	this.dataTab.click();
	}
	public void sendinputModel(String inputModel) {
		this.inputModel.clear();
		this.inputModel.sendKeys(inputModel);
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
	}

	public void enterPrice(String inputPrice) {
		this.inputPrice.clear();
		this.inputPrice.sendKeys(inputPrice);
		robot.keyPress(KeyEvent.VK_PAGE_UP);
		robot.keyRelease(KeyEvent.VK_PAGE_UP);

	}
	public void enterQuantity(String enterQuantity) {
		this.enterQuantity.clear();
		this.enterQuantity.sendKeys(enterQuantity);
		robot.keyPress(KeyEvent.VK_PAGE_UP);
		robot.keyPress(KeyEvent.VK_PAGE_UP);
		robot.keyRelease(KeyEvent.VK_PAGE_UP);
	}

	public void clicklinkTab() {
		robot.keyPress(KeyEvent.VK_PAGE_UP);
		robot.keyRelease(KeyEvent.VK_PAGE_UP);
		WaitTypes.elementToBeClickable(linkTab, 40).click();

	}

	public void sendinputCategory(String inputCategory) {
		this.inputCategory.clear();
		this.inputCategory.sendKeys(inputCategory);
	}

	public void clicksaveProduct() {
		WaitTypes.elementToBeClickable(saveProduct, 40).click();
		//	this.saveProduct.click();
	}

	public void deletemultipleProducts() throws InterruptedException {
		WaitTypes.elementToBeClickable(selectPrd1, 40).click();
		//		this.selectPrd1.click();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);

		WaitTypes.elementToBeClickable(selectPrd2, 30).click();

		//	this.selectPrd2.click();
		robot.keyPress(KeyEvent.VK_PAGE_UP);
		robot.keyRelease(KeyEvent.VK_PAGE_UP);
	}

	public void editProduct() {
		WaitTypes.elementToBeClickable(editProduct, 20).click();

		//	this.editProduct.click();

	}

	public void selectCategories() {
		WaitTypes.elementToBeClickable(categories, 30).click();
	}

	public void addNewCategories() {
		WaitTypes.elementToBeClickable(addNewCategories, 20).click();
	}
	public void categoryName(String categoryName) {
		this.categoryName.sendKeys(categoryName);
	}

	public void categoryDescription(String categoryDescription) {
		this.categoryDescription.sendKeys(categoryDescription);
	}

	public void catMetatagTitle(String catMetatagTitle) {
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		this.catMetatagTitle.sendKeys(catMetatagTitle);		
	}
	public void catMetatagDesc(String catMetatagDesc) {
		this.catMetatagDesc.sendKeys(catMetatagDesc);		
		robot.keyPress(KeyEvent.VK_PAGE_UP);
		robot.keyRelease(KeyEvent.VK_PAGE_UP);
	}

	public void saveCategory() {
		WaitTypes.elementToBeClickable(saveCategory, 20).click();

	}
	
	public void ReadExcel() {
		
	}
}






