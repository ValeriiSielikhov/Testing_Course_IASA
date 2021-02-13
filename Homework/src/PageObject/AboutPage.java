package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AboutPage extends Headers {
	
	public WebDriver driver;
	
	public AboutPage(WebDriver driver) {
			super(driver);
	        PageFactory.initElements(driver, this);
	        this.driver = driver;
	 }
}