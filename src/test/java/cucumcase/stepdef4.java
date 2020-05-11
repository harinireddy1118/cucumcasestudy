package cucumcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdef4 {
	WebDriver driver;
	@Given("user acceses the login page")
	public void user_acceses_the_login_page() {
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\driver\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
        driver.get("https://lkmdemoaut.accenture.com/TestMeApp/login.htm");
        driver.findElement(By.name("userName")).sendKeys("Lalitha");
        driver.findElement(By.name("password")).sendKeys("Password123");
        driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();

	}

	@When("user searches for the product")
	public void user_searches_for_the_product() {
     driver.findElement(By.xpath("//*[@id=\"myInput\"]")).sendKeys("head");
     driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	}

	@When("user adds to cart")
	public void user_adds_to_cart() {
		//driver.findElement(By.className("fa")).click();
driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();


driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).click();
		
	}

	@When("user checkout")
	public void user_checkout() {
		driver.findElement(By.xpath("//*[@id=\"cart\"]/tfoot/tr[2]/td[5]/a")).click();
		
		

	}

	@When("user proceeds to payment")
	public void user_proceeds_to_payment() {
		driver.findElement(By.xpath("/html/body/b/div/div/div[1]/div/div[2]/div[3]/div/form[2]/input")).click();
		driver.findElement(By.xpath("/html/body")).click();
		
	}

	@When("user enters netbanking details")
	public void user_enters_netbanking_details() {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/div/div/div[1]/div[1]/div/label/i")).click();
		
        driver.findElement(By.xpath("//*[@id=\"btn\"]")).click();
        
		
		
		driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input[1]")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input[2]")).sendKeys("Pass@456");
		driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[3]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input")).sendKeys("Trans@456");
		driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[2]/input")).click();
	    
	}


	@Then("user checks for order confirmation")
	public void user_checks_for_order_confirmation() {
		driver.findElement(By.xpath("/html/body/b/section/div/div/div")).click();
		driver.findElement(By.xpath("/html/body/header/div/div/ul/b/a[2]")).click();
		driver.close();
		
	
	}
}
