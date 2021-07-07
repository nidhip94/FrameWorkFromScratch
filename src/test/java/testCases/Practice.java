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

import PageObjectRepository.HomePageObject;
import PageObjectRepository.PracticePageObject;

import resources.Base;

public class Practice extends Base {
	public WebDriver driver;
	//initialize logger object 'log' 
	public static Logger log = LogManager.getLogger(Practice.class.getName());
	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		log.info("initialized");
	}
	
	@Test
	public void practice() throws IOException {
		HomePageObject landing= new HomePageObject(driver);
		PracticePageObject practice = new PracticePageObject(driver);
		landing.practiceTab().click();
		practice.getRadioButton().click();
		
		
	}
	
	@AfterTest
	public void endTesting() {
		driver.close();
	}
	
	
	

}
