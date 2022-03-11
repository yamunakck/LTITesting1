package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchDemoWorkshop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\googlechrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.name("FirstName")).sendKeys("saranya");
		driver.findElement(By.name("LastName")).sendKeys("T");
		driver.findElement(By.name("Email")).sendKeys("saranyat@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("password123");
		 driver.findElement(By.name("ConfirmPassword")).sendKeys("password123");
		 driver.findElement(By.name("register-button")).click();
		 //driver.close();
		driver.findElement(By.linkText("Log in")).click();
		 driver.findElement(By.name("Email")).sendKeys("saranyat@gmail.com");
			driver.findElement(By.name("Password")).sendKeys("password123");
			// not working //driver.findElement(By.name("Log in")).click();
			 driver.findElement(By.cssSelector(".login-button")).click();
			//driver.findElement(By.xpath("//input[@value='Log in']")).click();
			 //driver.close();
			 
			// Select c=new Select(driver.findElement(By.name("q")));
			// c.selectByVisibleText("Build your own cheap computer");
			 
			 
			driver.findElement(By.name("q")).sendKeys("Build your own cheap computer");
			driver.findElement(By.xpath("//input[@value='Search']")).click();
			driver.findElement(By.linkText("Build your own cheap computer")).click();
			driver.findElement(By.id("product_attribute_72_5_18_65")).click();//fast processor
			driver.findElement(By.id("product_attribute_72_6_19_91")).click();//8 gb ram
			driver.findElement(By.id("product_attribute_72_3_20_58")).click();//400 gb hdd
			driver.findElement(By.id("product_attribute_72_8_30_94")).click();//office suite
			driver.findElement(By.xpath("//input[@value='Add to cart']")).click();//add to cart
			driver.close();
			
	}

}
