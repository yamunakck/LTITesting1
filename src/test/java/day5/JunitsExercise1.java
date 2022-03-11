package day5;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitsExercise1 {
	WebDriver driver;
	@Test
	public void RegisterTestCase1() {
		WebElement registerlink = driver.findElement(By.linkText("Register"));
		WebElement loginlink = driver.findElement(By.linkText("Log in"));
		
		assertTrue(registerlink.isDisplayed());
		assertTrue(loginlink.isDisplayed());
	}
	
	/*@Test
	public void LoginTestCase2() {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.name("Email")).sendKeys("saranyat@gmail.com");
	    driver.findElement(By.name("Password")).sendKeys("password123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		String emailtext=driver.findElement(By.linkText("saranyat@gmail.com")).getText();
		assertTrue(emailtext.contains("saranyat"));
		assertEquals("saranyat@gmail.com",emailtext);
		assertTrue(driver.findElement(By.linkText("saranyat@gmail.com")).isEnabled());
	}*/
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
