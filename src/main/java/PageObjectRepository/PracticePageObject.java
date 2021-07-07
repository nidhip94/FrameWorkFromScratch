package PageObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticePageObject {
	public WebDriver driver;
	
	public PracticePageObject(WebDriver driver) {
		this.driver=driver;
	}
	
	By radioButton = By.xpath("//input[@value='radio2']");
	
	public WebElement getRadioButton() {
		return driver.findElement(radioButton);
	}

	
	
	

}
