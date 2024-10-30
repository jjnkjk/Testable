package Seleniumcode;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import java.time.Duration;

public class LaunchSwaglab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//login page
		driver.get("https://www.saucedemo.com/v1/index.html");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		//driver.close();
		List <WebElement> products = driver.findElements(By.className("inventory_item"));
		System.out.println(products.size());
		for (WebElement product: products) {
			System.out.println(product.getText());
		}
		driver.findElement(By.xpath("//div[@class='inventory_list']//div[1]//div[3]//button[1]")).click();
		
		//Your cart, checking items added to the cart
		driver.findElement(By.xpath("(//span[@class='fa-layers-counter shopping_cart_badge'])[1]")).click();
		driver.findElement(By.xpath("(//a[normalize-space()='CHECKOUT'])[1]")).click();
		
		//Checkout Your Information, check input fields
		driver.findElement(By.id("first-name")).sendKeys("swapna");
		driver.findElement(By.id("last-name")).sendKeys("hijk");
		driver.findElement(By.id("postal-code")).sendKeys("hp20");
		driver.findElement(By.xpath(("(//input[@value='CONTINUE'])[1]"))).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Checkout overview
		driver.findElement(By.xpath(("(//a[normalize-space()='FINISH'])[1]"))).click();
		String actual = "Actual";
		 actual = driver.findElement(By.xpath("//h2[normalize-space()='THANK YOU FOR YOUR ORDER']")).getText();
		 Assert.assertTrue(actual.contains("THANK YOU FOR YOUR ORDER"));
	        

	}
	}
	


