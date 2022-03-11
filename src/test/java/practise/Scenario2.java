package practise;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario2 {
	WebDriver driver;
	@Before
	public void before()
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\googlechrome\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/Agile_Project/Agi_V1/index.php");
	}
	
	@After
	public void after()
	{
				driver.close();
	}
	
	@Test
	public void TestCase1() {
		driver.findElement(By.name("btnLogin")).click();
		Alert a1 = driver.switchTo().alert();
		String text = a1.getText();
		System.out.println(text);
		if (text.contains("User or Password is not valid"))
		{
		System.out.println("About to accept Alert");
		a1.accept();
		}
		else
		{
		System.out.println("About to dismiss Alert");
		a1.dismiss();
		}
	}

	
	@Test
	public void TestCase2() throws InterruptedException {
		driver.findElement(By.name("uid")).sendKeys("1303");
	    driver.findElement(By.name("password")).sendKeys("Guru99");
	    driver.findElement(By.name("btnLogin")).click();
	    driver.findElement(By.linkText("Mini Statement")).click();
	    
	    Thread.sleep(5000);
	    driver.findElement(By.name("accountno")).click();
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.name("accountno")))
		.sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ENTER)
		.build().perform();
		Thread.sleep(5000);
		
	    
	}
		

}
