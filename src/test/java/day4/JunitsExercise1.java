package day4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class JunitsExercise1 {
	WebDriver driver;
	@Test
	public void Testcase1() {
		System.out.println("Testcase 1");
		
		driver.manage().window().maximize();
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("submit")).click();
		
		String actualresult = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/h3")).getText();
		Assert.assertEquals("Login Successfully", actualresult);
	}
	@Test
	public void Testcase2() throws InterruptedException {
		System.out.println("Testcase 2");
		
		driver.findElement(By.linkText("Flights")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@value='oneway']")).click();
	}
	
	@Before
	public void before()
	{
		System.out.println("Pre_requisite");
		
		System.setProperty("webdriver.chrome.driver","C:\\googlechrome\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		// to close launched browser
		//driver.close();
		//open application
		driver.get("https://demo.guru99.com/test/newtours/");
	}
	
	@After
	public void after()
	{
		System.out.println("Post Condition");
		
		driver.close();
	}

}
