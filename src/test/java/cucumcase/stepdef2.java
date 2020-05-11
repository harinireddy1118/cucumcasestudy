package cucumcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class stepdef2 
{

	WebDriver driver;
	@Given("user open the chrome browser")
	public void user_open_the_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\driver\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
        

	}

	@Given("user goes to testme app log in page")
	public void user_goes_to_testme_app_log_in_page() {
		driver.get("https://lkmdemoaut.accenture.com/TestMeApp/login.htm");

		 
	}

	@Given("user enters valid username and password")
	public void user_enters_valid_username_and_password() {
		driver.findElement(By.name("userName")).sendKeys("Lalitha");
	     driver.findElement(By.name("password")).sendKeys("Password123");
	     driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
	  
	}

	@Given("user searches for the headphones")
	public void user_searches_for_the_headphones() {
		
		 driver.findElement(By.xpath("//*[@id=\"myInput\"]")).sendKeys("head");
	     driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
		
	}

	@Then("user adds the headphones to cart")
	public void user_adds_the_headphones_to_cart() {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).click();
        driver.close();
	}


}   


