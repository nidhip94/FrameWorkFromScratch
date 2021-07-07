package testCases;

import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjectRepository.ContactPageObject;
import PageObjectRepository.HomePageObject;

import resources.Base;

public class Contact extends Base {
	
	public WebDriver driver;
	//initialize logger object 'log' 
	public static Logger log = LogManager.getLogger(Contact.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		log.info("initialized");
	}
	
	@Test
	public void contact() throws IOException {
		
		HomePageObject landing= new HomePageObject(driver);
		landing.contactTab().click();
		ContactPageObject contact = new ContactPageObject(driver);
		contact.getBlog().click();
		
	}
	@AfterTest
	public void endTesting() {
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
