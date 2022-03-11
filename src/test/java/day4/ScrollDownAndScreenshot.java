package day4;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDownAndScreenshot {

	public static void main(String[] args) throws InterruptedException, IOException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\googlechrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,2000)");
		
		TakesScreenshot s=(TakesScreenshot)driver;
		File src= s.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("F:\\LTI Certificates\\screenshot\\Screenshot1.png"));
		Thread.sleep(2000);
		driver.close();
		

	}

}
