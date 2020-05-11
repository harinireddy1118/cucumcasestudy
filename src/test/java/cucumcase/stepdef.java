package cucumcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdef {
	WebDriver driver;
	@Given("user access the registration page")
	public void user_access_the_registration_page() {
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\driver\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
        driver.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm#");
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();
	   
	}

	@When("user enters{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_enters(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12) {
		driver.findElement(By.name("userName")).sendKeys(string);
		driver.findElement(By.name("firstName")).sendKeys(string2);
		driver.findElement(By.name("lastName")).sendKeys(string3);
		driver.findElement(By.name("password")).sendKeys(string4);
		driver.findElement(By.name("confirmPassword")).sendKeys(string5);
		driver.findElement(By.xpath("//*[@name='gender' and @value='Male']")).click();
		driver.findElement(By.name("emailAddress")).sendKeys(string7);
		driver.findElement(By.name("mobileNumber")).sendKeys(string8);
		driver.findElement(By.name("dob")).sendKeys(string9);
		driver.findElement(By.name("address")).sendKeys(string10);
		driver.findElement(By.name("securityQuestion")).sendKeys(string11);
		driver.findElement(By.name("answer")).sendKeys(string12);
		driver.findElement(By.name("Submit")).click();
		
	}

	@Then("user navigates to login page")
	public void user_navigates_to_login_page() {

	}

}
