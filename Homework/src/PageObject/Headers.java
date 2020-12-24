package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Headers {
	
	public WebDriver driver;
	
	public Headers(WebDriver driver) {
	        PageFactory.initElements(driver, this);
	        this.driver = driver;
	 }
	
	@FindBy(xpath = "//*[@id=\"wrapper\"]/div[2]/div[1]/header/div/nav/ul/li[5]/span[1]/a")
    private WebElement about;
	
	public void clickabout() {
		about.click(); 
    }
	
	@FindBy(xpath = "//*[@id=\"wrapper\"]/div[2]/div[1]/header/div/nav/ul/li[1]/span[1]/a")
    private WebElement serv;
	
	public void clickserv() {
		serv.click(); 
    }
	
	@FindBy(xpath = "//*[@id=\"wrapper\"]/div[2]/div[1]/header/div/ul/li[2]/div/button")
    private WebElement global;
	
	public void clickglobal() {
		global.click(); 
    }
	
	@FindBy(xpath = "//*[@id=\"wrapper\"]/div[2]/div[1]/header/div/ul/li[1]/a/span")
    private WebElement contact;
	
	public void clickcontact() {
		contact.click(); 
    }
	
	@FindBy(xpath = "//*[@id=\"wrapper\"]/div[2]/div[1]/header/div/nav/ul/li[6]/span[1]/a")
    private WebElement careers;
	
	public void findjob() {
		careers.click(); 
    }

	@FindBy(xpath = "//*[@id=\"wrapper\"]/div[2]/div[1]/header/div/nav/ul/li[3]/span[1]/a")
    private WebElement work;
	
	public void ourwork() {
		work.click(); 
	}

	public String get_result() {
		return driver.getCurrentUrl();
    }
	
	@FindBy(xpath = "//*[@id=\"wrapper\"]/div[2]/div[2]/div/div/header/div/a")
    private WebElement epam;
	
	public void clickepam() {
		epam.click(); 
    }
}
