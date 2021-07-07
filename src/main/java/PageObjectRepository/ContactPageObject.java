package PageObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactPageObject {
	
	public WebDriver driver;

	public ContactPageObject(WebDriver driver) {
		this.driver=driver;
	}
	
	By blogTab = By.linkText("Blog");
	
	
	public WebElement getBlog() {
		return driver.findElement(blogTab);
	}
	
	

}
