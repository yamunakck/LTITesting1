package day6.pom.tests;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import day6.POMpages.HomePageClass;
import day6.POMpages.LoginPageClass;
import day6.POMpages.RegisterPageClass;

public class RegisterTest {
	static WebDriver driver;
	static FileInputStream fis;
	static Properties prop;
	static HomePageClass hp;
	static RegisterPageClass rp;
	static LoginPageClass lp;
	
	@BeforeClass
	public static void beforeClass() throws IOException {
		
		fis=new FileInputStream(new File("C:\\Users\\HP\\eclipse-workspace\\LTIWebDriverTest\\config.properties"));
		prop=new Properties();
		prop.load(fis);
		System.setProperty("webdriver.chrome.driver",prop.getProperty("chromedriverpath"));
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		//open application
		driver.get("http://demowebshop.tricentis.com/register");
		
		// create object class for HomePageClass and RegisterPageClass
		hp = new HomePageClass(driver);
		rp = new RegisterPageClass(driver);
		lp=PageFactory.initElements(driver, LoginPageClass.class);
	}
	@AfterClass
	  public static void afterClass() {
		  driver.close();
	  }
	@Test
	public void RegisterTest() {
		hp.click_register();
		rp.perform_register_female("tara1", "t", "tara1t@gmail.com", "pass1234", "pass1234");
		String text = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]")).getText();
		assertTrue(text.contains("completed"));
		driver.findElement(By.linkText("Log out")).click();
	}
	@Test
	public void LoginTC() {
		hp.click_login();
		lp.perform_login("tarat@gmail.com", "pass123");
	}
	
}
