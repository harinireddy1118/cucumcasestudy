package cucumcase;

import org.testng.Assert;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;

public class stepd5 {
WebDriver driver;
boolean cartAvailable;
@Given("user should be login")
public void user_should_be_login() {
	System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\driver\\chromedriver\\chromedriver.exe");
	    driver =new ChromeDriver();
	    driver.get("https://lkmdemoaut.accenture.com/TestMeApp/login.htm");
}
@Given("user enters valid credentials")
public void user_enters_valid_credentials() {
	 driver.findElement(By.id("userName")).sendKeys("lalitha");
     driver.findElement(By.id("password")).sendKeys("password123");
     driver.findElement(By.name("Login")).click();
}
@Given("search for product")
public void search_for_product() {
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.findElement(By.xpath("//*[@id=\"myInput\"]")).sendKeys("headphone");
}
@Given("try to proceed to payment without adding any item in the cart")
public void try_to_proceed_to_payment_without_adding_any_item_in_the_cart() {
	try {
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	cartAvailable=true;
	}
	catch(Exception e) {
		e.printStackTrace();
	}
}
@Given("testme app does not display the cart icon")
public void testme_app_does_not_display_the_cart_icon() {
	 //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 Assert.assertNotEquals("View Cart", driver.getTitle());
     driver.close();
}
}