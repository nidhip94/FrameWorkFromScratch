package PageObjectRepository;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPageObject {
	
public WebDriver driver;
	
	//create object og login button in home page
	By loginButton = By.xpath("//span[contains(text(),'Login')]");
    By email = By.id("user_email");
    By password = By.id("user_password");
    By loginWithCreds = By.cssSelector("input[type='submit']");
   
   

	public LoginPageObject(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}


	public WebElement getEmail() {
		return driver.findElement(email);
	}
	

	public WebElement getPassword() {
		return driver.findElement(password);
	}
	

	public WebElement clickLogin() {
		return driver.findElement(loginWithCreds);
	}
	
	
	
	


}
