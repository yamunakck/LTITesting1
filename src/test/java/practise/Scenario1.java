package practise;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario1 {
	WebDriver driver;
	@Before
	public void before()
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\googlechrome\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	
	@After
	public void after()
	{
				driver.close();
	}
	
	@Test
	public void TestCase1() {
		 WebElement searchinput = driver.findElement(By.name("q"));
		 WebElement searchinput1 = driver.findElement(By.name("btnK"));
		 assertTrue(searchinput.isDisplayed());
		 assertTrue(searchinput1.isDisplayed()); 
	}
	@Test
	public void TestCase2() throws InterruptedException {
		driver.findElement(By.name("q")).sendKeys("testing");
		driver.findElement(By.name("btnK")).click();
		Thread.sleep(5000);
		String search = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[1]/div[1]/div[2]/div[1]/div/div[2]/input")).getText();
		assertTrue(search.contains("testing"));
		}
	@Test
	public void Testcase3() {
		driver.findElement(By.name("btnK")).click();
	    assertTrue(driver.getTitle().contains("Google"));
	   	}
	@Test
	public void Testcase4() {
		int links = driver.findElements(By.tagName("a")).size();
		assertTrue(links>0);
	   	}
	

}
