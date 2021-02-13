package StepDefinition;		

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.AboutPage;
import PageObject.CareersPage;
import PageObject.ContactPage;
import PageObject.FacebookPage;
import PageObject.MainPage;
import PageObject.OurWorkPage;
import PageObject.SearchPage;
import PageObject.ServicesPage;
import PageObject.Ukraine;

import cucumber.api.java.en.Given;		
import cucumber.api.java.en.Then;		
import cucumber.api.java.en.When;

public class My_Steps {
	
	public static WebDriver driver;
	public static MainPage main;
	public static SearchPage search;
	public static AboutPage about;
	public static ServicesPage services;
	public static Ukraine uk;
	public static ContactPage contact;
	public static CareersPage careers;
	public static FacebookPage facebook;
	public static OurWorkPage work;
	
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "\\Drive\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.epam.com/");
		main = new MainPage(driver);
	}
	
	public void end() {
		driver.quit();
	}
	
    @Given("^I am on the EPAM site$")																		
    public void open_the_Chrome_and_click_on_search() throws Throwable{
    	setup();
    	main.clicksearch();
    }		
    
    @When("^I enter word \"([^\"]*)\"$")
    public void enter_word(String word) throws Throwable{
    	main.enter_word(word);
    	main.clickfind();
    }		

    @Then("^I should see result \"([^\"]*)\"$")					
    public void  result(String result) throws Throwable{
    	search = new SearchPage(driver);
    	Assert.assertEquals(search.get_result(), "https://www.epam.com/search?q=" + result);
    	end();
    }
    
    @Given("^I am on the EPAM site.$")																							
    public void open_the_Chrome() throws Throwable{	
    	setup();
    }		

    @When("^I click on ABOUT tab$")					
    public void click_on_ABOUT_tab() throws Throwable{
    	main.clickabout();
    }		

    @Then("^I should see ABOUT page$")					
    public void about_page() throws Throwable{
    	about = new AboutPage(driver);
    	Assert.assertEquals(about.get_result(), "https://www.epam.com/about");
    	end();
    }
    
    @Given("^I am on the EPAM Services page$")						
    public void open_Epam_services_page() throws Throwable{
    	setup();
    	main.clickserv();
    }		

    @When("^Click on EPAM$")					
    public void click_on_epam() throws Throwable{
    	services = new ServicesPage(driver);
    	services.clickepam();
    }		

    @Then("^I should see EPAM main page$")					
    public void epam_page() throws Throwable{
    	Thread.sleep(5000);
    	Assert.assertEquals(services.get_result(), "https://www.epam.com/");    
    	end();
    }
    
    @Given("^I am on the EPAM main page$")	
    public void open_the_Chrome_() throws Throwable{
    	setup();
    }		
    
    @When("^I click on Global EN$")	                     													
    public void click_on_global() throws Throwable{
    	main.clickglobal();
    	main.cheack_lang();
    }		

    @Then("^I should see language tab$")					
    public void language_page_open() throws Throwable{
    	uk = new Ukraine(driver);
    	Thread.sleep(5000);
    	Assert.assertEquals(uk.get_result(), "https://careers.epam.ua/");
    	end();
    }
    
    @Given("^I am on the EPAM$")		
    public void open_the_Chrome__() throws Throwable{
    	setup();
    }		
    
    @When("^I  click on contact us$")	                     													
    public void click_on_contact_us() throws Throwable{
    	main.clickcontact();
    	Thread.sleep(1000);
    }		

    @Then("^I should see contact page$")					
    public void contact_page() throws Throwable{
    	contact = new ContactPage(driver);
    	Assert.assertEquals(contact.get_result(), "https://www.epam.com/about/who-we-are/contact");
    	driver.quit();
    }
    
    @Given("^I am on the Epam site$")
    public void _open_the_Chrome__() throws Throwable{
    	setup();
    }		
    
    @When("^I click on careers$")	                     													
    public void click_on_dream_job() throws Throwable{
    	main.findjob();
    	Thread.sleep(1000);
    }		

    @Then("^I should see the EPAM careers page$")					
    public void careers_page() throws Throwable{	
    	careers = new CareersPage(driver);
    	Assert.assertEquals(careers.get_result(), "https://www.epam.com/careers");
    	end();
    }
    
    @Given("^I am on the Epam$")														
    public void open_epamm() throws Throwable{
    	setup();
    }		
    
    @When("^I scroll down and click on Facebook icon$")	                     											
    public void facebook_icon() throws Throwable{
    	main.get(main.facebookpage());
    	Thread.sleep(1000);
    }		

    @Then("^I should see EPAM Global page on Facebook$")					
    public void facebook() throws Throwable{
    	facebook = new FacebookPage(driver);
    	Assert.assertEquals(facebook.get_result(), "https://www.facebook.com/EPAM.Global");
    	end();
    }
    
    @Given("^I am on the Epam page.$")														
    public void open_epam_() throws Throwable{
    	setup();
    }		
    
    @When("^I click on Our wokr$")	                     											
    public void our_work() throws Throwable{
    	main.ourwork();
    	Thread.sleep(1000);
    }		

    @Then("^I should see Our wokr page$")					
    public void workpage() throws Throwable{
    	work = new OurWorkPage(driver);
    	Assert.assertEquals(work.get_result(), "https://www.epam.com/our-work");
    	end();
    }
}