package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class FacebookPage {
	
	public WebDriver driver;
	
	public FacebookPage(WebDriver driver) {
	        PageFactory.initElements(driver, this);
	        this.driver = driver;
	 }

	public String get_result() {
		return driver.getCurrentUrl();
    }
}