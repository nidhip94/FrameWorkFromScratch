package testCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjectRepository.CoursesPageObject;
import PageObjectRepository.HomePageObject;
import PageObjectRepository.PracticePageObject;

import resources.Base;

public class Courses extends Base{
	public WebDriver driver;
	//initialize logger object 'log' 
	public static Logger log = LogManager.getLogger(Courses.class.getName());
	

	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		log.info("initialized");
	}
	
	@Test
	public void courses() throws IOException {
		HomePageObject landing= new HomePageObject(driver);
		CoursesPageObject cs = new CoursesPageObject(driver);
		landing.coursesTab().click();
		Assert.assertFalse(cs.getAccessLink().isDisplayed());
		
		
		
	}
	
	@AfterTest
	public void endTesting() {
		driver.close();
	}
	
	
	
	
	
	
	
	

}
