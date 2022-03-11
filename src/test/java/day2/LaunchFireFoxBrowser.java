package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFireFoxBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\ieexplorer\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		  WebDriver ffdriver=new FirefoxDriver();
		  ffdriver.get("https://demo.guru99.com/test/newtours/");
			//click on Registerlink
			ffdriver.findElement(By.linkText("REGISTER")).click();
			//enter username as saranya
			 ffdriver.findElement(By.name("email")).sendKeys("saranya");
			 ffdriver.findElement(By.name("password")).sendKeys("password123");
			 ffdriver.findElement(By.name("confirmPassword")).sendKeys("password123");
			 ffdriver.findElement(By.name("submit")).click();
			//click on submit
			 
		  ffdriver.quit();

	}

}
