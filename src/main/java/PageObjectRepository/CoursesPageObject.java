package PageObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CoursesPageObject {
	
	
	public WebDriver driver;
	
	public CoursesPageObject(WebDriver driver) {
		this.driver = driver;
	}
    
	
	By accessLink = By.xpath("//a[text()='Access to All Courses']");
	
	
	public WebElement getAccessLink() {
		return driver.findElement(accessLink);
	}
	
	
	
	
	
	

}
