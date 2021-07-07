package testCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjectRepository.HomePageObject;
import PageObjectRepository.LoginPageObject;

import resources.Base;

public class HomePage extends Base {
	
	public WebDriver driver;
	
	//All methods define in base class , we can call from this class
	//check basepage navigation
	//initialize logger object 'log' 
	public static Logger log = LogManager.getLogger(Base.class.getName());

	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		log.info("initialized");
	}
	
	@Test
	public void baseHomePageNavigation() throws IOException {
		
		HomePageObject landing= new HomePageObject(driver);
		Assert.assertEquals(landing.assertFeatureText().getText(),"FEATURED COURSES");
		Assert.assertTrue(landing.assertNavBar().isDisplayed(), "Nav Bar is not displayed");
		log.info("baseHomePage executed");
	}
	
	@AfterTest
	public void endTesting() {
		driver.close();
	}
	
	

}
