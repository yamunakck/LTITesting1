package practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class ParallelTestExecution {
  @Test
  public void f() {
	    
		System.setProperty("webdriver.chrome.driver","C:\\googlechrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver webDriver = new ChromeDriver();
		webDriver.get("https://www.google.com/");
		System.out.println(webDriver.getTitle());
		webDriver.close();
  }
}
