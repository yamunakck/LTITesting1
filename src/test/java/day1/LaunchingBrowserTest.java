package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingBrowserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Launch google chrome
		System.setProperty("webdriver.chrome.driver","C:\\googlechrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// to close launched browser
		//driver.close();
		//open application
		driver.get("https://demo.guru99.com/test/newtours/");
		//click on Registerlink
		driver.findElement(By.linkText("REGISTER")).click();
		//enter username as saranya , password as password123, confirm password as password123
		 driver.findElement(By.name("email")).sendKeys("saranya");
		 driver.findElement(By.name("password")).sendKeys("password123");
		 driver.findElement(By.name("confirmPassword")).sendKeys("password123");
		//click on submit
		 driver.findElement(By.name("submit")).click();
		 driver.close();

	}

}
