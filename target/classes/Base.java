package resources;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public WebDriver driver;
	public Properties prop ;

	// This is the base class where we define the WebDriver Initialization
	// All testcases should use this class to get the info about driver

	public WebDriver initializeDriver() throws IOException {
		// TODO Auto-generated method stub
		prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") +"/src/main/java/resources/data.properties");
		prop.load(fis);
		//Get the value of browser you want to invoke from Properties file
		String browserName = prop.getProperty("browser");
		if(browserName.equalsIgnoreCase("chrome")) {
			//invoke chrome driver
			System.setProperty("webdriver.chrome.driver", "/Users/nidhi/Documents/seleniumJars/chromedriver");
			driver = new ChromeDriver();
		    driver.manage().window().maximize();
		}else if(browserName=="firefox") {
			//invoke firefox driver
		}else if(browserName=="IE") {
			//Invoke in IE driver
		}else {
			System.out.println("Browser Name is not defined correctly in data.properties file");
		}
		
		//global wait for all test cases
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		return driver;
		

	}// initializeDriver method ends
	
	
	public String getScreenshot(String testCaseName, WebDriver driver) throws IOException {
		  String fileName = getScreenshotName(testCaseName);
		TakesScreenshot ts =  (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String directory = System.getProperty("user.dir") + "/screenshots/";
		new File(directory).mkdirs();
		 String path = directory +fileName ;
	        try {
	           
	            FileUtils.copyFile(source, new File(path));
                System.out.println("Screenshot stored" + path);

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return path;
	
	}
	
	public String getScreenshotName(String methodName) {
        Date d = new Date();
        String fileName = methodName + "_" + d.toString().replace(":", "_").replace(" ", "_") + ".png";
        return fileName;
    }
	
	

}// class ends
