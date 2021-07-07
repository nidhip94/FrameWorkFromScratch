package PageObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObject {
	
	public WebDriver driver;
	
	//create object og login button in home page
	By loginButton = By.xpath("//span[contains(text(),'Login')]");
	 By assertTextFeature= By.xpath("//div[@class='text-center']/h2[text()='Featured Courses']");
	 By navBar = By.xpath("//ul[@class='nav navbar-nav navbar-right']");
	 By practice = By.xpath("//a[text()='Practice']");
	 By contact = By.xpath("//a[text()='Contact']");
	 By courses = By.xpath("//a[text()='Courses']");
	
	public HomePageObject(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}



	public WebElement getLoginButton() {
		return driver.findElement(loginButton);
	}
	
	public WebElement assertFeatureText() {
		return driver.findElement(assertTextFeature);
	}
	
	public WebElement assertNavBar() {
		return driver.findElement(navBar);
	}
	
	public WebElement coursesTab() {
		return driver.findElement(courses);
	}
	public WebElement practiceTab() {
		return driver.findElement(practice);
	}
	public WebElement contactTab() {
		return driver.findElement(contact);
	}

	

}
