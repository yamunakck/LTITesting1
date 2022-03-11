package day4;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class JunitsExercise2 {
	WebDriver driver;
	@Test
	public void RegisterTestCase1() {
		//System.out.println("Testcase 1");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.name("FirstName")).sendKeys("saranya");
		driver.findElement(By.name("LastName")).sendKeys("T");
		driver.findElement(By.name("Email")).sendKeys("saranyat@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("password123");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("password123");
		driver.findElement(By.name("register-button")).click();
		
		//String result=driver.findElement(By.linkText("Your registration completed")).getText();
		//assertEquals("Your registration completed",result);
		
		String actualresult = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]")).getText();
		assertEquals("Your registration completed", actualresult);
	}
	@Test
	public void LoginTestCase2() {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.name("Email")).sendKeys("saranyat@gmail.com");
	    driver.findElement(By.name("Password")).sendKeys("password123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		String emailtext=driver.findElement(By.linkText("saranyat@gmail.com")).getText();
		assertEquals("saranyat@gmail.com",emailtext);
	}
	
	@Before
	public void before()
	{
		//System.out.println("Pre_requisite");
		
		System.setProperty("webdriver.chrome.driver","C:\\googlechrome\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		
	}
	
	@After
	public void after()
	{
		//System.out.println("Post Condition");
		
		driver.close();
	}
}
