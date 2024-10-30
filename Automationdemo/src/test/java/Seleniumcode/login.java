
package Seleniumcode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	    private WebDriver driver;

@BeforeMethod
public void setUp() {
    // Initialize ChromeDriver
    driver = new ChromeDriver();
    driver.get("https://www.saucedemo.com/v1/cart.html"); 
}

@Test
public void test() {
driver.findElement(By.id("user-name")).sendKeys("standard_user");
driver.findElement(By.id("password")).sendKeys("secret_sauce");
driver.findElement(By.id("login-button")).click();
}
}