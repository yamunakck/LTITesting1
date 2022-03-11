package practise;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessTestExecution {
	@Test
	public void testcase1() {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("headless");
		System.setProperty("webdriver.chrome.driver","C:\\googlechrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver webDriver = new ChromeDriver(option);
		webDriver.get("https://www.google.com/");
		System.out.println(webDriver.getTitle());
		webDriver.close();
	}

}
