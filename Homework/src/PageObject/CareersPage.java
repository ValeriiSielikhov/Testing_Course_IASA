package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CareersPage extends Headers{
	
	public WebDriver driver;
	
	public CareersPage(WebDriver driver) {
			super(driver);
	        PageFactory.initElements(driver, this);
	        this.driver = driver;
	 }
}