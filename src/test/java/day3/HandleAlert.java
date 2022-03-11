package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\googlechrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("OKTab")).click();
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel ')]")).click();
		driver.findElement(By.id("CancelTab")).click();
		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]")).click();
		driver.findElement(By.id("Textbox")).click();
		
		String text=driver.switchTo().alert().getText();
		if(text.contains("Please enter your name"))
		{
			driver.switchTo().alert().sendKeys("Saranya");
			driver.switchTo().alert().accept();
		}
		}

	}


