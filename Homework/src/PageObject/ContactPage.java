package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ContactPage extends Headers{
	
	public WebDriver driver;
	
	public ContactPage(WebDriver driver) {
			super(driver);
	        PageFactory.initElements(driver, this);
	        this.driver = driver;
	 }
}