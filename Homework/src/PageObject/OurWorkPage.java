package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class OurWorkPage extends Headers{
	
	public WebDriver driver;
	
	public OurWorkPage(WebDriver driver) {
			super(driver);
	        PageFactory.initElements(driver, this);
	        this.driver = driver;
	 }
}