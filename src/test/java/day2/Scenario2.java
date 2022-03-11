package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Scenario2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\googlechrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// to close launched browser
		//driver.close();
		//open application
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("submit")).click();
		 driver.findElement(By.linkText("Flights")).click();
		 Thread.sleep(10000);
		 driver.findElement(By.xpath("//input[@value='oneway']")).click();
		 Select p=new Select(driver.findElement(By.name("passCount")));
		 p.selectByIndex(3);
		 Select d=new Select(driver.findElement(By.name("fromPort")));
		 d.selectByVisibleText("London");
		 
		 Select a=new Select(driver.findElement(By.name("fromMonth")));
		 a.selectByVisibleText("May");
		 
		 Select b=new Select(driver.findElement(By.name("fromDay")));
		 b.selectByIndex(13);
		 Select c=new Select(driver.findElement(By.name("toPort")));
		 c.selectByVisibleText("Paris");
		 Select e=new Select(driver.findElement(By.name("toMonth")));
		 e.selectByVisibleText("May");
		 Select f=new Select(driver.findElement(By.name("toDay")));
		 f.selectByIndex(16);
		 driver.findElement(By.xpath("//input[@value='Business']")).click();
		 Select g=new Select(driver.findElement(By.name("airline")));
		 g.selectByVisibleText("Blue Skies Airlines");
		 driver.findElement(By.name("findFlights")).click();
		    driver.close();



	}

}
