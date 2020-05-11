package cucumcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdef3 {
	WebDriver driver;
	@Given("user should be in login page")
	public void user_should_be_in_login_page() {
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\driver\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
        driver.get("https://lkmdemoaut.accenture.com/TestMeApp/login.htm");


	}

	@When("user enters valid credentials And performs login")
	public void user_enters_valid_credentials_And_performs_login() {
        driver.findElement(By.name("userName")).sendKeys("Lalitha");
        driver.findElement(By.name("password")).sendKeys("Password123");
        driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
        
	}

	@When("clicks the product")
	public void clicks_the_product() {
		
		driver.findElement(By.name("products")).sendKeys("headphone");
		  driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	   
		
		
	}

	@When("selects product from the dropdown")
	public void selects_product_from_the_dropdown() {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
		

	}

	@Then("clicks on add to cart")
	public void clicks_on_add_to_cart() {
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]/i")).click();
		
		
		driver.close();

	}




}
