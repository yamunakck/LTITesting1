package day5;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNGExercise2 {
	WebDriver driver;
  @Test(priority=1)
  public void LoginTestcase() {
	  driver.manage().window().maximize();
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("submit")).click();
		
		String actualresult = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/h3")).getText();
		Assert.assertEquals("Login Successfully", actualresult);
  }
  
  @Test(priority=2,enabled=false)
  public void FlightTestcase() throws InterruptedException {
	  driver.findElement(By.linkText("Flights")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@value='oneway']")).click();
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\googlechrome\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		// to close launched browser
		//driver.close();
		//open application
		driver.get("https://demo.guru99.com/test/newtours/");
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
