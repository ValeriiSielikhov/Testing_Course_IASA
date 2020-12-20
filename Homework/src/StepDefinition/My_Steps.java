package StepDefinition;		

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;		
import cucumber.api.java.en.Then;		
import cucumber.api.java.en.When;		

public class My_Steps {
	
	WebDriver driver;
	
    @Given("^I am on the EPAM site$")																			//1
    public void open_the_Chrome_and_click_on_search() throws Throwable{
    	System.setProperty("webdriver.chrome.driver", "\\Drive\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    	driver.get("https://www.epam.com/");
    	driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div[1]/header/div/ul/li[3]/div/button")).click();
    }		
    
    @When("^I enter word \"([^\"]*)\"$")					
    public void enter_word(String word) throws Throwable{
    	driver.findElement(By.name("q")).sendKeys(word);
    	driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div[1]/header/div/ul/li[3]/div/div/form/button")).click();
    }		

    @Then("^I should see result \"([^\"]*)\"$")					
    public void  result(String result) throws Throwable{	
    	driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div/section/div/div[2]/section/h2"));
    	driver.quit();
    }
    
    @Given("^I am on the EPAM site $")																				   //2				
    public void open_the_Chrome() throws Throwable{				
    	driver.get("https://www.epam.com/");
    }		

    @When("^I click on ABOUT tab$")					
    public void click_on_ABOUT_tab() throws Throwable{
    	driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div[1]/header/div/nav/ul/li[5]/span[1]/a")).click();	
    }		

    @Then("^I should see ABOUT page$")					
    public void about_page() throws Throwable{
    	Assert.assertEquals(driver.getCurrentUrl(), "https://www.epam.com/about");
    	driver.close();
    }
    
    @Given("^I am on the ABOUT page$")
    public void about() throws Throwable{
    	System.setProperty("webdriver.chrome.driver", "\\Drive\\chromedriver.exe");
    	driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.navigate().to("https://www.epam.com/about");
    	driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[1]/section/div/div[2]/div/div[2]/div/div/div/p/span/span"));
    }

    @When("^I click on video$")					
    public void click_on_video() throws Throwable{
    	driver.findElement(By.xpath("//*[@id=\"widget2\"]")).click();	
    }		

    @Then("^EPAM: Engineering the Future video  playback$")					
    public void video() throws Throwable{
    	driver.findElement(By.xpath("//*[@id=\"widget2\"]"));	
    	driver.quit();
    }
    
    @Given("^I am on the EPAM Services page$")																	   //3				
    public void open_Epam_services_page() throws Throwable{
    	System.setProperty("webdriver.chrome.driver", "\\Drive\\chromedriver.exe");
    	driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://www.epam.com/services");
    }		

    @When("^Click on EPAM$")					
    public void click_on_epam() throws Throwable{
    	driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div[2]/div/div/header/div/a/img")).click();
    	Thread.sleep(5000);
    }		

    @Then("^I should see EPAM main page$")					
    public void epam_page() throws Throwable{
    	Assert.assertEquals(driver.getCurrentUrl(), "https://www.epam.com/");    
    	driver.quit();
    }
    
    @Given("^I am on the EPAM main page$")																	//4
    public void open_the_Chrome_() throws Throwable{
    	System.setProperty("webdriver.chrome.driver", "\\Drive\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    	driver.get("https://www.epam.com/");
    }		
    
    @When("^I click on Global EN$")	                     													
    public void click_on_global() throws Throwable{
    	driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div[1]/header/div/ul/li[2]/div/button")).click();
    }		

    @Then("^I should see language tab$")					
    public void language_page_open() throws Throwable{	
    	driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div[1]/header/div/ul/li[2]/div/nav/ul/li[9]/a"));
    	driver.quit();
    }
    
    @Given("^I am on the EPAM$")														//5
    public void open_the_Chrome__() throws Throwable{
    	System.setProperty("webdriver.chrome.driver", "\\Drive\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    	driver.get("https://www.epam.com/");
    }		
    
    @When("^I  click on contact us$")	                     													
    public void click_on_contact_us() throws Throwable{
    	driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div[1]/header/div/ul/li[1]/a")).click();
    	Thread.sleep(5000);
    }		

    @Then("^I should see contact page$")					
    public void contact_page() throws Throwable{	
    	Assert.assertEquals(driver.getCurrentUrl(), "https://www.epam.com/about/who-we-are/contact");
    	driver.quit();
    }
    
    @Given("^I am on the Epam site$")														//6
    public void _open_the_Chrome__() throws Throwable{
    	System.setProperty("webdriver.chrome.driver", "\\Drive\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    	driver.get("https://www.epam.com/");
    }		
    
    @When("^I scroll down and click on FIND YOUR DREAM JOB$")	                     													
    public void click_on_dream_job() throws Throwable{
    	driver.get(driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[6]/section/div/div[3]/div/a")).getAttribute("href"));
    	Thread.sleep(5000);
    }		

    @Then("^I should see the EPAM careers page$")					
    public void careers_page() throws Throwable{	
    	Assert.assertEquals(driver.getCurrentUrl(), "https://www.epam.com/careers");
    	driver.close();
    }
    
    @Given("^I am on the Epam$")																			//7
    public void open_epamm() throws Throwable{
    	System.setProperty("webdriver.chrome.driver", "\\Drive\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    	driver.get("https://www.epam.com");
    }		
    
    @When("^I scroll down and click on Facebook icon$")	                     											
    public void facebook_icon() throws Throwable{
    	driver.get(driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[3]/div[1]/footer/div/div[2]/ul[2]/li[3]/a")).getAttribute("href"));
    	Thread.sleep(5000);
    }		

    @Then("^I should see EPAM Global page on Facebook$")					
    public void facebook() throws Throwable{
    	Assert.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/EPAM.Global");
    	driver.close();
    }
}