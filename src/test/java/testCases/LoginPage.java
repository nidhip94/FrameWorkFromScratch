package testCases;

import org.testng.annotations.Test;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;


import PageObjectRepository.HomePageObject;
import PageObjectRepository.LoginPageObject;

import resources.Base;

public class LoginPage extends Base{
	public WebDriver driver;
	//initialize logger object 'log' 
	public static Logger log =(Logger) LogManager.getLogger(Base.class.getName());
	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		log.info("initialized");
	}
	
	@Test(dataProvider="getData")
	public void login(String username , String password , String text) throws IOException {
		HomePageObject landing= new HomePageObject(driver);
		landing.getLoginButton().click();
		LoginPageObject loginPage = new LoginPageObject(driver);
		loginPage.getEmail().sendKeys(username);
		loginPage.getPassword().sendKeys(password);
		loginPage.clickLogin().click();
		log.info("invalid login to the application");
		System.out.println(text);
		System.out.println("pASSED");
		
	}
	
	@DataProvider
	public Object[][] getData() {
	   //rows indicate how many data set you will be sending(how many times test case will run
	  //column indicates the data set values->how many values for each test
		Object[][] data = new Object[1][3]; //2 data , per test sending 3 data value(column)
		//1st data set 
		data[0][0]= "nidhi@gmail.com";
		data[0][1]="Password1";
		data[0][2]="Valid user";
//		//second test data
//		data[1][0]="prajapati@gmail.com";
//		data[1][1]="Password2";
//		data[1][2]="Restricted User";
		
		return data;
		
	}
	
	@AfterTest
	public void endTesting() {
		driver.close();
	}
	
	
	
	

}
