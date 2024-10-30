package Seleniumcode;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


		
		 
		public class InputTest {
		    private WebDriver driver;

		    @BeforeMethod
		    public void setUp() {
		        
		        driver = new ChromeDriver();
		        driver.get("https://www.saucedemo.com/v1/checkout-step-one.html"); // Replace with the actual URL
		    }

		    @Test
		    public void test() {
		        WebElement textField = driver.findElement(By.id("first-name"));
		        WebElement textField1 = driver.findElement(By.id("last-name"));
		        WebElement textField3 = driver.findElement(By.id("postal-code"));
		        textField.sendKeys("Swapna");
		        textField1.sendKeys("Rekala");
		        textField3.sendKeys("hp29");
		        driver.findElement(By.className("btn_primary cart_button")).click();
		      
		    }

		    
		    }
		
	
