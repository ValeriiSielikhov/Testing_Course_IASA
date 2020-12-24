package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends Headers  {

	public WebDriver driver;
	
	public MainPage(WebDriver driver) {
			super(driver);
	        PageFactory.initElements(driver, this);
	        this.driver = driver;
	 }
	
	@FindBy(xpath = "//*[@id=\"wrapper\"]/div[2]/div[1]/header/div/ul/li[3]/div/button")
    private WebElement search;
	
	public void clicksearch() {
		search.click(); 
    }
	
	@FindBy(name = "q")
    private WebElement field;
	
	public void enter_word(String word) {
		field.sendKeys(word); 
    }
	
	@FindBy(xpath = "//*[@id=\"wrapper\"]/div[2]/div[1]/header/div/ul/li[3]/div/div/form/button")
    private WebElement find;
	
	public void clickfind() {
		find.click(); 
    }
	
	@FindBy(xpath = "//*[@id=\"wrapper\"]/div[2]/div[1]/header/div/ul/li[2]/div/nav/ul/li[8]/a")
    private WebElement cheack;
	
	public void cheack_lang() {
		cheack.click(); 
    }
	
	@FindBy(xpath = "//*[@id=\"wrapper\"]/div[3]/div[1]/footer/div/div[2]/ul[2]/li[3]/a")
    private WebElement facebook;
	
	public String facebookpage() {
		return facebook.getAttribute("href"); 
    }
	
	public void get(String url) {
			driver.navigate().to(url);
	}
}
